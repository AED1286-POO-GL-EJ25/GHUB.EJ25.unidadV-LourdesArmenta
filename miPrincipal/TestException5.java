package miPrincipal;

public class TestException5 {
    public static void main(String[] args) {
        try{
        int x = Math.incrementExact(2147483647);
        
        System.out.println(x);
        }catch (RuntimeException e){
            System.out.println("ocurrio un error: "+e.getMessage());
        }
    }
    
}
