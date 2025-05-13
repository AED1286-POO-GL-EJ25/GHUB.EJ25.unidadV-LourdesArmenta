package miPrincipal;

import java.io.Console;
import java.util.Scanner;

public class Principal {
    

    public static void main(String[] args) {

        try{
            Aplicacion app = new Aplicacion();

             Scanner scanner = new Scanner(System.in);

            //intentamos el login

            // Solicitar credenciales al usuario
           
            System.out.print("Ingrese su nombre de usuario: ");
            String username = scanner.nextLine();
       
            System.out.print("Ingrese su contraseña: ");
            String password = leerContrasena();//scanner.nextLine();
            
            Usuario u = app.login(username, password);
            //mostramos el resultado<z
            if (u == null)
               System.out.println("usuario y/o password incorrectos");
            else{
                System.out.println("Felicidades, login exitoso");
                System.out.println("Nombre: "+u.getNombre());
                System.out.println("Email: "+u.getEmail());
            }
        }catch(ErrorFisicoException ex){
            //ocurrio un error
            System.out.println("Servicio temporalmente interrumpido:");
            System.out.println(ex.getMessage());
        }
       
    }
     private static String leerContrasena() {
        Console console = System.console();
        if (console == null) {
            System.out.println("No se puede acceder a la consola.");
            return "";
        }

        char[] passwordArray = console.readPassword(); // Oculta la entrada y muestra asteriscos
        return new String(passwordArray);
    }

}