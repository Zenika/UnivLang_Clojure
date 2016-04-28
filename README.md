# UnivLang_Clojure

Université des languages sur Clojure

## Pré-requis

### Java 6 ou plus

### Leiningen

Installez leiningen en suivant les instructions disponibles sur http://leiningen.org/

Vous pouvez tester que tout fonctionne tapant dans la console

    lein repl
    
    (+ 1 1) ; doit retourner 2 :)
    
Pour quitter le repl tapez

    exit
    
Créez un projet en tapant la ligne suivante dans la console :

    lein new app univ
    

### IDE

Les deux environnements de développement les plus complets et les plus populaires sont Cider+Emacs et Cursive (IntelliJ). La liste complète est ici : http://www.clojurenewbieguide.com/

Personnellement j'utilise la distribution Spacemacs d'Emacs qui est très simple à configurer. Vous trouverez dans le répo mon .spacemacs qui redéfinit notamment des raccourcis pour "slurp" et "barf". Ce sont des fonctions de manipulation des parenthèses très utiles pour travailler sur du code Lisp.

Si vous optez pour Cider+Emacs vous pouvez également copier le répertoire .lein de ce repo pour avoir maconf de leiningen. 

**Si vous optez pour un autre éditeur que Emacs ou Cursive trouvez comment vous connecter au REPL depuis l'éditeur pour exécuter votre code depuis celui-ci.**

Sur Emacs ce sera cider-jack-in (C-c M-c) pour se connecter et cider-eval-last-sexp (C-c C-e) pour exéctuer la S-expression précédent votre curseur.

## Documentation

Le cheatsheet officiel est très bien : http://clojure.org/api/cheatsheet

De plus http://clojuredocs.org/ vous permettra de trouver facilement les descriptions et les exemples pour les fonctions de clojure.core, gardez le sous la main.

Pour ceux qui n'auront pas préparé leur environnement vous pourrez évaluer la plupart du code que nous utiliserons sur http://web.clojurerepl.com/

## Programme de la soirée

### REPL et workflow

    lein repl
    

### Concepts de base

#### Structures de données


### Koans

    lein auto test
    
http://exercism.io/exercises/clojure/
