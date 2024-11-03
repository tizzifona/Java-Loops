package project.f5.loop_java;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class AppTest {
    @Test
    public void testApp() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));
        App.main(new String[] {});

        String expectedOutput = "5 x 1 = 5\n" +
                "5 x 2 = 10\n" +
                "5 x 3 = 15\n" +
                "5 x 4 = 20\n" +
                "5 x 5 = 25\n" +
                "5 x 6 = 30\n" +
                "5 x 7 = 35\n" +
                "5 x 8 = 40\n" +
                "5 x 9 = 45\n" +
                "5 x 10 = 50\n";

        assertThat(outputStream.toString(), is(equalTo(expectedOutput)));
        System.setOut(originalOut);
    }
}
