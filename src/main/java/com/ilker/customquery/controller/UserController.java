package com.ilker.customquery.controller;

import com.ilker.customquery.dto.UserDTO;
import com.ilker.customquery.service.UserService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
  @GetMapping("/jpql/active")
  public List<UserDTO> getActiveUsersJPQL(){
    return userService.getActiveUsersJPQL();
  }
  @GetMapping("/native/active")
  public List<UserDTO> getActiveUsersNative(){
    return userService.getActiveUsersNative();
  }
  @GetMapping("/jpa/findByUsernameAndActiveTrue")
  public List<UserDTO> findByUsernameAndActiveTrueJPA(@RequestParam String username) {
  return userService.findByUsernameAndActiveTrueJPA(username);
  }
  @GetMapping("/jpql/findByUsernameAndActiveTrue")
  public List<UserDTO> findByUsernameAndActiveTrueJPQL(@RequestParam String username) {
    return userService.findByUsernameAndActiveTrueJPQL(username);
  }
  @GetMapping("/native/findByUsernameAndActiveTrue")
  public List<UserDTO> findByUsernameAndActiveTrueNative(@RequestParam String username) {
    return userService.findByUsernameAndActiveTrueNative(username);
  }
  @GetMapping("/jpa/findBySalaryGreaterThan/{salary}")
  public List<UserDTO> findBySalaryGreaterThanJPA(@PathVariable long salary) {
    return userService.findBySalaryGreaterThanJPA(salary);
  }
  @GetMapping("/jpql/findBySalaryGreaterThan/{salary}")
  public List<UserDTO> findBySalaryGreaterThanJPQL(@PathVariable long salary) {
    return userService.findBySalaryGreaterThanJPQL(salary);
  }
  @GetMapping("/native/findBySalaryGreaterThan/{salary}")
  public List<UserDTO> findBySalaryGreaterThanNative(@PathVariable long salary) {
    return userService.findBySalaryGreaterThanNative(salary);
  }
  @GetMapping("/jpa/findBySalaryBetween/{minSalary}/{maxSalary}")
  public List<UserDTO> findBySalaryBetweenJPA(@PathVariable long minSalary, @PathVariable long maxSalary) {
    return userService.findBySalaryBetweenJPA(minSalary, maxSalary);
  }

  @GetMapping("/jpql/findBySalaryBetween/{minSalary}/{maxSalary}")
  public List<UserDTO> findBySalaryBetweenJPQL(@PathVariable long minSalary, @PathVariable long maxSalary) {
    return userService.findBySalaryBetweenJPQL(minSalary, maxSalary);
  }

  @GetMapping("/native/findBySalaryBetween/{minSalary}/{maxSalary}")
  public List<UserDTO> findBySalaryBetweenNative(@PathVariable long minSalary, @PathVariable long maxSalary) {
    return userService.findBySalaryBetweenNative(minSalary, maxSalary);
  }
  @GetMapping("/jpa/countActiveUsers")
  public long countActiveUsersJPA() {
    return userService.countActiveUsersJPA();
  }

  @GetMapping("/jpql/countActiveUsers")
  public long countActiveUsersJPQL() {
    return userService.countActiveUsersJPQL();
  }

  @GetMapping("/native/countActiveUsers")
  public long countActiveUsersNative() {
    return userService.countActiveUsersNative();
  }
  }
