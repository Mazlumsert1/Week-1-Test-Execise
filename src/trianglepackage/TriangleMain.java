
package trianglepackage;

import java.util.Scanner;


public class TriangleMain {

    
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Tast info:");
        
        System.out.println("Side 1:");
        int a = scan.nextInt();
        System.out.println("Side 2:");
        int b = scan.nextInt();
        System.out.println("Side 3:");
        int c = scan.nextInt();
        
        Triangle t = new Triangle(a,b,c);
        TriangleController tc = new TriangleController();
        
        tc.checkTriangle2(t);

    
        
        
    
    }

}
