# MICROSERVICES

L'idée est de présenter l'implémentation des microservices: 

il existe deux type de projet:



## Microservice classique 

microservice/classique

/magasin-commande

/magasin-gateway

/magasin-service

## Microservice avec Spring cloud

microservice/spring-cloud

/store-commande

/store-gateway

/store-inventaire

/store-registry

/store-service



## Démarrage 

#### prérequis:  

Installer JDK 8 ou + 

#### build et lancer les projets

<repertoire du projet>/mvnw clean package 

<repertoire du projet>/ java -jar target/<nom du projet>.jar 

#### Consommer les endpoints 

http://localhost:8080/magasin/api/produits

http://localhost:8080/commande/api/commandes

par defaut le gateway du projet classique ecoute sur le port 8080

et pour le spring cloud le gateway ecoute sur le port 8084

http://localhost:8084/commande/api/commandes

http://localhost:8084/commande/api/commandes-produits

