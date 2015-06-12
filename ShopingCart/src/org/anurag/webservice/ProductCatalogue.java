package org.anurag.webservice;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import org.anurag.web.business.ProductServiceImpl;

@WebService
public class ProductCatalogue {
	ProductServiceImpl productServiceObj = new ProductServiceImpl();
	@WebMethod
	public List<String> getProductCategories() {

		return productServiceObj.getProductCategories();
	}
	public List<String> getProducts(String category){
		
		return productServiceObj.getProducts(category);
	 }
	
	public boolean addProducts(String category, String itemName){
		
			return productServiceObj.addProducts(category,itemName);
		
	}

}
