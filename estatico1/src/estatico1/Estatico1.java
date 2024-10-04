
package estatico1;

import java.util.Locale;
import java.util.Scanner;

public class Estatico1 {
    public static final double PI= 3.14159;

    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();
        
        double c =circuference(radius);
        
        double v = volume(radius);
        
        System.out.printf("Circuferece: %.2fn", c);
        System.out.printf("volume: %.2fn",v);
        System.out.printf("PI value: %.2fn",PI);
        
        
        
        
        
        sc.close();
    }
    public static double circuference(double radius){
        return 2.0 * PI * radius;
    }
    public static double volume(double radius){
        return 4.0*PI*radius*radius*radius/3;
    
}
}