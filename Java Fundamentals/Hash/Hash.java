import java.util.HashMap;
import java.util.Set;

public class Hash {
    public static void main(String[] args) {
        HashMap<String, String> songs = new HashMap<String, String>();
        songs.put("kazim", "ma7kma");
        songs.put("hany", "tekhsry");
        songs.put("hafiz", "ahwak");
        songs.put("a3sam", "de7ia");

        String value = songs.get("hany");

        for (String key : songs.keySet()) {
            System.out.println(String.format("Track: %s: Lyrics: %s", key, songs.get(key)));
        }


    }
}