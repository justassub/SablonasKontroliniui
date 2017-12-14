import React from 'react';
import {NavLink} from 'react-router-dom';
import '../../node_modules/bootstrap/dist/css/bootstrap.min.css';
import axios from '../../node_modules/axios';

export var NavigationComponent=()=>{

    
    return(
        
        <nav className="navbar navbar-default">
        <div className="container">
        <ul>
        <li><NavLink to="/products">Home</NavLink></li>
        <li><NavLink to="/admin">Admin</NavLink></li>
       
            </ul>
         
           
           <NavLink to="/user/products" ><center> <button>your cart</button></center></NavLink>
          
            </div>
        
            </nav>
    )
}