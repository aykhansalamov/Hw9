import java.util.List;

public class FamilyController {
    FamilyService service;
    public List<Family> getAllFamilies() {
        return service.getAllFamilies();
    }
    public Family createNewFamily(Woman mother, Man father) {
        return service.createNewFamily(father, mother);
    }
    public void deleteFamilyByIndex(int index) {
        service.deleteFamilyByIndex(index);
    }
}
