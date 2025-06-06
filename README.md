# 📦 Proyecto: Soporte Técnico App

Este proyecto consiste en una **aplicación web completa** dividida en backend, frontend y base de datos, orientada a la **gestión de usuarios y soporte técnico**. Está organizada en tres partes principales:

- 🧠 Backend: Java + Spring Boot (REST API)
- 🖥️ Frontend: Angular
- 🗄️ Base de datos: MySQL (con script `.sql` para importar estructura y datos)

---

## 📁 Estructura del repositorio

📦 soporte-tecnico-app/  
├── 📂 soporte-tecnico-backend/ → Proyecto Spring Boot (API)  
├── 📂 soporte-tecnico-frontend/ → Proyecto Angular (cliente web)  
├── 📄 soporte-tecnico-bd.sql → Script SQL para crear base de datos y tablas  
├── 📄 .gitignore → Archivos a ignorar por Git  
└── 📄 README.md → Este archivo

---

## 🚀 Clonar el proyecto

```bash
git clone https://github.com/Marco-Villanueva20/soporte-tecnico-app.git
```

## 🔙 Backend (Spring Boot)
📁 Ruta: soporte-tecnico-backend/soporte-tecnico-backend

### 📥 Importar en Spring Tool Suite (STS) o Eclipse

Abre Spring Tool Suite o Eclipse.

Ve a: File > Import.

Selecciona: Existing Projects into Workspace o Projects from Folder or Archive.

Clic en Next.

En Directory, selecciona la carpeta:  
soporte-tecnico-backend/soporte-tecnico-backend

Espera a que cargue el proyecto y haz clic en Finish.

### ⚙️ Requisitos

- Java 17 o superior
- Spring Boot 3.x
- MySQL (puerto 3306 por defecto)

### 📦 Dependencias usadas

- Spring Web
- Spring Data JPA
- MySQL Driver
- Spring Boot DevTools
- Lombok

---

## 🧑‍💻 Frontend (Angular)
📁 Ruta: soporte-tecnico-frontend/

### 📥 Pasos para instalar y correr

```bash
cd soporte-tecnico-frontend
npm install
ng serve --open
```

💡 El frontend está conectado al backend para consumir los endpoints REST.

---

## 🗄️ Base de Datos (MySQL)

📄 Script: soporte-tecnico-bd.sql

### 🛠️ ¿Cómo importarlo?

1. Abre MySQL Workbench u otra herramienta.
2. Conéctate a tu servidor MySQL.
3. Crea una base de datos vacía (ej. soportetecnicoapp).
4. Ejecuta el script soporte-tecnico-bd.sql.

---

## ❗ Nota sobre .gitignore

Este proyecto ignora carpetas como:

- node_modules/, dist/, .vscode/ (Angular)
- target/, .gradle/, .mvn/, .idea/ (Spring Boot)

🛠️ Si deseas importar el proyecto correctamente, no necesitas esos archivos. Todo lo necesario está incluido en el repositorio.

⚠️ Si necesitas importar el proyecto manualmente, asegúrate de seleccionar la carpeta interna correcta (soporte-tecnico-backend/soporte-tecnico-backend) y no solo la carpeta raíz.

---

## ✅ ¿Qué incluye este proyecto?

- Registro de usuarios con separación de entidades auth y usuarios.
- Asignación de roles (ADMIN, CLIENTE, etc.) desde la base de datos.
- API REST para autenticación y operaciones CRUD.
- Interfaz amigable con Angular.
- Organización por carpetas y patrón limpio (separación de capas).

---

## 🎯 ¿A quién va dirigido?

- Estudiantes o desarrolladores junior que deseen aprender arquitectura de proyectos reales con Spring Boot + Angular + MySQL.
- Personas interesadas en proyectos con autenticación básica y separación de roles.

---

## ✨ Autor

👤 Marco Villanueva  
📅 Junio 2025
