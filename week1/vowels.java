public class Main {
    public static void main(String[] args) {

        char letter='P';

        switch (letter){
            case 'A':
            case 'I':
            case 'E':
            case 'U':
            case 'O':
                System.out.println("Vowels");
                break;
            default:
                System.out.println("Consonant");
        }
    }
}