package com.acquisio.basic.java.question07;

/**
 * QUESTION 08: Unit Test
 * Add Unit Test method(s) to test this method.
 * Add your tests to the CalculatorTest class to see the result of
 * your test.
 *
 * IMPORTANT: Add all missing javadoc and/or unit tests that you think is necessary.
 */
public class Calculator {
    public static Integer applyOperation(int x, int y, char operator) {
        if (operator == '+') {
            return x + y;
        } else if (operator == '-') {
            return x - y;
        } else if (operator == '*') {
            return x * y;
        } else if (operator == '/') {
            if (y != 0) {
                return x / y;
            } else {
                return null;
            }
        } else {
            throw new IllegalArgumentException(
                    String.format("Operator '%s' not supported", operator));
        }
    }
    @Before
	public void setUp() {
		System.out.println("---begin test---");
	}
    //add
    @Test(timeout=1000)
    public void unitTestAdd(){
    	assertEquals(-2, applyOperation(-1,-1,'+'));
    	assertEquals(-1, applyOperation(-1,0,'+'));
    	assertEquals(0, applyOperation(-1,1,'+'));
    	assertEquals(-1, applyOperation(0,-1,'+'));
    	assertEquals(0, applyOperation(0,0,'+'));
    	assertEquals(1, applyOperation(0,1,'+'));
    	assertEquals(0, applyOperation(1,-1,'+'));
    	assertEquals(1, applyOperation(1,0,'+'));
    	assertEquals(2, applyOperation(1,1,'+'));
    }
    //sub
    @Test(timeout=1000)
    public void unitTestSub(){
    	assertEquals(0, applyOperation(-1,-1,'-'));
    	assertEquals(-1, applyOperation(-1,0,'-'));
    	assertEquals(-2, applyOperation(-1,1,'-'));
    	assertEquals(1, applyOperation(0,-1,'-'));
    	assertEquals(0, applyOperation(0,0,'-'));
    	assertEquals(-1, applyOperation(0,1,'-'));
    	assertEquals(2, applyOperation(1,-1,'-'));
    	assertEquals(1, applyOperation(1,0,'-'));
    	assertEquals(0, applyOperation(1,1,'-'));
    }
    //mul
    @Test(timeout=1000)
    public void unitTestMul(){
    	assertEquals(0, applyOperation(-1,0,'*'));
    	assertEquals(-1, applyOperation(-1,1,'*'));
    	assertEquals(1, applyOperation(-1,-1,'*'));
    	assertEquals(0, applyOperation(0,0,'*'));
    	assertEquals(0, applyOperation(0,1,'*'));
    	assertEquals(0, applyOperation(0,-1,'*'));
    	assertEquals(-1, applyOperation(1,-1,'*'));
    	assertEquals(0, applyOperation(1,0,'*'));
    	assertEquals(1, applyOperation(1,1,'*'));
    }
    //div
    @Test(timeout=1000)
    public void unitTestDiv(){
    	assertEquals(1, applyOperation(-1,-1,'/'));
    	assertEquals(-1, applyOperation(-1,1,'/'));
    	assertEquals(0, applyOperation(0,-1,'/'));
    	assertEquals(0, applyOperation(0,1,'/'));
    	assertEquals(-1, applyOperation(1,-1,'/'));
    	assertEquals(1, applyOperation(1,1,'/'));
    	assertEquals(null,applyOperation(-1,0,'/'));
    	assertEquals(null,applyOperation(0,0,'/'));
    	assertEquals(null,applyOperation(1,0,'/'));
    }
    @Test(expected=java.lang.ArithmeticException.class)
    public void expTest(){
    	assertEquals(null,applyOperation(1,1,'%'));
    	assertEquals(null,applyOperation(1,1,'='));
    	assertEquals(null,applyOperation(1,1,'!'));
    	assertEquals(null,applyOperation(1,1,'&'));
    	assertEquals(null,applyOperation(1,1,'^'));
    	
    }
    @After
	public void tearDown() {
		System.out.println("---end test---");
	}

}
