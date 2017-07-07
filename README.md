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

* [Java Platform (JDK) 1.8](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
* [Apache Maven 3.x](https://maven.apache.org/download.cgi)

### Instruction 
Follow this instructions if you want to install the [Spring Boot](https://spring.io/guides/gs/spring-boot/).

[Download](https://github.com/ieofong/roman-calculator/archive/master.zip) and unzip the source repository for this project, or clone it using Git:
`git clone https://github.com/ieofong/roman-calculator.git`


### Build & Run
1. open command line and cd into project directory
2. `mvn package`
3. `java -jar target/roman-calculator-0.0.1-SNAPSHOT.jar "path//of//input.txt"`
