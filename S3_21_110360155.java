import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S3_21_110360155
{
    public static void main(String[]args) throws IOException 
    {
        System.out.println("Please enter two integers");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();
        
       int num1 = Integer.parseInt(str1);
       int num2 = Integer.parseInt(str2);
       
       int ans = Math.max(num1, num2);
       
        System.out.println("Between "+str1+" and "+str2+", the biggest number is "+ans);
    }
}
