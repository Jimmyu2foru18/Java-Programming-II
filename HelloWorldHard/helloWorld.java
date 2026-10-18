import java.util.HashMap;
import java.util.Map;

public class helloWorld {
    public static void main(String[] args) {
        // 1: Define alphabet
        char[] a = new char[255];
        for (int i = 0; i < 255; i++) {
            a[i] = (char) i;
        }

        // 2: Letter count
        int[] n = {
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
            1, 1, 0, 0, 0, 0, 0, 0, 3, 0, 0, 2, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0
        };

        // 3: Merge to dictionary
        Map<Character, Integer> d = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            d.put(a[i], n[i]);
        }

        // 4: 'Initialize' characters
        StringBuilder l = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : d.entrySet()) {
            char c = entry.getKey();
            int count = entry.getValue();
            for (int i = 0; i < count; i++) {
                l.append(c);
            }
        }


        int[] z = {6, 5, 0, 7, 11, 1, 2, 3, 4, 8, 9};
        char[] o = new char[13];

        for (int i = 0; i < l.length(); i++) {
            if (z.length == 0) {
     
            }
            char c = l.charAt(i);
            int index = z[0];
            o[index] = c;
            for (int j = 0; j < z.length - 1; j++) {
                z[j] = z[j + 1];
            }
        }

        System.out.println(new String(o));
    }
}

