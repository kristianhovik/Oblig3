import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestLeapYear {
    @Test
    void yearDivisibleByFourButNotHundred() { //Tester at året er delbart med 4 men ikke 100.
        leapYear leapYear = new leapYear();
        assertTrue(leapYear.isLeapYear(4));
        assertFalse(leapYear.isLeapYear(100));
    }
    @Test
    void yeardivisibleByFourHundred() { //Tester at året er delbart med 400.
        leapYear leapYear = new leapYear();
        assertTrue(leapYear.isLeapYear(400));
        assertTrue(leapYear.isLeapYear(800));
    }
    @Test
    void yeardivisibleByFour() { //Tester at året er delbart med 4.
        leapYear leapYear = new leapYear();
        assertTrue(leapYear.isLeapYear(4));
        assertTrue(leapYear.isLeapYear(8));

    }
    @Test
    void yeardivisibleByFourHundredButNotHundred() { //Tester at året er delbart med 400, men ikke 100.
        leapYear leapYear = new leapYear();
        assertTrue(leapYear.isLeapYear(400));
        assertFalse(leapYear.isLeapYear(100));
    }

}
