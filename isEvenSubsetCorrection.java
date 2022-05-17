public class HelloWorld{

     public static void main(String []args){
        System.out.println("Hello World");
        int m=18;
        int n=32;
        correction(m,n);
     }
     
     
     static int correction(int m, int n){
         int length =(m > n) ? m : n;
         int a, b;
         if (length == m)
           {
            a = m;
            b = n;
            }
           else
               {
            a = n;
            b = m;
             }
         int ans=1;
         int evenmf=0;
         int evennf=0;
         for(int i=2; i<length; i++)
         {   
             if (a%i==0&&i%2==0){  
                  evenmf=i;
               System.out.println(evenmf);
              if(b%i==0 && i%2==0){
                  evennf=i;
                  System.out.println(evennf);
              }
              if(evenmf!=evennf){
                  ans=0;
                  break;
              }
              }
         }
         System.out.println(ans);
          return 1;
     }
}