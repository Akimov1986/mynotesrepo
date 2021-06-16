package com.example.mynotes.domain;

import android.provider.ContactsContract;

import com.example.mynotes.R;

import java.util.ArrayList;
import java.util.List;

public class NotesRepositoryImpl implements NotesRepository {
    @Override
    public List<Notes> getNotes() {
        ArrayList<Notes> result = new ArrayList<>();

        result.add(new Notes(R.string.birthday,R.string.stas_birth,R.dimen.));

        return result;
    }
}
