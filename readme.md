# CSC109-Assignment-4

## Features

This repository was made to practice using branches and pull requests. It includes a simple example of a Student class and a driver class to test the Student class.

## About the Code

The starter code has been taken from Assignment 2, and it can be found at https://github.com/mattcmerritt/CSC109-Assignment-2. It consists of four classes:
* ``StudentTest.java``: Driver class with example students
* ``Student.java``: Contains information including name, email, year, and current grade
* ``Assignment.java``: Contains infomation including name, total points, and points earned
* ``Classroom.java``: Contains information including name and roster

## How to Run

To run the driver class, navigate to the ``src`` directory of the project in the command line, and run the following lines:

```
javac StudentTest.java
java StudentTest
```

Alternatively, you can import the project into your choice of IDE and run the file named ``StudentTest.java`` in the ``src`` directory.

## Expected Output

The output of running ``StudentTest.java`` should be the following:

```
Starting average: 0.0
Matthew (Email: matt@example.com), Year 1, Average: 100.0
Name: Matthew
Email: matt@example.com
Year: 1
Points Earned: 100
Total Points: 100
Final average: 96.0
Final grade: A

Assignment 1; Score: 100.0
Assignment 2; Score: 92.0
Assignment 3; Score: 96.0

Alice (Email: alice@example.com), Year 1, Average: 100.0
Alice's Grade: A
Bob (Email: bob@example.com), Year 3, Average: 0.0
Bob's Grade: F
Charles (Email: charles@example.com), Year 2, Average: 87.0
Charles's Grade: B
Daniel (Email: daniel@example.com), Year 4, Average: 75.0
Daniel's Grade: C

Math Class; Students: Alice, Bob, Charles, Daniel
Empty Class; Students: No students enrolled
```