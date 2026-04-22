package br.com.erudio.Rest_With_Spring_Boot_And_Java_Erudio.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {
    //http://localhost:8080/math/sum/3/5 - utilizando esse endpoint
    @RequestMapping("/sum/{NumberOne}/{NumberTwo}")
    public double sum(
            @PathVariable("NumberOne") String NumberOne,
            @PathVariable("NumberTwo") String NumberTwo) throws Exception {

            return Service.sum(NumberOne,NumberTwo);
    }

    //http://localhost:8080/math/subtraction/3/5 - utilizando esse endpoint
    @RequestMapping("/subtraction/{NumberOne}/{NumberTwo}")
    public double subtraction(
            @PathVariable("NumberOne") String NumberOne,
            @PathVariable("NumberTwo") String NumberTwo) throws Exception {

            return Service.subtraction(NumberOne,NumberTwo);
    }

    //http://localhost:8080/math/multiplication/3/5 - utilizando esse endpoint
    @RequestMapping("/multiplication/{NumberOne}/{NumberTwo}")
    public double multiplication(
            @PathVariable("NumberOne") String NumberOne,
            @PathVariable("NumberTwo") String NumberTwo) throws Exception {

        return Service.multiplication(NumberOne,NumberTwo);
    }

    //http://localhost:8080/math/division/3/5 - utilizando esse endpoint
    @RequestMapping("/division/{NumberOne}/{NumberTwo}")
    public double division(
            @PathVariable("NumberOne") String NumberOne,
            @PathVariable("NumberTwo") String NumberTwo) throws Exception {

        return Service.divison(NumberOne,NumberTwo);
    }

    //http://localhost:8080/math/mean/3/5 - utilizando esse endpoint
    @RequestMapping("/mean/{NumberOne}/{NumberTwo}")
    public double mean(
            @PathVariable("NumberOne") String NumberOne,
            @PathVariable("NumberTwo") String NumberTwo) throws Exception {

        return Service.mean(NumberOne,NumberTwo);
    }

    //http://localhost:8080/math/squareRoot/25 - utilizando esse endpoint
    @RequestMapping("/squareRoot/{Number}")
    public double squareRoot(
            @PathVariable("Number") String Number) throws Exception {

        return Service.squareRoot(Number);
    }


    }



