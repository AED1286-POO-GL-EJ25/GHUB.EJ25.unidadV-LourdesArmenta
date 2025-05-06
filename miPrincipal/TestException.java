package miPrincipal;
import java.util.InputMismatchException;
import java.util.Scanner;
public class TestException{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        while (true) {
            try{
                System.out.print("Introduce un valor entero :");
                int num1= entrada.nextInt();
                System.out.print("Introduce un valor entero diferente de cero:");
                int num2= entrada.nextInt();
                int resultado = num1/num2;
                System.out.println("El resultado = "+resultado);
                break;
            }catch (ArithmeticException ex){
                System.out.println("\\u001B[31m\\t***Error:ocurrio un error de division por cero.***\u001B[0m");
                entrada.nextLine();
            }catch(InputMismatchException ex){
                System.out.println("\u001B[31m\t***Error: Debe ingresar un número entero válido.***\u001B[0m");
                entrada.nextLine(); // Consumir la nueva línea

            }
        }
        System.out.println("Lo que sigue....");
        
        
    }

}