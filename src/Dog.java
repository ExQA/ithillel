public class Dog extends Animals{

    @Override
    public void run(int distance) {
       System.out.println(distance);
    }

    @Override
    public void swimm(int distance) {
        super.swimm(distance);
    }
}
