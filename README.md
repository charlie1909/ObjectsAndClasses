# ObjectsAndClasses
# ObjectsAndClasses
1.8: Exercise: Objects &amp; Classes
You should attempt all of the following exercises.
In each case you should write your solution in Java using the IntelliJ IDE. Where you are asked to write a program rather than simply create a method, you should write a complete working program which has a class with appropriate constructor and methods (including a main method).
You MUST maintain a complete repository of all of your work (it would be good if you could do this in GIT repository that you can share with your tutors - but not essential) as you WILL be asked to show this at various points throughout the year
1. Write a short Java method, isMultiple, that takes two long values, n and m and returns true if and only if n is a multiple of m, that is n=m*i for some integer i.

public boolean isMultiple(long n, long m){
        int i=0;
        for(i=1; i<20; i++){
            if((n == m * i)){
                return true;
            }
        } return false;
    }

2. Write a short Java method, isOdd, that takes an int i and returns true if and only if i is odd. Your method must not use multiplication, modulus or division operators.

public boolean isOdd(int i){
        boolean isOdd=false;
        for(int x = 1; x <= i ; x++){
            isOdd = !isOdd;
        }
        return isOdd;
    }

3. Create a Java class named Circle which should have an appropriate constructor to reflect the following scenario. The Circle class should have two intance varibales, radius (of type double) and color (of type string). At instantiation these variables should have default values of 1.8 and red respectively.



4. Create an overloaded constructor for the Circle class such that it now accepts an argument (of type double) for the radius but still has a default value of red for color. - see class ObjectsAndClassessApp and Circle
5. Create a main method which allows the user to create an instance of the Circle class using the default constructor developed in questions 3 and 4 above.- see class ObjectsAndClassessApp and Circle
6. Provide two new public methods getRadius() and getArea() which return the radius and area of the circle respectively - see class ObjectsAndClassessApp and Circle

