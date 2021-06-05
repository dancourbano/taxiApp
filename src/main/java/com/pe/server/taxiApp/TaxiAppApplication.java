package com.pe.server.taxiApp;

import com.pe.server.taxiApp.config.SecurityUtility;
import com.pe.server.taxiApp.domain.security.Role;
import com.pe.server.taxiApp.domain.security.User;
import com.pe.server.taxiApp.domain.security.UserRole;
import com.pe.server.taxiApp.service.UserService;
import org.apache.catalina.security.SecurityUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class TaxiAppApplication {
	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(TaxiAppApplication.class, args);

	}

}
