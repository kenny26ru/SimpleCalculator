import java.util.TreeMap;

public class ToRoman {
    static TreeMap<Integer,String> map = new TreeMap<>();

    static {
        map.put(1,"I");
        map.put(2,"II");
        map.put(3,"III");
        map.put(4,"IV");
        map.put(5,"V");
        map.put(6,"VI");
        map.put(7,"VII");
        map.put(8,"VIII");
        map.put(9,"IX");
        map.put(10,"X");
        map.put(40,"XL");
        map.put(50,"L");
// И так далее...
    }

    static String toRoman(int number){
        int i = map.floorKey(number);
        if (number == i){
            return map.get(number);
        }
        return map.get(i) + toRoman(number - i);
    }
}
