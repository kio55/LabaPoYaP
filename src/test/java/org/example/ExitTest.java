package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ExitTest {
    Exit _menuItem = new Exit();

    @Test
    public void MenuItemExit_getTitle()
    {
        assertEquals("Exit", _menuItem.getTitle());
    }
}