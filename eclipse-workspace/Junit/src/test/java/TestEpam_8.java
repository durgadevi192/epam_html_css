import static org.junit.Assert.*;

	import org.junit.Test;

	public class TestEpam_8 {

		@Test
		public void test() {
			Epam_8 a=new Epam_8();
			assertEquals("BCD",a.remove("ABCD"));
			assertEquals("CD",a.remove("AACD"));
			assertEquals("BCD",a.remove("BACD"));
			assertEquals("BBAA",a.remove("BBAA"));
			assertEquals("BAA",a.remove("AABAA"));
		}

}
