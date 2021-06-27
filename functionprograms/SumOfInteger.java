package com.bridgelabz.functionprograms;

import com.bridgelabz.functionutility.Utility;

public class SumOfInteger {

	  Utility utility = new Utility();
      int numberOfIntegers = utility.getIntvalue();
      int[] integerArray = new int[numberOfIntegers];
      for (int i = 0; i <= numberOfIntegers; i++) {
          integerArray[i] = utility.getIntvalue();
          System.out.println(integerArray[i]);
      }

          System.out.println(utility.getTripletNumber(integerArray,numberOfIntegers));
  }
}
	
	
	

