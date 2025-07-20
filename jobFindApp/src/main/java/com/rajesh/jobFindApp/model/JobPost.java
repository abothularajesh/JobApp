package com.rajesh.jobFindApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class JobPost {
    private int postId;
    private String postProfile;
    private String postDesc;
    private int reqExperience;
    private List<String> postTechStack;

//    public JobPost(int postId, String postProfile, String postDesc, int reqExperience, List<String> postTechStack) {
//        this.postId = postId;
//        this.postProfile = postProfile;
//        this.postDesc = postDesc;
//        this.reqExperience = reqExperience;
//        this.postTechStack = postTechStack;
//    }
}
