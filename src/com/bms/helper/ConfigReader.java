package com.bms.helper;

import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/** Object holds the Configuration Properties read from configuration file [config.properties]. */
public final class ConfigReader {
	
	private static final Logger logger = LogManager.getLogger(ConfigReader.class.getName());

	private static Properties utilProperties;

	public ConfigReader() {
		logger.info("Initializing Config.");
	}

	/** Get a Configured Property by key. */
	public static String getProperty(String key) {
		String value = null;
		if (getUtilProperties().containsKey(key)) {
			value = getUtilProperties().getProperty(key);
		}
		return value;
	}

	/** Get All Configured Properties. */
	public static Properties getUtilProperties() {
		return ConfigReader.utilProperties;
	}

	public void setUtilProperties(Properties utilProperties) {
		ConfigReader.utilProperties = utilProperties;
	}

}
