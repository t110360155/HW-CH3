import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class S3_16_110360155
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("Please enter an integer");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		int num = Integeer.parseInt(str);
		System.out.println("The number you entered is:"+num);
	}
}		