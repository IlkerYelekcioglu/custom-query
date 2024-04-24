package com.ilker.customquery.service;

import com.ilker.customquery.converter.UserConvertor;
import com.ilker.customquery.dto.UserDTO;
import com.ilker.customquery.model.User;
import com.ilker.customquery.repository.UserRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
/**
 * @RequiredArgsConstructor: Class içinde final ve NonNull olan değişkenleri parametre olarak alan bir constructor oluşturur.
 */
public class UserService {
 private final UserRepository userRepository;

 public List<UserDTO> getActiveUsersJpa() {
  List<User> activeUsers = userRepository.findByActiveTrue();
  return UserConvertor.toDTOList(activeUsers);
 }

 public List<UserDTO> getActiveUsersJPQL() {
  List<User> activeUsers = userRepository.findActiveUsersJPQL();
  return UserConvertor.toDTOList(activeUsers);

 }

 public List<UserDTO> getActiveUsersNative() {
  List<User> activeUsers = userRepository.findActiveUsersNative();
  return UserConvertor.toDTOList(activeUsers);
 }

 public List<UserDTO> findByUsernameAndActiveTrueJPA(String username) {
  List<User> users = userRepository.findByUsernameAndActiveTrue(username);
  return UserConvertor.toDTOList(users);
 }
 public List<UserDTO> findByUsernameAndActiveTrueJPQL(String username) {
  List<User> users = userRepository.findActiveUsersByUsernameJPQL(username);
  return UserConvertor.toDTOList(users);
 }
 public List<UserDTO> findByUsernameAndActiveTrueNative(String username) {
  List<User> users = userRepository.findActiveUsersByUsernameNative(username);
  return UserConvertor.toDTOList(users);
 }

 public List<UserDTO> findBySalaryGreaterThanJPA(long salary) {
  List<User> users = userRepository.findBySalaryGreaterThan(salary);
  return UserConvertor.toDTOList(users);

 }

 public List<UserDTO> findBySalaryGreaterThanJPQL(long salary) {
  List<User> users = userRepository.findUsersWithSalaryGreaterThanJPQL(salary);
  return UserConvertor.toDTOList(users);

 }

 public List<UserDTO> findBySalaryGreaterThanNative(long salary) {
  List<User> users = userRepository.findUsersWithSalaryGreaterThanNative(salary);
  return UserConvertor.toDTOList(users);

 }

 public List<UserDTO> findBySalaryBetweenJPA(long minSalary, long maxSalary) {
  List<User> activeUsers = userRepository.findBySalaryBetween(minSalary, maxSalary);
  return UserConvertor.toDTOList(activeUsers);
 }

 public List<UserDTO> findBySalaryBetweenJPQL(long minSalary, long maxSalary) {
  List<User> activeUsers = userRepository.findUsersWithSalaryBetweenJPQL(minSalary, maxSalary);
  return UserConvertor.toDTOList(activeUsers);

 }

 public List<UserDTO> findBySalaryBetweenNative(long minSalary, long maxSalary) {
  List<User> activeUsers = userRepository.findUsersWithSalaryBetweenNative(minSalary, maxSalary);
  return UserConvertor.toDTOList(activeUsers);
 }
 public long countActiveUsersJPA() {
  return userRepository.countByActiveTrue();
 }

 public long countActiveUsersJPQL() {
  return userRepository.countActiveUsersJPQL();
 }

 public long countActiveUsersNative() {
  return userRepository.countActiveUsersNative();
 }

}
