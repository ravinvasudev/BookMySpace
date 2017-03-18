package com.bms.dao;

import com.bms.helper.BMSException;
import com.bms.helper.Constants.ActionStatus;
import com.bms.helper.DBService;
import com.bms.model.Project;

/**
 * @author Ravin Vasudev
 * 
 * @serial Version 1
 * 
 * @since March 2016
 * 
 *        <p>
 *        Interact with database to get Project data.
 *        </p>
 *
 */
public interface ProjectDao {
	
	public static final DBService DB_SERVICE = DBService.getInstance();

	/**
	 * Add the project as a new item to the database.
	 * 
	 * @param project to be added
	 * @return status of operation
	 */
	public abstract ActionStatus addProject(Project project) throws BMSException;

	/**
	 * Update the existing project in the database.
	 * 
	 * @param project to be added
	 * @return status of operation
	 */
	public abstract ActionStatus updateProject(Project project) throws BMSException;

}
