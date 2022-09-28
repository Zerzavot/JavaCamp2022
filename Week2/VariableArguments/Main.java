package VariableArguments;

public class Main {
    public static void main(String[] args) {
        System.out.println(mySum2(4,67,8,0,34,65,5));
    }

    public static int mySum(int num1,int num2) {
        return num1+num2;
    }

    public static int mySum2(int... numbers) {
        int result=0;
        for(int num: numbers){
            result+=num;
        }
        return result;
    }
}
