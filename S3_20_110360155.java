import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S3_20_110360155
{
    public static void main(String[]args) throws IOException 
    {
        System.out.println("Please enter a string");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        System.out.println("Please enter a sring to be added");
        String str2 = br.readLine();
        
        StringBuffer sb = new StringBuffer(str1);
        sb.append(str2);
        System.out.println("In the string <"+str1+"> after adding <"+str2+">, the new updated string is <"+sb+">");
    }
}