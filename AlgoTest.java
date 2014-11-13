/**
 * Directions:
 * 1) Run this as is and see how long it takes.
 * 2) Make changes to the body of "f" to make it faster without changing the output of the program.
 */
public class AlgoTest {
    public static void main(String[] args) {
    	long start = System.currentTimeMillis();

        for(int num = 1; num < 20; num++) {
            System.out.println("f(" + num + ", " + num + ") = " + f(num, num));
            System.out.println("f(" + num + ", " + (num+1) + ") = " + f(num, num + 1));
        }

    	long end = System.currentTimeMillis();

    	System.out.println("Test took " + ((float)(end - start) / 1000) + " seconds.");
    }
    
    private static int f(int a, int b) {
        if (a == 1 && b == 1)
    		   return 1;

        if(a == 1)
            return 1 + f(a, b-1);

        if(b == 1)
            return 1 + f(a-1, b);
   
        return (f(a-1, b) + f(a, b-1));
    }
}

