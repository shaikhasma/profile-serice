package com.gotech.profileservice.controller;

import com.gotech.profileservice.dto.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api("service for profile")
@RestController
@RequestMapping("/profile")
@Slf4j
public class ProfileController {
  @ApiOperation("/create")
  @GetMapping("/create")
  public Response createProfile() {
    return new Response(HttpStatus.CREATED.toString(), "profile created successfully");
  }
}
