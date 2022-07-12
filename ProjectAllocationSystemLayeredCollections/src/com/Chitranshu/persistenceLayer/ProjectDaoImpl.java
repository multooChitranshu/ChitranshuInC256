package com.Chitranshu.persistenceLayer;

import java.util.Set;

import com.Chitranshu.bean.Project;
import com.Chitranshu.database.ProjectsDataSource;

public class ProjectDaoImpl implements ProjectDao {

	@Override
	public Project searchRecord(int projId) {
		Set<Project> projectSet=ProjectsDataSource.getProjectSet();
		for(Project proj:projectSet) {
			if(proj.getProjID()==projId)
				return proj;
		}
		return null;
	}
	
	@Override
	public Set<Project> getAllProjects() {
		return ProjectsDataSource.getProjectSet();
	}

}