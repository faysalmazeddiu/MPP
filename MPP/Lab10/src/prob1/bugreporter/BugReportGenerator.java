package prob1.bugreporter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import java.util.logging.Logger;
import java.util.stream.Collectors;

import prob1.classfinder.ClassFinder;

/**
 * This class scans the package lesson10.labs.prob2.javapackage
 * for classes with annotation @BugReport. It then generates a bug report
 * bugreport.txt, formatted like this:
 * 
 * Joe Smith
 *     reportedBy:
 *     classname:
 *     description:
 *     severity:
 *     
 *     reportedBy:
 *     classname:
 *     description:
 *     severity:
 *     
 * Tom Jones
 *     reportedBy:
 *     classname:
 *     description:
 *     severity:
 *     
 *     reportedBy:
 *     classname:
 *     description:
 *     severity:
 * 
 *
 */
public class BugReportGenerator {
	private static final Logger LOG = Logger.getLogger(BugReportGenerator.class.getName());
	public static final String OUTPUT_DIR = System.getProperty("user.dir") + "/src/prob1/bugreporter/report.txt";
	private static final String PACKAGE_TO_SCAN = "prob1.javapackage";
	private static final String REPORT_NAME = "report.txt";
	private static final String REPORTED_BY = "reportedBy: ";
	private static final String CLASS_NAME = "classname: ";
	private static final String DESCRIPTION = "description: ";
	private static final String SEVERITY = "severity: ";
	public void reportGenerator() {
		List<Class<?>> classes = ClassFinder.find(PACKAGE_TO_SCAN);
		StringBuilder sb = new StringBuilder();
		
		//sample code for reading annotations -- you will need to change
		//this quite a bit to solve the problem
		//Sample code below obtains a list of names of developers assigned to bugs
		List<String> listOfjoeSmith = new ArrayList<String>();
		List<String> listOfTomJones = new ArrayList<String>();
		for(Class<?> cl : classes) {
			if(cl.isAnnotationPresent(BugReport.class)) {
				BugReport annotation = (BugReport)cl.getAnnotation(BugReport.class);
				String name = annotation.assignedTo();
				if(name.equals("Joe Smith")) {
					listOfjoeSmith.add("\t reportedBy: "+annotation.reportedBy());
					listOfjoeSmith.add("\t classname: "+cl.getName());
					listOfjoeSmith.add("\t description: "+annotation.description());
					listOfjoeSmith.add("\t severity: "+annotation.severity());
					listOfjoeSmith.add("\n");
				}else if (name.equals("Tom Jones")) {
					listOfTomJones.add("\t reportedBy: "+annotation.reportedBy());
					listOfTomJones.add("\t classname: "+cl.getName());
					listOfTomJones.add("\t description: "+annotation.description());
					listOfTomJones.add("\t severity: "+annotation.severity());
					listOfTomJones.add("\n");
				}
			}
		}
		sb.append("Joe Smith");
		sb.append("\n");
		listOfjoeSmith.stream().forEach(s->{
			sb.append(s);
			sb.append("\n");
			
		});
		sb.append("Tom Jones");
		sb.append("\n");
		listOfTomJones.stream().forEach(s->{
			sb.append(s);
			sb.append("\n");
			
		});
		reportGeneratorInFile(sb.toString());
		System.out.println("Bug report successfully generated!");
		
		
		
	}
	
	public void reportGeneratorInFile(String output) {
		try {
		      File myObj = new File(OUTPUT_DIR);
		      if (myObj.createNewFile()) {
		    	  FileWriter myWriter = new FileWriter(OUTPUT_DIR);
		          myWriter.write(output);
		          myWriter.close();
		      } else {
		    	  FileWriter myWriter = new FileWriter(OUTPUT_DIR);
		          myWriter.write(output);
		          myWriter.close();
		      }
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}
	
	
	
}
