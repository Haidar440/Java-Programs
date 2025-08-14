package com.resumeprocessor;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple DataFrame-like structure to store and display resume data
 */
public class ResumeDataFrame {
    private List<ResumeData> data;
    private List<String> columns;
    
    public ResumeDataFrame() {
        this.data = new ArrayList<>();
        this.columns = List.of("Resume Name", "Email ID", "LinkedIn ID", "Git ID");
    }
    
    /**
     * Adds a resume data row to the dataframe
     */
    public void addRow(ResumeData resumeData) {
        data.add(resumeData);
    }
    
    /**
     * Returns the number of rows in the dataframe
     */
    public int size() {
        return data.size();
    }
    
    /**
     * Returns all data rows
     */
    public List<ResumeData> getData() {
        return new ArrayList<>(data);
    }
    
    /**
     * Returns column headers
     */
    public List<String> getColumns() {
        return new ArrayList<>(columns);
    }
    
    /**
     * Displays the dataframe in a tabular format
     */
    public void display() {
        if (data.isEmpty()) {
            System.out.println("DataFrame is empty");
            return;
        }
        
        // Print header
        System.out.println("+" + "-".repeat(120) + "+");
        System.out.printf("| %-30s | %-25s | %-25s | %-25s |\n", 
                         "Resume Name", "Email ID", "LinkedIn ID", "Git ID");
        System.out.println("+" + "-".repeat(120) + "+");
        
        // Print data rows
        for (ResumeData row : data) {
            System.out.printf("| %-30s | %-25s | %-25s | %-25s |\n",
                            truncate(row.getResumeName(), 30),
                            truncate(row.getEmailId(), 25),
                            truncate(row.getLinkedInId(), 25),
                            truncate(row.getGitId(), 25));
        }
        
        System.out.println("+" + "-".repeat(120) + "+");
        System.out.println("Total resumes processed: " + data.size());
    }
    
    /**
     * Truncates text to specified length with ellipsis if needed
     */
    private String truncate(String text, int maxLength) {
        if (text == null) text = "";
        if (text.length() <= maxLength) {
            return text;
        }
        return text.substring(0, maxLength - 3) + "...";
    }
    
    /**
     * Exports dataframe to CSV format
     */
    public String toCSV() {
        StringBuilder csv = new StringBuilder();
        
        // Add header
        csv.append(String.join(",", columns)).append("\n");
        
        // Add data rows
        for (ResumeData row : data) {
            csv.append(String.format("%s,%s,%s,%s\n",
                    escapeCSV(row.getResumeName()),
                    escapeCSV(row.getEmailId()),
                    escapeCSV(row.getLinkedInId()),
                    escapeCSV(row.getGitId())));
        }
        
        return csv.toString();
    }
    
    /**
     * Escapes CSV values by adding quotes if they contain commas or quotes
     */
    private String escapeCSV(String value) {
        if (value == null) value = "";
        if (value.contains(",") || value.contains("\"") || value.contains("\n")) {
            return "\"" + value.replace("\"", "\"\"") + "\"";
        }
        return value;
    }
}