package com.ilker.customquery.model;

import com.ilker.customquery.dto.UserDTO;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "usr")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
/**
 * Getter ve setter lombok un bize sağladığı avantajlardan biridir.Generate etmek yerine lombok sayesinde bunu kullanabiliyoruz.
 *@AllArgsConstructor: Sınıfın Constructorını üretir.Bu Constructor sınıftaki tüm fieldleri parametre olarak almıştır.
 *@NoArgsConstructor: Parametresiz Constructor üretir.
 */
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String username;
  private boolean active;
  private long salary;
  @Column(name = "birth_date")
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date birthDate;



  public User(String username,boolean active,long salary, Date birthDate) {
    this.active = active;
    this.birthDate = birthDate;
    this.username = username;
    this.salary = salary;
  }

  public UserDTO toDto(User user) {
    UserDTO userDto = new UserDTO();
    userDto.setUsername(user.getUsername());
    userDto.setActive(user.isActive());
    userDto.setSalary(user.getSalary());
    userDto.setBirthdate(user.getBirthDate());
    return userDto;
  }
}
