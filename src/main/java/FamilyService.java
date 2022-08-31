import java.util.List;

public class FamilyService {
    FamilyDao dao;

    public List<Family> getAllFamilies() {

        return dao.getAllFamilies();
    }
    public Family createNewFamily(Man father, Woman mother) {
        Family family1 = new Family(mother, father);
        dao.saveFamily(family1);
        return family1;
    }
    public void deleteFamily(int index) {
        if (dao.deleteFamily(index)) System.out.println("Selected family has been deleted");
        else System.out.println("Entered family does not exist");
    }
    public void getFamilyByIndex(int index){
        if (dao.getFamilyByIndex(index)) System.out.println(CollectionFamilyDao.family.get(index));
        else System.out.println("Entered family does not exist");
    }
    public void deleteFamily(Family family) {
        if (dao.deleteFamily(family)) System.out.println("Selected family has been deleted");
        else System.out.println("Entered family does not exist");
    }
    public void displayAllFamilies() {
      System.out.println(CollectionFamilyDao.family);

    }


    public void getFamiliesBiggerThan() {
        boolean biggerFamily = (CollectionFamilyDao.family1.size() > 3);
    }
    public void getFamiliesLessThan() {
        boolean lessFamily = (CollectionFamilyDao.family1.size() < 3);
    }
}
