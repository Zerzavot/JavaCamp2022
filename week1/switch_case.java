public class Main {
    public static void main(String[] args) {


        char grade='A';

        switch (grade){
            case 'A':
                System.out.println("Amazing");
                break;
            case 'B':
            case 'C':
                System.out.println("Not bad");
                break;
            case 'D':
                System.out.println("Bad");
                break;
            default:
                System.out.println("Invalid Grade");

        }
    }
}