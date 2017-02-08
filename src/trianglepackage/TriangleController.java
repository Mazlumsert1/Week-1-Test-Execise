package trianglepackage;


public class TriangleController {
    
   // Metode 1 
   public void checkTriangle(Triangle t){
     if(validInputs(t.a,t.b,t.c)){
      if(isAValidTriangle(t.a,t.b,t.c)){
        if( (t.a == t.b) && (t.a == t.c) && (t.b == t.c) ){
            System.out.println("Ligesidet trekant..");
        }else if( (t.a == t.b) || (t.a == t.c) || (t.b == t.c) ){
           System.out.println("Ligebenet Trekant..");
        }else{
           System.out.println("Ingen sidder er ens..");
       }
     }else{
          System.out.println("ugyldig Trekant");
      }
      }else{
         System.out.println("lægnde skal være de naturlig tal");
     }
   }
   // Metode 2  
   public void checkTriangle2(Triangle t){
       int [] list = {t.a,t.b,t.c};
       if(validInputs(t.a,t.b,t.c)){
       if (isAValidTriangle(t.a,t.b,t.c)){
         for (int i = 0; i < list.length; i++) {
           for (int j = i + 1; j < list.length; j++) {
               if(list[i] == list[j]){
                    System.out.println("Ligebenet Trekant");
                    System.exit(0);
               }else if(list[0] != list[i]){
                   System.out.println("ingen ens sider");
                   System.exit(0);
               }else{
                   System.out.println("Ligesiddet Trekant");
                   System.exit(0);
               }
           }
         }
       }else{
           System.out.println("ugyldig trekant");
       }
       }else{
           System.out.println("længde kan ikke være negativ");
       }
   }
   
   public boolean isAValidTriangle(int a, int b, int c){
       return (a+b>c && a+c>b && b+c>a);
   }
   
   public boolean validInputs(int a, int b, int c){
        return (a>0 && b>0 && c>0);
    }
   
   
}


