package com.bms.controller;

import java.util.List;

import com.bms.model.SearchResult;

/**
 * @author Ravin Vasudev
 * 
 * @serial Version 1
 * 
 * @since March 2016
 * 
 *        <p>
 *        Handles search operations.
 *        </p>
 *
 */
public interface SearchController {

	public List<SearchResult> getResults(String string);

}
