package com.roman_numeric.rom_num.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.roman_numeric.rom_num.Service.ConvertService;


@RestController
public class ConverController {

    @Autowired
    public ConvertService ConvertService;

    @GetMapping(path="convert/convrom/{num}")
    public int getRomantoNumerical(@PathVariable String num){
        return ConvertService.getRomantoNumerical(num);
    }

    @GetMapping(path= "convert/convnum/{num}")
    public String getNumericaltoRoman(@PathVariable int num){

        return ConvertService.getNumericaltoRoman(num);
    }
}
