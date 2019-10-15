package com.yash.tdd_demo.util;

public class StringCalculator {

	public int calculate(String input) {
		if(input.isEmpty()) {
			return 0;
		}else if(input.indexOf(",")> -1){
			
			int sum = 0;
			String[] tockens = input.split(",");
			for (String tocken : tockens) {
				sum+=Integer.parseInt(tocken);
			}
 			return sum;
		}else
		{
		return Integer.parseInt(input);
		}
	}

}
