 Instructions nécessaires pour exécuter l’application
1. Prérequis

Avant d’exécuter l’application, assurez-vous d’avoir installé les outils suivants :

- Java JDK 17 ou supérieur
- Maven
- Node.js
- npm
- Expo CLI / Android Studio (émulateur Android)
- MySQL Server
- Postman (optionnel pour tester l’API)

 2. Configuration de la base de données

Créer une base de données MySQL :
Exécuter le fichier fooddelivery.sql dans MySQL pour créer la base de données de l’application.

Modifier le fichier `application.properties` :


spring.datasource.url=jdbc:mysql://localhost:3306/fooddelivery
spring.datasource.username=root
spring.datasource.password=mot_de_passe

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true


3. Exécution du Backend (Spring Boot)

Accéder au dossier backend :
cd demo
Installer les dépendances Maven :
mvn clean install
Lancer le serveur backend :
mvn spring-boot:run
Le backend sera accessible sur :
http://localhost:8080


4. Exécution du Frontend (React Native + Expo)

Accéder au dossier frontend :
cd delivery
Installer les dépendances :
npm install
Lancer le projet Expo :
npx expo start

En cas d’exécution de l’application avec un émulateur Android,
toutes les adresses de l’API utilisées dans le frontend (dossier delivery)
doivent être remplacées par l’adresse suivante : http://10.0.2.2:8080.
sinon api ca marche par cette address http://localhost:8080
Puis :

- Appuyer sur `a` pour ouvrir l’émulateur Android
- Scanner le QR code avec l’application Expo Go
- Ouvrir l’application dans un navigateur web en lançant le mode web d’Expo.(version final de ce code fonctionne sur le web)
- Ou lancer un appareil virtuel depuis Android Studio

***************************

Parmi les difficultés rencontrées durant le développement de cette application, l’utilisation de l’émulateur Android a constitué un obstacle.
J’ai notamment rencontré des problèmes lors de l’installation de l’AVD dans Android Studio à cause d’un espace de stockage insuffisant.
