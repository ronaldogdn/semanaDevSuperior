import React from  'react';
//BrowserRouter -> para fazer rotas "mudanças entre páginas"
//Switch -> casa as rotas da aplicação
//Route path -> "controller" da rota
import { BrowserRouter, Switch, Route } from 'react-router-dom';
import Header from './components/Header';
import Home from './pages/Home';
import Records from './pages/Records';

const Routes = () => (
    <BrowserRouter>
        <Header />
        <Switch>
            <Route path="/" exact>
                <Home /> 
            </Route>
            <Route path="/records">
                <Records /> 
            </Route>
        </Switch>
    </BrowserRouter>
);

export default Routes;



