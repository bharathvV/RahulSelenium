package test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalvalueDriver {

	public static void main(String[] args) throws IOException {
		
		 Properties props=new Properties();
		 FileInputStream fis=new FileInputStream("D:\\eclipse-workspace\\TestNGtutorial\\src\\test\\data.properties");
		 props.load(fis);
		 System.out.println(props.getProperty("browser"));
		 System.out.println(props.getProperty("url"));
		 props.setProperty("browser", "firefox");
		 FileOutputStream fout=new FileOutputStream("D:\\eclipse-workspace\\TestNGtutorial\\src\\test\\data.properties");
		 props.store(fout, null);
		 System.out.println(props.getProperty("browser"));
		 System.out.println(props.getProperty("url"));
		 
	}

}
