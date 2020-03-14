package evb0110.ppmtool.services;

import evb0110.ppmtool.domain.Project;
import evb0110.ppmtool.repositories.ProjectsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    @Autowired
    private ProjectsRepository projectsRepository;

    public Project saveOrUpdateProject(Project project) {
        return projectsRepository.save(project);
    }
}
