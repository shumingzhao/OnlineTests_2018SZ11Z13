package com.acquisio.basic.java.question01;

/**
 * QUESTION 01: FooBar
 * You have a program that loop from 1 to 50.
 * <p>
 * The program must follow those rules:
 * - Must print 'Foo' if the value can be divided by 3.
 * - Must print 'Bar' if the value can be divided by 5.
 * - Otherwise, print the current integer value in the loop.
 *
 * IMPORTANT: Add all missing javadoc and/or unit tests that you think is necessary.
 */
public class FooBar {
    public static void main(String[] args) {
        FooBar main = new FooBar();
        for (int i = 1; i <= 50; i ++) {
            System.out.println(main.fooBar(i));
        }
    }

    String fooBar(int value) {
        // TODO: Insert your code here
        if(value == 0 ){
            return "0";
        }else if(value%3==0 && value%5==0){
            return String.valueOf(value);
        }else if(value%3==0){
            return "Foo";
        }else if(value%5==0){
            return "Bar";
        }else{
            return String.valueOf(value);
        }
    }
}
