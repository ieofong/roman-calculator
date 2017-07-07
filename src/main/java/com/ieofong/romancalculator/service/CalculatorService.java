package com.ieofong.romancalculator.service;

import com.ieofong.romancalculator.service.ConvertorService;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
	
	@Autowired
	private ConvertorService convertorService;
    
    public String calculateRoman(String problem) {
    	int total = 0;
    	int operation = 0;
    	String operand = "";
    	String result = "";
		  
    	String[] splitOper = problem.split("(?<=[-+*/])|(?=[-+*/])");
    	
    	if (splitOper.length%2 <= 0) {
    		return "Cannot calculate propblem incomplete";
    	}
    	
    	for (String oper : splitOper) {
    		
    		if ("+-*/".contains(oper)) {
    			operand = oper;
    		}
    		else {
    			
    			try {
    				operation = this.convertorService.romanToArabic(oper);
    			} catch (IllegalArgumentException e){
    				System.out.println(e.getMessage());
    			}
    			
    			if (total <= 0) 
    				total = operation;
    			
    			if (!operand.isEmpty()) {
    				
    	    		switch (operand) {
    	    			case "+" : 
    	    				total = total + operation;
    	    				break;
    	    			case "-" : 
    	    				total = total - operation;
    	    				break;
    	    			case "*" : 
    	    				total = total * operation;
    	    				break;
    	    			case "/" : 
    	    				total = total / operation;
    	    				break;
    	    		}
    	    		
        			operand = "";
        		}
    		}
    		
    	}

    	try {
    		result = this.convertorService.arabicToRoman(total);
		} catch (IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
		 
		return result;
	}
    
}
