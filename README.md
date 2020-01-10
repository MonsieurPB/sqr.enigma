# TP 4A SQR 2019-20: enigma
Code for the German Enigma machine used in WW2.

## Questions
- Fork this github repository
- Run the project
- Comment the 2 classes
- Complete the next section : functions to be tested
- Commit your changes (commit README.md)
- Make tests (call your test functions using the rule: GIVEN_WHEN_THEN) 
- Commit your changes
- On github, make a pull request 
- that ends

## Functions to be tested
Hereafter, for each classes give function to be tested 

### Classe Machine
#### functions
1) Tests à effectuer sur la fonction initRotors :
-Pouvoir tester si les élément sont égaux à ceux donné (* B III IV)

2) Tests à effectuer sur la fonction setPositions :
-Vérifier si les éléments se plaçent suivant leur indice, par exemple :
"Je test si à l'indice [0], se trouve le reflector ou pas"

3) Tests sur la fonction configure :
-La fonction fait appel à deux autres fonctions, initRotors et setPositions.
Il n'est pas jugé utile d'effectuer des tests car ceux-ci seront réaliser séparemment 
pour chaque fonction.

4) Tests pour la fonction convert :
-Vérifier si la fonction converti bien la chaîne en MAJUSCULES


### Classe Reflector
#### function
1) Tests sur la fonction reflectorFactory :
-

2) Tests sur la fonction convertForward :
-

3) Tests sur la fonction convertBackward :
-On peut tester si l'exception est bien relevée 

### Classe Rotor
#### function
1) Tests sur la fonction rotorFactory :
-Vérifier les cas "IF : s.length == 2"

2) Tests sur les fonctions convertForward et convertBackward :
-

3) Tests sur la fonction advance :
-Effectuer un test pour savoir si le rotor change bien de position

## Tricks & tips

- Never test auto generate code
- Never test creator (its a design problem)
- Use @Test before each testFunction !
- When you test a void function of the class Rotor, then test the rotor instance's state
> Rotor r=new Rotor();
> int actual = r.getosition();
- You can test a function than throws an exception with the argument: expected
> @Test(expected=Exception.class)

## Documentation and validation set
### How simulate Enigma machine:
- https://korben.info/enigma-le-simulateur.html
- https://observablehq.com/@tmcw/enigma-machine
### Configuration code :
- * B III IV I AXLE
- FROM his shoulder Hiawatha / HYIHL BKOML IUYDC MPPSF SZW
- Took the camera of rosewood / SQCNJ EXNUO JYRZE KTCNB DGU



 