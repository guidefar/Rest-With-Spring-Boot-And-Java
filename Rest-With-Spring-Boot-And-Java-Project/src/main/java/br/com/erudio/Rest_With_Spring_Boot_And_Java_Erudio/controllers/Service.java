package br.com.erudio.Rest_With_Spring_Boot_And_Java_Erudio.controllers;

import br.com.erudio.Rest_With_Spring_Boot_And_Java_Erudio.exception.UnsupportedMathOperationException;

public class Service {

    public static double multiplication(String numero1, String numero2){
        if (!NumberUtils.isNumeric(numero1) || !NumberUtils.isNumeric(numero2)) throw new UnsupportedMathOperationException("Please,set numeric value!!");
        return ConvertUtils.convertToDouble(numero1)  * ConvertUtils.convertToDouble(numero2);
    };

    public static double sum(String numero1, String numero2){
        if (!NumberUtils.isNumeric(numero1) || !NumberUtils.isNumeric(numero2)) throw new UnsupportedMathOperationException("Please,set numeric value!!");
        return ConvertUtils.convertToDouble(numero1) + ConvertUtils.convertToDouble(numero2);
    };

    public static  double subtraction(String numero1, String numero2){
        if (!NumberUtils.isNumeric(numero1) || !NumberUtils.isNumeric(numero2)) throw new UnsupportedMathOperationException("Please,set numeric value!!");
        return ConvertUtils.convertToDouble(numero1) - ConvertUtils.convertToDouble(numero2);
    };

    public static double divison(String numero1, String numero2){
        if (!NumberUtils.isNumeric(numero1) || !NumberUtils.isNumeric(numero2)) throw new UnsupportedMathOperationException("Please,set numeric value!!");
        return ConvertUtils.convertToDouble(numero1) / ConvertUtils.convertToDouble(numero2);
    };

    public static double mean(String numero1, String numero2){
        if (!NumberUtils.isNumeric(numero1) || !NumberUtils.isNumeric(numero2)) throw new UnsupportedMathOperationException("Please,set numeric value!!");
        return (ConvertUtils.convertToDouble(numero1) + ConvertUtils.convertToDouble(numero2))/2;
    };

    public static double squareRoot(String numero1){
        if (!NumberUtils.isNumeric(numero1)) throw new UnsupportedMathOperationException("Please,set numeric value!!");
        return Math.sqrt(ConvertUtils.convertToDouble(numero1));
    };


}
