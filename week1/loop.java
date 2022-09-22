public class Main {
    public static void main(String[] args) {

        for(int i =1 ; i<10;i+=2) {
            System.out.println(i);
        }
        System.out.println("End of the for loop");

        //While
        int i = 2 ;
        while(i<10) {
            System.out.println(i);
            i++;
        }
        System.out.println("End of while loop");

        //Do-While
        int j=1;
        do{
            System.out.println(j);
            j += 2;
        } while(j<10);
        System.out.println("End of the Do-While");
    }
}