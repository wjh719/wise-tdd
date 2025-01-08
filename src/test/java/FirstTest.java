import org.example.TestApp;
import org.junit.jupiter.api.Test;

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
        String result = app.run();


        assertThat(result).isEqualTo("aaa");
        // aaa가 출력되는가?
    }
}
