import Footer from "../Footer";
import MemberCard from "./MemberCard";
import { TeamMember } from "./Types";

type Props = {
    members: TeamMember[]
}

function TeamList({ members } : Props) {
    return (
        <div>
            {members.map( member => (<MemberCard member = {member}/>))}
        </div>
    )
}

export default TeamList;