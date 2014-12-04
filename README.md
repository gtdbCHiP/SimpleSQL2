SimpleSQL2 Query Optimizer (aka SimpleSQLNoGradle) 
=================
Improvements on the SimpleSQL project developed by fellow Georgia Tech Students for CS 6422. 

This software is developed for CS6422 Fall 2014.


Overview 
=================
SimpleSQL is a SQL-query processor engine that analyzes user queries and calculates the best and the worst relational algebra representations that can be used to represent the original query logic. The relational algebra representations are converted into a tree and displayed via the GUI output. To optimize the SQL queries, SimpleSQL uses two main heuristics - converting cartesian products to natural joins, and pushing selections down as far as possible in the tree. However, these two heuristics are not complete - SimpleSQL does have some limitations when it comes to using these heuristics. 

In our project, we have developed three new heuristics to overcome the limitations of the existing implementation. The three heuristics are: 
- Reordering relations based on relation size for joins
- Pushing all selections down to relations
- Reordering nodes based on intermediate results for join




How we made SimpleSQL2 independent from any IDE or build automation tool
=================
1 Create new Java Eclipse Project 
2 Import src code 
3 Download required libraries (already included in /lib of project folder) 
4 Add jar libraries to build path 
5 Generate SimpleSQL Parser and Lexer files from SimpleSQL.q4 from antrl folder (in original branch) 
5.1 Go to http://www.antlr.org/ and download full version 
5.2 Open Command Line 
5.3 Execute SET CLASSPATH=.;C:\Users\Luppy\Desktop\antlr-4.4-complete.jar;%CLASSPATH%
5.4 Execute java org.antlr.v4.Tool SimpleSQL.g4
6 Copy the generated files into the SimpleSQL src code package in Eclipse 
7 Build and compile the Eclipse project 


Websites for libraries 
=================
- https://code.google.com/p/treelayout/downloads/list
- https://code.google.com/p/guava-libraries/
- http://www.antlr.org/

Tutorials 
=================
- https://theantlrguy.atlassian.net/wiki/display/ANTLR4/Getting+Started+with+ANTLR+v4
