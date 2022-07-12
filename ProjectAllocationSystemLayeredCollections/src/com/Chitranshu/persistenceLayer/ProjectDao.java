package com.Chitranshu.persistenceLayer;

import java.util.Set;

import com.Chitranshu.bean.Project;

public interface ProjectDao {
	
	Project searchRecord(int empId);
	Set<Project> getAllProjects();
}
