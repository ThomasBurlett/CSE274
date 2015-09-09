import static org.junit.Assert.*;

import org.junit.Test;

public class ParenMatcherTest {


	@Test
	public void test1() {
		assertTrue("Fails on string with no parens", ParenMatcher.ParenMatch("1+2"));
	}
        	
	@Test
	public void test2() {
		assertTrue("Fails on string with (correct) outside parens", ParenMatcher.ParenMatch("(1+2)"));
	}

	@Test
	public void test3() {
		assertTrue("Fails on string with (correct) multiple parens", ParenMatcher.ParenMatch("(1+(2+3))"));
	}
        
	@Test
	public void test4() {
		assertTrue("Fails on string with (correct) disjoint parens", ParenMatcher.ParenMatch("(1+2)(3+4)"));
	}
        
	@Test
	public void test5() {
		assertTrue("Fails on string with (correct) complex parens", ParenMatcher.ParenMatch("((1+(2+3)(4+5)(6+(7+8)))+9)"));
    }
        
	@Test
	public void test6() {
		assertFalse("Fail on incorrect string with open only", ParenMatcher.ParenMatch("("));
    }
        
	@Test
	public void test7() {
		assertFalse("Fail on incorrect string with close only", ParenMatcher.ParenMatch(")"));
	}
        
	@Test
	public void test8() {
		assertFalse("Fail on incorrect string with extra open", ParenMatcher.ParenMatch("()("));
	}
        
	@Test
	public void test9() {
		assertFalse("Fail on incorrect string with extra close", ParenMatcher.ParenMatch("())"));
	}
     
	@Test
    public void test10() {
    	assertFalse("Fail on incorrect string with extra open", ParenMatcher.ParenMatch("(()"));                
    }
     
	@Test
    public void test11() {
    	assertFalse("Fail on incorrect string with extra open", ParenMatcher.ParenMatch("(()(()))())"));                
    }
     
	@Test
    public void test12() {
    	assertFalse("Fail on incorrect string with extra close", ParenMatcher.ParenMatch("(()(()))())"));               
    }
}