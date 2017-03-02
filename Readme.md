# TP Architecture Logicielle / Inf4043 - 2017 - Jeux de lettres

## Projet LetterGame : (Jeu à 2 players) En ligne de commande
- Objectif: Le premier joueur ayant 10 mots gagne la partie !
  
 - Détermination du premier joueur grace à un tirage de lettre 
 => Chaque lettre a une valeur correspondante (0->A;1->B;2->C;...). Le joueur ayant retirer la lettre à plus petit valeur, commence.
 - Les lettres tirés sont ensuite placé dans un pot commun.
 - A chaque début du tour d'un joueur, il tire 2 lettres aléatoire à  rajouter au pot commun.
 - Lorsqu'un mot est entrée, les lettres composant le mot sont vérifiés afin de savoir si les lettres sont présentes dans le pot commun.  
 - Vérification du mot dans le fichier "dico.txt"
 - A chaque mot validé, les lettres utilisés sont suprimés du pot commun et le joueur "actif" rejoue.
   
## Comment lancer le jeu: 
- Placez-vous à l'emplacement du projet et ouvrez votre terminal, puis entrez les commandes suivantes:
```
$ sudo mvn package
$ sudo java-cp target/LetterGame-1.0.0-SNAPSHOT.jat fr.esiea.binome.Mehrenberger_Sidoli.app
```

## Problème rencontrés 
- Comment faire un mot ? en prenant un mot de ces adversaires (toutes les lettres du mot) et en lui rajoutant des lettres du pot commun
- En rallongeant un de ces mots avec des lettres du pot commun ou en utilisant un autre mot (toutes les lettres)
- Accent, anagrammes et mots composés



- Nous attendons aussi a minima une de ces deux extensions (ou les deux pour les plus courageux :-)) :
  - Une architecture client / serveur, chaque joueur utilisant une instance d'un client pour jouer.
  - Une intelligence artificiel permettant de jouer contre l'ordinateur.
  
## Description de votre architecture (Quel responsabilité à chaque package, ..).
- De plus, vous devrez illustrer trois principes SOLID ou design pattern en utilisant vos propres classes. 
  - pourquoi avez-vous utilisé ce design pattern / principe ? Qu'est-ce que cela vous a apporté ? Comment l'avez-vous appliqué ?
  - Nous attendons quelques paragraphes seulement
===> Ces deux exercices sont à livrer dans le README.md du projet.

## Remarques

- Le TP devra être rendu sur github et donc être gérer via Git
  - Plusieurs commits par personne sont attendus! 
- Le projet doit être rendu en Java. 

- Le projet devra pouvoir être compiler et lancer en ligne de commande (sans IDE) :
  - L'utilisation de `Maven`

- Le projet doit contenir des tests unitaires
  - Utilisation de `JUnit`
 
