package ru.netology;

import org.testng.Assert;
import org.testng.annotations.Test;
public class CashbackHackServiceTest {

    @Test
    public void testRemain1() {
        CashbackHackService x = new CashbackHackService();
        int expected = 1;
        int actual = x.remain(999);
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void testRemain2() {
        CashbackHackService x = new CashbackHackService();
        int expected = 0;
        int actual = x.remain(1000);
        Assert.assertEquals(actual, expected);
    }
}