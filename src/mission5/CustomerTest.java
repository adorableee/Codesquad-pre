package mission5;

import java.util.*;

public class CustomerTest {
    public static void main(String[] args) {
        List<Member> members = new ArrayList<>();
        members.add(new Red("James", 10000, 2));
        members.add(new Red("Tomas", 30000, 2));
        members.add(new Platinum("Edward", 10000, 2));
        members.add(new Platinum("Percy", 30000, 2));
        members.add(new Diamond("Elizabet", 30000, 2));

        for (Member Mem : members) {
            Mem.showCustomer();
        }
    }
}
