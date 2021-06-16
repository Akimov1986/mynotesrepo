package com.example.mynotes.domain;

import androidx.annotation.DimenRes;
import androidx.annotation.StringRes;

public class Notes {




    @StringRes
    private int name;
    private int description;
    @DimenRes
    private int date_of_creation;

    public Notes(int name, int description, int date_of_creation) {
        this.name = name;
        this.description = description;
        this.date_of_creation = date_of_creation;

    }
    public int getName() {
        return name;
    }

    public int getDescription() {
        return description;
    }

    public int getDate_of_creation() {
        return date_of_creation;
    }
}
