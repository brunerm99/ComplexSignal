package complexProject;

import org.junit.Test;
import static org.junit.Assert.*;

public class ComplexTest{
	private complexNumber cm = new complexNumber(1,2);
	private complexSignal sig = new complexSignal(cm);

	@Test
	public void test1(){
		complexNumber cm = new complexNumber(0, 1);
		complexSignal sig = new complexSignal(cm);
		assertEquals(cm.im, 1.0, 0.00000000000001);
		assertEquals(sig.phase, 90, 0.0000000000000000000000000000000000001);	
	}
	
	@Test
	public void test2(){
		complexNumber cm2 = new complexNumber(1, 0);
		complexSignal sig2 = new complexSignal(cm2);	
		assertEquals(cm2.re, 1.0, 0.00000000000001);
		assertEquals(sig2.magnitude, 1.0, 0.00000000001);
	}

	@Test
	public void test3(){
		complexNumber cm3 = new complexNumber(1, 0);
		complexSignal sig3 = new complexSignal(cm);
		assertEquals(cm.re, 1.0, 0.00000000000001);	
	}
}

