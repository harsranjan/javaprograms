![](https://upload.wikimedia.org/wikipedia/commons/thumb/4/4c/UPES_Logo_without_Tagline.jpg/1200px-UPES_Logo_without_Tagline.jpg)

## JAVA LAB MANUAL UPES
### lab experiments


### EXPERIMENT – 2
## TITLE: *Basic Java Programming*

1. Write a program to find the largest of 3 numbers.

2. Write a program to implement a command line calculator. (Try for Add sub MulDivision in same program for 2 digits.)
   *Integer.parseInt will be used*
               For e.g. java calc 20 + 30
               *Output* should be Sum of 20 and 30 is 50

               java calc 50 * 30
               *Output* should be Product of 50 and 30 is 1500

3. Write a program to accept 10 student’s marks in an array, arrange it into ascendingorder, convert into the following grades and print marks and grades in the tabularform.Between 40 and 50 : PASSBetween 51 and 75 : MERITand above : DISTINCTIONfor example:Enter Marks: 503050503050Output should be sorted array with Grade like:55 Merit41 Pass29 Fail

4. WAP to Take input as DD MM YYYY(04 08 2021) in command line and calculatenumber of days since 1 January 1970.

5. WAP to print the following pattern using loops
      *
      ***
      *****


### EXPERIMENT – 3
## TITLE: *Basic Java Programming*

1. Write a program to accept three digits (i.e., 0 - 9) and print all its possible combinations.(For example if the three digits are 1, 2, 3 than all possible combinations are : 123, 132,213, 231, 312, 321.)

2. Write a Java Program to accept 10 numbers in an array and compute the square of eachnumber. Print the sum of these numbers.

3. Write a program to input a number of a month (1 - 12) and print its equivalent name ofthe month. ( e.g 1 to Jan, 2 to Feb. 12 to Dec.)

4. Write a program to find the sum of all integers greater than 40 and less than 250 that aredivisible by 5.


### EXPERIMENT – 4
## TITLE: *Inheritance*

1. Write a Java program to show that private member of a super class cannot be accessedfrom derived classes.

2. Write a program in Java to create a Player class. Inherit the classes Cricket _Player,Football _Player and Hockey_ Player from Player class.

3. Write a class Worker and derive classes DailyWorker and SalariedWorker from it. Everyworker has a name and a salary rate. Write method ComPay (int hours) to compute theweek pay of every worker. A Daily Worker is paid on the basis of the number of dayshe/she works. The Salaried Worker gets paid the wage for 40 hours a week no matter whatthe actual hours are. Test this program to calculate the pay of workers. You are expectedto use the concept of polymorphism to write this program.

4. Consider the trunk calls of a telephone exchange. A trunk call can be ordinary, urgent orlightning. The charges depend on the duration and the type of the call. Write a programusing the concept of polymorphism in Java to calculate the charges.

5. Design a class employee of an organization. An employee has a name, empid, and salary.Write the default constructor, a constructor with parameters (name, empid, and salary) andmethods to return name and salary. Also write a method increaseSalary that raises theemployee’s salary by a certain user specified percentage. Derive a subclass Manager fromemployee. Add an instance variable named department to the manager class. Supply a testprogram that uses theses classes and method


### EXPERIMENT – 5
## TITLE: *Package*

1. Write a Java program to implement the concept of importing classes from user definedpackage and created packages.

2. Write a program to make a package Balance. This has an Account class withDisplay_Balance method. Import Balance package in another program to accessDisplay_Balance method of Account class.

3. WAP to create a package p with class A with 4 types of access protected methods. Howwe will use these methods in different packages class i.e. there is main() in class B inpackage Q and 4 methods are in Class A in package p.


### EXPERIMENT – 6
## TITLE: *Interfaces*

1.	Write a program to create interface named test. In this interface the member function is square. Implement this interface in arithmetic class. Create one new class called ToTestInt. In this class use the object of arithmetic class.


2.	Write a program to create interface A, in this interface we have two method meth1 and meth2. Implements this interface in another class named MyClass.

3.	Write a program in Java to show the usefulness of Interfaces as a place to keep constant value of the program

4.	Write a program to create an Interface having two methods division and modules. Create a class, which overrides these methods.

### EXPERIMENT – 7
## TITLE: *Exceptions*

1. Write a program in Java to display the names and roll numbers of students. Initializerespective array variables for 10 students. Handle ArrayIndexOutOfBoundsExeption, sothat any such problem doesn’t cause illegal termination of program.

2. Create an exception class, which throws an exception if operand is nonnumeric incalculating modules. (Use command line arguments).

3. Write a code to create your own exception class. Create another class, inside main methodprompt user to enter a number if number is less than 500 throw instances of your customexception class.

4. You are given two integers, a and b as input, you have to compute a/b: If a and b are not bitsigned integers or if is zero, exception will occur and you have to report it. Read sampleInput/Output to know what to report in case of exceptions.
          *Sample Input 0:*
          10
          3
          *Sample Output 0:*
          3
          *Sample Input 1:*
          10
          Hello
          *Sample Output 1:*
          java.util.InputMismatchException
          *Sample Input 2:*
          10
          0
          *Sample Output 2:*
          java.lang.ArithmeticException: / by zero
          *Sample Input 3:*
          23.323
          0
          *Sample Output 3:*
          java.util.InputMismatchException

5. You are required to compute the power of a number by implementing a calculator. Create a class Calc which consists of a single method long power(int, int). This method takestwo integers, a and b, as parameters and finds ab. If either a or b is negative, then themethod must throw an exception which says "a and b should not be negative". Also, if both a and b are zero, then the method must throw an exception which says "a and bshould not be zero"For example, -4 and -5 would result in java.lang.Exception: a and b should not benegative.Complete the function power in class Calc and return the appropriate result after thepower operation or an appropriate exception as detailed above.Input FormatEach line of the input contains two integers, a and b. The code must read the inputand send the values to the method as parameters.Constraints -10 <= a<= 10 -10 <= b<= 10Output FormatEach line of the output contains the result, if both a and b are positive. If either aor b is negative, the output contains "a and b should be non-negative". If both aand b are zero, the output contains "a and b should not be zero."Sample Input 03 52 40 0-1 -2-1 3Sample Output 024316java.lang.Exception: n and p should not be zero.java.lang.Exception: n or p should not be negative.java.lang.Exception: n or p should not be negative

### EXPERIMENT – 8
## TITLE: *Strings Handling and Wrapper Class*

1. Write a program for searching strings for the first occurrence of a character or substringand for the last occurrence of a character or substring.

2. Write a program that converts all characters of a string in capital letters. (Use StringBufferto store a string). Don’t use inbuilt function.

3. Write a program in Java to read a statement from console, convert it into upper case andagain print on console. (Don’t use inbuilt function)

4. Write a program in Java to create a String object. Initialize this object with your name. Findthe length of your name using the appropriate String method. Find whether the character‘a’ is in your name or not; if yes find the number of times ‘a’ appears in your name. Printlocations of occurrences of ‘a’ .Try the same for different String objects

## TITLE: *Wrapper Classes*

1. Write a Java code that converts int to Integer, converts Integer to String, converts String toint, converts int to String, converts String to Integer converts Integer to int.

2. Write a Java code that converts float to Float converts Float to String converts String tofloat converts float to String converts String to Float converts Float to float.

### EXPERIMENT – 9
## TITLE: *Threads and Collections*

1. Write a program to implement the concept of threading by extending Thread Class andRunnable interface.

2. Write a program for generating 2 threads, one for printing even numbers and the other forprinting odd numbers.

3. Write a program to launch 10 threads. Each thread increments a counter variable. Run theprogram with synchronization.

4. Write a Java program to create five threads with different priorities. Send two threads ofthe highest priority to sleep state. Check the aliveness of the threads and mark which threadis long lasting


### EXPERIMENT – 10
## TITLE: *Collections*

1.	Write a program for the following:

          * Read all elements from ArrayList by using Iterator.
          * Create duplicate object of an ArrayList instance.
          * Reverse ArrayList content.

2.	Write a program for the following HashMap

          * find whether specified key exists or not.
          * find whether specified value exists or not
          * get all keys from the given HashMap
          * get all key-value pair as Entry objects

3.	Write a program for the following HashSet

          * copy another collection object to HashSet object.
          * delete all entries at one call from HashSet
          * search user defined objects from HashSet

### EXPERIMENT – 11
## TITLE: *JDBC*

1. Create a database table to store the records of employee in a company. Use getConnectionfunction to connect the database. The statement object uses executeUpdate function tocreate a table.

2. Create a database of employee of company in mysql and then use java program to accessthe database for inserting information of employees in database. The SQL statement canbe used to view the details of the data of employees in the database.

3. Create a table Meeting having columns (NameOfParticipant, MeetingID, ScheduledTime,Email, Mobile), Populate with random data and perform following operations. READCOMPLETE QUESTION TO POPULATE DATABASE.
             a) Using JaveCode determine the names of the columns in the MEETING table anddisplay the column names on the console.
             b) Write a query to find the names of all participants for the meeting with ID 1144.Display the names on the console, preceded by the message, “Names of participantsin meeting 1144”.
             c) Insert a new participant with using only the participant’s name. Don’t specify theparticipant ID - let the ID be determined by the database. Determine the ID that wasassigned to the new participant and display it on the console (the statement thatdisplays the ID should display the name of the new participant as well).
             d) Count the number of people participating in the meeting with ID 1105. Display amessage on the console that gives both the meeting name and the number ofparticipants.
             e) Determine the names of all people who participate in meetings that meet on Tuesdays.Display the names, preceded by the message, “Participants attending Tuesdaymeetings”.


### EXPERIMENT – 12
## TITLE:  *Servlet*
1.	Servlet:  a) ServletContext interface  b)getParameterValues( ) of Servlet Request
2.	Write a Servlet page to display current date of the server.
3.	Write a Servlet page to which include the two other Servlet page through of include directives feature provided in Servlet.
4.	Write a Servlet page to create a simple calculator.

### EXPERIMENT – 13
## TITLE: *JSP*

Project Specification: (Write the following classes in same project named as Proj_Lab9)
Objective: After these lab exercises students will be in position to clear the concept of JSP and how to write the server side scripting language.
 1.  Write a JSP page to access the data of a student from the student table.
 2.  Write a JSP Login page to enter the username and password entered by
     user and display the welcome page on successful login otherwise display
     wrong authentication page.
