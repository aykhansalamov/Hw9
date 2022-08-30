import java.util.List;

public interface FamilyDao {

     List<Family> getAllFamilies();

    // Family getFamilyByIndex(int index);

     boolean deleteFamily(int index);

     void saveFamily(Family family);
}
