package com.products.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import com.products.businesslogic.ProductBLInterface;
import com.products.utility.BLFactory;

public class ProductView {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		String opt="y";
		int menu;
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		ProductBLInterface pb= BLFactory.createObject("admin");
		int choice;
		while(opt.equals("y")) {
			
			
			System.out.println("*****MAIN MENU*****");
			System.out.println("Press 1 to chose FoodItem as category");
			System.out.println("Press 2 to chose Apparel as category");
			System.out.println("Press 3 to chose Electronics as category");
			
			choice= Integer.parseInt(br.readLine());
			menu = Integer.parseInt(br.readLine());
			
			switch(menu) {
			
			case 1: pb.addProducts(choice);
					break;
			case 2: pb.viewProducts(choice);
					break;
			default:System.out.println("wrong choice");
				

			}
			
			System.out.println("Do you wish to continue?y/n");
			opt= br.readLine();
		}

	}

}
