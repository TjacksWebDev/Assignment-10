package com.coderscampus.Assignment10.spoonacular.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Nutrients {

	@JsonProperty("calories")
	private Integer calories;

	@JsonProperty("protein")
	private Integer protein;

	@JsonProperty("fat")
	private Integer fat;

	@JsonProperty("carbohydrates")
	private Integer carbohydrates;

	public Nutrients() {
	}

	public Integer getCalories() {
		return calories;
	}

	public void setCalories(Integer calories) {
		this.calories = calories;
	}

	public Integer getProtein() {
		return protein;
	}

	public void setProtein(Integer protein) {
		this.protein = protein;
	}

	public Integer getFat() {
		return fat;
	}

	public void setFat(Integer fat) {
		this.fat = fat;
	}

	public Integer getCarbohydrates() {
		return carbohydrates;
	}

	public void setCarbohydrates(Integer carbohydrates) {
		this.carbohydrates = carbohydrates;
	}
	
	@Override
    public String toString() {
        return "Nutrients [calories=" + calories + ", protein=" + protein + ", fat=" + fat + ", carbohydrates="
                + carbohydrates + "]";
    }

}