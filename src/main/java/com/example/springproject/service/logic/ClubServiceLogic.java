package com.example.springproject.service.logic;

import com.example.springproject.aggregate.club.TravelClub;
import com.example.springproject.service.ClubService;
import com.example.springproject.service.sdo.TravelClubCdo;
import com.example.springproject.shared.NameValueList;
import com.example.springproject.store.ClubStore;
import com.example.springproject.store.mapstore.ClubMapStore;
import io.namoosori.travelclub.spring.util.exception.NoSuchClubException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClubServiceLogic implements ClubService {
    @Autowired
    private ClubStore clubStore;

    @Override
    public String registerClub(TravelClubCdo club) {
        TravelClub newClub = new TravelClub(club.getName(), club.getIntro());
        newClub.checkValidation();
        return clubStore.create(newClub);
    }

    @Override
    public TravelClub findClubById(String id) {
        return clubStore.retrieve(id);
    }

    @Override
    public List<TravelClub> findClubsByName(String name) {
        return clubStore.retrieveByName(name);
    }

    @Override
    public void modify(String clubId, NameValueList nameValues) {
        TravelClub foundedClub = clubStore.retrieve(clubId);
        if(foundedClub == null){
            throw new NoSuchClubException("No such club with id : " + clubId);
        }
        foundedClub.modifiyValues(nameValues);
        clubStore.update(foundedClub);
    }

    @Override
    public void remove(String clubId) {
        if(!clubStore.exists(clubId)){
            throw new NoSuchClubException("No such club with id : " + clubId);

        }
        clubStore.delete(clubId);
    }
}
