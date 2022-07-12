package com.Chitranshu.database;

import java.util.HashSet;
import java.util.Set;

import com.Chitranshu.bean.Project;

public class ProjectsDataSource {
	
	private static Set<Project> projectSet=new HashSet<Project>();
	static {
		projectSet.add(new Project(701,"P1"));
		projectSet.add(new Project(702,"P2"));
		projectSet.add(new Project(703,"P3"));
		projectSet.add(new Project(704,"P4"));
		projectSet.add(new Project(705,"P5"));
	}
	
	public static Set<Project> getProjectSet() {
		return projectSet;
	}
	
	public static void setProjectSet(Set<Project> projectSet) {
		ProjectsDataSource.projectSet = projectSet;
	}
	
}
