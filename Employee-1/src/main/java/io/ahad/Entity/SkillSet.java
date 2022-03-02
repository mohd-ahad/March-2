package io.ahad.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(
        name = "Skills")
public class SkillSet {
//	@Id
//	@Column(
//    		name="id"
//    		)
//	@GeneratedValue //(strategy = GenerationType.IDENTITY)private long id;
	
	@Id
    @Column(
    		name="title"
    		)
    
    private String title;
	
	public SkillSet() {}

//	public long getId() {
//		return id;
//	}
//
//	public void setId(long id) {
//		this.id = id;
//	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
