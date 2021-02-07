import './styles.css';
import {ReactComponent as Logo } from '../Assets/vet.svg';
import { Link } from 'react-router-dom';

function Navbar(){
    return (
        <nav className = "navbar-container">
            <Logo className = "logo"/>
            <Link className = "logo-text" to="/">CLÍNICA VETV</Link>
            <Link className = "button-item" to="/">Home</Link>
            <Link className = "button-item" to="/adoption">Adoção</Link>
            <Link className = "button-item" to="/quem-somos">Quem somos</Link>
            <Link className = "button-item" to="/minha-conta">Minha conta</Link>
            <Link className = "button-item" to="/login">Login</Link>
        </nav>
    )
}
export default Navbar;