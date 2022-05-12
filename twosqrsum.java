public class HelloWorld{

     public static void main(String []args){
        //System.out.println("Hello World");
        int a =51;
        sqrSum(a);
     }

    static String sqrSum(int n) {
        int ans=0;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++) {
                if (n == i * i + j * j)
                     System.out.println(n + " = " + i + "^2 + " + j + "^2");
              }
        }
         System.out.println( " existence of sum of two squares");
        return n + " existence of sum of two squares";
    }

}