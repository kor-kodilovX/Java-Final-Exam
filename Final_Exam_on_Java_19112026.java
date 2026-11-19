//v.English

import java.util.Scanner;

public class Final_Exam_on_Java_19112026 {

// ----- CALCULATION METHODS -----
// Each method calculates the volume of a geometric shape.
// It receives the measurements as parameters and returns the result using return.

static double volumenCubo(double lado) 
{return Math.pow(lado, 3);}

static double volumenPrismaRectangular(double largo, double ancho, double alto) 
{return largo * ancho * alto;}

static double volumenCilindro(double radio, double altura) 
{return Math.PI * Math.pow(radio, 2) * altura;}

static double volumenEsfera(double radio) 
{return (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);}

static double volumenCono(double radio, double altura) 
{return (Math.PI * Math.pow(radio, 2) * altura) / 3.0;}


// ----- AUXILIARY METHODS -----
// These methods are used to display the calculation results and warn the user when a negative measurement is entered.

static void mostrarResultado(String nombre, double volumen) 
{System.out.println("\nEl volumen del " + nombre + " es: " + volumen);}

static void errorMedidas() 
{System.out.println("\nERROR: Las medidas no pueden ser negativas.");}


// ----- MAIN PROGRAM -----
// This is where the calculator works.
// The menu is displayed, the data is entered and the corresponding calculation is performed.

public static void main(String[] args) {

// We create the Scanner to read the data entered by the user and declare the variable that stores the selected option.

Scanner sc = new Scanner(System.in);
int opcion;

// We use a do-while loop to repeat the menu until the user selects option 0.

do {
    
// We display the main menu with the five geometric shapes and the option to exit the program.

System.out.println("----- CALCULADORA DE VOLUMENES -----");
System.out.println(" ");
System.out.println("1. Cubo");
System.out.println("2. Prisma rectangular");
System.out.println("3. Cilindro");
System.out.println("4. Esfera");
System.out.println("5. Cono");
System.out.println("0. Salir");
System.out.println(" ");
System.out.print("Elige una opción: ");

// We store the option selected by the user.

opcion = sc.nextInt();

// We use switch to execute the corresponding case depending on the geometric shape selected by the user.

switch (opcion) {

case 1: 

{
    
// ----- CUBE CALCULATION -----
// We ask for the side length and check that it is not negative.
// If the measurement is valid, we call the calculation method and display the resulting volume.

System.out.print("\nIntroduce el lado del cubo: ");
double lado = sc.nextDouble();
if (lado < 0) 
{errorMedidas();} 

else 
{mostrarResultado("Cubo", volumenCubo(lado));}

break;

}

case 2: 

{
    
// ----- RECTANGULAR PRISM CALCULATION -----
// We ask for the length, width and height.
// We check that none of the measurements are negative.
// If all measurements are valid, we calculate and display the volume.

System.out.print("\nIntroduce el largo del prisma: ");
double largo = sc.nextDouble();
System.out.print("Introduce el ancho del prisma: ");
double ancho = sc.nextDouble();
System.out.print("Introduce la altura del prisma: ");
double alto = sc.nextDouble();
if (largo < 0 || ancho < 0 || alto < 0) 

{errorMedidas();} 

else {mostrarResultado("Prisma rectangular", volumenPrismaRectangular(largo, ancho, alto));}

break;

}

case 3: 

{

// ----- CYLINDER CALCULATION -----
// We ask for the radius and height.
// We check that both measurements are valid.
// If neither is negative, we calculate and display the volume.

System.out.print("\nIntroduce el radio del cilindro: ");
double radio = sc.nextDouble();
System.out.print("Introduce la altura del cilindro: ");
double altura = sc.nextDouble();
if (radio < 0 || altura < 0) 

{errorMedidas();} 

else {mostrarResultado("Cilindro", volumenCilindro(radio, altura));}

break;

}

case 4: 

{
    
// ----- SPHERE CALCULATION -----
// We ask for the radius and check that it is not negative.
// If it is valid, we calculate and display the volume.

System.out.print("\nIntroduce el radio de la esfera: ");
double radio = sc.nextDouble();
if (radio < 0) 

{errorMedidas();} 

else {mostrarResultado("Esfera", volumenEsfera(radio));}

break;

}

case 5: 

{
    
// ----- CONE CALCULATION -----
// We ask for the radius and height.
// We check that neither measurement is negative.
// If both are valid, we calculate and display the volume.

System.out.print("\nIntroduce el radio del cono: ");
double radio = sc.nextDouble();
System.out.print("Introduce la altura del cono: ");
double altura = sc.nextDouble();
if (radio < 0 || altura < 0) 

{errorMedidas();} 

else {mostrarResultado("Cono", volumenCono(radio, altura));}

break;

}

case 0:

// If the user selects 0, we display the goodbye message and the do-while loop will end.

System.out.println("\nHasta luego.");

break;

default:

// If the user enters an option that does not exist, we display a message indicating that the option is invalid.

System.out.println("\nERROR: Opción no válida.");

}

// We leave a blank line before displaying the menu again.

System.out.println(" ");

} 

while (opcion != 0);

// We close the Scanner when the user finishes the program.

sc.close();

}

}