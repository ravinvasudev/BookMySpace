package com.bms.action;

import java.util.List;

import com.bms.controller.SearchController;
import com.bms.model.SearchResult;

public class SearchAction {

	private String query;

	private List<SearchResult> results;

	private SearchController controller;

	public String search() {
		results = controller.getResults(query);
		return null;
	}

	public String getSearchQuery() {
		return query;
	}

	public void setSearchQuery(String query) {
		this.query = query;
	}

	public List<SearchResult> getResults() {
		return results;
	}

	public void setResults(List<SearchResult> results) {
		this.results = results;
	}

}
