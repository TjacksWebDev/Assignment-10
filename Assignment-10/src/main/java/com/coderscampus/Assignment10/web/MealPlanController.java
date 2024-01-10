package com.coderscampus.Assignment10.web;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.coderscampus.Assignment10.spoonacular.dto.DayResponse;
import com.coderscampus.Assignment10.spoonacular.dto.WeekResponse;

@RestController
public class MealPlanController {

	@GetMapping("mealplanner/week")
	public ResponseEntity<WeekResponse> getWeekMeals(@RequestParam(required = false) String numCalories,
			@RequestParam(required = false) String diet, @RequestParam(required = false) String exclusions) {

		RestTemplate rt = new RestTemplate();

		UriComponentsBuilder uriBuilder = UriComponentsBuilder
				.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate").queryParam("timeframe", "week")
				.queryParam("apiKey", "4275d01a4e0c4c599db77962cb5aca15");
		if (numCalories != null) {
			uriBuilder.queryParam("targetCalories", numCalories);
		}
		if (diet != null) {
			uriBuilder.queryParam("diet", diet);
		}
		if (exclusions != null) {
			uriBuilder.queryParam("exclusions", exclusions);
		}
		URI uri = uriBuilder.build().toUri();
		ResponseEntity<WeekResponse> response = rt.getForEntity(uri, WeekResponse.class);
		return response;

	}
	@GetMapping("mealplanner/day")
	public ResponseEntity<DayResponse> getDayMeals(@RequestParam(required = false) String numCalories, @RequestParam(required = false) String diet, @RequestParam(required = false) String exclusions){
		
		RestTemplate rt = new RestTemplate();
		
		UriComponentsBuilder uriBuilder=UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
				.queryParam("apiKey", "4275d01a4e0c4c599db77962cb5aca15");
		if (numCalories != null) {
			uriBuilder.queryParam("targetCalories", numCalories);
		}
		if (diet != null) {
			uriBuilder.queryParam("diet", diet);
		}
		if (exclusions != null) {
			uriBuilder.queryParam("exclusions", exclusions);
		}
		URI uri = uriBuilder.build().toUri();
		ResponseEntity<DayResponse> response = rt.getForEntity(uri, DayResponse.class);
		return response;
	}
}
