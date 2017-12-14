import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import {BrowserRouter, Route, Switch} from 'react-router-dom';
import { ProductListContainer } from './Products/ProductListContainer';
import {NavigationComponent} from './Navigation/NavigationComponent'



ReactDOM.render((

      <BrowserRouter>
          <div className="container">
              <NavigationComponent />
              <Switch>
              <Route exact path="/products/:id" component={ProductListContainer} />
              
              </Switch>
          </div>
      </BrowserRouter> ),
document.getElementById('root'));