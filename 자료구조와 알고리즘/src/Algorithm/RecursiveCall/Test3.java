package Algorithm.RecursiveCall;

public class Test3 {

    public int factorialFunc(int num){
        if(num <= 1)
            return num;
        return num * factorialFunc(num-1);
    }

    public static void main(String[] args) {
        Test3 t = new Test3();
        System.out.println(t.factorialFunc(5));
    }
}
