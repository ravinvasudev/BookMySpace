package com.bms.controller;

import java.util.List;

import com.bms.model.Project;

/**
 * @author Ravin Vasudev
 * 
 * @serial Version 1
 * 
 * @since March 2016
 * 
 *        <p>
 *        Handles project operations.
 *        </p>
 *
 */
public interface ProjectController {

	/**
	 * Retrieve the Project.
	 * 
	 * @param projectId
	 * @return {@link Project}
	 */
	public Project find(int projectId);

	/**
	 * Retrieve all Projects.
	 * 
	 * @return {@link List}<{@link Project}>
	 */
	public List<Project> getAllProjects();

	/**
	 * Retrieve all Active Projects.
	 * 
	 * @return {@link List}<{@link Project}>
	 */
	public List<Project> getActiveProjects();

	/**
	 * Retrieve all Featured Projects.
	 * 
	 * @return {@link List}<{@link Project}>
	 */
	public List<Project> getFeaturedProjects();

	/**
	 * Retrieve all Upcoming Projects.
	 * 
	 * @return {@link List}<{@link Project}>
	 */
	public List<Project> getUpcomingProjects();

	/**
	 * Adds the Project.
	 * 
	 * @param project
	 * @return {@link String}
	 */
	public String addProject(Project project);

	/**
	 * Update the Project.
	 * 
	 * @param project
	 * @return {@link String}
	 */
	public String updateProject(Project project);

	/**
	 * Delete the Project.
	 * 
	 * @param projectId
	 * @return {@link String}
	 */
	public String deleteProject(int i);

}
