package io.ahad.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import io.ahad.Entity.SkillSet;
import io.ahad.Service.NotFoundException;

@Repository
public interface SkillSet_Repo  extends JpaRepository<SkillSet, String> {
	@Transactional
	void deleteByTitle(String title)throws NotFoundException;
	SkillSet findByTitle(String title);
	ArrayList<SkillSet> save(ArrayList<SkillSet> skillSet);
}
