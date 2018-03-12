package lab2;

/**
 * @author Chris Frahm
 *
 */

public class Startup {
    public static void main(String[] args) {
        AdvancedJavaCourse course = new AdvancedJavaCourse("Advanced Java", "152-135-001", 3,"Intro to Java");
        IntroJavaCourse course2 = new IntroJavaCourse("Intro to Java", "152-134-001", 3, "Intro to Programming");
        IntroToProgrammingCourse course3 = new IntroToProgrammingCourse("Intro to Programming", "152-107-001", 2);

        OutputService message = new OutputService();
        message.simpleOutput(course.toString());
        message.simpleOutput(course2.toString());
        message.simpleOutput(course3.toString());



        /**
         * Liskov Substitution principle could not be applied like in lab1 where I could say
         * Course course = new AdvancedJavaCourse
         * By using the interface I did not have any abstract types.  This worked better for this solution
         * I think because you could force the courses to implement the 3 methods, but could also add more methods.
         * For instance Advanced Java and Intro to Java had prerequisites but Intro to Programming does not.
         * The variables are forced because the getters for these variables are forced from the Interfaces.
         */
    }
}