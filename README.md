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
---
### Constructors
- It is used to initialize an object
- Is a block(similiar to method) having same name as that of class name
- Does not have any return type - not even void
- The only modifier applicable to modifier
	- public
	- protected
	- private
	- default
- It executes automatically when we create an object
	- 2 Ways to call constructor
		- Test t = new Test();
		- new Test(); (no need to create reference in this case t)
- Note: Constructor doesn't create object, Object is created by new keyword

Types in Constructors
1. Default Constructor - No arg constructor
	1. Compiler creates default constructor
	2. If there is no constructor created, the compiler creates one by default
	3. If the user creates even one constructor the compiler will not create a default constructor
2. User Defined Constructor - No arg constructor
	1. User creates this constructor with no arguments
3. Parametrized Constructor
	1. User created this constructor with arguments
		1. Test(String name){}
		2. If an argument is give the user has to pass the variable that was provided when as in argument when creating the constructo

Why doesn't constructor have a return type
1. Constructor's main job is to initialize an object. 
2. When compiler creates a default constructor, it cannot judge what return type to add
