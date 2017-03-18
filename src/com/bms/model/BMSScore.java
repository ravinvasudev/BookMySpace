package com.bms.model;

import java.io.Serializable;
import java.util.List;

/**
 * @author Ravin Vasudev
 * 
 *         <p>
 *         This class represents the Project BMS Score.
 *         </p>
 */
public class BMSScore implements Serializable {

	private static final long serialVersionUID = -6771951254120492204L;

	private String score;

	private List<String> factors;

	public BMSScore() {

	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public List<String> getFactors() {
		return factors;
	}

	public void setFactors(List<String> factors) {
		this.factors = factors;
	}

	@Override
	public String toString() {
		return String.format("BMSScore [score=%s, factors=%s]", score, factors);
	}

}
