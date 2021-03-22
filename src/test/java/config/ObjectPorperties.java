package config;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Map;

import org.yaml.snakeyaml.Yaml;

public class ObjectPorperties {
	
	static Map <?,?> property;
	static String objectpath = "src/test/resources/data/config.yml";
	
	public static void initObjProp() {
		
		try {
			Reader rd = new FileReader(objectpath);
			Yaml yml = new Yaml();
			property = (Map<?,?>) yml.load(rd);
			rd.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static String getProperty(String obj) {
		Map<?,?> map = (Map<?,?>) property.get(obj.split("\\.")[0]);
		return map.get(obj.split("\\.")[1]).toString();
	}
}
