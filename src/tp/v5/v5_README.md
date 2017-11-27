# Fil_rouge v5
**IMT ATLANTIQUE, GIPAD 2017-2018, ARCHITECTURE LOGICIELLE** 
**Date de dernière modification** : 26/11/2017


# AUTEURS
**Professeur encadrant** : Hervé Grall  
**Étudiants** : Clara TERSEN, Gabrielle Panizzoli, Denis LY  




# OBJECTIFS

L'objectif de ce projet est de comparer les structures de données mutables à celles immutables. Nous avons considéré l'exemple des files FIFO ("First In, First Out" i.e. premier arrivé, premier sorti). Après la définition de l'interface des files, plusieurs implémentations seront données, avec des propriétés ou des usages différents : mutabilité ou non, persistance ou non.
Les critères de comparaison utilisés seront : la complexité structurelle, la complexité opérationnelle en temps et en espace.

# PRINCIPES DE CONCEPTION

# PRINCIPES DE NOMMAGE

Les conventions utilisées sont les conventions classiques qui peuvent être retrouvées sur le l'adresse suivante : http://www.iwombat.com/standards/JavaStyleGuide.html.
Cette partie est un résumé des conventions utilisées. Le lecteur est libre de consulter la ressource citée précedemment s'il souhaite davantage de précisions.

Peu importe l'objet qui doit être nommé, le nom doit être assez explicite pour qu'il n'y ait aucune confusion possible sur le rôle joué par l'objet.

**Package/Paquet**  
Tous les noms des packages sont en minuscule et dans le cas d'un nom à plusieurs mots, ces mots ne sont en aucun cas séparés par un espace.
Dans notre cas : etat, fabrique, file

**Class/Classe**  
Le nom de la classe devrait toujours être un nom commun. Les verbes sont à proscrire. La première lettre doit toujours être en majuscule et le nom doit être gardé au singulier.
Dans notre cas : FileMutable

**Interface**  
Le nom de l'inteface devrait toujours un adjectif donnant une description des classes qui l'implémentent. Quand cela est possible, il faut choisir un nom se terminant par "-able" . La première lettre doit toujours être en majuscule et le nom doit être gardé au singulier.
Dans notre cas : File, FabriqueFileMutable

**Method/Méthode**  
Les méthodes sont en général des verbes mais des noms peuvent également être utilisés pour certains cas (accesseurs par exemple. Le nom doit être assez explicite pour comprendre ce que fait la méthode rien qu'en lisant son nom.

**Variable**  
Le nom des variables sont en général écrits complètement et doit refléter son but. S'il est composé de plusieurs mots, ils doivent alors tous être collés et la première lettre de chaque mot doit être en majuscule, à l'excepetion du premier mot.


# COMPLEXITÉ DES OPÉRATIONS

## File

**estVide()**
Complexité en O(1).

**ajout(K)**
Complexité en O(n) avec n la taille de la file.

## FileImmutable

**ajout(E)**
Complexité en O(1).

**retrait()**
Complexité en O(1).

**ajout(File<E>)**
Complexité en O(n) avec n la taille de la file.

## FileMutable

**suivants()**
Complexité en O(1).

**ajout(E)**
Complexité en O(1).

**retrait()**
Complexité en O(1).

# GUIDE POUR LANCER LES TESTS

Les tests sont rassemblés dans la classe Test.
Il y a une fonction qui teste les iles mutables, et une autre qui teste les files non immutables. Les différents temps de calcul sont calculés et comparés dans la fonction anayseComparative.
On a ajouté un paramètre n qui fixe la taille (le nombre d'ajouts et de retraits) du test.

# COMPARATIF DES PERFORMANCES

Nous avons comparé les différents temps d'exécutions dans la classe test, dans la fonction analyseComparative. 

