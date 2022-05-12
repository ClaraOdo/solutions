public class HelloWorld{

     public static void main(String []args){
        //System.out.println("Hello World");
        int a =61;
        c(a);
     }
     static int c(int a){
         int ObfancyN=5;
        int  pfancyN=17;
         int fancyN=0;
         if (a<=0) return 0;
         if (a==1) {
         System.out.println(1);
         return 1;}
             for(int i =0; i<=a/2; i++)
               {
                 fancyN=(3*pfancyN)+(2*ObfancyN);
               }
            if (a == fancyN){
            System.out.println(1);
             return 1;
            }
         System.out.println(0);
          return 0;   
     }
}