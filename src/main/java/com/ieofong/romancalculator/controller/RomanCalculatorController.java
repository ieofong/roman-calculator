package com.ieofong.romancalculator.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ieofong.romancalculator.service.CalculatorService;
import com.ieofong.romancalculator.service.FileStreamService;

@Controller
public class RomanCalculatorController {

	@Autowired
    private CalculatorService calcService;
	
	@Autowired
	private FileStreamService fileService;
	
	public void processCalculateRoman(String fileName) {
		
		List<String> problemList = new ArrayList<>();
		problemList = this.fileService.readFile(fileName);
		
		for (String problem : problemList)
		{
			System.out.println("Problem is "+ problem);
			System.out.println("Result = "+ this.calcService.calculateRoman(problem));
		}
		
	}
}
