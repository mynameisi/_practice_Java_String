import static org.junit.Assert.*;
import org.junit.Test;
import tools.Constants;
public class Practice_1Test {
	Practice_1	p	= new Practice_1();
	@Test
	public void x0() {
		assertTrue(p.x0.equals("1"));
	}
	@Test
	public void x1() {
		assertTrue(p.x1.equals("12"));
	}
	@Test
	public void x2() {
		assertTrue(p.x2 == Constants.str1.length());
	}
	@Test
	public void x3() {
		assertTrue(p.x3.equals(p.x1 + Integer.toString(p.x2)));
	}
	@Test
	public void x4() {
		assertTrue(p.x4.equals("3.14"));
	}
	@Test
	public void x5() {
		assertTrue(p.x5 == Float.parseFloat(p.x4));
	}
	@Test
	public void x6() {
		assertTrue(p.x6 == Double.parseDouble(p.x4));
	}
	@Test
	public void x7() {
		assertTrue(p.x7.equals(Float.toString(p.x5)));
	}
	@Test
	public void x8() {
		assertTrue(p.x8.equals(Double.toString(p.x5)));
	}
	@Test
	public void x9() {
		assertTrue(p.x9 == Constants.str1.charAt(11));
	}
	@Test
	public void x10() {
		assertTrue(p.x10 == Constants.str1.charAt(Constants.str1.length() - 1));
	}
	@Test
	public void x11() {
		int sum = 0;
		for (char x : Constants.str1.toCharArray()) {
			sum += x;
		}
		assertTrue(p.x11 == sum);
	}
	@Test
	public void x12() {
		assertTrue(p.x12 == Constants.str1.equals(Constants.str2));
	}
}
