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

1. Abrir una terminal (CMD, PowerShell o Terminal de VS Code).
2. Ir a la carpeta del proyecto frontend. Puedes hacerlo con este comando:

```bash
cd soporte-tecnico-frontend
```

3. (Opcional) Abrir Visual Studio Code en esa carpeta:

```bash
code .
```

4. Instalar las dependencias del proyecto Angular:

```bash
npm install
```

🔧 Este comando descargará todos los paquetes necesarios definidos en package.json.

5. Ejecutar la aplicación Angular en modo desarrollo:

```bash
ng serve --open
```

🌐 Este comando levantará el servidor de desarrollo y abrirá automáticamente el navegador en http://localhost:4200/.


💡 El frontend está conectado al backend para consumir los endpoints REST.

---

## 🗄️ Base de Datos (MySQL)

📄 Script: soporte-tecnico-bd.sql

### 🛠️ ¿Cómo importarlo?

Sigue estos pasos para importar correctamente la estructura y datos iniciales de la base de datos en MySQL:

1. Abre MySQL Workbench u otra herramienta de administración de bases de datos compatible con MySQL.
2. Conéctate al servidor MySQL usando tu usuario y contraseña (por defecto, suele ser root y sin contraseña si es local).
3. Haz clic en el menú File > Open SQL Script...
4. Busca y selecciona el archivo soporte-tecnico-bd.sql que está dentro del repositorio del proyecto.
5. El script se abrirá en una pestaña nueva. Ahora haz clic en el ícono del rayo ⚡ (o presiona Ctrl + Shift + Enter) para ejecutar el script completo.
6. Una vez ejecutado, verifica que la base de datos y las tablas hayan sido creadas correctamente. Puedes hacerlo desde la pestaña "Schemas".

💡 Importante: Asegúrate de que el archivo .sql contiene instrucciones como CREATE DATABASE y USE, para que se cree automáticamente la base y no tengas que crearla manualmente.

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
