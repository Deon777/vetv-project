import './styles.css';
import {ReactComponent as Logo } from '../Assets/vet.svg';

function Navbar(){
    return (
        <nav className = "navbar-container">
            <Logo className = "logo"/>
            <a className = "logo-text" href="Home">CLÍNICA VETV</a>
            <a className = "button-item" href="Home">Home</a>
            <a className = "button-item" href="Adocao">Adoção</a>
            <a className = "button-item" href="QuemSomos">Quem somos</a>
            <a className = "button-item" href="MinhaConta">Minha conta</a>
            <a className = "button-item" href="Login">Login</a>
        </nav>
    )
}
export default Navbar;