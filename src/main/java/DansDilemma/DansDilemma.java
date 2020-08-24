package DansDilemma;

import java.util.HashSet;
import java.util.Set;

public class DansDilemma {

    public Integer dilemmaOfTwo(Double input1, Double input2) {
        Set<Double> results = new HashSet<Double>();
        results.add(input1 + input2);
        results.add(input1 - input2);
        results.add(input2 - input1);
        results.add(input1 * input2);
        results.add(input1 / input2);
        results.add(input2 / input1);
        return results.size();
    }

    public Integer dilemmaOfThree(Double input1, Double input2, Double input3) {
        Set<Double> results = new HashSet<Double>();
        results.add(input1 + input2);
        results.add(input1 - input2);
        results.add(input2 - input1);
        results.add(input1 * input2);
        results.add(input1 / input2);
        results.add(input2 / input1);
        
        results.add(input1 + input3);
        results.add(input1 - input3);
        results.add(input3 - input1);
        results.add(input1 * input3);
        results.add(input1 / input3);
        results.add(input3 / input1);
        
        results.add(input2 + input3);
        results.add(input2 - input3);
        results.add(input3 - input2);
        results.add(input2 * input3);
        results.add(input2 / input3);
        results.add(input3 / input2);
        return results.size();
    }

    public Integer dilemmaOfN(Double... args){
        Set<Double> results = new HashSet<Double>();
        for(int i = 0; i < args.length - 1; i++) {
            for(int j = i + 1; j < args.length; j++) {
                results.add(args[i] + args[j]);
                results.add(args[i] - args[j]);
                results.add(args[j] - args[i]);
                results.add(args[i] * args[j]);
                results.add(args[i] / args[j]);
                results.add(args[j] / args[i]);
            }
        }
        return results.size();
    }
}
