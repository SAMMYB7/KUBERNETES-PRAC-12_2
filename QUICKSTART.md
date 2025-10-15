# 🚀 Quick Start Guide - Warranty Tracker

## ⚡ Fast Setup (5 Minutes)

### Step 1: Database Setup (1 minute)
```sql
CREATE DATABASE warrantydb;
```

### Step 2: Start Backend (2 minutes)
```bash
cd WARRANTY-TRACKER-SPRINGBOOT
./mvnw spring-boot:run
```
✅ Backend running at: http://localhost:1901

### Step 3: Start Frontend (2 minutes)
```bash
cd WARRANTY-TRACKER-REACT
npm install
npm run dev
```
✅ Frontend running at: http://localhost:5173

### Step 4: Test the Application
1. Open browser: http://localhost:5173
2. Click "Add Warranty"
3. Fill in the form:
   - Item Name: Laptop
   - Purchase Date: Today's date
   - Warranty Period: 12 months
   - Vendor: TechStore
4. Click "Add Warranty"
5. View your warranty in "View All Warranties"

## 🎯 Key Features to Test

### Add a Warranty
- Go to "Add Warranty"
- Enter item details
- Expiry date is auto-calculated!

### View All Warranties
- See all warranties in a table
- Red highlight = expiring within 30 days
- Edit or Delete any warranty

### Search Warranty
- Enter a warranty ID
- Get instant details

## 📊 Sample Test Data

```
Warranty 1:
- Item: Laptop
- Purchase: 2024-10-01
- Period: 12 months
- Vendor: TechStore
- Notes: Extended warranty

Warranty 2:
- Item: Smartphone
- Purchase: 2024-11-01
- Period: 6 months
- Vendor: PhoneShop
- Notes: Standard warranty
```

## ⚠️ Common Issues

**Backend won't start?**
- Check MySQL is running
- Verify port 1901 is free

**Frontend shows errors?**
- Run `npm install` first
- Check backend is running

**Can't add warranty?**
- Check all required fields are filled
- Verify backend API is accessible

## 🎉 You're All Set!

Your Warranty Tracker is now running!
Start managing your warranties with ease! 🛡️
