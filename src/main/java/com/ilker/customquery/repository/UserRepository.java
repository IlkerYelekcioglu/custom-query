package com.ilker.customquery.repository;

import com.ilker.customquery.model.User;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User,Long> {

  List<User> findByActiveTrue();
}
