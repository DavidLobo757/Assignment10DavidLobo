package com.coderscampus.Assignment10DavidLobo.spoonacular.dto;



public class Meal {
	private Integer id;
	private String title;
	private Integer readyInMinutes;
	private Integer servings;
	private String imageType;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public Integer getReadyInMinutes() {
		return readyInMinutes;
	}
	public void setReadyInMinutes(Integer readyInMinutes) {
		this.readyInMinutes = readyInMinutes;
	}
	public Integer getServings() {
		return servings;
	}
	public void setServings(Integer servings) {
		this.servings = servings;
	}
	
	public String getImageType() {
		return imageType;
	}
	public void setImageType(String imageType) {
		this.imageType = imageType;
	}
	@Override
	public String toString() {
		return "Meal [id=" + id + ", title=" + title + ", readyInMinutes=" + readyInMinutes + ", servings=" + servings + ", imageType=" + imageType + "]";
	}
}
