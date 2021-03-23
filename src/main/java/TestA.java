public class TestA {
    private final int  first;
    private final int  second;
    private final int  third;

    public static class Buider{

        private final int first;
        private final int second;

        private int third = 0;

        public  Buider(int first,int second){
            this.first = first;
            this.second =second;
        }

        public  Buider third(int val){
            third = val;
            return  this;
        }

        public TestA build() {
            return new TestA(this);
        }
    }

    public TestA(Buider buider) {
        first = buider.first;
        second = buider.second;
        third = buider.third;
    }

    @Override
    public String toString() {
        return "TestA{" +
                "first=" + first +
                ", second=" + second +
                ", third=" + third +
                '}';
    }
}
