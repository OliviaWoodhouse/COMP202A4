import java.util.Arrays;
public class ExamGrading {
  //Student Name: Olivia Woodhouse
  //Student ID: 260734701
  
  //Main method
  public static void main(String[] args) {
    char[][] studentResponses = {{'A','B','C','D','B','A'},{'C','B','D','D','B','B'},{'C','B','D','D','C','B'}};
    char[] student1Answers = {'A','B','C','D','C','A'};
    char[] student2Answers = {'A','B','D','B','B','A'};
    char[] correctAnswers = {'C','B','C','D','A','A'};
    //System.out.println(Arrays.toStings(gradeAllStudents(studentResponses,correctAnswers)));
    //System.out.println(numWrongSimilar(student1Answers,student2Answers,correctAnswers));
    //System.out.println(numMatches(studentResponses,correctAnswers,1,2));
    System.out.println(Arrays.deepToString(findSimilarAnswers(studentResponses,correctAnswers,2)));
  }
  
  //Question 1: Exam Grading
  public static double[] gradeAllStudents(char[][] studentResponses, char[] correctAnswers) {
    double[] finalGrades = new double[studentResponses.length];
    for (int i=0;i<studentResponses.length;i++) {
      for (int j=0;j<studentResponses[i].length;j++) {
        if (studentResponses[i].length!=correctAnswers.length) {
          throw new IllegalArgumentException("Student "+i+" caused an error by providing "+studentResponses[i].length+" answers while there was only "+correctAnswers.length+" questions on the test.");
        }
        if (studentResponses[i][j]==correctAnswers[j]) {
          finalGrades[i]++;
        }
      }
      finalGrades[i] = (finalGrades[i]/studentResponses[i].length)*100;
    }
    return finalGrades;
  }
  
  //Question 2(a): Cheating in Exams
  public static int numWrongSimilar(char[] student1Answers, char[] student2Answers, char[] correctAnswers) {
    if (student1Answers.length!=student2Answers.length||student1Answers.length!=correctAnswers.length) {
      throw new IllegalArgumentException("One (or both) of the lengths of the student responses is different from that of the solutions");
    }
    int x = 0;
    for (int i=0;i<correctAnswers.length;i++) {
      if (student1Answers[i]==student2Answers[i]&&student1Answers[i]!=correctAnswers[i]) {
        x++;
      }
    }
    return x;
  }
  
  //Question 2(b): Cheating in Exams
  public static int numMatches(char[][] studentResponses, char[] correctAnswers, int index, int simThreshold) {
    int x = 0;
    for (int i=0;i<studentResponses.length;i++) {
      if (studentResponses[i]!=studentResponses[index]) {
        int numWrongSimilar = numWrongSimilar(studentResponses[index],studentResponses[i],correctAnswers);
        if (numWrongSimilar>=simThreshold) {
          x++;
        }
      }
    }
    return x;
  }
  
  //Question 2(c): Cheating in Exams
  public static int[][] findSimilarAnswers(char[][] studentResponses, char[] correctAnswers, int simThreshold) {
    int[][] cheatingIndex = new int[studentResponses.length][];
    for (int i=0;i<studentResponses.length;i++) {
      cheatingIndex[i] = new int[numMatches(studentResponses,correctAnswers,i,simThreshold)];
      int x = 0;
      for (int j=0;j<studentResponses.length;j++) {
        if (j!=i) {
          int numWrongSimilar = numWrongSimilar(studentResponses[i],studentResponses[j],correctAnswers);
          if (numWrongSimilar>=simThreshold){
            cheatingIndex[i][x] = j;
            x++;
          }
        }
      }
    }
    return cheatingIndex;
  }
  
}





