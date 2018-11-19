package com.acquisio.basic.java.question08;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;

/**
 * QUESTION 09: Lambdas (https://docs.oracle.com/javase/8/docs/api/java/util/stream/package-summary.html)
 * Using JDK8 Lambdas, add the code to transform the input file to apply those rules.
 * 1- Keep lines where the amount is greater than or equals to 50$
 * 2- Add a Taxes column right after the Amount column, which is 15% of the Amount.
 * 3- Add a Total column right after the Taxes column, which is the sum of Amount and Taxes.
 * 4- Remove the ShoppingCartTitle columns.
 * <p>
 * The input file contains those columns
 * User,Amount,ShoppingCartTitle,NbItems
 * <p>
 * IMPORTANT: Add all missing javadoc and/or unit tests that you think is necessary.
 */
public class Lambdas {
    public static void main(String[] args) throws IOException, URISyntaxException {
        Lambdas instance = new Lambdas();
        File input = new File(Thread.currentThread().getContextClassLoader().getResource("./carts.csv").toURI());
        File output = new File("./carts_output.csv");
        output.delete();

        instance.convertCarts(input, output);

        if (output.exists()) {
            Files.lines(output.toPath()).forEachOrdered(line -> System.out.println(line));
        }
    }

    void convertCarts(File input, File output) throws IOException {
        // TODO: Insert your code here.
            	String strFile =  input.getAbsolutePath();
    	CSVReader reader = new CSVReader(new FileReader(strFile));
        String [] nextLine;
        int lineNumber = 0;
        while ((nextLine = reader.readNext()) != null) {
            lineNumber++;
            System.out.println("Line # " + lineNumber);
    		int length = nextLine.length;
    		
    		if(lineNumber==0){
    			for(int i = 0; i<length; i++){
    				nextLine.add(nextLine[nextLine.length-1]);
    				int location = nextLine.indexOf("Amount");
    				nextLine[location+1] = ("Tax");
    				nextLine[location+2] = ("Total");
    			}
    		}
    		for(int i = 0; i<length; i++){
				nextLine.add(nextLine[nextLine.length-1]);
				int location = nextLine.indexOf("Amount");
				if(nextLine[location] <50){
					nextLine[location+1] = (nextLine[location]*0.15);
					nextLine[location+2] = (nextLine[location]*1.15);
				}else{
					nextLine[location+1] = null;
					nextLine[location+2] = null;
				}

			}
        }
    }

}
