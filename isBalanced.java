public class HelloWorld{

     public static void main(String []args){
        System.out.println("Hello World");
        int [] a={-5,2-2};
        isBalanced(a);
     }
    static int isBalanced(int [] a){
        
        int ans = 1;
        
        for(int i=0;i<a.length;i++){        
            int check = 0;
            
            for(int j=0; j<a.length; j++){
                
                if(a[i] == (-1*a[j])){
                    check = 1;
                    break;
                }
            }
            if (check == 0){
                ans = 0;
            }
        }
        System.out.println(ans);
        return ans;
    }
}