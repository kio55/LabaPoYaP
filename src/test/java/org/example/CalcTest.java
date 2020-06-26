package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {
    Calc _menuItem = new Calc();

    @Test
    public void MenuItemCalc_getTitle()
    {
        assertEquals("Calc", _menuItem.getTitle());
    }

    @Test
    void getResult() {
        assertEquals(7,_menuItem.GetResult(0,0));
        assertEquals(8,_menuItem.GetResult(1,0));
        assertEquals(72,_menuItem.GetResult(1,8));
    }
}