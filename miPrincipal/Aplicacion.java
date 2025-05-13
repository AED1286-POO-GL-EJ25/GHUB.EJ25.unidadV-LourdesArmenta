package miPrincipal;
import java.io.FileInputStream;
import java.util.Properties;

public class Aplicacion {
    public Usuario login(String usrname, String password){
        try{

            //abrimos el archivo de propiedades para lectura
            FileInputStream fis = new FileInputStream("usuario.properties");

            //cargamos el archivo de propiedades a un objeto tipo properties

            Properties p = new Properties();
            p.load(fis);

            //leemos el valor de la propiedad usrname
            String usr = p.getProperty("usrname");

            //leemos el valor de la propiedad password
            String pwd = p.getProperty("password");

            //defimos la variable de retorno
            Usuario u = null;


            if (usr.equals(usrname) && pwd.equals(password)){
                //instanciamos y seteamos todos los datos
                u = new Usuario();
                u.setUserName(usr);
                u.setPassword(pwd);
                u.setNombre(p.getProperty("nombre"));
                u.setEmail(p.getProperty("email"));
                
            }else{
                return null;
            }
            return u;
        }catch (Exception ex){
            //cualquier error "salgo por excepcion"
            throw new RuntimeException("Error verificando datos",ex);
        }

    }

    
}
