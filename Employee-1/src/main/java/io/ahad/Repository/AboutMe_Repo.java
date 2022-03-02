package io.ahad.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import io.ahad.Entity.AboutMe;

@Repository
public interface AboutMe_Repo extends JpaRepository<AboutMe, String>{
	
}
