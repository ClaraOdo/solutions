public class HelloWorld{
     public static void main(String[] args) {
        // int[] array = {3, 3, 2, 6, 7};
        int[] array = {3, 3, 2, 6,6, 7};
        // int[] array = {2, 3, 5, 6, 9};
        // int[] array = {2, 4};
        // int[] array = {3, 8, 5, 7,3};
        System.out.println(isTwinoid(array));
    }

    static int isTwinoid(int[] a) {
        int ans = 0;
        int isEven = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                isEven++;
            }
        }

        if (isEven != 2) {
            return ans;

        } else {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] % 2 == 0) {
                    if (a[j + 1] % 2 == 0) {
                        ans = 1;
                        return ans;
                    }
                }
            }
        }
        return ans;
    }
}