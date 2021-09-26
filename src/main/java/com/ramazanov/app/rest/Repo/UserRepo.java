package com.ramazanov.app.rest.Repo;

import com.ramazanov.app.rest.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {

}
