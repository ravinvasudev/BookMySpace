package com.bms.helper;

/**
 * @author Ravin Vasudev
 * 
 *         <p>
 *         This class contains all essential static types.
 *         </p>
 *
 */
public final class Constants {

	/**
	 * Following Statuses are available.
	 * <ul>
	 * <li><b>Success</b></li>
	 * <li><b>Failure</b></li>
	 * </ul>
	 */
	public static enum Status {

		SUCCESS("SUCCESS"),

		FAILURE("FAILURE"),
		
		ERROR("ERROR");

		private String status;

		private Status(String status) {
			this.status = status;
		}

		public String get() {
			return this.status;
		}

	}
	
	/**
	 * Following Action Statuses are available.
	 * <ul>
	 * <li><b>Initial</b></li>
	 * <li><b>Success</b></li>
	 * <li><b>Failure</b></li>
	 * </ul>
	 */
	public static enum ActionStatus {

		INITIAL(-1),

		SUCCESS(0),

		FAILURE(1);

		private int status;

		private ActionStatus(int status) {
			this.status = status;
		}

		public int get() {
			return status;
		}

	}

	/**
	 * Following Project Categories are available.
	 * <ul>
	 * <li><b>New</b></li>
	 * <li><b>Featured</b></li>
	 * <li><b>Upcoming</b></li>
	 * </ul>
	 */
	public static enum ProjectCategory {

		NEW(0),

		FEATURED(1),

		UPCOMING(2);

		private int cat;

		private ProjectCategory(int cat) {
			this.cat = cat;
		}

		public int get() {
			return cat;
		}
	}

	/**
	 * Following Project Types are available.
	 * <ul>
	 * <li><b>Residential</b></li>
	 * <li><b>Commercial</b></li>
	 * </ul>
	 */
	public static enum ProjectType {

		RESIDENTIAL(0),

		COMMERCIAL(1);

		private int type;

		private ProjectType(int type) {
			this.type = type;
		}

		public int get() {
			return type;
		}
	}
	
	public static enum ErrorCode {
		
		DB_ERROR("BMS"),
		
		NILLABLE_DATASOURCE("BMS"), 
		
		NOSQL_CONNECTION("BMS"),
		
		NOSQL_ROLLBACK("BMS"),
		
		NOSQL_COMMIT("BMS"),
		
		NOSQL_CLOSE("BMS");
		
		private String code;
		
		private ErrorCode(String code) {
			this.code = code;
		}
		
		public String get() {
			return code;
		}
	}
	
	public static enum ConfigKey {
		
		NILLABLE_DATASOURCE(""), 
		
		NOSQL_CONNECTION(""),
		
		NOSQL_ROLLBACK(""),
		
		NOSQL_COMMIT(""),
		
		NOSQL_CLOSE("");

		private String key;

		private ConfigKey(String key) {
			this.key = key;
		}

		public String get() {
			return key;
		}
	}

}
