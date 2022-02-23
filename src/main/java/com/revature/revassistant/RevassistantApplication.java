package com.revature.revassistant;

import com.revature.revassistant.beans.models.ActionItem;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@SpringBootApplication(scanBasePackages = "com.revature.revassistant.beans")
public class RevassistantApplication {
	public static void main(String[] args) {
		SpringApplication.run(RevassistantApplication.class, args);



	}

}
