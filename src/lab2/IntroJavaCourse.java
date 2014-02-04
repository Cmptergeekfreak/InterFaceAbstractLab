package lab2;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      cmptergeekfreak
 * @version     1.00
 */
public class IntroJavaCourse implements Course{
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;


    public String getCourseNumber() {
       return courseNumber;
    }

    public double getCredits() {
        return credits;
    }
    
    public String getPrerequisites() {
        return prerequisites;
    }
    
     public String getCourseName() {
        return courseName;
    }
    
    public final void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }

    public final void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits = credits;
    }
 
    public final void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }

    public final void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        this.courseName = courseName;
    }

    
}
