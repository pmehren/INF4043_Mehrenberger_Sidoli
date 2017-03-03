# TP Architecture Logicielle / Inf4043 - 2017 - Jeux de lettres

## Projet LetterGame : (Jeu à 2 players) En ligne de commande
- Objectif: Le premier joueur ayant 10 mots gagne la partie !
  
 - Détermination du premier joueur grace à un tirage de lettre 
 => Chaque lettre a une valeur correspondante (1->A;2>B;3>C;...). Le joueur ayant retirer la lettre à plus petit valeur, commence.
 - Les lettres tirés sont ensuite placé dans un pot commun.
 - A chaque début du tour d'un joueur, il tire 2 lettres aléatoire à  rajouter au pot commun.
 - Lorsqu'un mot est entrée, les lettres composant le mot sont vérifiés afin de savoir si les lettres sont présentes dans le pot commun. 
 - Vérification du mot dans le fichier "dico.txt"
 - A chaque mot validé, les lettres utilisés sont suprimés du pot commun et le joueur "actif" rejoue.
   
## Comment lancer le jeu: 
- Placez-vous à l'emplacement du projet et ouvrez votre terminal, puis entrez les commandes suivantes:
```
$ sudo mvn package
$ sudo java-cp target/LetterGame-1.0.0-SNAPSHOT.jar fr.esiea.binome.Mehrenberger_Sidoli.app
```

## Problème rencontrés 
- Implémentation d'une fonctionnalité permettant de voler un mot de l'adversaire avec un autre mot composé du mot volé.
  => Nous avions prévu de remplir un tableau de mots caché (TabMotsCache.java) qui regrouperai tout les mots validés et enregistrés. 
  Ainsi il aurait été possible de parcourrir le tableau et devérifier s'il ya possibilité de vol de lettres. 

- Nous n'avons pas eule temps de faire une fonction gérant le cas de l'anagramme

- L'implementation d'une intelligence artificiel permettant de jouer contre l'ordinateur.
  =>Nous n'avons pas réussi a ce que l'IA agisse en totale autonomie.
 
- Nous avons utilisé maven mais pour une raison que nous ignorons la command mvn package ne s'effectue pas. 
 => A notre grand regret, il n'est donc pas possible d'ouvrir le projet sans l'intermédiaire d'un IDE.
 
## Ce qui a été fait:

- Le TP LetterGame est sur github et donc peut être gérer via Git.
- Plusieurs commits ont été fait par les membres du binome. 
- Le projet est bien sur rendu en Java. 
- Nous avons utilisé  `Maven` `JUnit` et effectuer de nombreux tests (vérification dans le dico, les mots avec accents, etc.).
- Nous avons reussi à faire en sorte ce qu'il y est recherche des mots entrés dans le dico.txt 
- Et cela en prennant en compte les mots avec accents ou les mots composés(avec trait d'union)
- Toutes les fonctionnalités hormis le vol de lettres et l'IA, fonctionne comme il faut.
   
## Description de votre architecture (Quel responsabilité à chaque package, ..).
- De plus, vous devrez illustrer trois principes SOLID ou design pattern en utilisant vos propres classes. 
  - pourquoi avez-vous utilisé ce design pattern / principe ? Qu'est-ce que cela vous a apporté ? Comment l'avez-vous appliqué ?
  - Nous attendons quelques paragraphes seulement
===> Ces deux exercices sont à livrer dans le README.md du projet.
(


