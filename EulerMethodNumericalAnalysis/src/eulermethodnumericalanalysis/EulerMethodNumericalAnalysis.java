
package eulermethodnumericalanalysis;
import java.util.*;
public class EulerMethodNumericalAnalysis {

    public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
        System.out.println(" Input Step Size: ");
        float h = in.nextFloat();
        System.out.println(" Input lower limit: ");
        float to = in.nextFloat();
        System.out.println(" Input upper limit: ");
        float tf = in.nextFloat();
        System.out.println(" Input y(xo): ");
        float yo = in.nextFloat();
       // we have h, x0,xf
        float yin = yo;
       int i =1;
        while(to<tf){
       
       float y1 = yin + h*(func(to,yin));
          
            yin = y1;
              System.out.println( i +  " "+ y1 +" ");
        to = to +h;
        i++;
        }
   
   
    }
   public static float func(float t,float y){
   return (float)((t-y)*0.5);
   }
    
    
    
}
