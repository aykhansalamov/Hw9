import java.util.*;


public class Main {


    public static void main(String[] args) {
        Map<DayOfWeek, String> fatherSchedule = new HashMap<>();
        fatherSchedule.put(DayOfWeek.MONDAY, "do exercise");
        Map<DayOfWeek, String> motherSchedule = new HashMap<>();
        motherSchedule.put(DayOfWeek.TUESDAY, "cook meal");
        Map<DayOfWeek, String> childSchedule = new HashMap<>();
        childSchedule.put(DayOfWeek.SUNDAY, "sleep");

        Human father = new Man("Vito", "Karleone", 1955,
                95,
                fatherSchedule);

        Human mother = new Woman("Jane", "Karleone", 1956,
                85,
                motherSchedule);

        Human child = new Human("Michael", "Karleone", 1977,
                90,
                childSchedule);
//        Pet dog = new Pet(Species.DOG, "Rocky", 5, 45, habits) {
//
//        };
//        Set<Pet> petSet = new HashSet<>();
//        petSet.add();
        //child.setPet(dog);

        //Human man = new Human();

        // father.greetPet();
        //   child.describePet();
        // Dog.respond();

        Random random = new Random();
        int secretNumber = random.nextInt(101);
        boolean feedTime;
        if (Pet.getTrickLevel() >= secretNumber) {
            feedTime = true;
        } else {
            feedTime = false;
        }
        // child.feedPet(feedTime);


        //Pet.eat();
        System.out.println(child);
        Family family = new Family(mother, father, new ArrayList<>());

        family.addChild(child);
        family.deleteChild(0);

        System.out.println(family);
//        System.out.println("Equality of dogs is " + pet.getNickName().equals(p.getNickName()));
//        System.out.println("Equality of dog and cat is " + pet.getNickName().equals(cat.getNickName()));
        System.out.println("Family count is: " + family.countFamily());

    }

    public static void garbageCollectorLoop() {
        for (int i = 0; i < 10000000; i++) {
            Human h = new Human();
        }

    }
}