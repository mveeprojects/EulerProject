package EvenFibonacciNumbers;

/*
Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:

1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
*/

public class Application {

    public static void main(String[] args) {
        {
            int n1 = 0;
            int n2 = 1;
            int n3;
            int seqValue = 0;
            int limit = 4000000;
            int sum = 0;

            while (seqValue <= limit) {
                n3 = n1 + n2;
                n1 = n2;
                n2 = n3;
                seqValue = n2;
                if (seqValue > 4000000) {
                    break;
                }
                if (seqValue % 2 == 0) {
                    System.out.println(seqValue);
                    sum = sum + seqValue;
                    System.out.println("sum :" + sum);
                }
            }
            System.out.println("Final sum: " + sum);
        }
    }
}
