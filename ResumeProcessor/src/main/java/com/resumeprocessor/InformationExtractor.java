package com.resumeprocessor;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Utility class to extract specific information from resume text
 */
public class InformationExtractor {
    
    // Regular expression patterns for different information types
    private static final Pattern EMAIL_PATTERN = Pattern.compile(
        "\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}\\b"
    );
    
    private static final Pattern LINKEDIN_PATTERN = Pattern.compile(
        "(?i)linkedin\\.com/in/([A-Za-z0-9-._]+)"
    );
    
    private static final Pattern GITHUB_PATTERN = Pattern.compile(
        "(?i)github\\.com/([A-Za-z0-9-._]+)"
    );
    
    /**
     * Extracts email address from text
     */
    public static String extractEmail(String text) {
        Matcher matcher = EMAIL_PATTERN.matcher(text);
        if (matcher.find()) {
            return matcher.group();
        }
        return "";
    }
    
    /**
     * Extracts LinkedIn ID from text
     */
    public static String extractLinkedInId(String text) {
        Matcher matcher = LINKEDIN_PATTERN.matcher(text);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return "";
    }
    
    /**
     * Extracts GitHub ID from text
     */
    public static String extractGitId(String text) {
        Matcher matcher = GITHUB_PATTERN.matcher(text);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return "";
    }
    
    /**
     * Processes resume text and extracts all relevant information
     */
    public static ResumeData extractResumeData(String resumeName, String text) {
        ResumeData data = new ResumeData(resumeName);
        
        data.setEmailId(extractEmail(text));
        data.setLinkedInId(extractLinkedInId(text));
        data.setGitId(extractGitId(text));
        
        return data;
    }
}