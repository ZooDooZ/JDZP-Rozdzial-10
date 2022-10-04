package Exercise2;

import java.util.ArrayList;

public class CourseGrades {

    private ArrayList<GradedActivity> grades = new ArrayList<>();

    public void setLab(GradedActivity o){
        this.grades.add(0, o);
    }

    public void setPassFailExam(PassFailExam o){
        this.grades.add(1, o);
    }

    public void setEssay(Essay o){
        this.grades.add(2, o);
    }

    public void setFinalExam(FinalExam o){
        this.grades.add(3, o);
    }

    public String toString(){
        return "Course grades: " + grades.get(0) + "\n" + grades.get(1)+ "\n" + grades.get(2)+ "\n" + grades.get(3);
    }

}
