package com.example.springproject.service;

import com.example.springproject.aggregate.club.TravelClub;
import com.example.springproject.service.sdo.TravelClubCdo;
import com.example.springproject.shared.NameValueList;

import java.util.List;

public interface ClubService {
    //
    String registerClub(TravelClubCdo club);
    TravelClub findClubById(String id);
    List<TravelClub> findClubsByName(String name);
    void modify(String clubId, NameValueList nameValues);
    void remove(String clubId);
}