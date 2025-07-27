# Hotel Management System

A comprehensive Java-based desktop application for managing hotel operations including customer bookings, room management, employee management, and administrative tasks.

## 🏨 Overview

The Hotel Management System is a full-featured desktop application built with Java Swing that provides a complete solution for hotel management. The system offers two main interfaces: **Reception** for front desk operations and **Admin** for administrative tasks.

## ✨ Features

### 🎯 Core Functionality
- **Customer Management**: Add, update, delete, and view customer information
- **Room Management**: Add rooms, search availability, update room status
- **Booking System**: Handle room bookings and check-ins/check-outs
- **Employee Management**: Manage hotel staff information
- **Driver Management**: Handle transportation services
- **Package Tours**: Book and manage tour packages
- **Payment Processing**: Integrated payment system with Paytm
- **Reports**: View customer history and booking details

### 🎨 User Interface
- **Modern GUI**: Built with Java Swing for cross-platform compatibility
- **Intuitive Design**: User-friendly interface with clear navigation
- **Visual Elements**: Rich graphics and icons for better user experience
- **Responsive Layout**: Adapts to different screen sizes

### 🔐 Security
- **Login System**: Secure authentication for admin access
- **Role-based Access**: Separate interfaces for reception and admin
- **Database Security**: MySQL database with proper connection handling

## 🛠️ Technology Stack

- **Language**: Java
- **GUI Framework**: Java Swing
- **Database**: MySQL
- **Database Driver**: MySQL Connector/J
- **IDE**: IntelliJ IDEA (compatible with other Java IDEs)

## 📋 Prerequisites

Before running this application, ensure you have the following installed:

- **Java Development Kit (JDK)**: Version 8 or higher
- **MySQL Server**: Version 5.7 or higher
- **MySQL Connector/J**: JDBC driver for MySQL

## 🚀 Installation

### 1. Clone the Repository
```bash
git clone https://github.com/CodeHive08/hotel-management-system.git
cd hotel-management-system
```

### 2. Database Setup
1. Install MySQL Server on your system
2. Create a new database named `el_diablo`
3. Import the database schema (SQL files will be provided separately)

### 3. Configure Database Connection
Update the database connection details in `Conn.java`:
```java
private static final String url="jdbc:mysql://localhost:3306/el_diablo";
private static final String username="your_username";
private static final String password="your_password";
```

### 4. Add MySQL Connector
Ensure the MySQL JDBC driver is in your project's classpath:
- Download `mysql-connector-java.jar`
- Add it to your project's libraries

## 🎮 Usage

### Starting the Application
1. Compile all Java files:
   ```bash
   javac *.java
   ```

2. Run the main application:
   ```bash
   java Login
   ```

### Main Interfaces

#### 🏢 Reception Interface
- **Customer Operations**: Add new customers, view customer details
- **Room Booking**: Check room availability and make bookings
- **Check-in/Check-out**: Process guest arrivals and departures
- **Package Tours**: Handle tour bookings
- **Payment**: Process payments and generate receipts

#### 👨‍💼 Admin Interface
- **Employee Management**: Add, update, and manage staff
- **Room Management**: Add new rooms and update room information
- **Driver Management**: Manage transportation services
- **Department Management**: Handle different hotel departments
- **System Reports**: View comprehensive hotel statistics

## 📁 Project Structure

```
hotel-management-system/
├── hotel management systtem/
│   ├── code/
│   │   ├── *.java                 # Main application files
│   │   ├── *.class                # Compiled Java classes
│   │   ├── icon/                  # UI icons and images
│   │   └── .vscode/              # VS Code configuration
│   ├── out/                       # Output directory
│   ├── .idea/                     # IntelliJ IDEA files
│   └── *.iml                      # IntelliJ module file
└── ResultSet2xml.jar             # Additional library
```

### Key Java Files
- `Login.java` - Main login interface
- `Dashboard.java` - Main dashboard with navigation
- `Reception.java` - Reception interface
- `Admin.java` - Admin interface
- `Conn.java` - Database connection handler
- `AddCustomer.java` - Customer management
- `Add_Room.java` - Room management
- `CheckOut.java` - Check-out processing

## 🎨 Screenshots
<img width="1920" height="1067" alt="1" src="https://github.com/user-attachments/assets/910039b6-c9ce-4749-93c2-ef1e19f1ec36" />
<img width="1911" height="1080" alt="2" src="https://github.com/user-attachments/assets/33d5005d-34e8-4abe-a4b7-28f505e4a162" />
<img width="1918" height="1080" alt="3" src="https://github.com/user-attachments/assets/3ee38dae-773b-4bb2-b373-ded2b7bbf928" />
<img width="1920" height="1080" alt="4" src="https://github.com/user-attachments/assets/aea1ca80-aa29-4dfd-92af-88d05631120d" />

The application includes a rich visual interface with:
- Modern login screen with animated elements
- Dashboard with intuitive navigation
- Professional reception and admin interfaces
- Beautiful icons and graphics throughout the application

## 🔧 Configuration

### Database Configuration
The application uses MySQL database with the following default settings:
- **Database**: `el_diablo`
- **Host**: `localhost`
- **Port**: `3306`
- **Driver**: `com.mysql.cj.jdbc.Driver`

### Customization
You can customize the application by:
- Modifying the UI colors and themes in the Java files
- Adding new features by extending existing classes
- Customizing the database schema for additional functionality

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📝 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 👨‍💻 Author

**Sandeep Mehta**
- GitHub: [@CodeHive08](https://github.com/CodeHive08)

## 🙏 Acknowledgments

- Java Swing community for GUI components
- MySQL team for database support
- All contributors and testers

## 📞 Support

If you encounter any issues or have questions:
- Create an issue in the GitHub repository
- Contact the development team
- Check the documentation for common solutions

---

**Note**: This is a desktop application designed for hotel management operations. Ensure proper training for staff before deployment in a production environment. 
