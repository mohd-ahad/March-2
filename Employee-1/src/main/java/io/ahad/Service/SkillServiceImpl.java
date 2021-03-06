package io.ahad.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import io.ahad.Entity.SkillSet;
import io.ahad.Repository.SkillSet_Repo;

@Service
public class SkillServiceImpl implements SkillService {

	@Autowired
	 private SkillSet_Repo repository;
	
	@Override
	public List<SkillSet> add(List<SkillSet> skillSet) {
		return repository.saveAll(skillSet);
		
	}
		
//		@Override
//		public List<SkillSet> getAll() {
//				return repository.findAll();
//			}
//
//
//		@Override
//		public SkillSet add(SkillSet skillSet) {
//				return repository.save(skillSet);
//			}
//	
//		@Transactional
//		@Override
//		public void delete(String title)throws NotFoundException {
//			if(repository.getById(title)==null)
//				throw new NotFoundException("title", "title", title);
//			repository.deleteById(title);
//			
//		}
//
//
		@Override
		public SkillSet findById(String title) {
		SkillSet skillSet=repository.findById(title).get();
			if(repository.findById(title)==null){
           throw new NotFoundException("title", "title", title);
			}
	return skillSet;
		}
		}
//	
//	}
//}
