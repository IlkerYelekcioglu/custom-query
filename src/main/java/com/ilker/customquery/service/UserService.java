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
}
