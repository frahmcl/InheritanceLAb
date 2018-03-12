package lab2;

import javax.swing.*;

/**
 * Describe responsibilities here.
 *
 * @author      Chris Frahm
 * @version     1.00
 */
public class IntroJavaCourse implements Courseable {
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

    public IntroJavaCourse(String courseName, String courseNumber, double credits, String prerequisites) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setCredits(credits);
        this.setPrerequisites(prerequisites);
    }

    //making these setters public because these values might need to change in the future

    public void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            throw new IllegalArgumentException( "Error: courseName cannot be null of empty string");

                    }
        this.courseName = courseName;
    }

    public final void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            throw new IllegalArgumentException("Error: courseNumber cannot be null of empty string");
        }
        this.courseNumber = courseNumber;
    }

    public void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            throw new IllegalArgumentException("Error: credits must be in the range 0.5 to 4.0");
        }
        this.credits = credits;
    }


    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            throw new IllegalArgumentException("Error: prerequisites cannot be null of empty string");

        }
        this.prerequisites = prerequisites;
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

    @Override
    public String toString() {
        return "IntroJavaCourse{" +
                "courseName='" + courseName + '\'' +
                ", courseNumber='" + courseNumber + '\'' +
                ", credits=" + credits +
                ", prerequisites='" + prerequisites + '\'' +
                '}';
    }
}
