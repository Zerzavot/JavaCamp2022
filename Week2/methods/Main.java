package methods;

public class Main {
    public static void main(String[] args) {

        int[] numbers=new int[]{11,3,52,7,9,56,12,45,5};
        int findIt=56;

        findNumber(numbers,findIt);

    }

    public static void findNumber(int[] numbers, int findIt) {
        boolean find=false;

        for(int num: numbers){
            if(num==findIt){
                find=true;
                break;
            }
        }
        if(find){
        giveMessage("Find the number inside of the group: "+ findIt);}
        else{
            giveMessage("Couldnt find it..");
        }

    }

    public static void giveMessage(String message) {
        System.out.println(message);
    }
}
