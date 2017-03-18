package com.bms.helper;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.bms.helper.Constants.ConfigKey;
import com.bms.helper.Constants.ErrorCode;

public final class DBService {

	private static final Logger logger = LogManager.getLogger(DBService.class.getName());
	
	private static final class InstanceHelper {
		public static final DBService INSTANCE = new DBService();
	}

	public static DBService getInstance() {
		return DBService.InstanceHelper.INSTANCE;
	}

	private Connection connection;

	private DataSource dataSource;

	private DBService() {
		logger.info("Initializing DBService.");
	}

	public void closeConnection() {
		if (connection != null) {
			try {
				connection.close();
				connection = null;
			} catch (SQLException e) {
				throw new BMSException(ErrorCode.NOSQL_CLOSE, getConfigText(ConfigKey.NOSQL_CLOSE), e);
			}
		}
	}

	public void commit() {
		try {
			connection.commit();
		} catch (SQLException e) {
			throw new BMSException(ErrorCode.NOSQL_COMMIT, getConfigText(ConfigKey.NOSQL_COMMIT), e);
		}
	}

	public Connection openConnection() throws BMSException {
		if (dataSource != null) {
			if (connection == null) {
				try {
					connection = dataSource.getConnection();
				} catch (SQLException e) {
					throw new BMSException(ErrorCode.NOSQL_CONNECTION, getConfigText(ConfigKey.NOSQL_CONNECTION), e);
				}
			}
			return connection;
		} else {
			throw new BMSException(ErrorCode.NILLABLE_DATASOURCE, getConfigText(ConfigKey.NILLABLE_DATASOURCE));
		}
	}

	public void rollback() {
		if (connection != null) {
			try {
				connection.rollback();
			} catch (SQLException e) {
				throw new BMSException(ErrorCode.NOSQL_ROLLBACK, getConfigText(ConfigKey.NOSQL_ROLLBACK), e);
			}
		}
	}

	protected void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	private String getConfigText(ConfigKey configKey) {
		return ConfigReader.getProperty(configKey.get());
	}

}
