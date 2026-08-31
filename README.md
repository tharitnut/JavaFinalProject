# 🍔 Rush Hour - Java GUI Food Ordering System

[![Java](https://img.shields.io/badge/Java-SE--11%2B-orange.svg)](https://www.oracle.com/java/)
[![Swing](https://img.shields.io/badge/GUI-Java%20Swing-blue.svg)](https://docs.oracle.com/javase/tutorial/uiswing/)
[![Status](https://img.shields.io/badge/Status-Completed-brightgreen.svg)]()

**Rush Hour** is a Java Swing-based desktop food ordering kiosk application. It allows customers to easily select food items, customize their orders (spiciness, egg options, side ingredients, meat selection), and complete payments via QR Code. It also includes an administrator dashboard for viewing customer order history.

---

## 📌 Key Features

### 👤 1. Authentication & User Management
- **Register / Sign Up**: Allows new customers to create an account (credentials saved to `CustomerDetail.txt`).
- **Login**: Existing registered users can log into their accounts.
- **Guest Mode**: Allows instant food ordering without requiring account registration.
- **Admin Access**: Special privilege access to view the complete order history table.

### 🍲 2. Menu Selection & Order Customization
- **Main Dishes**:
  - Stir-fried Basil (*Pad Kraprao*)
  - Fried Rice (*Khao Pad*)
  - Garlic & Pepper Stir-fry (*Pad Gratiem*)
  - Spicy Salt & Pepper Stir-fry (*Pad Prik Kleur*)
- **Meat Selection**:
  - Pork, Crispy Pork, Chicken, Beef, Fish, Seafood, Shrimp, Squid
- **Detailed Customization Options**:
  - **Spiciness Level**: No Spicy, Little Spicy, Medium Spicy, Extra Spicy
  - **Egg Style**: No Egg, Normal Fried Egg, Sunny Side Up, Omelet
  - **Vegetables**: No Vegetable, Normal, Extra Vegetables
  - **Rice Portion**: Less Rice, Normal, Extra Rice
  - **Garlic Level**: Less Garlic, Extra Garlic

### 🛒 3. Order Summary & Payment
- **Order Review**: Displays chosen items, custom modifications, and calculates the total cost.
- **QR Code Payment**: Displays a PromptPay QR Code for payment. Upon confirmation, order details are logged into `Menu.txt`.

### 👑 4. Administrator Dashboard
- **Order History Viewer**: Loads and displays all past orders stored in `Menu.txt` via an interactive `JTable` GUI.

---

## 🔑 Admin Credentials

| Role | Username | Password |
| :--- | :--- | :--- |
| **Administrator** | `Labinstall` | `Tni12345` |

---

## 📁 Project Structure

```text
JavaFinalProject/
├── RushHour/
│   ├── src/
│   │   ├── FirstPage.java         # Main entry point frame (Login / Register / Guest / Exit)
│   │   ├── LoginPage.java         # User & Admin Login frame
│   │   ├── RegisterPage.java      # New user registration frame
│   │   ├── ChooseMain.java        # Main dish & meat selection frame
│   │   ├── ChooseOption.java      # Food customization options frame
│   │   ├── OrderPage.java         # Order summary & pricing frame
│   │   ├── QrPage.java            # Payment QR Code frame
│   │   ├── AdminPage.java         # Admin order history viewer frame
│   │   ├── Customer.java          # Customer data model & registration logic
│   │   ├── Menu.java              # Menu data model & formatting
│   │   ├── CheckUser.java         # Username validation utility
│   │   └── CheckPassword.java     # Password validation utility
│   ├── CustomerDetail.txt         # User credentials database file
│   └── Menu.txt                   # Completed orders log database file
├── Background/                    # GUI background images
├── NotBackground/                 # GUI buttons, food icons & assets
├── Project.jar                    # Executable JAR file
├── RushHour.exe                   # Windows Executable file
├── ProjectProgressReport.pdf      # Complete project documentation report (.pdf)
├── ProjectProgressReport.docx     # Complete project documentation report (.docx)
├── PreziLink.txt                  # Prezi presentation slide link
└── README.md                      # Project documentation
```

---

## 🚀 Getting Started

### Prerequisites
- **Java Runtime Environment (JRE)** or **Java Development Kit (JDK)** version 8 or higher.

### Running the Application

#### Option 1: Using Executable (`.exe` or `.jar`)
1. Double-click `RushHour.exe` (Windows).
2. Or launch via Terminal / Command Prompt:
   ```bash
   java -jar Project.jar
   ```

#### Option 2: Running Source Code
1. Open the project in an IDE (e.g., Eclipse, IntelliJ IDEA, NetBeans).
2. Import the `RushHour` directory.
3. Run the main class `FirstPage.java` (or `LoginPage.java`).

---

## 🔗 Presentation
- **Prezi Link**: [View Rush Hour Project Presentation](https://prezi.com/view/tUE3bFKKPLlrRx3KQ0m5/)