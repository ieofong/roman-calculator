package com.ieofong.romancalculator.service;

import org.springframework.stereotype.Service;

@Service
public class ConvertorService {

	public int romanToArabic(String roman) {
		
		if (roman.length() == 0)
			throw new NumberFormatException("A roman numeral dose not be empty.");
		
		roman = roman.toUpperCase();
		
		int arabic = this.letterToNumber(roman);
		
		return arabic;
	}
	
	public String arabicToRoman(int arabic) {
		
		if (arabic < 1 || arabic > 3999) {
			System.out.println("Number arabic must be between 1 and 3999 ");
		}
		
		String roman = "";
		
		roman = this.numberToLetter(arabic);
		
		return roman;
	}
	
	private int letterToNumber(String letters) {
		
        if (letters.isEmpty()) return 0;
        else if (letters.startsWith("M"))  return 1000 + letterToNumber(letters.substring(1));
        else if (letters.startsWith("CM")) return 900  + letterToNumber(letters.substring(2));
        else if (letters.startsWith("D"))  return 500  + letterToNumber(letters.substring(1));
        else if (letters.startsWith("CD")) return 400  + letterToNumber(letters.substring(2));
        else if (letters.startsWith("C"))  return 100  + letterToNumber(letters.substring(1));
        else if (letters.startsWith("XC")) return 90   + letterToNumber(letters.substring(2));
        else if (letters.startsWith("L"))  return 50   + letterToNumber(letters.substring(1));
        else if (letters.startsWith("XL")) return 40   + letterToNumber(letters.substring(2));
        else if (letters.startsWith("X"))  return 10   + letterToNumber(letters.substring(1));
        else if (letters.startsWith("IX")) return 9    + letterToNumber(letters.substring(2));
        else if (letters.startsWith("V"))  return 5    + letterToNumber(letters.substring(1));
        else if (letters.startsWith("IV")) return 4    + letterToNumber(letters.substring(2));
        else if (letters.startsWith("I"))  return 1    + letterToNumber(letters.substring(1));
        
        throw new IllegalArgumentException("Unexpected roman numerals");
    }

//	private String numberToLetter(int number, String letter) {
//		
//		if (number <= 0) { return letter; }
//		else if (number >= 1000) { letter += "M"; number -= 1000; numberToLetter(number, letter); }
//		else if (number >= 900) { letter += "CM"; number -= 900; numberToLetter(number, letter); }
//		else if (number >= 500) { letter += "D"; number -= 500; numberToLetter(number, letter); }
//		else if (number >= 400) { letter += "CD"; number -= 400; numberToLetter(number, letter); }
//		else if (number >= 100) { letter += "C"; number -= 100; numberToLetter(number, letter); }
//		else if (number >= 90) { letter += "XC"; number -= 90; numberToLetter(number, letter); }
//		else if (number >= 50) { letter += "L"; number -= 50; numberToLetter(number, letter); }
//		else if (number >= 40) { letter += "XL"; number -= 40; numberToLetter(number, letter); }
//		else if (number >= 10) { letter += "X"; number -= 10; numberToLetter(number, letter); }
//		else if (number >= 9) { letter += "IX"; number -= 9; numberToLetter(number, letter); }
//		else if (number >= 5) { letter += "V"; number -= 5; numberToLetter(number, letter); }
//		else if (number >= 4) { letter += "IV"; number -= 4; numberToLetter(number, letter); }
//		else if (number >= 1) { letter += "I"; number -= 1; numberToLetter(number, letter); }
//		else { return letter; }
//		 
//		throw new IllegalArgumentException("Unexpected number value");
//		 
////		for (int i = 0; i < numbers.length; i++) {
////			if (number >= numbers[i]) {
////				letter += letters[i];
////				number -= numbers[i];
////			}
////		}
//	}
	
	private String numberToLetter(int number) {
		
		if (number <= 0) { return ""; }
		else if (number >= 1000) { return "M" + numberToLetter(number-1000); }
		else if (number >= 900) { return "CM" + numberToLetter(number-900); }
		else if (number >= 500) { return "D" + numberToLetter(number-500); }
		else if (number >= 400) { return "CD" + numberToLetter(number-400); }
		else if (number >= 100) { return "C" + numberToLetter(number-100); }
		else if (number >= 90) { return "XC" + numberToLetter(number-90); }
		else if (number >= 50) { return "L" + numberToLetter(number-50); }
		else if (number >= 40) { return "XL" + numberToLetter(number-40); }
		else if (number >= 10) { return "X" + numberToLetter(number-10); }
		else if (number >= 9) { return "IX" + numberToLetter(number-9); }
		else if (number >= 5) { return "V" + numberToLetter(number-5); }
		else if (number >= 4) { return "IV" + numberToLetter(number-4); }
		else if (number >= 1) { return "I" + numberToLetter(number-1); }
		 
		throw new IllegalArgumentException("Unexpected number value");
	
	}
}
