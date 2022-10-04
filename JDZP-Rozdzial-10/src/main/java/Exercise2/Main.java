package Exercise2;

public class Main {
    public static void main(String[] args) {

        // Exercise 4
        GradedActivity gradedActivity = new GradedActivity();
        Essay essay1 = new Essay(25,18, 15, 25);

        gradedActivity.setScore(essay1.getSumOfPoints());
        System.out.println("You have earned: " + essay1.getSumOfPoints() + " points.");
        System.out.println("The result of the essay is : " + gradedActivity.getGrade());

        // Exercise 5
        FinalExam finalExam = new FinalExam(90);
        PassFailExam passFailExam = new PassFailExam(85);

        CourseGrades courseGrades = new CourseGrades();

        courseGrades.setLab(gradedActivity);
        courseGrades.setEssay(essay1);
        courseGrades.setFinalExam(finalExam);
        courseGrades.setPassFailExam(passFailExam);


    }
}
