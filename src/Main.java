import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduceti primul numar al intervalului: ");
        int n1= input.nextInt();
        System.out.println("Introduceti ultimul numar al intervalului: ");
        int n2 = input.nextInt();
        System.out.println("Introduceti decalajul:");
        int d = input.nextInt();
        afiseazaPerechiPrime(n1,n2,d);

    }
    private static void afiseazaPerechiPrime(int n1, int n2, int d){
        n1 = n1<2 ? 3 : n1;
        for (int i=n1;i<=n2-d;i++){
            if (isPrime(i) && isPrime(i+d))
                System.out.println(i+ " - "+(i+d));
        }
    }
    private static boolean isPrime(int a) {
        for (int i = 2; i <= a/2; i++) {
            if (a % i == 0) {
                return  false;
            }
        }
        return true;
    }
}
