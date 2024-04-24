package com.ilker.customquery.repository;

import com.ilker.customquery.model.User;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User,Long> {

  List<User> findByActiveTrue();

   @Query("SELECT u FROM User u WHERE u.active = true ")
   List<User> findActiveUsersJPQL();
   @Query(value = "SELECT * FROM usr WHERE active = true ",nativeQuery = true)
  List<User> findActiveUsersNative();
  List<User> findByUsernameAndActiveTrue(String username);

  @Query("SELECT u FROM User u WHERE u.username = :username AND u.active = true ")
  List<User> findActiveUsersByUsernameJPQL(@Param("username") String username);

  @Query(value = "SELECT * FROM usr  WHERE u.username = :username AND u.active = true ",nativeQuery = true)
  List<User> findActiveUsersByUsernameNative(@Param("username") String username);


  List<User> findBySalaryGreaterThan(long salary);

  @Query("SELECT u FROM User u WHERE u.salary  > :salary ")
  List<User> findUsersWithSalaryGreaterThanJPQL(@Param("salary") long salary);

  @Query(value = "SELECT * FROM usr  WHERE u.salary > :username",nativeQuery = true)
  List<User> findUsersWithSalaryGreaterThanNative(@Param("salary")long salary);

  List<User> findBySalaryBetween(long minSalary, long maxSalary);
  @Query("SELECT u FROM User u WHERE u.salary BETWEEN :minSalary AND :maxSalary")
  List<User> findUsersWithSalaryBetweenJPQL(long minSalary, long maxSalary);
  @Query(value = "SELECT * FROM usr WHERE salary BETWEEN :minSalary AND :maxSalary", nativeQuery = true)
  List<User> findUsersWithSalaryBetweenNative(long minSalary, long maxSalary);

  long countByActiveTrue();
  @Query("SELECT COUNT(u) FROM User u WHERE u.active = true")
  long countActiveUsersJPQL();
  @Query(value = "SELECT COUNT(*) FROM usr WHERE active = true", nativeQuery = true)
  long countActiveUsersNative();


}
