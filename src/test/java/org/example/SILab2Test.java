package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    SILab2 siLab2 = new SILab2();
    @Test
    void multipleConditionTest(){
        User user = new User("Name", "Pass", "email@gmail.com");
        assertEquals(false, siLab2.function(user, new ArrayList<>()));

        user = new User("Name", "Pass", null);
        assertEquals(false, siLab2.function(user, new ArrayList<>()));

        user = new User("Name", null, "email@gmail.com");
        assertEquals(false, siLab2.function(user, new ArrayList<>()));

        user = new User("Name", null, null);
        assertEquals(false, siLab2.function(user, new ArrayList<>()));

        user = new User(null, "Pass", "email@gmail.com");
        assertEquals(false, siLab2.function(user, new ArrayList<>()));

        user = new User(null, "Pass", null);
        assertEquals(false, siLab2.function(user, new ArrayList<>()));

        user = new User(null, null, "email@gmail.com");
        assertEquals(false, siLab2.function(user, new ArrayList<>()));

        user = new User(null, null, null);
        assertEquals(false, siLab2.function(user, new ArrayList<>()));
    }

    @Test
    void everyBranchTest(){
        // First condition
        User user = null;
        User finalUser = user;
        assertThrows(RuntimeException.class, () -> siLab2.function(finalUser, new ArrayList<>()));

        // Second condition
        user = new User(null, "pass", "email@gmail.com");
        assertEquals(false, siLab2.function(user, new ArrayList<>()));


        // Third condition
        assertEquals(false, siLab2.function(user, new ArrayList<>()));
    }

}