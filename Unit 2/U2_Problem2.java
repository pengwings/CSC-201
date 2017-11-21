/* Created by Brian Yu on 9/17/2017
def diverScore()
    call on inputAllScores
    prompt user to input dive difficulty
    call on calculateScore
def inputValidScore(score)
    make sure valid score between 0 and 10 is entered
def inputAllScores()
    prompt user to input scores for each judge
    call on inputValidScore to validate each entered score
    create array with all scores
def inputValidDegreeofDifficulty(degree)
    make sure difficulty entered is validated
def calculateScore(judgeScore, degree)
    calculate max and min of array


 */
import java.util.Scanner;
public class U2_Problem2 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        float difficulty;
        float[] judgesScores = new float[7];
        float diverScore;
        judgesScores = inputAllScores();
        System.out.println("Please enter in the dive's degree of difficulty");
        difficulty = inputValidDegreeofDifficulty(keyboard.nextFloat());
        diverScore = calculateScore(judgesScores, difficulty);
        System.out.println("The score for the diver's dive of difficulty " + difficulty + " is " + diverScore + ".");
    }
    public static float inputValidScore(float judgeScore){
        if(judgeScore < 0 || judgeScore > 10){
            System.out.println("Please enter in a valid score.");
            return -1;
        } else {
            return judgeScore;
        }
    }

    public static float[] inputAllScores(){
        Scanner key = new Scanner(System.in);
        int judges = 7;
        float[] allScores = new float[7];
        float score;
        for(int i=0; i<judges; i++){
            do {
                System.out.println("Please enter in Judge #" + (i + 1) + "'s score.");
                score = inputValidScore(key.nextFloat());
            } while(score == -1);
            allScores[i] = score;
        }
        return allScores;
    }

    public static float inputValidDegreeofDifficulty(float degree){
        if(degree < 1.2 || degree > 3.8){
            System.out.println("Please enter in a valid degree of difficulty.");
            return -1;
        } else {
            return degree;
        }
    }

    public static float calculateScore(float[] judgeScore, float degree){
        float diverScore = 0;
        float totalJudgeScore = 0;
        float min = 10;
        float max = 0;
        for(int k=0; k<judgeScore.length; k++){
            if(judgeScore[k] < min){
                min = judgeScore[k];
            }
            if(judgeScore[k] > max){
                max = judgeScore[k];
            }
        }
        for(int l=0; l<judgeScore.length; l++){
            totalJudgeScore = totalJudgeScore + judgeScore[l];
        }
        diverScore = degree * (totalJudgeScore-min-max) * (float)0.6;
        return diverScore;
    }

}
