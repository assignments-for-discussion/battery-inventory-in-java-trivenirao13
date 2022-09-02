package bunchbycycles;
import java.io.*;
import java.util.*;
public class Main {
  static class CountsByUsage {
    public int lowCount = 0;
    public int mediumCount = 0;
    public int highCount = 0;
    public int invalid = 0; //negative cycles
  };

  static CountsByUsage countBatteriesByUsage(int[] cycles) {
    CountsByUsage counts = new CountsByUsage();
   
    for(int i=0;i<cycles.length;i++)
    {
    	if(cycles[i]<0)
    	{
    		counts.invalid++;
    		
    	}
    	else if(cycles[i]>=0 && cycles[i]<400)
        {
    		counts.lowCount++;
        	
        }
    	else if(cycles[i]>=400 && cycles[i]<=919)
    	{
    		counts.mediumCount++;
    		
    	}
    	else
    	{
    		counts.highCount++;
    		
    	}
    	
    }
    
    
    return counts;
  }

  static void testBucketingByNumberOfCycles() {
    System.out.println("Counting batteries by usage cycles...\n");
    CountsByUsage counts = countBatteriesByUsage(new int[] {-1, -300, 500, 600, 900, 1000});//updated test cases
    System.out.println("Invalid:"+counts.invalid);
    System.out.println("High:"+counts.highCount);
    System.out.println("Low:"+counts.lowCount);
    System.out.println("Medium:"+counts.mediumCount);
    System.out.println("Done counting :)\n");
  }

  public static void main(String[] args) {
    testBucketingByNumberOfCycles();
  }
}
