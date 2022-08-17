package HommeWork11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NoteBook {


        private Map<String, List<String>> map = new HashMap<>();

        public void add(String name, String telNumber) {
            List<String> telNumbers = map.getOrDefault(name, new ArrayList<>());
            telNumbers.add(telNumber);
            map.put(name, telNumbers);
        }

        public List<String> get(String name) {
            return map.get(name);
        }


    }

