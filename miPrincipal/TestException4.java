package miPrincipal;

public class TestException4 {
    public static void main(String[] args) {
        try{
            //simulamos una condicion que lance la nueva excepcion
            lanzarMiExcepcion();
        
        }catch (MiExcepcionPersonalizada ex){
            System.out.println("MiExcepcion personalizada capturada: "+ex.getMessage());
        }
        
    }
    public static void lanzarMiExcepcion() throws MiExcepcionPersonalizada{
        throw new MiExcepcionPersonalizada("Este es un mensaje de excepcion personalizada");
    }
    
}
