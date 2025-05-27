# prog-5-d5

☕ Système de Machine à Café

Ce projet décrit un système logiciel pour gérer une machine à café intelligente, intégrant des fonctionnalités pour les utilisateurs, 
les techniciens et ladministrateurs. Il couvre les cas d’usage, la logique métier, les erreurs possibles et les optimisations envisageables.


1)Cas d’Usage :

*Acteurs 
   Client : Achète une boisson chaude.
   Technicien : Assure la maintenance, les réparations et le réapprovisionnement.
   Administrateur : Supervise les ventes, les stocks et les paramètres système.

*Scénarios fonctionnels
   Paiement : Paiement par pièces, carte bancaire, mobile ou application.
   Choix de boisson : Sélection parmi différents types (expresso, latte, thé…).
   Vérification des stocks : Vérifie la disponibilité des ingrédients nécessaires.
   Préparation : Chauffage, mouture, dosage et mélange des ingrédients.
   Distribution : Service de la boisson avec rendu de monnaie si nécessaire.
   Annulation : Le client peut annuler la commande avant le début de la préparation.
   Maintenance : Nettoyage, réparations, remplissage automatique ou manuel.
   Suivi & rapports : Statistiques de vente, alertes de panne, gestion à distance.
   Fidélité : Gestion de points, promotions et offres personnalisées.


2) Logique Métier :
   
   Moyens de paiement : Espèces, carte, mobile, QR code, compte client.
   Types de boissons : Expresso, Cappuccino, Latte, Chocolat chaud, Thé...
   Personnalisation : Sucre, lait, taille, intensité...
   Suivi des stocks : Surveillance des niveaux d’eau, café, lait, sucre, gobelets.
   Analyse des ventes : Produits populaires, heures de pointe, préférences client.
   Offres promotionnelles : Réductions, cartes de fidélité, abonnements.
   Historique d’entretien : Journalisation des maintenances techniques.
   Connectivité : Interface connectée pour contrôle et surveillance à distance.
   
3)Erreurs Possibles
Erreur	                          Cause Potentielle
Paiement refusé	                 Carte invalide, mobile non reconnu, erreur système
Boisson non disponible	           Manque d’ingrédients (grains, lait, eau...)
Rendu de monnaie impossible	     Pièces insuffisantes ou erreur logicielle
Boisson non servie	              Blocage mécanique ou gobelet manquant
Machine en panne	                 Problème électrique, chauffe-eau, pompe, capteur...
Interface figée	                 Bug logiciel, surcharge ou écran tactile défectueux
Annulation tardive	              Commande déjà en cours de préparation


4)Optimisations Possibles
Optimisation	Description
Paiement mobile/app	Paiement rapide, précommande via application mobile
Machine connectée	Notifications automatiques, gestion à distance, intégration cloud
Interface utilisateur	Écran tactile interactif, interface vocale, support multilingue
Analyse intelligente	Données de consommation analysées pour recommandations ou prédictions
Réduction d’énergie	Mise en veille intelligente, économies d’énergie
Maintenance prédictive	Capteurs pour anticiper les pannes et optimiser les interventions techniques
Réapprovisionnement automatique	Alertes en cas de niveau critique des stocks
Programme de fidélité	Points accumulés, réductions personnalisées, cartes de membre

5)Modélisation du Système
La modélisation du système repose sur une structure orientée objet, avec des classes représentant les entités clés et leurs interactions. Ci-dessous, un aperçu des principales classes et de leurs responsabilités :

Entités principales
Classe	Description
MachineCafe	Représente la machine dans son ensemble : gestion des stocks, de l’état, etc.
Boisson	Type de boisson avec nom, ingrédients nécessaires, prix, temps de préparation
Commande	Représente une commande passée par un client
Paiement	Gère les méthodes de paiement (espèces, carte, mobile)
Stock	Suivi des niveaux d’ingrédients (eau, lait, café, sucre...)
Utilisateur	Abstraction de tout acteur (Client, Technicien, Admin)
Technicien	Sous-classe d’Utilisateur, accède aux fonctions de maintenance
Administrateur	Sous-classe d’Utilisateur, gère les statistiques et paramètres
Transaction	Enregistre chaque vente ou remboursement
Entretien	Planifie et historise les opérations de maintenance
