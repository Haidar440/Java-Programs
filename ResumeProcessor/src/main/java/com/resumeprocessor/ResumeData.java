package com.resumeprocessor;

/**
 * Data class to represent extracted resume information
 */
public class ResumeData {
    private String resumeName;
    private String emailId;
    private String linkedInId;
    private String gitId;
    
    public ResumeData(String resumeName) {
        this.resumeName = resumeName;
        this.emailId = "";
        this.linkedInId = "";
        this.gitId = "";
    }
    
    // Getters and Setters
    public String getResumeName() {
        return resumeName;
    }
    
    public void setResumeName(String resumeName) {
        this.resumeName = resumeName;
    }
    
    public String getEmailId() {
        return emailId;
    }
    
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
    
    public String getLinkedInId() {
        return linkedInId;
    }
    
    public void setLinkedInId(String linkedInId) {
        this.linkedInId = linkedInId;
    }
    
    public String getGitId() {
        return gitId;
    }
    
    public void setGitId(String gitId) {
        this.gitId = gitId;
    }
    
    @Override
    public String toString() {
        return String.format("ResumeData{resumeName='%s', emailId='%s', linkedInId='%s', gitId='%s'}", 
                           resumeName, emailId, linkedInId, gitId);
    }
}