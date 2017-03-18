package com.bms.action;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import com.bms.controller.ProjectController;
import com.bms.helper.Constants.ActionStatus;
import com.bms.helper.Constants.Status;
import com.bms.model.AckMessage;
import com.bms.model.Project;
import com.opensymphony.xwork2.ActionSupport;

public class ProjectAction extends ActionSupport implements ActionResult {

	private static final long serialVersionUID = 4985525053984299228L;

	private int projectId;

	private Project project;

	private List<Project> projects;

	private ProjectController controller;
	
	private AckMessage ack;

	public ProjectAction() {

	}

	/**
	 * Adds the new Project.
	 * 
	 * @return SUCCESS when added.<br/>
	 *         FAILURE when error.
	 */
	public String addProject() {
		String status = controller.addProject(project);
		
		if(status == "SUCCESS") {
			ack.setStatus(Status.SUCCESS);
			ack.setStatusCode("BMS_00");
		} else if(status == "FAILURE") {
			ack.setStatus(Status.FAILURE);
			ack.setStatusCode("BMS_01");
		} 
		return status; 
	}

	/**
	 * Update the existing Project.
	 * 
	 * @return SUCCESS when added.<br/>
	 *         FAILURE when error.
	 */
	public String update() {
		return controller.updateProject(project);
	}

	/**
	 * Mark/Delete the Project for appropriate action by Administrator.
	 * 
	 * @return SUCCESS when added.<br/>
	 *         FAILURE when error.
	 */
	public String delete() {
		return controller.deleteProject(projectId);
	}
	
	/**
	 * Retrieve all the Projects available in database. Instance variable
	 * projects will be set upon success.
	 * 
	 * @return SUCCESS when added.<br/>
	 *         FAILURE when error.
	 */
	public String getAll() {
		projects = controller.getAllProjects();
		return null;
	}
	
	/**
	 * Finds the Project by given projectId. Instance variable project will be
	 * set upon success.
	 * 
	 * @return SUCCESS when added.<br/>
	 *         FAILURE when error.
	 */
	public String get() {
		project = controller.find(projectId);
		return null;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	public ProjectController getProjectController() {
		return controller;
	}

	public void setProjectController(ProjectController controller) {
		this.controller = controller;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	@Override
	public String actionStatus(ActionResult actionStatus) {		
		if (actionStatus.equals(ActionStatus.SUCCESS)) {
			return Status.SUCCESS.get();
		} else if (actionStatus.equals(ActionStatus.FAILURE) || actionStatus.equals(ActionStatus.INITIAL)) {
			return Status.FAILURE.get();
		} else {
			return Status.FAILURE.get(); 
		}
	}

}
