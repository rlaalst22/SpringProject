package com.example.springproject.service;

import com.example.springproject.aggregate.club.CommunityMember;
import com.example.springproject.service.sdo.MemberCdo;
import com.example.springproject.shared.NameValueList;

import java.util.List;

public interface MemberService {
    //
    String registerMember(MemberCdo member);
    CommunityMember findMemberById(String memberId);
    CommunityMember findMemberByEmail(String memberEmail);
    List<CommunityMember> findMembersByName(String name);
    void modifyMember(String memberId, NameValueList member);
    void removeMember(String memberId);
}
