package day1;
// factorial

public class factorial
{
    public static void main(String[] args) {
        int num = 5;
        int result = 0;

        result = fact(num);

        System.out.println(result);
    }

    private static int fact(int num) {
        // int value = 1;

        // for(int i = 1; i <= num; i++)
        // {
        //     value = value * i;
        // }
        if(num == 0)
            return 1;

        return num*fact(num-1);
    }
}