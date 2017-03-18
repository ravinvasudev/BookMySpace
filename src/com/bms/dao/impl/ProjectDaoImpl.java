package com.bms.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLTimeoutException;

import com.bms.dao.ProjectDao;
import com.bms.helper.BMSException;
import com.bms.helper.Constants.ActionStatus;
import com.bms.model.Project;

public class ProjectDaoImpl implements ProjectDao {

	@Override
	public ActionStatus addProject(Project project) throws BMSException {
		Connection conn = DB_SERVICE.openConnection();
		PreparedStatement stat = null;
		if(conn != null) {
			try {
				stat = conn.prepareStatement("");
				stat.setQueryTimeout(2*60);
				conn.setAutoCommit(false);
				int result = stat.executeUpdate();
				if(result == 1) {
					DB_SERVICE.commit();
					return ActionStatus.SUCCESS;
					// verify execution order of statements
				} else {
					// what is the return value for other cases?
				}
			} catch(SQLTimeoutException e) {
				DB_SERVICE.rollback();
				throw new BMSException();
			} catch (SQLException e) {
				DB_SERVICE.rollback();
				throw new BMSException();
			} finally {
				DB_SERVICE.closeConnection();
				try {
					if(!stat.isClosed()) {
						stat.close();
					}
				} catch(SQLException e) {
					// log for audit
				}
			}
		}
		return ActionStatus.INITIAL;
		//null - when db connection exception
		//	   - unable to create statement
		//     - SQL timeout
	}

	@Override
	public ActionStatus updateProject(Project project) throws BMSException {
		// TODO Auto-generated method stub
		return null;
	}

}
