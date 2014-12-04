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


Future Work / Wish List 
=================
SimpleSQL2 has definitely room for futher improvement. We have identified the following areas below that have the potential for future work: 
- Ability to support indexes on the data, and for the program to make use of index information to select the best implementation strategy for the operators 
- Identifying selectivity factors for range comparisons, or for data with similar values (e.g. first name = "George")
- Selecting the best algorithm for evaluating relational algebra operators (based on attributes affected, availability of index, and data layout on disk)
- Understanding the context of which the original developers calculated their estimated size, and how they intended to use it
- Allowing users to specify how the data is stored on disk so as to calculate disk access time 
- Mapping database files to backend data and measuring how fast the best case and worst case query will take (can be used to compare effectiveness of optimizations)


How we made SimpleSQL2 independent from IDE or build automation tool
=================
- Create new Java Eclipse Project 
- Import src code 
- Download required libraries (already included in /lib of project folder) 
- Add jar libraries to build path 
- Generate SimpleSQL Parser and Lexer files from SimpleSQL.q4 from antrl folder (in original branch) 
- Go to http://www.antlr.org/ and download full version 
- Open Command Line 
- Execute SET CLASSPATH=.;C:\Users\User\Desktop\antlr-4.4-complete.jar;%CLASSPATH%
- Execute java org.antlr.v4.Tool SimpleSQL.g4
- Copy the generated files into the SimpleSQL src code package in Eclipse 
- Build and compile the Eclipse project 


Websites for libraries 
=================
- https://code.google.com/p/treelayout/downloads/list
- https://code.google.com/p/guava-libraries/
- http://www.antlr.org/

Tutorials 
=================
- https://theantlrguy.atlassian.net/wiki/display/ANTLR4/Getting+Started+with+ANTLR+v4
