package com.example.johnk.highschoolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.database.DatabaseReference;

public class UserSetup extends AppCompatActivity {

    private DatabaseReference mDataBase;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_setup);
    }

    private void createUser(String username, String email, String password, String location){

        mDataBase.child("users").child(username).child("email").setValue(email);
        mDataBase.child("users").child(username).child("location").setValue(location);
        mDataBase.child("users").child(username).child("password").setValue(password);
    }


}


