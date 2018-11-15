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
    	System.out.println("=Add="+applyOperation(-1,-1,'+'));
    	System.out.println("=Add="+applyOperation(-1,0,'+'));
    	System.out.println("=Add="+applyOperation(-1,1,'+'));
    	System.out.println("=Add="+applyOperation(0,-1,'+'));
    	System.out.println("=Add="+applyOperation(0,0,'+'));
    	System.out.println("=Add="+applyOperation(0,1,'+'));
    	System.out.println("=Add="+applyOperation(1,-1,'+'));
    	System.out.println("=Add="+applyOperation(1,0,'+'));
    	System.out.println("=Add="+applyOperation(1,1,'+'));
    }
    //sub
    @Test(timeout=1000)
    public void unitTestSub(){
    	System.out.println("=Sub="+applyOperation(-1,-1,'-'));
    	System.out.println("=Sub="+applyOperation(-1,0,'-'));
    	System.out.println("=Sub="+applyOperation(-1,1,'-'));
    	System.out.println("=Sub="+applyOperation(0,-1,'-'));
    	System.out.println("=Sub="+applyOperation(0,0,'-'));
    	System.out.println("=Sub="+applyOperation(0,1,'-'));
    	System.out.println("=Sub="+applyOperation(1,-1,'-'));
    	System.out.println("=Sub="+applyOperation(1,0,'-'));
    	System.out.println("=Sub="+applyOperation(1,1,'-'));
    }
    //mul
    @Test(timeout=1000)
    public void unitTestMul(){
    	System.out.println("=Mul="+applyOperation(-1,0,'*'));
    	System.out.println("=Mul="+applyOperation(-1,1,'*'));
    	System.out.println("=Mul="+applyOperation(-1,-1,'*'));
    	System.out.println("=Mul="+applyOperation(0,0,'*'));
    	System.out.println("=Mul="+applyOperation(0,1,'*'));
    	System.out.println("=Mul="+applyOperation(0,-1,'*'));
    	System.out.println("=Mul="+applyOperation(1,-1,'*'));
    	System.out.println("=Mul="+applyOperation(1,0,'*'));
    	System.out.println("=Mul="+applyOperation(1,1,'*'));
    }
    //div
    @Test(timeout=1000)
    public void unitTestDiv(){
    	System.out.println("=Div="+applyOperation(-1,-1,'/'));
    	System.out.println("=Div="+applyOperation(-1,1,'/'));
    	System.out.println("=Div="+applyOperation(0,-1,'/'));
    	System.out.println("=Div="+applyOperation(0,1,'/'));
    	System.out.println("=Div="+applyOperation(1,-1,'/'));
    	System.out.println("=Div="+applyOperation(1,1,'/'));
    }
    @Test(expected=java.lang.ArithmeticException.class)
    public void expTest(){
    	System.out.println("=Div="+applyOperation(-1,0,'/'));
    	System.out.println("=Div="+applyOperation(0,0,'/'));
    	System.out.println("=Div="+applyOperation(1,0,'/'));
    	
    	System.out.println("=Other="+applyOperation(1,1,'%'));
    	System.out.println("=Other="+applyOperation(1,1,'='));
    	System.out.println("=Other="+applyOperation(1,1,'!'));
    	System.out.println("=Other="+applyOperation(1,1,'&'));
    	System.out.println("=Other="+applyOperation(1,1,'^'));
    	
    }
    @After
	public void tearDown() {
		System.out.println("---end test---");
	}

}
