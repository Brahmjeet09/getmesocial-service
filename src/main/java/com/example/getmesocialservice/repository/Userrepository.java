package com.example.getmesocialservice.repository;

import com.example.getmesocialservice.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class Userrepository
{
    public User getUser()
    {
        User user=new User("Brahmjeet","Brampton",27,"java.jpg");
        return user;
    }
}
