# Fil_rouge v5
**Date de derni�re modification** : 26/11/2017


# AUTEURS

**IMT ATLANTIQUE, GIPAD 2017-2018, ARCHITECTURE LOGICIELLE**  
**Professeur encadrant** : Herv� Grall  
**�tudiants** : Clara TERSEN, Gabrielle Panizzoli, Denis LY  




# OBJECTIFS

L'objectif de ce projet est de comparer les structures de donn�es mutables � celles immutables. Nous avons consid�r� l'exemple des files FIFO ("First In, First Out" i.e. premier arriv�, premier sorti). Apr�s la d�finition de l'interface des files, plusieurs impl�mentations seront donn�es, avec des propri�t�s ou des usages diff�rents : mutabilit� ou non, persistance ou non.
Les crit�res de comparaison utilis�s seront : la complexit� structurelle, la complexit� op�rationnelle en temps et en espace.

# PRINCIPES DE CONCEPTION

# PRINCIPES DE NOMMAGE

Les conventions utilis�es sont les conventions classiques qui peuvent �tre retrouv�es sur le l'adresse suivante : http://www.iwombat.com/standards/JavaStyleGuide.html.
Cette partie est un r�sum� des conventions utilis�es. Le lecteur est libre de consulter la ressource cit�e pr�cedemment s'il souhaite davantage de pr�cisions.

Peu importe l'objet qui doit �tre nomm�, le nom doit �tre assez explicite pour qu'il n'y ait aucune confusion possible sur le r�le jou� par l'objet.

**Package/Paquet**  
Tous les noms des packages sont en minuscule et dans le cas d'un nom � plusieurs mots, ces mots ne sont en aucun cas s�par�s par un espace.
Dans notre cas : etat, fabrique, file

**Class/Classe**  
Le nom de la classe devrait toujours �tre un nom commun. Les verbes sont � proscrire. La premi�re lettre doit toujours �tre en majuscule et le nom doit �tre gard� au singulier.
Dans notre cas : FileMutable

**Interface**  
Le nom de l'inteface devrait toujours un adjectif donnant une description des classes qui l'impl�mentent. Quand cela est possible, il faut choisir un nom se terminant par "-able" . La premi�re lettre doit toujours �tre en majuscule et le nom doit �tre gard� au singulier.
Dans notre cas : File, FabriqueFileMutable

**Method/M�thode**  
Les m�thodes sont en g�n�ral des verbes mais des noms peuvent �galement �tre utilis�s pour certains cas (accesseurs par exemple. Le nom doit �tre assez explicite pour comprendre ce que fait la m�thode rien qu'en lisant son nom.

**Variable**  
Le nom des variables sont en g�n�ral �crits compl�tement et doit refl�ter son but. S'il est compos� de plusieurs mots, ils doivent alors tous �tre coll�s et la premi�re lettre de chaque mot doit �tre en majuscule, � l'excepetion du premier mot.


# COMPLEXIT� DES OP�RATIONS

## File

**estVide()**
Complexit� en O(1).

**ajout(K)**
Complexit� en O(n) avec n la taille de la file.

## FileImmutable

**ajout(E)**
Complexit� en O(1).

**retrait()**
Complexit� en O(1).

**ajout(File<E>)**
Complexit� en O(n) avec n la taille de la file.

## FileMutable

**suivants()**
Complexit� en O(1).

**ajout(E)**
Complexit� en O(1).

**retrait()**
Complexit� en O(1).

# GUIDE POUR LANCER LES TESTS

# COMPARATIF DES PERFORMANCES

