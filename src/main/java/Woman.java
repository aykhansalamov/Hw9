import java.util.Map;

public final class Woman extends Human{
    public Woman (String name, String surname, int year, int iq, Map<DayOfWeek, String> schedule) {
        super(name, surname, year, iq, schedule);
    }

    public void greetPet() {
        System.out.println("Hello, I'm a woman, " + family.getPet().getNickName());
    }
    public void makeUP () {
        System.out.println("Wait me for an hour for makeup process");
    }
}
