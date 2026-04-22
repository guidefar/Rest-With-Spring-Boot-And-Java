package br.com.erudio.Rest_With_Spring_Boot_And_Java_Erudio.exception;

import java.util.Date;

public record ExceptionResponse(Date timestamp, String message, String details ) {}
