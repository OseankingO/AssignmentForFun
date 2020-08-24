package Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {

    public ArrayList<Integer> addShit(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        list1.addAll(list2);
        return list1;
    }

    public Integer addShitTogether(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        int sum = 0;
        for(int i : list1) {
            sum += i;
        }
        for(int i : list2) {
            sum += i;
        }
        return sum;
    }

    public ArrayList<Integer> removeAll(ArrayList<Integer> original, Integer toRemove) {
        ArrayList<Integer> output = new ArrayList<Integer>();
        for(int i : original) {
            if(i != toRemove) {
                output.add(i);
            }
        }
        return output;
    }

    public boolean happyList(ArrayList<String> original) {
        if(original.size() < 2) {
            return false;
        }
        for(int i = 1; i < original.size(); i++) {
            char[] tmp = original.get(i).toCharArray();
            char[] prev = original.get(i - 1).toCharArray();
            boolean gotSame = false;
            for(char tmpC : tmp) {
                for(char prevC : prev) {
                    if(tmpC == prevC) {
                        gotSame = true;
                        break;
                    }
                }
                if(gotSame) {
                    break;
                }
            }
            if(!gotSame) {
                return false;
            }
        }
        return true;
    }
}
