package com.cauanlagrotta.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {

  @GetMapping
  public String HomeControllerHandler(){ return "category microsservices is up"; }
}
