package com.example.springproject.store;

import com.example.springproject.aggregate.club.TravelClub;

import java.util.List;

public interface ClubStore {
    String create(TravelClub club);
    TravelClub retrieve(String clubId);
    List<TravelClub> retrieveByName(String name);
    void update(TravelClub club);
    void delete(String clubId);

    boolean exists(String clubId);
}
