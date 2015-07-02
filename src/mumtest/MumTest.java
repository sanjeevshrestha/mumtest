package mumtest;

import mumtest.prime;
import mumtest.sqrt;

/**
 *
 * @author sanjeev
 */
public class MumTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println(prime.isPrime(169));
        System.out.println(prime.isPrime(179));
        System.out.println(prime.findPorcupineNumber(139));
        System.out.println(sqrt.isPerfectSquare(9));
        System.out.println(sqrt.isPerfectSquare(10));
        System.out.println(sqrt.isPerfectSquare(11));
        System.out.println(sqrt.isPerfectSquare(16));
        System.out.println(sqrt.isPerfectSquare(24));
        System.out.println(sqrt.isPerfectSquare(25));
        System.out.println(sqrt.nextPerfectSquare(24));
        System.out.println(sqrt.nextPerfectSquare(109));
        System.out.println(sqrt.nextPerfectSquare(9786));
        System.out.println(sqrt.nextPerfectSquare(-24));






    }
}
