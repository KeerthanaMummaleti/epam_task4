package epamproj1;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Test;

public class HouseTest {
	House h;
	@Before
	public void init()
	{
		h=new House();
	}


	@Test
	public void test() {
		assertEquals(4500000,h.FullyHomeCost("HighStandardMaterials",2500),0);
	}

}
