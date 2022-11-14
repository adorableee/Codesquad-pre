package mission5_1;

public class WhippedCream extends Decorator{
    public WhippedCream(Coffee coffee) {
        super(coffee);
    }
    public void brewing() {
        super.brewing();
        System.out.print("Adding WhippedCream");
    }
}
