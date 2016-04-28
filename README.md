# UnivLang_Clojure

Université des languages sur Clojure

## Pré-requis

### Java 6 ou plus

### Leiningen

Installez leiningen en suivant les instructions disponibles sur http://leiningen.org/

Vous pouvez tester que tout fonctionne tapant dans la console

    lein repl
    
Pour quitter le repl tapez

    exit
    
Créez un projet en tapant la ligne suivante dans la console :

    lein new app univ
    

### IDE

Vous avez le choix les meilleurs étant Cider+Emacs et Cursive (IntelliJ). La liste complète est ici : http://www.clojurenewbieguide.com/

Si vous optez pour Cider+Emacs vous pouvez copier le répertoire .lein de ce repo si vous voulez avoir ma conf de leiningen. 

Personnellement j'utilise la distribution Spacemacs qui est très simple à configurer, je vous ai aussi mis mon .spacemacs dans le repo. Il redéfinit notamment des raccourcis pour "slurp" et "barf", qui sont des fonctions de manipulation des parenthèses très utiles pour manipuler du code Lisp.

Si vous optez pour un autre éditeur que Emacs ou Cursive trouvez comment vous connecter au REPL depuis l'éditeur pour exécuter votre code depuis celui-ci). 

Sur Emacs ce sera cider-jack-in (C-c M-c) pour se connecter et cider-eval-last-sexp (C-c C-e) pour exéctuer la S-expression précédent votre curseur.

## Documentation

Le cheatsheet officiel est très bien : http://clojure.org/api/cheatsheet

De plus http://clojuredocs.org/ vous permettra de trouver facilement les descriptions et les exemples pour les fonctions de clojure.core, gardez le sous la main.


## Programme de la soirée

### REPL et workflow
### Concepts de base
### Unit testing
### Koans
