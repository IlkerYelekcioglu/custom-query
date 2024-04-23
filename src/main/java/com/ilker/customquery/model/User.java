package com.ilker.customquery.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "usr")
@Getter
@Setter
/**
 * Getter ve setter lombok un bize sağladığı avantajlardan biridir.Generate etmek yerine lombok sayesinde bunu kullanabiliyoruz.
 */
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private boolean active;
  private long salary;
  @Column(name = "birth_date")
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date birthdate;
}
