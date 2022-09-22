import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean isPrime = true;

        int number=sc.nextInt();

        for(int i=2;i<number;i++){
            if(number%i==0){
                isPrime=false;
            }
        }

        if(isPrime==true && number!=1) {
            System.out.println("The number is a prime number");
        }else {
            System.out.println("The number isn't a prime number");
        }

    }
}