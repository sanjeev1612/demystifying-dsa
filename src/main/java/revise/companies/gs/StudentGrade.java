package revise.companies.gs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class StudentGrade {

  public static int getResult(String[][] studentScores) {
    Map<String, ArrayList<Integer>> scoreList = new HashMap<>();

    for (String[] s : studentScores) {
      String name = s[0];
      int score = Integer.parseInt(s[1]);

      if (scoreList.containsKey(name)) {
        ArrayList<Integer> li = scoreList.get(name);
        li.add(score);
        scoreList.put(name, li);
      } else {
        ArrayList<Integer> ne = new ArrayList<>();
        ne.add(score);
        scoreList.put(name, ne);
      }
    }

    Map<String, Integer> average = new HashMap<>();

    for (String val : scoreList.keySet()) {
      int sum = scoreList.get(val).stream().reduce(0, (a, b) -> a + b);
      int avg = sum / (scoreList.get(val).size());
      average.put(val, avg);
    }
    System.out.println(average);

    return average.values().stream().sorted(Comparator.reverseOrder()).findFirst().get();

  }

  public static void main(String[] args) {
    String[][] scores = new String[][]{{"Sanjeev", "100"}, {"Rahul", "200"}, {"Sanjeev", "22"}, {"Sanjeev", "300"}};
    System.out.println(getResult(scores));
  }
}
