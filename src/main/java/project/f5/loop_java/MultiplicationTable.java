package project.f5.loop_java;

public class MultiplicationTable {
    public void printMultiplicationTable(int n) {
        for (int i = 1; i <= 10; i++) {
            int result = n * i;
            System.out.println(n + " x " + i + " = " + result);
        }
    }
}
