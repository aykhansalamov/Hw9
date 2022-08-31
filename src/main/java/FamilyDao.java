import java.util.List;

public interface FamilyDao {

     List<Family> getAllFamilies();

     boolean getFamilyByIndex(int index);

     boolean deleteFamily(int index);
     boolean deleteFamily(Family family1);

     void saveFamily(Family family1);
     List<Family> DisplayAllFamilies();
}
