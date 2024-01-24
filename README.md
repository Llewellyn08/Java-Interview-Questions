# Java Interview Questions and Concepts Repository

Welcome to the Java Interview Questions and Concepts repository! This repository is designed to help you prepare for Java programming interviews by providing a comprehensive collection of Java-related questions and concepts. Whether you're a beginner or an experienced developer, this repository aims to cover a wide range of Java topics that are commonly asked during interviews.

### OOPs
- Object Oriented Programming Language
- Programming Paradigm or Methodology
- 6 Main Pillars of OOPs
	- Classes
	- Objects and Methods
	- Encapsulation
	- Inheritance
	- Polymorphism
	- Abstraction

Example of Classes Objects and Methods(Example is used further down in notes)

Class: Animal
Objects:
1. Dog
2. Cat
Methods:
1. eat()
2. run()

Classes
1. Class is the collection of objects
2. Class is not a real world entity. It is just a template or blueprint or prototype
3. Class does not occupy memory  
4. Syntax: access-modifier class ClassName {
	1. methods
	2. constructors
	3. fields
	4. blocks
	5. nested class }

Methods
1. A set of code which performs a particular task
2. Advantages of Methods:
	1. Code Reusability
	2. Code Optimization
3. Syntax:
	1. access-modifier return-type methodName(list of parameters){
		1. }
4. Object is required to run a method

Objects
1. Object is an instance of class
2. Object is real world entity
3. Object Occupies Memory
4. Object consists of:
	1. Identity :- name(unique)
	2. State/Attribute :- color, breed, age
	3. Behavior:-  eat, run, bark
5. How to create an object:-
	1. new keyword
	2. newInstance() method
	3. clone() method
	4. deserialization
	5. factory methods
6. Creating object with new keyword
	1. Declaration:- Animal pluto;
	2. Instantiation: pluto=new Animal();
		1. Memory allocated to object
		2. Reference of the object that was created is returned from the new keyword
	3. Initialization: pluto=new Animal();
		1. In initialization the values are put into the memory that was allocated
	4. Syntax: Animal pluto = new Animal();

How to call method with object
Syntax: pluto.run();

How to initialize an object:
1. Using reference variable
	1. ![[Pasted image 20240125033835.png]]
2. Using method
	1. ![[Pasted image 20240125034027.png]]
