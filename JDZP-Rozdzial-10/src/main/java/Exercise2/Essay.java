package Exercise2;

public class Essay extends GradedActivity {

    private int grammarPoints;
    private int spellingPoints;
    private int appropriateLengthPoints;
    private int contentsPoints;

    public Essay(int grammarPoints, int spellingPoints, int appropriateLengthPoints, int contentsPoints) {
        this.grammarPoints = grammarPoints;
        this.spellingPoints = spellingPoints;
        this.appropriateLengthPoints = appropriateLengthPoints;
        this.contentsPoints = contentsPoints;
    }

    public int getSumOfPoints(){
        return grammarPoints + spellingPoints + appropriateLengthPoints + contentsPoints;
    }

    public char getGrade(){
        return super.getGrade();
    }

    public String toString(){
        return "Result of the essay: " + getSumOfPoints() + "points.\nGrades: " + getGrade();
    }
}
