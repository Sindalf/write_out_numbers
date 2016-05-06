import java.util.HashMap;
import java.util.Map;

public class Write_out_numbers {

    Map<String, String> map = new HashMap<String, String>();
    
    public static void main(String[] args) {
        Write_out_numbers test = new Write_out_numbers();
    }
    

    public Write_out_numbers() {
        map.put("0", "");
        map.put("1", "one ");
        map.put("2", "two ");
        map.put("3", "three ");
        map.put("4", "four ");
        map.put("5", "five ");
        map.put("6", "six ");
        map.put("7", "seven ");
        map.put("8", "eight ");
        map.put("9", "nine ");
        map.put("10", "ten ");
        map.put("11", "Eleven ");
        map.put("12", "Twelve ");
        map.put("13", "thirteen ");
        map.put("14", "fourteen ");
        map.put("15", "fifteen ");
        map.put("16", "sixteen ");
        map.put("17", "seventeen ");
        map.put("18", "eighteen ");
        map.put("19", "nineteen ");
        map.put("20", "twenty ");
        map.put("30", "thirty ");
        map.put("40", "forty ");
        map.put("50", "fifty ");
        map.put("60", "sixty ");
        map.put("70", "seventy ");
        map.put("80", "eighty ");
        map.put("90", "ninety ");
        map.put("00", "");
        map.put("000", "");
        map.put("h", "hundred ");
        map.put("t", "thousand ");
    }

    public String fn(String n) {

        if (n.equals("0")) {
            return "zero ";
        } else if (map.containsKey(n)) {
            return map.get(n);
        }

        if (n.length() > 3) {
            String first = n.substring(0, n.length() - 3);
            String second = n.substring(n.length() - 3, n.length());
            return toWord(first) + map.get("t") + toWord(second);
        }
        return toWord(n);
    }

    public String toWord(String n) {
        String result = "";

        if (map.containsKey(n)) {
            return map.get(n);
        }

        if (n.length() == 3) {
            if (n.substring(0, 1).equals("0")) {
                result = result + map.get("0");
                n = n.substring(1);
            } else {
                result = result + map.get(n.substring(0, 1)) + map.get("h");
                n = n.substring(1);
            }
        }

        if (n.length() == 2) {
            String c1 = n.substring(0, 1);

            if (c1.equals("1")) {
                result = result + map.get(n);
                n = n.substring(2); // Will end the function
            } else {
                result = result + map.get(c1 + "0");
                n = n.substring(1); 
            }
        }

        if (n.length() == 1) {
            result = result + map.get(n);
        }
        return result;
    }
}
