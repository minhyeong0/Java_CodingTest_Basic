package Algorithm.RecursiveCall;

public class Test5 {

    public int factorialFunc(int data){
        if(data == 1)
            return 1;
        else if(data == 2)
            return 2;
        else if (data == 3)
            return 4;
        return factorialFunc(data-1) + factorialFunc(data-2) + factorialFunc(data-3);
    }

    public static void main(String[] args) {
        Test5 t = new Test5();
        System.out.println(t.factorialFunc(5));
    }
}
