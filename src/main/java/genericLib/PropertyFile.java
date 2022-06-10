package genericLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile implements AutoConstant {

	public String getProperty(String key) throws FileNotFoundException, IOException {

		Properties property = new Properties();
		property.load(new FileInputStream(propetyFilePath));
		return property.getProperty(key);
	}
}
