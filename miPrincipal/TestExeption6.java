package miPrincipal;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TestExeption6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        try{
            System.out.print("introduce un valor:");
            int a = entrada.nextInt();
            System.out.print("introduce un valor:");
            int b = entrada.nextInt();
            int resultado = a / b;
            System.out.println(resultado);
        }catch (ArithmeticException e){
            System.err.println("se ha capturado una excepcion "+e.getMessage());
        }catch(InputMismatchException e){
            System.err.println("se ha capturado una excepcion "+e.getMessage());
        }finally{
            System.out.println("Esto siempre se ejecuta");
            entrada.close();
        }
        


    }
    
}
