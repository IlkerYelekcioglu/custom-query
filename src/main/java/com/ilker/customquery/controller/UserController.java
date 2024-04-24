package com.ilker.customquery.controller;

import com.ilker.customquery.dto.UserDTO;
import com.ilker.customquery.service.UserService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/users")
public class UserController {
private final UserService userService;

@GetMapping("/jpa/active")
  public List<UserDTO> getActiveUsersJpa(){
  return userService.getActiveUsersJpa();
}
}
