package com.cognizant.demo;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class PersistDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfiguration configuration=new AnnotationConfiguration();
		configuration.configure();
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		
		
		Skills skills1=new Skills();
		skills1.setSkillId(1);
		skills1.setSkillName("Java");
		
		Skills skills2=new Skills();
		skills2.setSkillId(2);
		skills2.setSkillName(".NET");
		List<Skills> skillsList=new ArrayList<Skills>();
		skillsList.add(skills1);
		skillsList.add(skills2);
		
		
		SkillSet skillset=new SkillSet();
		skillset.setSkillSetId(1001);
		
		
		skillset.setSkills(skillsList);
		
		ProjectDetails projectDetails=new ProjectDetails();
		projectDetails.setProjectId(10001);
		projectDetails.setSkillSet(skillset);
		
		Transaction transaction=session.getTransaction();
		transaction.begin();
		session.persist(projectDetails);
		transaction.commit();
		
		
		
	}

}
