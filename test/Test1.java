package dowlath.io.example.test;

/*
[[1,4],[5,6],[7,10],[15,18]]
[[1,3],[2,6],[8,10],[15,18]]
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        //int[][] intervals = {{1,4},{5,6},{7,10},{15,18}};
        int[][] merged = merge(intervals);
        System.out.println("Merged Intervals...:");
        for(int[] interval : merged){
            System.out.println(Arrays.toString(interval));
        }
    }
    public static int[][] merge(int[][] intervals){
        if(intervals.length <=1 ) return intervals;
        // 1. sort the interval.
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0],b[0]));

        List<int[]> merged = new ArrayList<>();
        int[] current = intervals[0];
        merged.add(current);

        // 2. merge overlap
        for(int[] interval : intervals){
            if(interval[0] <= current[1]){
                current[1] = Math.max(current[1],interval[1]);
            } else{
                current = interval;
                merged.add(current);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
}

/*


1. AppInstallerService

   isntallApp(){

   // Runs Script

   //  save DB

   //  retuns status

   }
   }
  2. ShellExecutor script...

     processBuilder (all 3 apps )
     return statusCode , stdErr, stdIN

  3. Repostory...

     findByName (app )...

  4 Entity

    id,
    status
    version
    status... installed ,failed , crashed
    latestDatetime

  5. DTo instaation status  & result

  6. Rest Controller

  post /install

  get /{appName}

  database sch
  ------------
  id appname version status date









 */