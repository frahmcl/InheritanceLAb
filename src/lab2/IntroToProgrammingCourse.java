package lab2;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroToProgrammingCourse implements Courseable{
    private String courseName;
    private String courseNumber;
    private double credits;

    public IntroToProgrammingCourse(String courseName, String courseNumber, double credits) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setCredits(credits);
    }


    public final void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            throw new IllegalArgumentException("Error: courseNumber cannot be null or empty string");

        }
        this.courseNumber = courseNumber;
    }


    public void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            throw new IllegalArgumentException("Error: credits must be in the range 0.5 to 4.0");
        }
        this.credits = credits;
    }

    public final void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null or empty string");
            System.exit(0);
        }
        this.courseName = courseName;
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
        return "IntroToProgrammingCourse{" +
                "courseName='" + courseName + '\'' +
                ", courseNumber='" + courseNumber + '\'' +
                ", credits=" + credits +
                '}';
    }

}

