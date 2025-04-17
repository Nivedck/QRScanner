# 🔍 QR Scanner & Generator App  

**A minimalist Android application for scanning and creating QR codes**  

---

## ✨ Features  

| Feature | Description |  
|---------|-------------|  
| **QR Scanning** | Scan any QR code using device camera |  
| **QR Generation** | Convert text/URLs into shareable QR codes |  
| **Offline Mode** | Works without internet connection |  
| **Material Design** | Clean, modern interface |  

---

## 📥 Installation  

### Prerequisites  
- Android 5.0+ (API 21)  
- Android Studio (for development)  

### Installation Methods  

**1. From Source:**  
```bash
git clone https://github.com/your-repo/qr-scanner-app.git
cd qr-scanner-app


🚀 Usage
Scanning QR Codes
Tap Scan QR Code button

Point camera at QR code

View decoded content in toast

Generating QR Codes
Tap Generate QR Code button

Enter text in input field

Press Generate button

QR code appears below

🔧 Technical Details
Built With
Kotlin - Primary language

ZXing Android Embedded - QR processing

Android Jetpack Components

Permissions
CAMERA - For scanning functionality

(No internet permission required)


File Structure

app/
├── src/
│   ├── main/
│   │   ├── java/com/nivedck/qrscanner/
│   │   │   ├── MainActivity.kt
│   │   │   ├── QRScannerActivity.kt
│   │   │   └── QRGeneratorActivity.kt
│   │   └── res/
│   │       ├── layout/
│   │       │   ├── activity_main.xml
│   │       │   ├── activity_qr_scanner.xml
│   │       │   └── activity_qr_generator.xml
│   │       │  


🤝 Contributing
Fork the project

Create your branch (git checkout -b feature/your-feature)

Commit changes (git commit -m 'Add some feature')

Push to branch (git push origin feature/your-feature)

Open a Pull Request


