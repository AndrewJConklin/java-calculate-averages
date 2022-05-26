import java.util.stream.*;
import java.util.Arrays;
import java.util.OptionalInt;

 class App {
  public static void main(String args[]){
    int[] scores = {72, 95, 91, 85, 87, 51, 65, 72, 75, 89};
    Arrays.sort(scores);  
    System.out.println(String.format("The median score is %d",scores[5]));
    
    int total = 0;
    for(int i = 0; i < scores.length; i++){
      total = total + scores[i];
    }
    System.out.println(String.format("The mean of all the scores is %d", (total/scores.length)));
  
    int max = Arrays.stream(scores).max().getAsInt();
    System.out.println(String.format("The max of all the scores is %d", max));

    int min = Arrays.stream(scores).min().getAsInt();
    System.out.println(String.format("The max of all the scores is %d", min));
  } 
  }

  