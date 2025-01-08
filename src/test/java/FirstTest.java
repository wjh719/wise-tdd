import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThat;

public class FirstTest {


    @Test
    void t1(){

        int rst = 1;

        assertThat(rst).isEqualTo(1);
    }

    @Test
    void t2(){
        TestApp app = new TestApp();
        app.run();


//        assertThat(result).isEqualTo("aaa");
        // aaa가 출력되는가?
    }

    @Test
    void t3(){
        String out = TestBot.run("종료");

        // 출력값을 체크
    }

    @Test
    @DisplayName("앱 시작시 '== 명언 앱 ==' 출력")
    void t4(){
        String out = TestBot.run("종료");

        assertThat(out.toString())
                .containsSubsequence("== 명언 앱 ==", "명언앱을 종료합니다.");

        // 출력값을 체크
    }
}
