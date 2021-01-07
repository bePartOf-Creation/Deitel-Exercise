package com.javaChapter2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class UserEntryTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void  UserEntry_hasTitleAfterConstruction(){
        //given
        UserEntry userEntry;
        //when
        userEntry = new UserEntry("My First Entry");
        //assert
        String entryTitle =  userEntry.getEntryTitle();
        assertEquals("My First Entry",entryTitle);
    }

    @Test
    void userEntryHasDateAndTimeOfEntryAfterConstruction(){
        //given
        UserEntry userEntry;
        //when
        userEntry = new UserEntry("My First Entry");
        //assert
        assertNotNull(userEntry.getEntryDateAndTime());
    }

    @Test
    void dateAndTimeOfEntry_isCurrentAfterEntryCreation(){
        //given
        UserEntry userEntry = new UserEntry("New User Entry");
        //when
        LocalDateTime entryDateAndTime = userEntry.getEntryDateAndTime();
        /* Test The Date user create a new Entry is equal to */
        LocalDate entryDate = entryDateAndTime.toLocalDate();
        /*To the CurrentDate on the User's Device when User Creates a new entry */
        LocalDate currentDate = LocalDate.now();
        //assert
        assertEquals(currentDate,entryDate);
    }

    @Test
    void userEntryTitle_canBeUpdated(){
        //given
        UserEntry userEntry = new UserEntry("Old Entry Title");
        //when
        userEntry.updateEntryTitle("New Entry Title");
        //assert
        String entryTitle = userEntry.getEntryTitle();
        assertEquals("New Entry Title",entryTitle);
    }

    @Test
    void userEntryBody_notNUll() {
        //given
        UserEntry userEntry;
        //when
        userEntry = new UserEntry("New Entry Title");
        userEntry.updateEntryBody("New User Body");
        //assert
        assertNotNull(userEntry.getEntryBody());
    }

    @Test
    void userEntryBody_CanBeUpdated(){
        //given
        UserEntry userEntry = new UserEntry("New Entry Title");
        //when
        userEntry.updateEntryBody("My New Story");
        String entryBody = userEntry.getEntryBody();
        //assert
        assertEquals("My New Story", entryBody);
    }





}