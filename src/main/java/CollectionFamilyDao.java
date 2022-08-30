import java.util.ArrayList;
import java.util.List;

public class CollectionFamilyDao implements FamilyDao {
    public List<Family> family1 = new ArrayList<>();

    @Override
    public List<Family> getAllFamilies() {
        return family1;
    }

    @Override
    public void saveFamily(Family family) {
        family1.add(family);
    }

    @Override
    public boolean deleteFamily(int index) {
        family1.remove(family1.get(index));
        return true;

    }
}
