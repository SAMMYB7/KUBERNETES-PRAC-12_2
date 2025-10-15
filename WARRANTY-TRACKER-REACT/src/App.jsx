import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import Navbar from './components/Navbar';
import Home from './pages/Home';
import AddWarranty from './pages/AddWarranty';
import ViewWarranties from './pages/ViewWarranties';
import SearchWarranty from './pages/SearchWarranty';

function App() {
  return (
    <Router>
      <Navbar />
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/add" element={<AddWarranty />} />
        <Route path="/view" element={<ViewWarranties />} />
        <Route path="/search" element={<SearchWarranty />} />
      </Routes>
    </Router>
  );
}

export default App
