package br.com.erudio.Rest_With_Spring_Boot_And_Java_Erudio.controllers;

import br.com.erudio.Rest_With_Spring_Boot_And_Java_Erudio.exception.ResourceNotFoundException;

public class ConvertUtils {
    public static double convertToDouble(String strNumber) throws IllegalArgumentException {

        if (strNumber == null || strNumber.isEmpty()) throw new ResourceNotFoundException("Please,set numeric value!!");

        String Number = strNumber.replace(",",".");
        return Double.parseDouble(Number);

    }
}
