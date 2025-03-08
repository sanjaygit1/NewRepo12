package Generic_Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class File_Utility {

	/**
	 * This method is used to read data from properties file
	 * @param key
	 * @return
	 * @throws Throwable
	 * @author Shobha
	 */
	public String getCommonData(String key) throws Throwable
	{
		FileInputStream fis = new FileInputStream(IPathConstant.filePath);

		// step2:- load all the keys from properties file
		Properties pro = new Properties();
		pro.load(fis);

		// step3:- get keys from properties file
		String Value = pro.getProperty(key);
		return Value;
		
	}
}
