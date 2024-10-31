package project.f5.loop_java;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MultiplicationTableTest {
    @Test
    public void testMultiplicationTableFor5() {
        MultiplicationTable table = new MultiplicationTable();
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        table.printMultiplicationTable(5);

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
    }

    @Test
    public void testMultiplicationTableFor10() {
        MultiplicationTable table = new MultiplicationTable();
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        table.printMultiplicationTable(10);

        String expectedOutput = "10 x 1 = 10\n" +
                "10 x 2 = 20\n" +
                "10 x 3 = 30\n" +
                "10 x 4 = 40\n" +
                "10 x 5 = 50\n" +
                "10 x 6 = 60\n" +
                "10 x 7 = 70\n" +
                "10 x 8 = 80\n" +
                "10 x 9 = 90\n" +
                "10 x 10 = 100\n";

        assertThat(outputStream.toString(), is(equalTo(expectedOutput)));
    }
}
