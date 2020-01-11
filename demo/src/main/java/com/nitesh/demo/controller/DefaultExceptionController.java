
  package com.nitesh.demo.controller;
  
  import org.json.JSONException; import
  org.springframework.dao.DataAccessException; import
  org.springframework.web.bind.annotation.ControllerAdvice; import
  org.springframework.web.bind.annotation.ExceptionHandler;
  
  import java.sql.SQLException;
  
  @ControllerAdvice public class DefaultExceptionController {
  
  @ExceptionHandler({SQLException.class, DataAccessException.class}) public
  String databaseError() {
  
  return "Database Error occured. Please check syntax"; }
  
  @ExceptionHandler({JSONException.class}) public String jsonError() { return
  " JSON exception occured"; }
  
  @ExceptionHandler({Exception.class}) public String defaultException() {
  return " Some exception occured. Please contact system administrator"; } }
  
  
 