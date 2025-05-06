package miPrincipal;
import java.util.InputMismatchException;
import java.util.Scanner;
public class TestException{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        try{
            System.out.print("Introduce un valor entero :");
            int num1= entrada.nextInt();
            System.out.print("Introduce un valor entero diferente de cero:");
            int num2= entrada.nextInt();
            int resultado = num1/num2;
            System.out.println("El resultado = "+resultado);
        }catch (ArithmeticException ex){
            System.out.println("ocurrio un error de division por cero:"+ex.getMessage());
        }catch(InputMismatchException ex){
            System.out.println("introduciste un valor invalido: "+ex.getMessage());

        }
        
        
    }

}