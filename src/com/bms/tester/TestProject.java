package com.bms.tester;

import java.util.List;

import com.bms.controller.ProjectController;
import com.bms.controller.SearchController;
import com.bms.controller.UserAccountController;
import com.bms.controller.impl.ProjectControllerImpl;
import com.bms.controller.impl.SearchControllerImpl;
import com.bms.controller.impl.UserAccount;
import com.bms.model.Ack;
import com.bms.model.Project;
import com.bms.model.SearchResult;
import com.bms.model.User;
import com.bms.model.UserAuth;

public class TestProject {
	
	public static void main(String[] args) {
		
		ProjectController controller = new ProjectControllerImpl();
			
		// Get all Projects
		List<Project> projects = controller.getAllProjects();
		
		// Get Active Projects
		List<Project> activeProjects = controller.getActiveProjects();
		
		// Get Featured Projects
		List<Project> featuredProjects = controller.getFeaturedProjects();
		
		// Get Upcoming Projects
		List<Project> upcomingProjects = controller.getUpcomingProjects();
		
		// Add new Project
		controller.addProject(new Project());
		
		// Update Project
		controller.updateProject(new Project());
		
		// Delete Project
		controller.deleteProject(123);
		
		
		
		SearchController searchController = new SearchControllerImpl();
		List<SearchResult> searchResults = searchController.getResults("qwerty");
		searchResults.get(0).getUrl();
		
		
		
		
		UserAccountController accountController = new UserAccount();
		
		UserAuth userAuth = accountController.authenticate("username", "password");
		
		Ack status = accountController.createAccount(new User());
		
		
	
		
	}

}
