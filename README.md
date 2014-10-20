SimpleSQLNoGradle
=================

Eclipse Project for SimpleSQL with no requirement to use Gradle or IntelliJ. 
However, does not genereate the GUI for trees.


How I did it (for documentation)
=================
1) Create new Java Eclipse Project 
2) Import src code
3) Download required libraries (already included in /lib of project folder)
4) Add jar libraries to build path
5) Generate SimpleSQL Parser and Lexer files from SimpleSQL.q4 from antrl folder (in original branch)
  5.1) Go to http://www.antlr.org/ and download full version 
  5.2) Open Command Line 
  5.3) Execute SET CLASSPATH=.;C:\Users\Luppy\Desktop\antlr-4.4-complete.jar;%CLASSPATH%
  5.4) Execute java org.antlr.v4.Tool SimpleSQL.g4
  
6) Copy the generated files into the SimpleSQL src code package in Eclipse 
7) Build and compile the Eclipse project 


Websites for libraries 
=================
- https://code.google.com/p/treelayout/downloads/list
- https://code.google.com/p/guava-libraries/
- http://www.antlr.org/

Tutorials 
=================
- https://theantlrguy.atlassian.net/wiki/display/ANTLR4/Getting+Started+with+ANTLR+v4
