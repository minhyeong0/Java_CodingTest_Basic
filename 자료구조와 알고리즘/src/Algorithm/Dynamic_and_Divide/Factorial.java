package Algorithm.Dynamic_and_Divide;

public class Factorial {

    public int FactorialFunc(int data){
        if(data <= 1)
            return data;
        return this.FactorialFunc(data-2) + this.FactorialFunc(data-1);
    }

    public static void main(String[] args) {
        Factorial fObject = new Factorial();
        System.out.println(fObject.FactorialFunc(10));
    }


}
