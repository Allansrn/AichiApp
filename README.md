# 📦 AichiApp

**AichiApp** est une application de bureau développée en **Java (Swing)**, conçue pour la **gestion des commandes** dans une entreprise. Elle suit l'architecture **MVC** et se connecte à une base de données **MySQL** via **phpMyAdmin**.

---

## ⚙️ Fonctionnalités principales

- 🧾 Création de nouvelles commandes
- 🗃️ Affichage de la liste des commandes existantes
- ✏️ Modification et suppression d’une commande
- 🔍 Recherche de commandes par différents critères (ID, client, date, etc.)
- 📊 Tri des commandes (par date, montant, etc.)

---

## 🧱 Architecture MVC

Le projet suit une séparation claire des responsabilités :
- **Modèle (Model)** : contient les classes représentant les données (Commandes, Clients...) et les opérations sur la base de données (DAO)
- **Vue (View)** : interfaces graphiques créées avec Java Swing
- **Contrôleur (Controller)** : gère les interactions entre l’utilisateur, la vue et le modèle

---

## 🗃️ Base de données

Base de données **MySQL**, gérée avec **phpMyAdmin**.

### Exemple de tables :
- `commandes` :
  - `id` (INT, clé primaire)
  - `client` (VARCHAR)
  - `date_commande` (DATE)
  - `montant_total` (DECIMAL)
  - `statut` (VARCHAR)

- `produits` :
  - `id` (INT, clé primaire)
  - `nom` (VARCHAR)
  - `prix_unitaire` (DECIMAL)

- `clients` :
  - `id` (INT, clé primaire)
  - `nom` (VARCHAR)
  - `email` (VARCHAR)

Tu peux ajouter une table de jointure pour gérer les **lignes de commande** si besoin.

---

## 🛠️ Technologies utilisées

- 💻 Java SE
- 🖼️ Java Swing (interface graphique)
- 🧱 Architecture MVC
- 🗃️ MySQL (phpMyAdmin)
- 🔌 JDBC (connexion à la base de données)
- 🔐 Connexion sécurisée via DAO

---

## 🚀 Lancement du projet

1. Clone ce dépôt :
   ```bash
   git clone https://github.com/ton-pseudo/AichiApp.git
