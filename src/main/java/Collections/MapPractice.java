package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapPractice {

    public Object findValueOf(Map map, Object key) {
        return map.get(key);
    }

    public Object[] findKeysOf(Map map, Object value) {
        List<Object> list = new ArrayList<Object>();
        for(Object key : map.keySet()) {
            if(map.get(key) == value) {
                list.add(key);
            }
        }
        return list.toArray();
    }

    public Map<Integer, Integer> fibonacciTree(int size) {
        Map<Integer, Integer> res = new HashMap<Integer, Integer>();
        if(size == 0) {
            return res;
        } 
        int prevPrev = 1;
        res.put(0, prevPrev);
        if(size == 1) {
            return res;
        }
        int prev = 1;
        res.put(1, prevPrev);
        if(size == 2) {
            return res;
        }
        for(int i = 2; i < size; i++) {
            int tmp = prevPrev + prev;
            prevPrev = prev;
            prev = tmp;
            res.put(i, tmp);
        }
        return res;
    }

    public Map<Integer, Integer> crazySpiral(Integer first, Integer second, Integer size) {
        Map<Integer, Integer> res = new HashMap<Integer, Integer>();
        if(size == 0) {
            return res;
        } 
        int prevPrev = first;
        res.put(0, prevPrev);
        if(size == 1) {
            return res;
        }
        int prev = second;
        res.put(1, prevPrev);
        if(size == 2) {
            return res;
        }
        for(int i = 2; i < size; i++) {
            int tmp = prevPrev + prev;
            prevPrev = prev;
            prev = tmp;
            res.put(i, tmp);
        }
        return res;
    }
}
