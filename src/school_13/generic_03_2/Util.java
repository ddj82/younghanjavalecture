package school_13.generic_03_2;

public class Util {
    public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
        //p1 <K, V> = <Integer, String>
        //p2 <K, V> = <Integer, String>
        //p3 <K, V> = <String, String>
        //p4 <K, V> = <String, String>
        boolean keyCompare = p1.getKey().equals(p2.getKey()); 			//p1,p2 t	//p3,p4 f
        boolean valueCompare = p1.getValue().equals(p2.getValue()); 	//p1,p2 t	//p3,p4 t

        return keyCompare && valueCompare; //둘다(&&=and) 같으면t 나머지f 리턴 //p1,p2 t 	//p3,p4 f
    }
}