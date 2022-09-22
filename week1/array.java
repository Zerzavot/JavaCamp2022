import java.time.Duration;
import java.time.Instant;

public class Main {
    public static void main(String[] args) {



        String [] children = new String[3];
        children[0] ="Ali";
        children[1] ="Veli";
        children[2] ="Ece";

        System.out.println("___for___");
        long start1 = System.nanoTime();
        for(int i =0; i<children.length;i++) {
            System.out.println(children[i]);
        }
        long end1 = System.nanoTime();
        //ForEach


        System.out.println("___for each___");
        for(String chield : children) {
            System.out.println(chield);
        }


        long elapsedTime1 = end1 - start1;

        System.out.println("elapsed time for for loop: "+elapsedTime1);

}}