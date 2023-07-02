package ru.netology;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void remain1() {
        int expected = 1;
        CashbackHackService x = new CashbackHackService();
        int actual = x.remain(999);
        assertEquals(expected,actual);
    }
    @Test
    public void remain2() {
        int expected = 0;
        CashbackHackService x = new CashbackHackService();
        int actual = x.remain(1000);
        assertEquals(expected,actual);
    }
}