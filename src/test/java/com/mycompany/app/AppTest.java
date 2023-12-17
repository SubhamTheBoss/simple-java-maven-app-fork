package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple application
 */
class AppTest {
	@Test
	void testAppConstructor() {
		App app1 = new App();
		App app2 = new App();
		assertEquals(app1.getMessage(), app2.getMessage());
	}

	@Test
	void testAppMessage() {
		App app = new App();
		assertEquals("Hello World!", app.getMessage());
	}
}
