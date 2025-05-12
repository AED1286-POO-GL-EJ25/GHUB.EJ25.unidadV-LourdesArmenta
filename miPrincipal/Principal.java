package miPrincipal;

public class Principal {
    

    public static void main(String[] args) {

        //instanciar la clase aplicacion
        Aplicacion app = new Aplicacion();
        
        //intentamos logearnos

        Usuario  u = app.login("juan", "juan123sito");

        //si los datos no son correctos
        if(u == null){
            System.out.println("usuario y/o password incorrectos");
        }else{
            System.out.println("Felicidades, login exitoso");
            System.out.println("Nombre: "+u.getNombre());
            System.out.println("Email: "+u.getEmail());
        }
        

        
    }
}