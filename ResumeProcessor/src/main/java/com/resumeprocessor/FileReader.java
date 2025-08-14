package com.resumeprocessor;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.extractor.WordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Utility class to read content from different file formats
 */
public class FileReader {
    
    /**
     * Reads text content from a file (PDF, DOC, DOCX, TXT)
     */
    public static String readFile(File file) throws IOException {
        String fileName = file.getName().toLowerCase();
        
        if (fileName.endsWith(".pdf")) {
            return readPDF(file);
        } else if (fileName.endsWith(".docx")) {
            return readDOCX(file);
        } else if (fileName.endsWith(".doc")) {
            return readDOC(file);
        } else if (fileName.endsWith(".txt")) {
            return readTXT(file);
        } else {
            throw new IllegalArgumentException("Unsupported file format: " + fileName);
        }
    }
    
    /**
     * Reads text from PDF file
     */
    private static String readPDF(File file) throws IOException {
        try (PDDocument document = PDDocument.load(file)) {
            PDFTextStripper pdfStripper = new PDFTextStripper();
            return pdfStripper.getText(document);
        }
    }
    
    /**
     * Reads text from DOCX file
     */
    private static String readDOCX(File file) throws IOException {
        try (FileInputStream fis = new FileInputStream(file);
             XWPFDocument document = new XWPFDocument(fis);
             XWPFWordExtractor extractor = new XWPFWordExtractor(document)) {
            return extractor.getText();
        }
    }
    
    /**
     * Reads text from DOC file
     */
    private static String readDOC(File file) throws IOException {
        try (FileInputStream fis = new FileInputStream(file);
             HWPFDocument document = new HWPFDocument(fis);
             WordExtractor extractor = new WordExtractor(document)) {
            return extractor.getText();
        }
    }
    
    /**
     * Reads text from TXT file
     */
    private static String readTXT(File file) throws IOException {
        return new String(java.nio.file.Files.readAllBytes(file.toPath()));
    }
}