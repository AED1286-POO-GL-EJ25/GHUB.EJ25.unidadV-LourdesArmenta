package miPrincipal;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TestExeption2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int enteros[]={10,20,30,40}; //creo un arreglo de enteros de 4 elementos
        try{
            System.out.print("Introduce la posicion del elemento que deseas visualizar:");
            int i = entrada.nextInt();
            System.out.println(enteros[i]);
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("El valor del indice es incorrecto: "+ex.getMessage());

        }catch (InputMismatchException ex){
            System.out.println("Debes introducir un valor numérico entero:");

        }catch(Exception ex){
            System.out.println("Ocurrio un error inesperado: "+ex.getMessage());
        }
    }

    
}
