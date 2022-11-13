package mission4;

import java.util.ArrayList;

public class Student {
    private static int id = 1000;
    private final int student_id;
    private String name;
    private String major;
    private ArrayList<Integer> scores;

    public Student(String name, String major,ArrayList<Integer> scores) {
        id++;
        student_id = id;
        this.name = name;
        this.major = major;
        this.scores = scores;
    }
    public int getTotalScore() {
        return scores.stream().mapToInt(s->s).sum();
    }
    public int getAverageScore() {
        return getTotalScore() / scores.size();
    }
    public void showInfo() {
        System.out.println(this.name+" 학생은 "+this.scores.size()+"과목을 수강했습니다.");
        System.out.println("총점은 "+getTotalScore()+"이고 평균은 "+getAverageScore()+"입니다.");
    }
}
