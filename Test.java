public class Test implements Service {
    public Test() {}

    public void execute() {
        System.out.println("Test");
        int x = 0;
        for (int i = 0; i < 10; i++) {
            x += i;
        }
        System.out.println(x);
    }
}
