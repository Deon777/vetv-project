import { BrowserRouter, Route, Switch } from "react-router-dom";
import Footer from "./Footer";
import Home from "./Home";
import Navbar from "./Navbar";
import QuemSomos from "./QuemSomos";

function Routes() {
    return (
        <BrowserRouter>
            <Navbar/>
            <Switch>

                <Route path = "/quem-somos">
                    <QuemSomos/>
                </Route>

                <Route path = "/">
                    <Home/>
                </Route>

            </Switch>
            <Footer/>
        </BrowserRouter>
    )
}

export default Routes;