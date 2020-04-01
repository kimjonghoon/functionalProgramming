# java 8 functional programming example

### how to run (Windows)
	cd src\net\java_school\examples\
	javac -d ..\..\..\..\out *.java
	xcopy src\movies.txt out
	cd ..\..\..\..\
	java -cp out net.java_school.examples.MovieTest

### How to run (Linux)
	javac -d out -sourcepath src $(find src -name "*.java")
	cp src/movies.txt out/
	java -cp out net.java_school.examples.MovieTest
