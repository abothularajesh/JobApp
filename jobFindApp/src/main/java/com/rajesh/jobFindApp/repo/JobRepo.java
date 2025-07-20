package com.rajesh.jobFindApp.repo;

import com.rajesh.jobFindApp.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Repository
public class JobRepo {

    List<JobPost> jobs=new ArrayList<>(Arrays.asList(
            new JobPost(1,"Java Developer","Must have good experiance in core java ",1, Arrays.asList("java","SpringBoot","hibernate")),
            new JobPost(2,"Frontend Developer","Must have good experiance in Front end and Backend languages ",1, Arrays.asList("html","css","javaScript")),
            new JobPost(3,"Mobile App Devloper","Must have good experiance in  Python ",1, Arrays.asList("Python","Machine learning")),
            new JobPost(4,"DataAnalyst","Must have good experiance in core Backend  ",1, Arrays.asList("java","python","node.js"))
    ));

    public List<JobPost> getAllJobs(){
        return jobs;
    }
    public void addJob(JobPost job){
        jobs.add(job);
        System.out.println(jobs);
    }

}
