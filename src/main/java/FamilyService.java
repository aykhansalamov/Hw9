import java.util.List;

public class FamilyService {
    FamilyDao dao;

    public List<Family> getAllFamilies() {

        return dao.getAllFamilies();
    }
    public Family createNewFamily(Man father, Woman mother) {
        Family family = new Family(mother, father);
        dao.saveFamily(family);
        return family;
    }
    public void deleteFamilyByIndex(int index) {
        if (dao.deleteFamily(index)) System.out.println("Selected family has been deleted");
        else System.out.println("Entered family does not exist");
    }

}
