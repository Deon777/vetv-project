import './styles.css';
import TeamList from './TeamList';
import { useEffect, useState } from 'react';
import { TeamMember } from './Types';
import { fetchMembers } from '../api';

function QuemSomos(){

    const [members, setMembers] = useState<TeamMember[]>([]);

    useEffect (() => {
        fetchMembers()
            .then(response => setMembers(response.data))
            .catch(error => console.log(error));
    }, []);

    return (
        <div className = "quemSomos-container">

            <div className = "quemSomos-clinic">   
                <div className = "img-clinic" />
                <p className = "clinic-text">
                    xxxxxxxxxxxxxxx
                </p>
            </div>

            <div className = "quemSomos-team">
                <h1 className = "titulo">Nossa equipe</h1>
                <TeamList members = {members}/>
            </div>

        </div>
    )
}
export default QuemSomos;