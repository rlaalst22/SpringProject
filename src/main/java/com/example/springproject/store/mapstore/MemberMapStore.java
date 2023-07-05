package com.example.springproject.store.mapstore;

import com.example.springproject.aggregate.club.CommunityMember;
import com.example.springproject.store.MemberStore;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MemberMapStore implements MemberStore {
    @Override
    public String create(CommunityMember member) {
        return null;
    }

    @Override
    public CommunityMember retrieve(String memberId) {
        return null;
    }

    @Override
    public CommunityMember retrieveByEmail(String email) {
        return null;
    }

    @Override
    public List<CommunityMember> retrieveByNames(String name) {
        return null;
    }

    @Override
    public void update(CommunityMember member) {

    }

    @Override
    public void delete(String email) {

    }

    @Override
    public boolean exists(String memberId) {
        return false;
    }
}
