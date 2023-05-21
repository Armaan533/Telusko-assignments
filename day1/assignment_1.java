import java.util.HashMap;
import java.util.Map;

public class assignment_1 {
    // I couldn't figure out how to put an array as a key
    // private static Map<Integer[], Integer> cache = new HashMap<>();

    public static void main(String[] args) {
        int row = 5;
        pascal_print(row);

        // pascal_iter(row);
    }

    private static void pascal_iter(int row)
    {
        for (int line = 1; line <= row; line++) {
            for (int j = 0; j <= row - line; j++) {
 
                // for left spacing
                System.out.print(" ");
            }
 
            // used to represent C(line, i)
            int C = 1;
            for (int i = 1; i <= line; i++) {
 
                // The first value in a line is always 1
                System.out.print(C + " ");
                C = C * (line - i) / i;
            }
            System.out.println();
        }
    }

    private static void pascal_print(int row) {
        for(int line = 0; line < row; line++)
        {
            for(int j = 0; j <= row - line; j++)
            {
                // for left spacing
                System.out.print(" ");
            }
            
            for(int b = 0; b <= line; b++)
            {
                    // for printing the binomial coefficients
                    System.out.print(pascal_recur(line, b) + " ");
            }
            System.out.println();
        }
    }

    private static int pascal_recur(int a, int b) {
        // first and last value in pascal triangle is 1
        if(b == 0 || b == a)
        {
            return 1;
        }
        int key[] = {a, b};
        // if(cache.containsKey(key))
        //     return cache.get(key);
            

        // calculates the binomial coefficients
        int coeff = pascal_recur(a - 1, b - 1) + pascal_recur(a - 1, b);
        // cache.put(key, coeff);
        return coeff;

    }
}


/*
The pascal_iter function takes the number of rows to be printed and runs a nested for loop to print the pascal triangle.
Inside the outside for loop, first we will run a for loop for the spacing on the left side of the triangle.
Then, we will compute the nCr or C(line, i) to get the binomial coefficients (values in pascal triangle)
*/

/*
The pascal_print function prints the spaces and values from pascal_recur function.
The pascal_recur function uses recursion to return the binomial coefficients by adding the elements of the previous row but column is current -1 and current
*/

/* I couldn't figure out how to memoize this function because the key was supposed to be two integers not one */