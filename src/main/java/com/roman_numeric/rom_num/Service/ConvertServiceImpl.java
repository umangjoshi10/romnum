package com.roman_numeric.rom_num.Service;
import java.util.*;
import org.springframework.stereotype.Component;

@Component
public class ConvertServiceImpl implements ConvertService {
    

    @Override
    public int getRomantoNumerical(String roman){
         Map<Character, Integer> map = new HashMap<>();
          map.put('I', 1);
          map.put('V', 5);
          map.put('X', 10);
          map.put('L', 50);
          map.put('C', 100);
          map.put('D', 500);
          map.put('M', 1000);
          int result = 0;
          for (int i = 0; i < roman.length(); i++) {
            char c = roman.charAt(i);
            Integer value = map.get(c);
            if(value == null){
              throw (new NumberFormatException("Invalid Input"));
            }
            if (i + 1 < roman.length()) {
              char next = roman.charAt(i + 1);
              if (value < map.get(next)) {
                result -= value;
              } else {
                result += value;
              }
            } else {
              result += value;
            }
          }
          return result;

    }

    @Override
    public String getNumericaltoRoman(int num){
        
        StringBuilder result = new StringBuilder();
        int[] decimal = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        if(num<1 || num>4000){
          throw (new NumberFormatException("Number Must be Between 1 and 4000"));
        }
        for (int i = 0; i < decimal.length; i++) {
            while (num >= decimal[i]) {
                result.append(roman[i]);
                num -= decimal[i];
        }
    }
    return result.toString();
}
    
    

}
