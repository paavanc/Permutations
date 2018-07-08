# Permutations

Running Locally:

Pre-req: Java8 and Maven3

#### Installation for mac:

1. Install HomeBrew: 
```
/usr/bin/ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)"
```

2. Install Java:

   1.  ```brew tap caskroom/versions```
   
   2.  ```brew cask install java8```
   
3. Install Maven:

   ```brew install maven```

      In the terminal, run the following command in the Permutations directory.

      1. ```mvn package```

          * this command runs all the tests and package up a jar in the Permutations/target directory

      2. cd into Permutations/target 

      3. run the command:  ```java -jar translate-0.0.1-SNAPSHOT.jar 10X10X0```

         * the argument is a string with 1s, 0s and Xs. ex: 1x0

#### Example: 

```
java -jar translate-0.0.1-SNAPSHOT.jar 10X10X0
1011010
1011000
1001010
1001000
````

#### Performance:

This solution runs in 2^n, as we recursively print our answer.

#### Assumptions:

Assume the string only has 1s, 0s or Xs.

#### Important files:

* /src/main/java/com/permutation/translate/manager/impl/PermutationManagerImpl.java - source code
* /src/test/java/com/permutation/translate/TranslateApplicationTests.java - tests
