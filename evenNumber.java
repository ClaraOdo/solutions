import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        System.out.println("Hello World");
        int[] a = {1,2,3,4};
        even(a);
     }
     
     static int even(int[] a){
         int k=0;
         int[] evenArray = new int[a.length];
         
         for(int i=0;i<a.length;i++){
             if(a[i]%2==0){
             evenArray[k] = a[i];
                 k++;
             }
         }
             System.out.println(Arrays.toString(evenArray));
         int[] ans=new int[k];
         for(int i=0;i<ans.length;i++){
             ans[i]=evenArray[i];
             }
             System.out.println(Arrays.toString(ans));
             return 1;
         
     }
}