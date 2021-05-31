package selChrome;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class S_PropertiesFileReadAndWrite {

	public static void main(String[] args) throws IOException {
		Properties pr=new Properties();
		
		//Reading
		FileInputStream is=new FileInputStream("C:\\Users\\Admin\\Desktop\\Eclipse\\EclipseWrokspace\\selChrome\\src\\test\\resources\\prop.properties");
        pr.load(is);
        System.out.println(pr.getProperty("url"));
        System.out.println(pr.getProperty("websitename"));
        
        //Writing
        FileOutputStream os=new FileOutputStream("C:\\Users\\Admin\\Desktop\\Eclipse\\EclipseWrokspace\\selChrome\\src\\test\\resources\\prop.properties");
        pr.setProperty("Date", "21st May");
        pr.store(os, "added date");
        
        System.out.println(pr.getProperty("Date"));
        
	}

}
