package methodsWithParameters;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> myList=new ArrayList<>();
        myList.add(98);
        myList.add(45);
        myList.add(32);

        System.out.println(mySum(3,4));
        System.out.println(myRemove(45,myList));
        System.out.println(myAdd(65,myList));
        System.out.println(myAdd(87,myList));
        System.out.println(myAdd(36,myList));
        System.out.println(myAdd(29,myList));

        System.out.println(myUpdate(4,myList,100));

    }



    public static int mySum(int num1, int num2) {
        return num1+num2;
    }
    public static List myRemove(int num, List<Integer> numberList) {
        numberList.remove(Integer.valueOf(32));
        return numberList;
    }
    public static List myAdd(int num, List<Integer> numberList) {
        numberList.add(num);
        System.out.println("My add method");
        return numberList;
    }

    public static List myUpdate(int whichIndex,List<Integer> numberList,int newNumber) {
        numberList.set(whichIndex,newNumber);
        return numberList;


    }
}
