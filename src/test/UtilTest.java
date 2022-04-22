package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;

import org.junit.jupiter.api.Test;

import appli.Util;

class UtilTest
{
	@Test
	// Test de makeDate(int year, int month, int day)
	void testMakeDate()
	{
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(Util.makeDate(1988, 3, 14));
		assertEquals(1988, calendar.get(Calendar.YEAR));
		assertEquals(3, calendar.get(Calendar.MONTH));
		assertEquals(14, calendar.get(Calendar.DAY_OF_MONTH));
	}

}
