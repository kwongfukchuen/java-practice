import java.util.List;
import java.util.ArrayList;

class sorter {
    public static List<String> sort(List<String> textbooks){
        textbooks.sort(String::compareToIgnoreCase);
        return textbooks;
    }
}

public class SortMyTextBooks {
    public static void main(String []args){
        ArrayList<String> strs = new ArrayList<>();
        for(String s : new String[] {"Alg#bra", "$istory", "Geom^try", "**English"})
        strs.add(s);
        sorter.sort(strs);
        System.out.println(sorter.sort(strs));
    }
}
