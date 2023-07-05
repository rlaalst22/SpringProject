package com.example.springproject.store;

import com.example.springproject.aggregate.club.CommunityMember;

import java.util.List;

public interface MemberStore {
    String create(CommunityMember member);
    CommunityMember retrieve(String memberId);
    CommunityMember retrieveByEmail(String email);
    List<CommunityMember> retrieveByNames(String name);
    void update(CommunityMember member);
    void delete(String email);

    boolean exists(String memberId);
}
