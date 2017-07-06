package com.ieofong.romancalculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ieofong.romancalculator.service.CalculatorService;

import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.beans.factory.annotation.Autowired;

import static java.lang.System.exit;

@SpringBootApplication
public class RomanCalculatorApplication  implements CommandLineRunner {
	
	@Autowired
    private  CalculatorService calService;

	public static void main(String[] args) throws Exception {
		SpringApplication.run(RomanCalculatorApplication.class, args);
//		SpringApplication app = null;
//		app.setBannerMode(Banner.Mode.OFF);
//        app.run(args);
	}
	
	//access command line arguments
    @Override
    public void run(String...args) throws Exception {

    	if (args.length > 0) {
            System.out.println(calService.getMessage(args[0].toString()));
        } else {
            System.out.println(calService.getMessage());
        }

        exit(0);

    }
}
