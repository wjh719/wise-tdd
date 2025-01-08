import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FirstTest {


    @Test
    void t1() {

        int rst = 1;

        assertThat(rst).isEqualTo(1);
    }

    @Test
    void t2() {
//        App app = new App();
//        app.run();


//        assertThat(result).isEqualTo("aaa");
        // aaa가 출력되는가?
    }

    @Test
    void t3() {
        String out = TestBot.run("");
        assertThat(out)
                .contains("명령 ) ")
                .contains("명언앱을 종료합니다.");

        // 출력값을 체크
    }

    @Test
    @DisplayName("명령을 여러번 입력할 수 있다.")
    void t4() {
        String out = TestBot.run("""
                등록
                등록
                종료
                """);

        long count = out.split("명령 \\)").length - 1;

        System.out.println(count);

        // 명령 ) 횟수를 세서 검증해야 됨.
        assertThat(out)
                .contains("명령 ) ")
                .contains("명령 ) ");

        assertThat(count).isEqualTo(3); // 기대하는 횟수에 따라 값 수정

    }
    @Test
    @DisplayName("앱 시작시 '== 명언 앱 ==' 출력")
    void t5() {
        String out = TestBot.run("");

        assertThat(out)
                .containsSubsequence("== 명언 앱 ==", "명언앱을 종료합니다.");

        // 출력값을 체크
    }

    @Test
    @DisplayName("등록 - 명언 1개 입력")
    void t6() {
        String out = TestBot.run("""
                등록
                현재를 사랑하라.
                작자미상
                종료
                """);

        assertThat(out)
                .containsSubsequence("명언 : ", "작가 : ");
    }
    @Test
    @DisplayName("등록 - 명언 1개 입력, 명언 번호 출력")
    void t7() {
        String out = TestBot.run("""
                등록
                현재를 사랑하라.
                작자미상
                종료
                """);

        assertThat(out)
                .contains("1번 명언이 등록되었습니다.");
    }
}
