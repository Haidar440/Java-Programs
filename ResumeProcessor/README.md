# Resume Processor

A Java application that reads resume files (PDF, DOC, DOCX, TXT) and extracts key information including email addresses, LinkedIn IDs, and GitHub IDs to create a structured dataframe.

## Features

- Supports multiple file formats: PDF, DOC, DOCX, TXT
- Extracts email addresses using pattern matching
- Extracts LinkedIn profile usernames from LinkedIn URLs
- Extracts GitHub usernames from GitHub URLs
- Displays results in a tabular format
- Exports data to CSV format

## Prerequisites

- Java 17 or higher
- Maven 3.6 or higher

## Dependencies

- Apache PDFBox 2.0.29 - for PDF processing
- Apache POI 5.2.4 - for Word document processing

## Build and Run

### 1. Build the project
```bash
cd ResumeProcessor
mvn clean compile
```

### 2. Run the application
```bash
mvn exec:java -Dexec.mainClass="com.resumeprocessor.ResumeProcessor"
```

### 3. Custom resume directory
By default, the application looks for resume files in the `resumes` directory. You can specify a custom directory:
```bash
mvn exec:java -Dexec.mainClass="com.resumeprocessor.ResumeProcessor" -Dexec.args="/path/to/your/resumes"
```

## Usage

1. Place your resume files (PDF, DOC, DOCX, or TXT) in the `resumes` directory
2. Run the application using the command above
3. The application will process all supported files and display:
   - A summary of processing results
   - A tabular view of extracted data
   - CSV export of the data

## Output Format

The application creates a dataframe with the following columns:
- **Resume Name**: The filename of the resume
- **Email ID**: Extracted email address
- **LinkedIn ID**: Username from LinkedIn profile URL
- **Git ID**: Username from GitHub profile URL

## Example Output

```
RESUME DATA FRAME:
=================================================================================
+------------------------------------------------------------------------------------------------------------------------+
| Resume Name                    | Email ID                  | LinkedIn ID               | Git ID                    |
+------------------------------------------------------------------------------------------------------------------------+
| alex_johnson_resume.txt        | alex.johnson@techcorp.com | alexjohnsonml             | alexjohnson-ml            |
| john_doe_resume.txt            | john.doe@example.com      | johndoe123                | johndoe                   |
| jane_smith_resume.txt          | jane.smith@gmail.com      | jane-smith-data           | janesmith-data            |
+------------------------------------------------------------------------------------------------------------------------+
Total resumes processed: 3
```

## Project Structure

```
ResumeProcessor/
├── pom.xml                                 # Maven configuration
├── README.md                              # This file
├── src/main/java/com/resumeprocessor/
│   ├── ResumeProcessor.java               # Main application class
│   ├── ResumeData.java                    # Data model for resume information
│   ├── ResumeDataFrame.java               # DataFrame implementation
│   ├── FileReader.java                    # File reading utilities
│   └── InformationExtractor.java          # Information extraction logic
└── resumes/                               # Directory for resume files
    ├── alex_johnson_resume.txt
    ├── jane_smith_resume.txt
    └── john_doe_resume.txt
```

## Supported Patterns

### Email
- Standard email format: `name@domain.com`

### LinkedIn
- `linkedin.com/in/username`

### GitHub
- `github.com/username`

## Error Handling

The application handles various error scenarios:
- Unsupported file formats
- Corrupted or unreadable files
- Missing directories
- Empty directories

Error messages are displayed during processing, and the final summary shows the count of successfully processed files and errors encountered.