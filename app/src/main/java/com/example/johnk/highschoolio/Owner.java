package com.example.johnk.highschoolio;

public class Owner
{
    private String email, password;
    private Location loc;

    public Owner(String aEmail, String aPassword, Location aLoc)
    {
        aEmail = email;
        aPassword = password;
        aLoc = loc;
    }

    public String getEmail()
    {
        return email;
    }

    public String getPassword()
    {
        return password;
    }

    public Location getLoc()
    {
        return loc;
    }
}
