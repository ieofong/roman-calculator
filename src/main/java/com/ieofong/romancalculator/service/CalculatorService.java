package com.ieofong.romancalculator.service;

import com.ieofong.romancalculator.service.ConvertorService;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

	@Value("${name:unknown}")
    private String name;
	
	@Autowired
	private ConvertorService convertorService;
    
    public String calculateRoman(String problem) {
    	int total = 0;
    	int operation = 0;
    	String operand = "";
    	String result = "";
		  
    	String[] splitOper = problem.split("(?<=[-+*/])|(?=[-+*/])");
    	
    	for (String oper : splitOper) {
    		
    		if ("+-*/".contains(oper)) {
    			operand = oper;
    		}
    		else {
    			operation = this.convertorService.romanToArabic(oper);
    			
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

		 result = this.convertorService.arabicToRoman(total);
		 return result;
	}
    
}
