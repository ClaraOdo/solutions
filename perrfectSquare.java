public class HelloWorld{
public static void main(String[] args) {
        System.out.println(countSqrPairs(new int[]{9,0,2,-5,7}));
    }

    static int countSqrPairs(int[] a) {
        int countSquarePairs = 0;
        for (int i = 1; i < a.length; i++){
            for (int j = 0; j < i; j++) {
                if (a[i] <= 0) break;
                if (a[j] <= 0) continue;
                if (isPerfectSqr(a[i] + a[j]) == 1)
                    countSquarePairs++;
            }
        }
        return countSquarePairs;
    }

    static int isPerfectSqr(int number) {
        int isPerfectSquare = 0;
        for (int i = 0; i < number/2; i++) {
            if (i * i == number) {
                isPerfectSqr = 1;
                break;
            }
        }
        return isPerfectSqr;
    }
    }