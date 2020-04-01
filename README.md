# java 8 functional programming example

### how to run (Windows)
	md out
	cd src\net\java_school\examples\
	javac -d ..\..\..\..\out *.java
	cd ..\..\..\..\
	java -cp out net.java_school.examples.MovieTest

### How to run (Linux)
	javac -d out -sourcepath src $(find src -name "*.java")
	java -cp out net.java_school.examples.MovieTest
