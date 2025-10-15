import React from 'react';
import { Link, useLocation } from 'react-router-dom';
import './navbar.css';

const Navbar = () => {
  const location = useLocation();

  return (
    <nav className="navbar">
      <div className="navbar-container">
        <div className="navbar-brand">
          <h1>🛡️ Warranty Tracker Management</h1>
        </div>
        <ul className="navbar-menu">
          <li className={location.pathname === '/' ? 'active' : ''}>
            <Link to="/">Home</Link>
          </li>
          <li className={location.pathname === '/add' ? 'active' : ''}>
            <Link to="/add">Add Warranty</Link>
          </li>
          <li className={location.pathname === '/view' ? 'active' : ''}>
            <Link to="/view">View All Warranties</Link>
          </li>
          <li className={location.pathname === '/search' ? 'active' : ''}>
            <Link to="/search">Search Warranty</Link>
          </li>
        </ul>
      </div>
    </nav>
  );
};

export default Navbar;
