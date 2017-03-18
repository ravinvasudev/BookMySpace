package com.bms.controller.impl;

import java.util.List;

import com.bms.controller.ProjectController;
import com.bms.dao.ProjectDao;
import com.bms.helper.BMSException;
import com.bms.helper.Constants.ActionStatus;
import com.bms.helper.Constants.Status;
import com.bms.model.Project;

public class ProjectControllerImpl implements ProjectController {

	private ProjectDao dao;

	@Override
	public Project find(int projectId) {
		return null;
	}

	@Override
	public List<Project> getAllProjects() {
		return null;
	}

	@Override
	public List<Project> getActiveProjects() {
		return null;
	}

	@Override
	public List<Project> getFeaturedProjects() {
		return null;
	}

	@Override
	public List<Project> getUpcomingProjects() {
		return null;
	}

	@Override
	public String addProject(Project project) {
		// 1. validate input data
		// 2. check if project already exists
		// 3. otherwise, delegate work to DAO
		ActionStatus actionStatus = null;
		try {
			actionStatus = dao.addProject(project);// success-failure-exception
		} catch (BMSException e) {
			// #1
			actionStatus = ActionStatus.FAILURE;
			// 1. log exception cause, reason and details for audit purpose.
		}
		return actionStatus(actionStatus);
	}

	@Override
	public String updateProject(Project project) {
		return actionStatus(dao.updateProject(project));
	}

	@Override
	public String deleteProject(int i) {
		return null;
	}

	// we need to refactor below method.
	private String actionStatus(ActionStatus actionStatus) {
		actionStatus = actionStatus == null ? ActionStatus.INITIAL : actionStatus;
		if (actionStatus.equals(ActionStatus.SUCCESS)) {
			return Status.SUCCESS.get();
		} else if (actionStatus.equals(ActionStatus.FAILURE) || actionStatus.equals(ActionStatus.INITIAL)) {
			return Status.FAILURE.get();
		} else {
			return Status.FAILURE.get(); 
		}		
	}

}
