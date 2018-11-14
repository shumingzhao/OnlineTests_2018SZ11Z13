package com.acquisio.basic.java.question06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * QUESTION 07: Debugging
 * This method remove all even number from a list.
 * But the method is not working properly.
 * Find the error and fix it.
 *
 * IMPORTANT: Add all missing javadoc and/or unit tests that you think is necessary.
 */
public class Debugging {

    public static void main(String[] args) {
        Debugging instance = new Debugging();
        instance.removeEvenNumbers(1, 2, 3, 4));
    }

    Integer[] removeEvenNumbers(Integer ... values) {
        // TODO: Fix code here.

        List<Integer> integers = new ArrayList<Integer>(Arrays.asList(values));

        for(int i=0;i<integers.size();i++){
			if(integers.get(i)%2==0){
				integers.remove(i);
				i--;
			}
		}
        for(int i=0;i<integers.size();i++){
			System.out.print(integers.get(i));
			if(i!=integers.size()-1){
				System.out.print(",");
			}
		}

        return integers.toArray(new Integer[integers.size()]);
    }
}
