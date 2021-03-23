public class Examples {
    public static void main(String[] args) {
        TestA testA = new TestA.Buider(1,2).third(3).build();
        System.out.println(testA.toString());
    }
}
