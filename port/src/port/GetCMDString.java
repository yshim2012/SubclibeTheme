package port;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class GetCMDString {
	public ArrayList<String> Get_CMDString(){
		ArrayList<String> arr = new ArrayList<String>();
        try {  
            Runtime rt = Runtime.getRuntime();  
            Process pr = rt.exec("cmd /c mode"); // cmd /c calc  
            // Process pr = rt.exec("D:\\xunlei\\project.aspx");  
  
            BufferedReader input = 
            		new BufferedReader(
            		new InputStreamReader(
            		pr.getInputStream(), "GBK"));  
            String line = null;  
            while ((line = input.readLine()) != null) {  
                System.out.println(line); 
                arr.add(line);
            }  
            return arr;
  //          int exitVal = pr.waitFor();  
    //        System.out.println("Exited with error code " + exitVal);  
  
        } catch (Exception e) {  
            System.out.println(e.toString()+"µ÷ÓÃ´íÎó");  
            e.printStackTrace();  
            return null;
        }  
	}		
}
