package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecursionDateTest {
    RecursionDate _menuItem = new RecursionDate();

    @Test
    public void MenuItemRecursionDate_getTitle()
    {
        assertEquals("RecursionDate", _menuItem.getTitle());
    }

    @Test
    public void AckermannFunction()
    {
        assertEquals(1,_menuItem.AckermannFunction(0,0));
        assertEquals(2,_menuItem.AckermannFunction(1,0));
        assertEquals(3,_menuItem.AckermannFunction(2,0));
        assertEquals(5,_menuItem.AckermannFunction(3,0));
        assertEquals(13,_menuItem.AckermannFunction(4,0));
    }

}