public class Main {
    public static void main(String[] args) {
        int[] myNumbers= new int[]{1,2,5,7,9,0};

        int findIt=7;
        boolean iAmIn= false;

        for(int num: myNumbers){
            if(num==findIt){
                iAmIn=true;
                break;
            }
        }
        if(iAmIn){
            System.out.println(findIt+" is a member of myNumbers");

        }else{
            System.out.println("Not a part of list");
        }


    }
}