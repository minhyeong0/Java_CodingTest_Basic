import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main1{
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.valueOf(br.readLine());
        String b = br.readLine();
        char[] c = b.toCharArray();
        int sum = 0;
        
        for(int i=0; i<c.length; i++){
            sum += c[i] - '0';
        }
        
        System.out.println(sum);
    }
}