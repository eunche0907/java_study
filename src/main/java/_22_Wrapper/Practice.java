package _22_Wrapper;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        String[] scores = {"85","92","78","96","89"};
        // 1. scores 배열을 Integer 배열로 변환해주세요
        Integer[] integerScores = new Integer[scores.length];
        for(int i = 0; i < scores.length; i++){
            //scores에서 i번째 문자열 가져와서 integer로 변환
            Integer integerVal = Integer.valueOf(scores[i]);
            //integerScores의 i번째에 대입
            integerScores[i] = integerVal;
        }
        //확인
        System.out.println(Arrays.toString(integerScores));


        // 2. 최고점, 최저점을  Integer.max(), min()을 통해 구해주세요
        Integer maxScore = integerScores[0];
        Integer minScore = integerScores[0];

        for(int i = 1; i < integerScores.length; i++){
            maxScore = Integer.max(maxScore,integerScores[i]);
            minScore = Integer.min(minScore,integerScores[i]);
        }


    }
}
