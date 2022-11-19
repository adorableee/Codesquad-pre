package mission6_1;

public abstract class PlayerLevel {
    abstract void run();
    abstract void jump();
    abstract void turn();
    abstract void showLevel();
    public void go(int count) {
        showLevel();
        run();
        for (int i = 0; i < count; i++) {
            jump();
        }
        turn();
        System.out.println();
    }
}
