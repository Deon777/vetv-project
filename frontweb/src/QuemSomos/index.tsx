import './styles.css';
import {ReactComponent as Img } from '../Assets/vet.svg';
import {ReactComponent as Email } from '../Assets/envelope.svg';
import {ReactComponent as Call } from '../Assets/call.svg';
import {ReactComponent as WhatsApp } from '../Assets/whatsapp.svg';
import {ReactComponent as Facebook } from '../Assets/facebook.svg';
import {ReactComponent as Instagram } from '../Assets/instagram.svg';

function QuemSomos(){
    return (
        <footer className = "quemSomos-container">

            <Img className = "img-clinic" />
            <p className = "clinic-text">
                xxxxxxxxxxxxxxx
            </p>

            <h1 className = "titulo">Nossa equipe</h1>

        </footer>
    )
}
export default QuemSomos;