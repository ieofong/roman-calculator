package com.ieofong.romancalculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ieofong.romancalculator.controller.RomanCalculatorController;

import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.beans.factory.annotation.Autowired;

import static java.lang.System.exit;

@SpringBootApplication
public class RomanCalculatorApplication  implements CommandLineRunner {
	
	@Autowired
    private  RomanCalculatorController controller;

	public static void main(String[] args) throws Exception {
		//disabled banner, don't want to see the spring logo
        SpringApplication app = new SpringApplication(RomanCalculatorApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
		SpringApplication.run(RomanCalculatorApplication.class, args);
	}
	
	//access command line arguments
    @Override
    public void run(String...args) throws Exception {

    	System.out.println("\n================== Start ==================\n");
    	
    	if (args.length > 0) {
    		controller.processCalculateRoman(args[0].toString());
        } else {
            System.out.println("Please determine the path of input file.");
        }
 
    	System.out.println("\n=================== End ===================\n");
        exit(0);

    }
}
