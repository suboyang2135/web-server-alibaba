package com.ikang.ui.dao;

import com.ikang.ui.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author xuyang
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
