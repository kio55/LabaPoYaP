package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskStringsTest {
    TaskStrings _menuItem = new TaskStrings();

    @Test
    public void MenuItemStrings_getTitle()
    {
        assertEquals("Strings", _menuItem.getTitle());
    }

    @Test
    void compareStrings() throws ValidationException {
        _menuItem.CompareStrings("abc","abc");
    }

    @Test
    void NotCompareStrings() {
        assertThrows(ValidationException.class , ()->_menuItem.CompareStrings("abcd","abc"));
    }

    @Test
    void palindromeCheck() throws ValidationException {
        _menuItem.PalindromeCheck("abc","cba");
    }

    @Test
    void NotPalindromeStrings() {
        assertThrows(ValidationException.class , ()->_menuItem.PalindromeCheck("abc","abc"));
    }

    @Test
    void modifiedStrings() throws ValidationException {
        _menuItem.ModifiedStrings(" Ab c ","ab    c");
    }

    @Test
    void NotModifiedStrings() {
        assertThrows(ValidationException.class , ()->_menuItem.ModifiedStrings("ab c","abc"));
    }

    @Test
    void CheckRegular(){
        assertEquals(true, _menuItem.CheckRegular(TaskStrings.PHONE_NUMBER,"+79069197937"));
    }

    @Test
    void specificityCheck() throws ValidationException {
        _menuItem.SpecificityCheck(TaskStrings.PHONE_NUMBER,"+79069197937","PHONE NUMBER");
    }

    @Test
    void NotSpecificityCheck() {
        assertThrows(ValidationException.class , ()->_menuItem.SpecificityCheck(TaskStrings.PHONE_NUMBER,"dsgsdgsd","PHONE NUMBER"));
    }

    @Test
    void checkEmail() throws ValidationException {
        _menuItem.CheckEmail("1@mail.ru");
    }

    @Test
    void checkNotEmail() {
        assertThrows(ValidationException.class , ()->_menuItem.CheckEmail("afgadg"));
    }

    @Test
    void checkNumber() throws ValidationException {
        _menuItem.CheckNumber("+79069197937");
    }

    @Test
    void checkNotNumber() {
        assertThrows(ValidationException.class , ()->_menuItem.CheckNumber("afgadg"));
    }

    @Test
    void checkIP() throws ValidationException {
        _menuItem.CheckIP("109.120.54.177");
    }

    @Test
    void checkNotIP() {
        assertThrows(ValidationException.class , ()->_menuItem.CheckIP("afgadg"));
    }

}