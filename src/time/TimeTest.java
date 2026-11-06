package time;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeTest {
	
	@Test
	public void testGetTotalSecondsGood()
	{
	    int seconds = Time.getTotalSeconds("05:05:05");
	    assertEquals(18305, seconds);
	}

	@Test
	void testGetTotalSecondsBad() {
	    assertThrows(
	        StringIndexOutOfBoundsException.class,
	        () -> { Time.getTotalSeconds("10:00"); }
	    );
	}
	
	@Test
	public void testGetTotalSecondsBoundary()
	{
	    assertEquals(0, Time.getTotalSeconds("00:00:00"));
	    assertEquals(86399, Time.getTotalSeconds("23:59:59"));
	}
	
	@Test
	public void testGetTotalMinutesGood()
	{
	    int minutes = Time.getTotalMinutes("05:05:05");
	    assertEquals(5, minutes);
	}

	@Test
	void testGetTotalMinutesBad() {
	    assertThrows(
	        StringIndexOutOfBoundsException.class,
	        () -> { Time.getTotalMinutes("10"); }
	    );
	}
	
	@Test
	public void testGetTotalMinutesBoundary()
	{
	    assertEquals(0, Time.getTotalMinutes("00:00:00"));
	    assertEquals(59, Time.getTotalMinutes("23:59:59"));
	}
	
	@Test
	public void testGetTotalHoursGood()
	{
	    int hours = Time.getTotalHours("05:05:05");
	    assertEquals(5, hours);
	}

	@Test
	void testGetTotalHoursBad() {
	    assertThrows(
	        StringIndexOutOfBoundsException.class,
	        () -> { Time.getTotalHours("5"); }
	    );
	}
	
	@Test
	public void testGetTotalHoursBoundary()
	{
	    assertEquals(0, Time.getTotalHours("00:00:00"));
	    assertEquals(23, Time.getTotalHours("23:59:59"));
	}
	
	@Test
	public void testGetSecondsGood()
	{
	    int seconds = Time.getSeconds("05:05:05");
	    assertEquals(5, seconds);
	}

	@Test
	void testGetSecondsBad() {
	    assertThrows(
	        StringIndexOutOfBoundsException.class,
	        () -> { Time.getSeconds("20:15"); }
	    );
	}
	
	@Test
	public void testGetSecondsBoundary()
	{
	    assertEquals(0, Time.getSeconds("00:00:00"));
	    assertEquals(59, Time.getSeconds("23:59:59"));
	}
	
	@Test
	public void testGetMillisecondsGood()
	{
	    int milliseconds = Time.getMilliseconds("05:05:05:05");
	    assertEquals(5, milliseconds);
	}

	@Test
	void testGetMillisecondsBad() {
	    assertThrows(
	        StringIndexOutOfBoundsException.class,
	        () -> { Time.getMilliseconds("20:15"); }
	    );
	}
	
	@Test
	public void testGetMillisecondsBoundary()
	{
	    assertEquals(0, Time.getMilliseconds("00:00:00:00"));
	    assertEquals(59, Time.getMilliseconds("23:59:59:59"));
	}
	
	@Test
	public void testGetAllMillisecondsGood()
	{
	    int milliseconds = Time.getAllMilliseconds("12:05:05:05");
	    assertEquals(43505005, milliseconds);
	}

	@Test
	void testGetAllMillisecondsBad() {
	    assertThrows(
	        StringIndexOutOfBoundsException.class,
	        () -> { Time.getAllMilliseconds("20:15"); }
	    );
	}
	
	@Test
	public void testGetAllMillisecondsBoundary()
	{
	    assertEquals(0, Time.getAllMilliseconds("00:00:00:00"));
	    assertEquals(86399059, Time.getAllMilliseconds("23:59:59:59"));
	}

}
