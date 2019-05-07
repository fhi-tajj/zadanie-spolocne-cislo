package sk.euba.fhi.tajj.spolocne;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Igor Banduric.
 */
public class SpolocneTest {

	private Spolocne spolocne; //FIXME

	@Test
	public void testDveTri() {
		assertEquals( true, this.spolocne.spolocnaCislica( 12, 23 ) );
		assertEquals( true, this.spolocne.spolocnaCislica( 12, 42 ) );
		assertEquals( false, this.spolocne.spolocnaCislica( 12, 43 ) );
		assertEquals( false, this.spolocne.spolocnaCislica( 12, 44 ) );
	}
}
