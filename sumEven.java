public class HelloWorld{

     public static void main(String []args){
        //System.out.println("Hello World");
        int[] a ={2,3,2,3};
        sumEven(a);
     }

    static int sumEven(int[] a) {
        int mid=a.length/2;
        int fir=0;
        int ans=0;
        int sec=0;
                if (a.length%2==0){
        for (int i = 0; i < mid; i++){
                     fir+=a[i];
        }
        for (int j= a.length-1; j >=mid; j--){
                     sec+=a[j]; 
        }
        
        if(fir==sec){
             ans=1;
            System.out.println(ans);
           return 1; 
        }
                    
                }
         System.out.println(0);
        return 0;
    }

}