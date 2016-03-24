package regex1;
//Õ¯¬Á≈¿≥Ê
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex_9 {
	public static void main (String[] args) throws Exception{
		String reg = "\\w+@[a-zA-Z]";
		getMailsByWeb(reg);
	}
	public static void getMailsByWeb(String regex)throws Exception
	{
		URL url = new URL("file:///C:/Users/Administrator/Desktop/%E5%AD%97%E7%AC%A6%E7%BC%96%E7%A0%81_%E7%99%BE%E5%BA%A6%E7%99%BE%E7%A7%91.html");
		
		URLConnection conn = url.openConnection();
		BufferedReader bufIn = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		String line = null;
		Pattern p = Pattern.compile(regex);		
		while((line=bufIn.readLine())!=null)
		{
			//System.out.println(line);
			Matcher m = p.matcher(line);
			while(m.find())
			{
				System.out.println(m.group());
			}
		}
		bufIn.close();
	}
	public static void getMails(String regex)throws Exception
	{
		BufferedReader bufr = 
			new BufferedReader(new FileReader("mail.txt"));
		String line = null;
		Pattern p = Pattern.compile(regex);		
		while((line=bufr.readLine())!=null)
		{
			//System.out.println(line);
			Matcher m = p.matcher(line);
			while(m.find())
			{
				System.out.println(m.group());
			}
		}
		bufr.close();
	}
}
