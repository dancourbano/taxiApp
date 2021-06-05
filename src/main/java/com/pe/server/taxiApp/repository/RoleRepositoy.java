package com.pe.server.taxiApp.repository;

import com.pe.server.taxiApp.domain.security.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepositoy extends CrudRepository<Role, Long> {

}
