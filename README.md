# Roman Calculator

Program calculate Roman numeral. Read input from a text file.

```
For example
o   “XX” + “II” = “XXII”
o   “II” + “II” = “IV”
o   “XIV” + “LX” = “LXXIV”
o   “V” + “V” = “X”
```

Input file format

```
XX+II
II+II
XIV+LX
V+V
```

Output format

```
XXII
IV
LXXIV
X      	
```

### Prerequisites

* [Java Platform (JDK) 7](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
* [Apache Maven 3.x](http://maven.apache.org/)

### Instruction 
Follow the instructions in our main documentation if you want to install the [Spring Boot CLI](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#getting-started-installing-the-cli).


### Build & Run
-----------
1. open command line and then go to project directory
2. `mvn package`
3. `java -jar target/roman-calculator-0.0.1-SNAPSHOT.jar "input file path"`
