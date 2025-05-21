package dowlath.io.dsa.misc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Interval{
    int start;
    int end;
    Interval(int start, int end){
        this.start = start;
        this.end = end;
    }
}
public class MergeIntervals {
    public static void main(String[] args) {
        List<Interval> input = new ArrayList<>();
        input.add(new Interval(1,4));
        input.add(new Interval(2,5));
        input.add(new Interval(6,9));

        List<Interval> output = mergeInterval(input);
        for(Interval result : output){
            System.out.println(result.start + "  "+ result.end);
        }
    }

    public static List<Interval> mergeInterval(List<Interval> intervals){
        /*
            If list has less than two elements,
            then there is nothing to merge.
         */
        if(intervals.size() < 2 ){
            return intervals;
        }

        List<Interval> output = new ArrayList<>();

        // Sort the interval on the basis of start attribute
        Collections.sort(intervals,(a, b) -> Integer.compare(a.start,b.start));

        // Take the interval present at 0th element
        Interval temp = intervals.get(0);
        int start = temp.start;
        int end = temp.end;

        // Traverse a list
        for(int i = 1; i<intervals.size();i++){
            temp = intervals.get(i);
            if(temp.start <= end){
                end = Math.max(end, temp.end);
            } else {
                output.add(new Interval(start,end));
                start = temp.start;
                end = temp.end;
            }
        }
        output.add(new Interval(start,end));
        return output;

    }
}
