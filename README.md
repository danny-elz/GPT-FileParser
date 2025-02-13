# FileParser

FileParser is a simple Java application that reads a file, removes specific characters (`*` and `#`), and writes the cleaned content to a new file. This is particularly useful for cleaning up text copied from ChatGPT, which may include these symbols.

### Build the Project

```sh
mvn clean install
```
## Usage

1. Update the file paths in `src/main/java/org/example/Main.java` to point to your input and output files.
2. Run the application using the command above.

### Run the Application

```sh
mvn exec:java -Dexec.mainClass="org.example.Main"
```
