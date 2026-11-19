//v.Español

import java.util.Scanner;

public class ExamenFinaldeJava_19112026 {

// ----- MÉTODOS DE CÁLCULO -----
// Cada método calcula el volumen de una figura geométrica.
// Recibe sus medidas mediante parámetros y devuelve el resultado con return.

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


// ----- MÉTODOS AUXILIARES -----
// Estos métodos sirven para mostrar los resultados de los cálculos, y avisar al usuario cuando introduce alguna medida negativa.

static void mostrarResultado(String nombre, double volumen) 
{System.out.println("\nEl volumen del " + nombre + " es: " + volumen);}

static void errorMedidas() 
{System.out.println("\nERROR: Las medidas no pueden ser negativas.");}


// ----- PROGRAMA PRINCIPAL -----
// Aquí se desarrolla el funcionamiento de la calculadora.
// Se muestra el menú, se recogen los datos y se ejecuta el cálculo correspondiente.

public static void main(String[] args) {

// Creamos el Scanner para recoger los datos introducidos por el usuario, y declaramos la variable que almacenará la opción elegida.

Scanner sc = new Scanner(System.in);
int opcion;

// Utilizamos un bucle do-while para repetir el menú hasta que el usuario seleccione la opción 0.

do {
    
// Mostramos el menú principal con las cinco figuras geométricas y la opción para salir del programa.

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

// Guardamos la opción seleccionada por el usuario.

opcion = sc.nextInt();

// Utilizamos switch para ejecutar el caso correspondiente según la figura geométrica que el usuario quiera calcular.

switch (opcion) {

case 1: 

{
    
// ----- CÁLCULO DEL CUBO -----
// Pedimos el lado y comprobamos que no sea negativo.
// Si la medida es válida, llamamos al método de cálculo, y mostramos el volumen obtenido.

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
    
// ----- CÁLCULO DEL PRISMA RECTANGULAR -----
// Pedimos el largo, el ancho y el alto.
// Comprobamos que ninguna medida sea negativa.
// Si todas son válidas, calculamos y mostramos el volumen.

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

// ----- CÁLCULO DEL CILINDRO -----
// Pedimos el radio y la altura.
// Comprobamos que ambas medidas sean válidas.
// Si ninguna es negativa, calculamos y mostramos el volumen.

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
    
// ----- CÁLCULO DE LA ESFERA -----
// Pedimos el radio y comprobamos que no sea negativo.
// Si es válido, calculamos y mostramos el volumen.

System.out.print("\nIntroduce el radio de la esfera: ");
double radio = sc.nextDouble();
if (radio < 0) 

{errorMedidas();} 

else {mostrarResultado("Esfera", volumenEsfera(radio));}

break;

}

case 5: 

{
    
// ----- CÁLCULO DEL CONO -----
// Pedimos el radio y la altura.
// Comprobamos que ninguna de las dos medidas sea negativa.
// Si son válidas, calculamos y mostramos el volumen.

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

// Si el usuario selecciona 0, mostramos el mensaje de despedida, y el bucle do-while finalizará.

System.out.println("\nHasta luego.");

break;

default:

// Si el usuario introduce una opción que no existe, mostramos un mensaje indicando que la opción no es válida.

System.out.println("\nERROR: Opción no válida.");

}

// Dejamos una línea en blanco antes de volver a mostrar el menú.

System.out.println(" ");

} 

while (opcion != 0);

// Cerramos el Scanner cuando el usuario termina el programa.

sc.close();

}

}