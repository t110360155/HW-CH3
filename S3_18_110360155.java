import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class S3_18_110360155
{
	public static void main(String[] args) throws IOException
	{
    System.out.println("Please enter an English word");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String str = br.readLine();

    String stru = str.toUpperCase();
    String strl = str.toLowerCase();
    
    System.out.println("When converted to uppercase it is: "+stru);
    System.out.println ("When converted to lowercase, it is: "+strl);
  }
}
