import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class leapYearTest {
    @Test
    void yearDivisibleByFourButNotHundred() { //Tester at året er delbart med 4 men ikke 100.
        var leapYear = new leapYear();
        assertTrue(leapYear.isLeapYear(4));
        assertFalse(leapYear.isLeapYear(100));
    }
    @Test
    void yeardivisibleByFourHundred() { //Tester at året er delbart med 400.
        var leapYear = new leapYear();
        assertTrue(leapYear.isLeapYear(400));
        assertTrue(leapYear.isLeapYear(800));
    }
    @Test
    void yeardivisibleByFour() { //Tester at året er delbart med 4.
        var leapYear = new leapYear();
        assertTrue(leapYear.isLeapYear(4));
        assertTrue(leapYear.isLeapYear(8));
        assertTrue(leapYear.isLeapYear(12));
    }
    @Test
    void yeardivisibleByFourHundredButNotHundred() { //Tester at året er delbart med 400, men ikke 100.
        var leapYear = new leapYear();
        assertTrue(leapYear.isLeapYear(400));
        assertFalse(leapYear.isLeapYear(100));
    }

}
