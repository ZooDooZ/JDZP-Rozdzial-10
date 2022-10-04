package Exercise2;

public class FinalExam extends GradedActivity {

    private int score;

    public FinalExam(int score){
        this.score = score;
    }

    public String toString(){
        return "Result of final exam: " + score;
    }

}
