package mission4;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("/Users/kang-yejin/IdeaProjects/Codesquad-pre/src/mission4/input.txt"));
        String line = br.readLine();
        ArrayList<Student> students = new ArrayList<>();

        while(line != null) {
            StringTokenizer st = new StringTokenizer(line);
            String name = st.nextToken();
            String major = st.nextToken();

            ArrayList<Integer> scores = new ArrayList<>();

            while (st.hasMoreTokens()) {
                int score = Integer.parseInt(st.nextToken());
                scores.add(score);
            }
            Student sd = new Student(name,major,scores);
            students.add(sd);
            line = br.readLine();
        }
        for(Student sd : students){
            sd.showInfo();
        }
    }
}
