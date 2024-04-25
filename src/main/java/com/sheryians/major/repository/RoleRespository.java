package com.sheryians.major.repository;
import com.sheryians.major.model.Role;
import com.sheryians.major.repository.RoleRespository;
import com.sheryians.major.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRespository extends JpaRepository<Role,Integer> {

}
