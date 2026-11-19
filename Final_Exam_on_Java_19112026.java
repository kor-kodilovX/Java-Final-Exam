// v.English

import java.util.Scanner;

public class Final_Exam_on_Java_19112026 {

// ----- CALCULATION METHODS -----
// Each method calculates the volume of a geometric shape.
// It receives the measurements as parameters and returns the result using return.

static double volumenCubo(double side) 
{return Math.pow(side, 3);}

static double volumenPrismaRectangular(double length, double width, double height) 
{return length * width * height;}

static double volumenCilindro(double radius, double height) 
{return Math.PI * Math.pow(radius, 2) * height;}

static double volumenEsfera(double radius) 
{return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);}

static double volumenCono(double radius, double height) 
{return (Math.PI * Math.pow(radius, 2) * height) / 3.0;}


// ----- AUXILIARY METHODS -----
// These methods display the calculation results and warn the user when a negative measurement is entered.

static void mostrarResultado(String name, double volume) 
{System.out.println("\nThe volume of the " + name + " is: " + volume);}

static void errorMedidas() 
{System.out.println("\nERROR: Measurements cannot be negative.");}


// ----- MAIN PROGRAM -----
// This is where the calculator works.
// The menu is displayed, the data is entered and the corresponding calculation is performed.

public static void main(String[] args) {

// We create the Scanner to read the data entered by the user and declare the variable that stores the selected option.

Scanner sc = new Scanner(System.in);
int option;

// We use a do-while loop to repeat the menu until the user selects option 0.

do {

// We display the main menu with the five geometric shapes and the option to exit the program.

System.out.println("----- VOLUME CALCULATOR -----");
System.out.println(" ");
System.out.println("1. Cube");
System.out.println("2. Rectangular prism");
System.out.println("3. Cylinder");
System.out.println("4. Sphere");
System.out.println("5. Cone");
System.out.println("0. Exit");
System.out.println(" ");
System.out.print("Choose an option: ");

// We store the option selected by the user.

option = sc.nextInt();

// We use switch to execute the corresponding case depending on the geometric shape selected by the user.

switch (option) {

case 1: 

{
    
// ----- CUBE CALCULATION -----
// We ask for the side length and check that it is not negative.
// If the measurement is valid, we call the calculation method and display the resulting volume.

System.out.print("\nEnter the side length of the cube: ");
double side = sc.nextDouble();

if (side < 0) 
{errorMedidas();} 

else 
{mostrarResultado("Cube", volumenCubo(side));}

break;

}

case 2: 

{
    
// ----- RECTANGULAR PRISM CALCULATION -----
// We ask for the length, width and height.
// We check that none of the measurements are negative.
// If all measurements are valid, we calculate and display the volume.

System.out.print("\nEnter the length of the prism: ");
double length = sc.nextDouble();

System.out.print("Enter the width of the prism: ");
double width = sc.nextDouble();

System.out.print("Enter the height of the prism: ");
double height = sc.nextDouble();

if (length < 0 || width < 0 || height < 0) 

{errorMedidas();} 

else {mostrarResultado("Rectangular prism", volumenPrismaRectangular(length, width, height));}

break;

}

case 3: 

{

// ----- CYLINDER CALCULATION -----
// We ask for the radius and height.
// We check that both measurements are valid.
// If neither is negative, we calculate and display the volume.

System.out.print("\nEnter the radius of the cylinder: ");
double radius = sc.nextDouble();

System.out.print("Enter the height of the cylinder: ");
double height = sc.nextDouble();

if (radius < 0 || height < 0) 

{errorMedidas();} 

else {mostrarResultado("Cylinder", volumenCilindro(radius, height));}

break;

}

case 4: 

{
    
// ----- SPHERE CALCULATION -----
// We ask for the radius and check that it is not negative.
// If it is valid, we calculate and display the volume.

System.out.print("\nEnter the radius of the sphere: ");
double radius = sc.nextDouble();

if (radius < 0) 

{errorMedidas();} 

else {mostrarResultado("Sphere", volumenEsfera(radius));}

break;

}

case 5: 

{
    
// ----- CONE CALCULATION -----
// We ask for the radius and height.
// We check that neither measurement is negative.
// If both are valid, we calculate and display the volume.

System.out.print("\nEnter the radius of the cone: ");
double radius = sc.nextDouble();

System.out.print("Enter the height of the cone: ");
double height = sc.nextDouble();

if (radius < 0 || height < 0) 

{errorMedidas();} 

else {mostrarResultado("Cone", volumenCono(radius, height));}

break;

}

case 0:

// If the user selects 0, we display the goodbye message and the do-while loop will end.

System.out.println("\nGoodbye!");

break;

default:

// If the user enters an option that does not exist,
// we display a message indicating that the option is invalid.

System.out.println("\nERROR: Invalid option.");

}

// We leave a blank line before displaying the menu again.

System.out.println(" ");

} 

while (option != 0);

// We close the Scanner when the user finishes the program.

sc.close();

}

}