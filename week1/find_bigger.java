public class Main {
    public static void main(String[] args) {
        int number1=34;
        int number2=94;
        int number3=96;

        int biggerOne=number1;

        if (biggerOne>number2 && biggerOne>number3){
            biggerOne=number1;
        }else if(number2>number3){
            biggerOne=number2;
        }else{
            biggerOne=number3;
        }

        System.out.println("Bigger one is "+biggerOne);

    }
}