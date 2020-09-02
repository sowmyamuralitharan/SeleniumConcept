package com.concept.Demo;

import java.util.Scanner;

public class DynamicWebTable extends CoronaUpdate {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter countryName:" );
		String CountryName = sc.nextLine();
		countryUpdate(CountryName);
	}

}
