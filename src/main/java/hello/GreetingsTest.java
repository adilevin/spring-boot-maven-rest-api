package hello;

import static org.junit.Assert.*;

import javax.validation.constraints.AssertTrue;

import org.junit.Test;

public class GreetingsTest {

	@Test
	public final void testGreeting() {
		@SuppressWarnings("unused")
		Greeting g = new Greeting(0,"");
	}

	@Test
	public final void testGetId() {
		Greeting g = new Greeting(1,"");
		assertEquals(1, g.getId());
	}

	@Test
	public final void testGetContent() {
		Greeting g = new Greeting(0,"dummy");
		assertEquals("dummy", g.getContent());
	}

}
