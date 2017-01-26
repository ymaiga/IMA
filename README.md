# Objectif du projet

Ce projet universitaire a pour but de mettre en pratique les acquis du cours d'Ingénierie des modèles de l'ESIR pour l'année universitaire 2016/2017 dans lequel la notion de DSL (Domain Specific Language) était au centre. 

A partir d'un métamodel Ecore de récupération et d'analyse de tweets que nous avons mis en place, l'objectif était de mettre en place :

- Un éditeur graphique avec Sirius
- Un générateur de code qui génère du code java allant rechercher des tweets et des traitements à ces derniers selon les commandes du métamodèle.

# Métamodèle 
![](./images/MetaModel.jpg)

# Exemples de programme  
- Récupérer tous les tweets de toto ayant #UsaLections et les afficher. 

![](./images/sample1.jpg)

- Récupérer d'une part tous les tweets de toto ayant #UsaLections et les afficher et d'autre part si le nombre de tweets de Toto est supérieur à 50, filtrer ceux dans lesquels est mentionné France puis les afficher, sinon chercher tous ses followers.

![](./images/sample2.jpg)

# Note d'installation 

Il faut au préalable avoir eclipse modeling et s'assurer que les packages Acceleo et Sirius sont présents.

- Faire un clone du 
```sh
  git clone https://github.com/ymaiga/IMA.git
```

- Importer dans eclipse les projets :
  - ImaModel2
  - ImaModel2.edit
  - ImaModel2.editor
  - ImaModel2.tests
  
 - Toujours dans eclipse, faire un clic droit sur le projet et faire : run as > Eclipse Application 
 
 Une nouvelle instance d'eclipse se lance. Dans cette nouvelle instance, il faut importer les projets suivants dans la nouvelle instance d'eclipse :
 
 - myproject.desing
 - esir3.ima.twitter.compilator 
 
 Il faut aussi le importer le projet lib (qui est de type maven). 
 Avant de lancer la génération de code, il faut specifier ses clés developpeurs en argument avant d'executer les codes générés comme ceci : 
 
 ```
 -Dtwitter4j.debug=true 
 -Dtwitter4j.oauth.consumerKey=
 -Dtwitter4j.oauth.consumerSecret=
 -Dtwitter4j.oauth.accessToken=
 -Dtwitter4j.oauth.accessTokenSecret=
 ```
 
 Afin d'utiliser les commandes plot qui utilise R, il faut au préalable avoir R installé sur son poste, ajouter le package "Rserve" et lancer une instance de la librairie commme suit :
 
 ```R
install.package("Rserve")

library("Rserve")

# Lancer une instance du serveur Rserve afin que le code Java on puisse appélé les fonctions R 

Rserve()

 ```
 
 Pour compiler le projet, il faut renseigner les champs suivants dans run configurations: 
 
 ![](./images/runConfigurations.JPG)

  - Model : Choisir le fichier xmi 
  - Target: Chemin du répértoire où l'on veut génerer le code JAVA

# Technologies utilisées 

  - Sirius, Acceleo, Java, Twitter4J, RServe

# TODO
- Implementer la commande followers 
- Enrichir la liste des commandes de stats sur les tweets
