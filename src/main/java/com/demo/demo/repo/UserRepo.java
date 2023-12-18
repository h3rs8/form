package com.demo.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.demo.demo.model.User;
import java.util.List;
import com.demo.demo.model.Batch;


@Repository
public interface UserRepo extends JpaRepository<User, Long> {
	@Query("SELECT CASE WHEN COUNT(u) > 0 THEN true ELSE false END FROM User u WHERE u.phone = :phone AND u.batch = :batch")
    boolean existsByPhoneNumberAndBatch(@Param("phone") Long phone, @Param("batch") Batch batch);
	
}
