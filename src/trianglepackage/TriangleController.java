package trianglepackage;

public class TriangleController {
    
    //Metode 1 
//   public void checkTriangle(Triangle t) throws Exception{
//     if(validInputs(t.a,t.b,t.c)){
//      if(validTriangle(t.a,t.b,t.c)){
//        if( (t.a == t.b) && (t.a == t.c) && (t.b == t.c) ){
//            System.out.println("Ligesidet trekant..");
//            
//        }else if( (t.a == t.b) || (t.a == t.c) || (t.b == t.c) ){
//           System.out.println("Ligebenet Trekant..");
//        }else{
//           System.out.println("Ingen sidder er ens..");
//       }
//     }else{
//          throw new Exception("Ugyldig Trekant..");
//      }
//      }else{
//         throw new Exception("Lægnde skal være de naturlig tal..");
//     }
//   }
   // Metode 2  
   public void checkTriangle2(Triangle t) throws Exception{
       int [] list = {t.a,t.b,t.c};
       
       if(validInputs(t.a,t.b,t.c)){
       if (validTriangle(t.a,t.b,t.c)){
         for (int i = 0; i < list.length; i++) {
           for (int j = i + 1; j < list.length; j++) {
               if(list[i] == list[j]){
                    System.out.println("Ligesidet Trekant");
                    System.exit(0);
               }else if(list[0] != list[i]){
                   System.out.println("ingen ens sider");
                   System.exit(0);
               }else{
                   System.out.println("Ligebenet Trekant");
                   System.exit(0);
               }
           }
         }
       }else{
           
           throw new Exception("Ugyldig trekant..");
       }
       }else{
           throw new Exception("Ugyldig trekant..");
       }
   }
   // det skal være en gyldig trekant
   public boolean validTriangle(int a, int b, int c){
       return (a+b>c && a+c>b && b+c>a);
   }
   // inputs skal være større end 0 
   public boolean validInputs(int a, int b, int c){
        return (a>0 && b>0 && c>0);
   }
   
   
}


