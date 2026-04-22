package br.com.erudio.Rest_With_Spring_Boot_And_Java_Erudio.controllers;

public class NumberUtils {

    public static boolean isNumeric(String strNumber){

        if (strNumber == null || strNumber.isEmpty()){return false;}

        String Number = strNumber.replace(",","."); //Tratando a string recebida, para nao ter exceções
        return Number.matches("[-+]?[0-9]*\\.?[0-9]+");
    }
}
