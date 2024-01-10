package com.coderscampus.Assignment10.spoonacular.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DayResponse {

	@JsonProperty("meals")
	private List<Meals> meals;

	@JsonProperty("nutrients")
	private Nutrients nutrients;

	public DayResponse() {

	}

	public List<Meals> getMeals() {
		return meals;
	}

	public void setMeals(List<Meals> meals) {
		this.meals = meals;
	}

	public Nutrients getNutrients() {
		return nutrients;
	}

	public void setNutrients(Nutrients nutrients) {
		this.nutrients = nutrients;
	}

	@Override
	public String toString() {
		return "DayResponse [meals=" + meals + ", nutrients=" + nutrients + "]";
	}

}