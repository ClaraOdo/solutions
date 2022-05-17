public class HelloWorld{

     public static void main(String []args){
        System.out.println("Hello World");
        int m=18;
        int n=12;
        isEvenSubSet(m,n);
     }
  static  int isEvenSubSet(int m, int n){
 
     int ans=0;
        for (int i = 2; i < m; i++){
            if (m % i == 0 && i%2==0){
                for (int j = 2; j < n; j++){
                    if (n % j == 0){
                        if (i == j){
                            ans = 1;
                        }else{
                            ans = 0;
                        }
                    }
                }
            }
        }
         System.out.println(ans);
        return ans;
    }

}