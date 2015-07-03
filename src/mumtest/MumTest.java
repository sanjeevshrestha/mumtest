package mumtest;

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

//        System.out.println(prime.isPrime(169));
//        System.out.println(prime.isPrime(179));
//        System.out.println(prime.findPorcupineNumber(139));
//        System.out.println(sqrt.isPerfectSquare(9));
//        System.out.println(sqrt.isPerfectSquare(10));
//        System.out.println(sqrt.isPerfectSquare(11));
//        System.out.println(sqrt.isPerfectSquare(16));
//        System.out.println(sqrt.isPerfectSquare(24));
//        System.out.println(sqrt.isPerfectSquare(25));
//        System.out.println(sqrt.nextPerfectSquare(24));
//        System.out.println(sqrt.nextPerfectSquare(109));
//        System.out.println(sqrt.nextPerfectSquare(9786));
//        System.out.println(sqrt.nextPerfectSquare(-24));
        System.out.println(prime.primeCount(10, 300000));

        System.out.println(sequence.isGuithireSequence(new int[]{8, 4, 2, 1}));
        System.out.println(sequence.isGuithireSequence(new int[]{8, 17, 4, 1}));
        System.out.println(sequence.isGuithireSequence(new int[]{8, 4, 1}));
        System.out.println(sequence.isGuithireSequence(new int[]{8, 17, 2}));

        System.out.println(special.isMadhavArray(new int[]{2, 1, 1}));
        System.out.println(special.isMadhavArray(new int[]{2, 1, 1, 4, -1, -1}));
        System.out.println(special.isMadhavArray(new int[]{6, 2, 4, 2, 2, 2, 1, 5, 0, 0}));
        System.out.println(special.isMadhavArray(new int[]{18, 9, 10, 6, 6, 6}));
        System.out.println(special.isMadhavArray(new int[]{-6, -3, -3, 8, -5, -4}));
        System.out.println(special.isMadhavArray(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, -2, -1}));
        System.out.println(special.isMadhavArray(new int[]{3, 1, 2, 3, 0}));

    }
}
