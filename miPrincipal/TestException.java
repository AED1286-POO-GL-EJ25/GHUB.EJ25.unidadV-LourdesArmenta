package miPrincipal;
import java.util.InputMismatchException;
import java.util.Scanner;
public class TestException{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int num1= LeerEntero("Intruduce un valor entero 1:", entrada, -32000,32000);               System.out.print("Introduce un valor entero diferente de cero:");
        int num2= LeerEntero("Introduce un valor entero 2:", entrada, 1,100);
        int resultado = num1/num2;
        System.out.println("El resultado = "+resultado);
                
        
    }
    public static int LeerEntero(String mensaje, Scanner scanner, int min, int max){
        while (true){
            try{
                System.out.println("\u001B[34m"+mensaje+"\u001B[0m" ); //Mensaje azul
                int valor = scanner.nextInt();
                scanner.nextLine(); // consumir el ultimo enter
                //validar el rango
                if (valor<min || valor>max){
                    System.out.println("\u001B[34m **** El valor debe estar entre "+min+" y "+max+ "\u001B[0m"); //Mensaje en rpjo
                } else{ 
                    return valor;
                }
                
            } catch (InputMismatchException e){
                System.out.println("\u001B[34m **** Error: debe introducir un valor valido \u001B[0m");
                scanner.nextLine();

            }
        }

    }

}