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


            <div className = "vertical-line"></div>


            <p className = "faleConosco-text">
                Fale Conosco
            </p>

            <div className = "icons-container-FaleConosco">
                <Email className = "icon"/> <br/>
                <Call className = "icon"/> <br/>
                <WhatsApp className = "icon"/> 
            </div>
        
            <p className = "faleConosco-items">
                xxx@gmail.com<br/>
                (xx) xxxxx-xxxx<br/>
                (xx) xxxxx-xxxx
            </p>


            <div className = "vertical-line"></div>


            <p className = "Links-text">
                Links
            </p>

            <div className = "icons-container-Links">
                <Facebook className = "icon"/> <br/>
                <Instagram className = "icon"/>
            </div>

            <p className = "Links-items">
                <a href="https://facebook.com" target = "_new">Facebook</a><br/>
                <a href="https://instagram.com" target = "_new">Instagram</a><br/>
            </p>

        </footer>
    )
}
export default Footer;