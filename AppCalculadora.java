import java.util.Scanner;

public class AppCalculadora{

    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        boolean opcionValida = false;
        int opcion;
            do{

                System.out.println("1.-Suma \n2.-Resta \n3.-Multiplicación \n4.-División \n5.- Salir");
                System.out.print("Selecciona una opcion: ");
                opcion = scan.nextInt();
               
        
        switch(opcion){

            case 1:
                System.out.println("***Seleccionaste SUMA***");
                System.out.print("Ingresa el primer número: ");
                calc.setNum1(scan.nextInt());
                System.out.print("Ingresa el segundo número: ");
                calc.setNum2(scan.nextInt());
                System.out.println( calc.operacionSuma());
                break;

            case 2:
                System.out.println("***Seleccionaste RESTA***");
                System.out.print("Ingresa el primer número: ");
                calc.setNum1(scan.nextInt());
                System.out.print("Ingresa el segundo número: ");
                calc.setNum2(scan.nextInt());
                System.out.println(calc.operacionResta());
                break;

            case 3:
                System.out.println("***Seleccionaste Multiplicación***");
                System.out.print("Ingresa el primer número: ");
                calc.setNum1(scan.nextInt());
                System.out.println("Ingresa el segundo número: ");
                calc.setNum2(scan.nextInt());
                System.out.println( calc.operacionMulti());
                break;
            case 4: 
                System.out.println("***Seleccionaste división***");
                System.out.println("Ingresa el primer número: ");
                calc.setNum1(scan.nextInt());
                System.out.println("Ingresa el segundo número: ");
                calc.setNum2(scan.nextInt());
                System.out.println(calc.operacionDiv());
                break; 
            case 5:
                System.out.println("Saliendo del programa... Hasta luego!!!");
                break;
                    default:
                    System.out.println("*****Opción no valida, inicia nuevamente el programa y elige una opción correcta****"); 
                   }
        } while (opcion!=5);
            }

    }
