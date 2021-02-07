import './styles.css';
import {ReactComponent as Logo } from '../Assets/vet.svg';
import {ReactComponent as Email } from '../Assets/envelope.svg';
import {ReactComponent as Call } from '../Assets/call.svg';
import {ReactComponent as WhatsApp } from '../Assets/whatsapp.svg';
import {ReactComponent as Facebook } from '../Assets/facebook.svg';
import {ReactComponent as Instagram } from '../Assets/instagram.svg';

function Footer(){
    return (
        <footer className = "footer-container">
            <Logo className = "logo-footer" />
            <p className = "logo-text-footer">
                CLÍNICA VETV <br/> 
                <span className = "sub-text-footer">
                    © Copyright 2021. Todos direitos reservados.
                </span> 
            </p>

            <p className = "faleConosco-text">
                Fale Conosco
            </p>
            <p className = "faleConosco-items">
                <Email className = "icon"/> xxx@gmail.com<br/>
                <Call className = "icon"/> (xx) xxxxx-xxxx<br/>
                <WhatsApp className = "icon"/> (xx) xxxxx-xxxx<br/>
            </p>

            <p className = "Links-text">
                Links
            </p>
            <p className = "Links-items">
                <Facebook className = "icon"/> Facebook<br/>
                <Instagram className = "icon"/> Instagram<br/>
            </p>
        </footer>
    )
}
export default Footer;