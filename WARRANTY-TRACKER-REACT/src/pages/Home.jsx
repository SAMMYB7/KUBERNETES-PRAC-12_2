import React from 'react';
import { Link } from 'react-router-dom';
import './pages.css';

const Home = () => {
  return (
    <div className="page-container">
      <div className="home-content">
        <h2>Welcome to Warranty Tracker Management System</h2>
        
        <div className="feature-grid">
          <Link to="/add" className="feature-card">
            <div className="feature-icon">➕</div>
            <h3>Add New Warranty</h3>
            <p>Add new warranties to your inventory with item name, purchase date, warranty period, vendor, and notes.</p>
          </Link>
          
          <Link to="/view" className="feature-card">
            <div className="feature-icon">📋</div>
            <h3>View All Warranties</h3>
            <p>Browse all warranties in your collection with options to edit or delete entries.</p>
          </Link>
          
          <Link to="/search" className="feature-card">
            <div className="feature-icon">🔍</div>
            <h3>Search Warranties</h3>
            <p>Find specific warranties quickly by searching with their ID number.</p>
          </Link>
        </div>

        <div className="info-section">
          <h3>About This Application</h3>
          <p>
            This full-stack warranty management system allows you to perform complete CRUD 
            (Create, Read, Update, Delete) operations on warranty records. The application 
            features a React frontend with a Spring Boot backend, demonstrating modern 
            web development practices.
          </p>
        </div>
      </div>
    </div>
  );
};

export default Home;
