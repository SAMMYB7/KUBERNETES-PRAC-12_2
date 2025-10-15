# 🛡️ Warranty Tracker - Full Stack Application

A complete full-stack warranty management system built with **Spring Boot** (Backend) and **React** (Frontend).

## 📋 Features

### Core Functionality
- ✅ **Create** warranties with item details, purchase date, warranty period, vendor, and notes
- ✅ **Read** all warranties or search by ID
- ✅ **Update** existing warranty information
- ✅ **Delete** warranties from the system
- ✅ **Auto-calculate** expiry date based on purchase date + warranty period

### Smart Features
- 🔴 **Expiry Highlighting**: Warranties expiring within 30 days are highlighted in red
- ⚠️ **Status Display**: Shows "Expires in X days" for warranties expiring soon
- 📊 **Clean UI**: Modern, responsive design with gradient navbar
- 🔍 **Search**: Quick search functionality by warranty ID

## 🛠️ Technology Stack

### Backend
- **Spring Boot 3.5.5**
- **Spring Data JPA**
- **MySQL Database**
- **Java 21**
- **Maven**

### Frontend
- **React 18**
- **React Router DOM**
- **Axios**
- **Vite**
- **CSS3**

## 📁 Project Structure

```
WARRANTY-TRACKER-FULLSTACK/
├── WARRANTY-TRACKER-SPRINGBOOT/          # Backend
│   └── src/
│       └── main/
│           ├── java/com/klef/lab/
│           │   ├── entity/               # Warranty Entity
│           │   ├── repository/           # JPA Repository
│           │   ├── service/              # Business Logic
│           │   ├── controller/           # REST API
│           │   └── WarrantyTrackerSpringbootApplication.java
│           └── resources/
│               └── application.properties
│
└── WARRANTY-TRACKER-REACT/               # Frontend
    └── src/
        ├── components/                   # Reusable Components
        │   ├── Navbar.jsx
        │   ├── navbar.css
        │   └── config.js
        ├── pages/                        # Page Components
        │   ├── Home.jsx
        │   ├── AddWarranty.jsx
        │   ├── ViewWarranties.jsx
        │   ├── SearchWarranty.jsx
        │   └── pages.css
        ├── App.jsx
        ├── App.css
        ├── index.css
        └── main.jsx
```

## 🚀 Getting Started

### Prerequisites
- Java 21 or higher
- Node.js 18 or higher
- MySQL 8.0 or higher
- Maven (or use included mvnw)

### Database Setup

1. Create a MySQL database:
```sql
CREATE DATABASE warrantydb;
```

2. Update credentials in `application.properties` if needed:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/warrantydb
spring.datasource.username=root
spring.datasource.password=Sammy_40118
```

### Backend Setup

1. Navigate to the Spring Boot directory:
```bash
cd WARRANTY-TRACKER-SPRINGBOOT
```

2. Build the project:
```bash
./mvnw clean install
```

3. Run the application:
```bash
./mvnw spring-boot:run
```

The backend will start on `http://localhost:1901`

### Frontend Setup

1. Navigate to the React directory:
```bash
cd WARRANTY-TRACKER-REACT
```

2. Install dependencies:
```bash
npm install
```

3. Start the development server:
```bash
npm run dev
```

The frontend will start on `http://localhost:5173`

## 🌐 API Endpoints

### Base URL: `http://localhost:1901/warrantyapi/`

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/` | Home message |
| GET | `/all` | Get all warranties |
| GET | `/get/{id}` | Get warranty by ID |
| POST | `/add` | Create new warranty |
| PUT | `/update/{id}` | Update warranty |
| DELETE | `/delete/{id}` | Delete warranty |

### Request Body Example (POST/PUT):
```json
{
  "itemName": "Laptop",
  "purchaseDate": "2024-01-15",
  "warrantyPeriodMonths": 24,
  "vendor": "TechStore Inc.",
  "notes": "Extended warranty purchased"
}
```

## 📦 Database Schema

### Warranty Entity
```
warranties
├── id (Long, Primary Key, Auto-increment)
├── itemName (String, NOT NULL)
├── purchaseDate (LocalDate, NOT NULL)
├── warrantyPeriodMonths (Integer, NOT NULL)
├── expiryDate (LocalDate, NOT NULL, Auto-calculated)
├── vendor (String, NOT NULL)
└── notes (String, Optional, max 500 chars)
```

## 🎨 UI Features

### Pages
1. **Home** - Landing page with feature cards
2. **Add Warranty** - Form to add new warranties
3. **View All Warranties** - Table view with edit/delete actions
4. **Search Warranty** - Search by ID with detailed view

### Color Coding
- 🟢 **Green**: Valid warranties (> 30 days remaining)
- 🔴 **Red Background**: Warranties expiring within 30 days
- 🔴 **Dark Red Background**: Expired warranties

## 🔧 Configuration

### Backend Port
Change in `application.properties`:
```properties
server.port=1901
```

### Frontend API URL
Change in `src/components/config.js`:
```javascript
const config = {
    url: "http://localhost:1901"
}
```

## 📝 Development Notes

- Auto-calculates expiry date: `purchaseDate + warrantyPeriodMonths`
- Backend validates required fields
- Frontend includes client-side validation
- Responsive design for mobile and desktop
- Cross-Origin Resource Sharing (CORS) enabled

## 🐛 Troubleshooting

### Backend Issues
- **Port already in use**: Change port in `application.properties`
- **Database connection failed**: Verify MySQL is running and credentials are correct
- **Build fails**: Ensure Java 21 is installed

### Frontend Issues
- **Module not found**: Run `npm install`
- **API connection failed**: Check backend is running on correct port
- **Blank page**: Check browser console for errors

## 📄 License

This project is for educational purposes.

## 👨‍💻 Author

SAMMYB7

---

**Happy Tracking! 🛡️**
