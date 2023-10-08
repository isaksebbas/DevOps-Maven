import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FriendFinder {
    public static String[] getFriendNames(String filePath) {
        List<String> names = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                names.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return names.toArray(new String[0]);
    }

    public static void main(String[] args) {
        
        String[] friends = getFriendNames("src/main/resources/names.txt");
        for (String friend : friends) {
            System.out.println(friend);
        }
    }
}
