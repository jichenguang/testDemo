package com.dbyl.libarary.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
/**
 * This method is for get the config file
 * 这个方法用来查找一个配置文件，这个文件里存储浏览器的路径
 * @author Young
 *
 */
public class ConfigUtils {

	private static Log log = new Log(ConfigUtils.class);

	public static Properties getProperties(String config) throws IOException {
//		获取文本参数
		Properties properties = new Properties();
		log.info("Get the config file: " + config);
		FileInputStream inStream = new FileInputStream(new File(config));
		try {
//      读取文本内容，转化为参数
			properties.load(inStream);
		} catch (Exception e) {
			log.error("can't find the config file ");
			log.error(e.getMessage());
		}

		return properties;
	}
}
