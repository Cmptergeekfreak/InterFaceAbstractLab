

package lab2;

/**
 *
 * @author Cmptergeekfreak
 */
public class Startup {
    
     public static void main(String[] args) {
        
        Course studentClass = new AdvancedJavaCourse();
        
        studentClass.setCourseName("Advanced Java");
        studentClass.setCourseNumber("#5514");
        studentClass.setCredits(3);
        
        System.out.println("Class: " + studentClass.getCourseName()+" Credits: " + studentClass.getCredits());
        
        Course studentClass2 = new IntroJavaCourse();
        
        studentClass2.setCourseName("Intro to Java");
        studentClass2.setCourseNumber("#1118");
        studentClass2.setCredits(4);
        
        System.out.println("Class: " + studentClass2.getCourseName()+" Course Number: " + studentClass2.getCourseNumber()+ " Credits: " + studentClass2.getCredits());
        
        IntroToProgrammingCourse studentClass3 = new IntroToProgrammingCourse();
        
        studentClass3.setCourseName("Intro To Programming");
        studentClass3.setCourseNumber("#8987");
        studentClass3.setCredits(3);
                
        System.out.println("Class: " + studentClass3.getCourseName()+ " Course Number: " + studentClass3.getCourseNumber() + " Credits: " + studentClass3.getCredits());
        
    }
    
}
