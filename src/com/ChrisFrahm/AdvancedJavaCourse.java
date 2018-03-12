package com.ChrisFrahm;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class AdvancedJavaCourse extends Course {
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

    public AdvancedJavaCourse(String courseName, String courseNumber, double credits) {
        super(courseName, courseNumber, credits);
    }

    @Override
    public String toString() {
        return "AdvancedJavaCourse{" +
                "courseName='" + getCourseName() + '\'' +
                ", courseNumber='" + getCourseNumber() + '\'' +
                ", credits=" + getCredits() +
                ", prerequisites='" + getPrerequisites() + '\'' +
                '}';
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }

    public void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.setCredits(credits);
    }

    public void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        this.courseName = courseName;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    @Override
    public String getCourseName() {
        return this.courseName;
    }

    @Override
    public String getCourseNumber() {
        return this.courseNumber;
    }

    @Override
    public double getCredits() {
        return this.credits;
    }
}
