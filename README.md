# WordHistogram

This Java project implements a simple word histogram.

## Description
The program analyzes a text string, counts the frequency of each word, and allows querying the count of a specific word.

## Project Structure
- `Main.java`: Main class to run the program.
- `WordHistogram.java`: Class responsible for analyzing and counting words.
- `MyIterator.java`: (Optional) Custom iterator implementation, if needed.

## How to Run
1. Compile the Java files:
   ```sh
   javac src/*.java
   ```
2. Run the main program:
   ```sh
   java -cp src Main
   ```

## Example Usage
The program analyzes the string:
```
hello, my name is raquel Raquel
```
And prints the count for the word "raquel" (case-insensitive).

