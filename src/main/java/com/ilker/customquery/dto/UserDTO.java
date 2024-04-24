package com.ilker.customquery.dto;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {
  private String username;
  private boolean active;
  private long salary;
  private Date birthdate;
}
