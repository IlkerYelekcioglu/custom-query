package com.ilker.customquery.converter;

import com.ilker.customquery.dto.UserDTO;
import com.ilker.customquery.model.User;
import java.util.List;
import java.util.stream.Collectors;
import lombok.experimental.UtilityClass;

@UtilityClass
public class UserConvertor {
public User toEntity(UserDTO userDTO){
  User user = new User();
   user.setUsername(userDTO.getUsername());
   user.setActive(userDTO.isActive());
   user.setSalary(userDTO.getSalary());
   user.setBirthDate(userDTO.getBirthdate());
    return user;
}
  public UserDTO toDTO(User user){
    UserDTO userDTO = new UserDTO();
    userDTO.setUsername(user.getUsername());
    userDTO.setActive(user.isActive());
    userDTO.setSalary(user.getSalary());
    userDTO.setBirthdate(user.getBirthDate());
    return userDTO;
  }
  public static List<UserDTO> toDTOList(List<User> users) {
  return users.stream().map(UserConvertor::toDTO).collect(Collectors.toList());
  }
}
