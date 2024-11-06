# Day8 Tasks

Question1:
    Implement Muliple inhertance with traits
   
Trait GetStarted --> has implemented method prepare(also check if it is abstract)
Trait Cook extends GetStarted --> has implemented method prepare (super.prepare call must be there)
Trait Seasoning ---> has implemented method applySeasoning
Class Food extends Cook with Seasoning --> Has implemented method prepareFood
          that calls prepare and Seasoning

          the order of execution must be

          GetStarted prepare
          Cook prepare
          Seasoning applySeasoning

Check whether there is need of abstract override and comment why in the submisstion


Question 2
----------

trait Task --->  doTask (implemented method)
trait Cook  extends Task --> doTask (override)
trait Garnish extends Cook --> doTask (overide)
trait Pack extends Garnish --> doTask (overide)
class Activity extends Task---> doActivity ---> Call for doTask


create object in main method 

val:Task = new Activity with Cook with Garnish with Pack

observe the behavior

observe the behavior by changing the order of inheritance

question 3:

	1. Define a Case Class:
Create a case class named Candidate with the following fields:
- sno (Int): Serial number of the candidate.
- name (String): Name of the candidate.
- city (String): City of the candidate.
	2. Sample Data (Array of Tuples):
Here are the 50 records that you need to insert into the database:
val candidateData: Array[(Int, String, String)] = Array(
      (1, "Alice", "New York"),
      (2, "Bob", "Los Angeles"),
      (3, "Charlie", "Chicago"),
      (4, "Diana", "Houston"),
      (5, "Eve", "Phoenix"),
      (6, "Frank", "Philadelphia"),
      (7, "Grace", "San Antonio"),
      (8, "Hank", "San Diego"),
      (9, "Ivy", "Dallas"),
      (10, "Jack", "San Jose"),
      (11, "Kathy", "Austin"),
      (12, "Leo", "Jacksonville"),
      (13, "Mona", "Fort Worth"),
      (14, "Nina", "Columbus"),
      (15, "Oscar", "Charlotte"),
      (16, "Paul", "San Francisco"),
      (17, "Quinn", "Indianapolis"),
      (18, "Rita", "Seattle"),
      (19, "Steve", "Denver"),
      (20, "Tina", "Washington"),
      (21, "Uma", "Boston"),
      (22, "Vince", "El Paso"),
      (23, "Wendy", "Detroit"),
      (24, "Xander", "Nashville"),
      (25, "Yara", "Portland"),
      (26, "Zane", "Oklahoma City"),
      (27, "Aiden", "Las Vegas"),
      (28, "Bella", "Louisville"),
      (29, "Caleb", "Baltimore"),
      (30, "Daisy", "Milwaukee"),
      (31, "Ethan", "Albuquerque"),
      (32, "Fiona", "Tucson"),
      (33, "George", "Fresno"),
      (34, "Hazel", "Mesa"),
      (35, "Ian", "Sacramento"),
      (36, "Jill", "Atlanta"),
      (37, "Kyle", "Kansas City"),
      (38, "Luna", "Colorado Springs"),
      (39, "Mason", "Miami"),
      (40, "Nora", "Raleigh"),
      (41, "Owen", "Omaha"),
      (42, "Piper", "Long Beach"),
      (43, "Quincy", "Virginia Beach"),
      (44, "Ruby", "Oakland"),
      (45, "Sam", "Minneapolis"),
      (46, "Tara", "Tulsa"),
      (47, "Ursula", "Arlington"),
      (48, "Victor", "New Orleans"),
      (49, "Wade", "Wichita"),
      (50, "Xena", "Cleveland")
    )
    
	3. Database Setup:
Use MySQL as the database.
Create a table named `candidates` with columns that match the fields of the Candidate case class:
- sno (INT): Primary key.
- name (VARCHAR): Name of the candidate.
- city (VARCHAR): City of the candidate.
	4. Implicit Conversion from Tuple to Candidate:
Implement an implicit conversion that allows a tuple (Int, String, String) to be automatically converted into a Candidate instance. The conversion should happen automatically whenever a tuple is passed to a method expecting a Candidate.
	5. Insert Method:
Define a method with the signature def insertMethod(candidate: Candidate): Unit.
This method should perform the actual insertion into the `candidates` table in the database.
Ensure that the insertMethod can accept both Candidate instances and tuples, utilizing the implicit conversion when necessary.
	6. Database Insertion Process:
Iterate over the array of candidate tuples (candidateData) and use insertMethod to insert each record into the database.
Confirm that the implicit conversion works correctly by calling insertMethod on each tuple without manually converting it to Candidate.
	7. Verification:
After insertion, verify that all 50 records have been inserted into the database by querying the candidates table.

Question 4:
-------------

Create a Topic with 3 Partitions and 
Replication Factor 2

Create multiple producers using CLI

Create Two Consumer groups
   1. multiple consumers in the group
   2. only one consumer in the group

Outcomes:
    - Check how the consumers consume it
    - How partitions are alloted to consumers
    - How re allocation happens if a new consumer
    is added
    - How reallocation happens if a consumer is 
    Removed