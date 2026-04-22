package br.com.erudio.Rest_With_Spring_Boot_And_Java_Erudio.controllers;

import br.com.erudio.Rest_With_Spring_Boot_And_Java_Erudio.exception.UnsupportedMathOperationException;

public class ConvertUtils {
    public static double convertToDouble(String strNumber) throws IllegalArgumentException {

        if (strNumber == null || strNumber.isEmpty()) throw new UnsupportedMathOperationException("Please,set numeric value!!");

        String Number = strNumber.replace(",",".");
        return Double.parseDouble(Number);

    }
}
