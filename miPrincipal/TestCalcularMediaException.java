package miPrincipal;

public class TestCalcularMediaException {
     public static void main(String[] args) {
        System.out.println("La media es:"+calcularMedia(7));
        
    }
    public static double calcularMedia(int num)  {
        double c[]={1.2,2.2,3.3,4.4,5.5,6.6,7.7};
        double media;
        
        
            media = avg(c,num);
            return media;
       
            


        }
        

    }
    public static double avg(double []b,int num) {
       
        double media =0;
        for(int i=0;i<num;i++){
            media = media + b[i];
        }
        return media/num;
    }
    
}
