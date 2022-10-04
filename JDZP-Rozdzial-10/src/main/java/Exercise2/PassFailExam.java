package Exercise2;

public class PassFailExam extends GradedActivity {

    private boolean isPassed = false;
    private int score;

    public PassFailExam(int score){
        this.score = score;
    }

    public boolean isPassedExam(){
        if(score >= 70){
            isPassed = true;
        } else {
            isPassed = false;
        }
        return isPassed;
    }

    public String toString(){
        return "Result of the exam: " + isPassedExam();
    }
}
