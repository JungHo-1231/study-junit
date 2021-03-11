package chapter_01;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

public class ScoreCollectionTest {

    @Test
    void test(){
        fail("Not yet implemented");
    }

    @Test
    void answerArithmeticMeanOfTwoNumbers(){

        // 준비
        ScoreCollection collection = new ScoreCollection();

        collection.add(()-> 5);
        collection.add(()-> 7);

        // 실행
        int actualResult = collection.arithmeticMean();

        // 단언
        Assertions.assertThat(actualResult).isEqualTo(6);
    }

}
