package com.javaChapter2;

import java.time.LocalDateTime;

public class UserEntry {

    private String entryBody;
    private String entryTitle;
    private LocalDateTime entryDateAndTime;// Re-using Java Local date and Time

    public UserEntry(String userEntryTitle,String userEntryBody) {
        this.entryTitle = userEntryTitle;
        entryDateAndTime = LocalDateTime.now();
        this.entryBody = userEntryBody;
    }

    public UserEntry(String userEntryTitle) {
        this.entryTitle = userEntryTitle;
        entryDateAndTime = LocalDateTime.now();
    }


    public String getEntryTitle() {
        return entryTitle;
    }

    public LocalDateTime getEntryDateAndTime(){
        return entryDateAndTime;
    }

    public void updateEntryTitle(String newEntryTitle) {
        entryTitle = newEntryTitle;
    }

    public String getEntryBody() {
        return entryBody;
    }

    public void updateEntryBody(String new_user_body) {
        entryBody = new_user_body;
    }
}
