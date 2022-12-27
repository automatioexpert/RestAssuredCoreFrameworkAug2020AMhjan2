package UnitTest;

import java.io.IOException;

import Utilities.PropertiesFileUtils;

public class TestPropertiesFileUtils {

	public static void main(String[] args) throws IOException {
		
		PropertiesFileUtils propertiesFileUtils = new PropertiesFileUtils("config");
		PropertiesFileUtils propertiesFileUtils1 = new PropertiesFileUtils("config1");
		
		
		
		
		System.out.println(propertiesFileUtils.getValue("frameworkName"));
		System.out.println(propertiesFileUtils.getValue("author"));
		System.out.println(propertiesFileUtils1.getValue("author1"));
		System.out.println(propertiesFileUtils1.getValue("frameworkName1"));
	}
}
