package com.resumeprocessor;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 * Main class for Resume Processing Application
 * Reads resume files (PDF, DOC, DOCX) and extracts email, LinkedIn, and Git information
 */
public class ResumeProcessor {
    
    public static void main(String[] args) {
        String resumesPath = "resumes";
        
        // Check if custom path is provided
        if (args.length > 0) {
            resumesPath = args[0];
        }
        
        File resumesDir = new File(resumesPath);
        if (!resumesDir.exists() || !resumesDir.isDirectory()) {
            System.err.println("Error: Resume directory '" + resumesPath + "' does not exist or is not a directory.");
            System.out.println("Usage: java ResumeProcessor [resume_directory_path]");
            return;
        }
        
        ResumeDataFrame dataFrame = new ResumeDataFrame();
        
        System.out.println("Starting resume processing from directory: " + resumesDir.getAbsolutePath());
        System.out.println("=" + "=".repeat(80));
        
        File[] files = resumesDir.listFiles((dir, name) -> {
            String lowercaseName = name.toLowerCase();
            return lowercaseName.endsWith(".pdf") || 
                   lowercaseName.endsWith(".doc") || 
                   lowercaseName.endsWith(".docx") ||
                   lowercaseName.endsWith(".txt");
        });
        
        if (files == null || files.length == 0) {
            System.out.println("No resume files found in the directory.");
            System.out.println("Please ensure the directory contains PDF, DOC, DOCX, or TXT files.");
            return;
        }
        
        System.out.println("Found " + files.length + " resume file(s) to process.");
        System.out.println();
        
        int processedCount = 0;
        int errorCount = 0;
        
        for (File file : files) {
            try {
                System.out.print("Processing: " + file.getName() + " ... ");
                
                // Read file content
                String content = FileReader.readFile(file);
                
                // Extract information
                ResumeData resumeData = InformationExtractor.extractResumeData(file.getName(), content);
                
                // Add to dataframe
                dataFrame.addRow(resumeData);
                
                System.out.println("✓ Done");
                processedCount++;
                
            } catch (IOException e) {
                System.out.println("✗ Error: " + e.getMessage());
                errorCount++;
            } catch (Exception e) {
                System.out.println("✗ Unexpected error: " + e.getMessage());
                errorCount++;
            }
        }
        
        System.out.println();
        System.out.println("Processing completed!");
        System.out.println("Successfully processed: " + processedCount + " files");
        System.out.println("Errors encountered: " + errorCount + " files");
        System.out.println();
        
        // Display results
        System.out.println("RESUME DATA FRAME:");
        System.out.println("=" + "=".repeat(80));
        dataFrame.display();
        
        // Optionally save to CSV
        System.out.println();
        System.out.println("CSV Export:");
        System.out.println("-".repeat(40));
        System.out.println(dataFrame.toCSV());
    }
}