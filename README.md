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
1) Tests � effectuer sur la fonction initRotors :
-Pouvoir tester si les �l�ment sont �gaux � ceux donn� (* B III IV)

2) Tests � effectuer sur la fonction setPositions :
-V�rifier si les �l�ments se pla�ent suivant leur indice, par exemple :
"Je test si � l'indice [0], se trouve le reflector ou pas"

3) 
configure
convert

### Classe Reflector
#### function
reflectorFactory
convertForward
convertBackward

### Classe Rotor
#### function
rotorFactory
convertForward
convertBackward
advance

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



 