import java.util.*;

public class Assignment1 
{
    public static void main(String args[])
    {
        long startTime = System.nanoTime();

        ArrayList<Integer> primes = new ArrayList<>();
        long sumAllPrimes = 0;

        for (int i = 2; i < (Math.pow(10, 8)); i++)
        {
            if (isPrime(i))
            {
                primes.add(i);
                sumAllPrimes += i;
            }
        }
        int length = primes.size();
        System.out.println("Top ten maximum primes: ");
        for (int i = length - 10; i < length; i++)
        {
            System.out.println(primes.get(i));
        }

        long endTime = System.nanoTime();
        long totalTime = (endTime - startTime);
        double totalTimeSec  = (double)totalTime / 1000000000.0;
        // System.out.println(primes);
        System.out.println("Execution time: " + (totalTimeSec) + " seconds");
        System.out.println("total number of primes: " + primes.size());
        System.out.println("sum of all primes found: " + sumAllPrimes);

    }

    public static boolean isPrime(int num)
    {
        if ( num > 2 && num % 2 == 0 ) {
            return false;
        }

        for (int i = 3; i <= (int)Math.sqrt(num); i++ )
        {
            if (num % i == 0)
                return false;
        }
        return true;
    }
          
    
}