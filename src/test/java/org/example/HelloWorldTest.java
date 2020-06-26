package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldTest {
    HelloWorld _menuItem = new HelloWorld();

    @Test
    public void MenuItemHelloWorld_getTitle()
    {
        assertEquals("HelloWorld", _menuItem.getTitle());
    }

}