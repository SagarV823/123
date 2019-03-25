package com.cognizant.demo;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class LoadProjectDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfiguration configuration=new AnnotationConfiguration();
		configuration.configure();
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		ProjectDetails projectDetails=(ProjectDetails)session.load(ProjectDetails.class, 10001);
		System.out.println(projectDetails.getProjectId());
		
		SkillSet skillSet=projectDetails.getSkillSet();
		System.out.println(skillSet.getSkillSetId());
		
		List<Skills> skillsList=skillSet.getSkills();
		
		skillsList.forEach(System.out::println);
		
		
		Query query=session.createQuery("select o from ProjectDetails o where o.projectId=:param");
		query.setParameter("param",10001);
		ProjectDetails projectDetails1=(ProjectDetails)query.uniqueResult();
		System.out.println(projectDetails1);
	}

}
