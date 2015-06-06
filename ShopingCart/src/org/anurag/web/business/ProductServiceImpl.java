package org.anurag.web.business;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl {

	List<String> bookList = new ArrayList<>();
	List<String> moviesList = new ArrayList<>();
	List<String> musicList = new ArrayList<>();
	
	public ProductServiceImpl() {
	
		bookList.add("Steve Jobs");
		bookList.add("CTCI");
		bookList.add("CPP and DS");
		
		moviesList.add("San Andreas");
		moviesList.add("Avengers");
		moviesList.add("Mad Max");
		
		musicList.add("Random Access Memories");
		musicList.add("E D M");
		musicList.add("Higher");
				
	}
	
	public List<String> getProductCategories() {
		List<String> categories = new ArrayList<>();
		categories.add("Books");
		categories.add("Movies");
		categories.add("Music");
		return categories;
	}
	
	public List<String> getProducts(String category){
		
		switch (category.toLowerCase()){
		case "books":
			return bookList;
		case "movies":
			return moviesList;
		case "music":
			return musicList;
			
		}
		
		return null;
	}
	
	public boolean addProducts(String category, String itemName){
		switch(category.toLowerCase()){
		case "books":
			bookList.add(itemName);
			return true;
		case "music":
			musicList.add(itemName);
			return true;
			
		case "movies":
			moviesList.add(itemName);
			return true;
			
		
		default:
			System.out.println("Error in product entry");
			return false;
			
		
		}		
		
	}
}

