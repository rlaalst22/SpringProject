package com.example.springproject.service.logic;

import com.example.springproject.aggregate.club.CommunityMember;
import com.example.springproject.service.MemberService;
import com.example.springproject.service.sdo.MemberCdo;
import com.example.springproject.shared.NameValueList;
import com.example.springproject.store.MemberStore;
import io.namoosori.travelclub.spring.util.exception.MemberDuplicationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceLogic implements MemberService {
    private MemberStore memberStore;

    public MemberServiceLogic(MemberStore memberStore) {
        this.memberStore = memberStore;
    }

    @Override
    public String registerMember(MemberCdo member) {
        String email = member.getEmail();
        CommunityMember foundedMember = memberStore.retrieveByEmail(email);

        if (foundedMember != null){
            throw new MemberDuplicationException("Member already exist");
        }
        return null;
    }

    @Override
    public CommunityMember findMemberById(String memberId) {
        return null;
    }

    @Override
    public CommunityMember findMemberByEmail(String memberEmail) {
        return null;
    }

    @Override
    public List<CommunityMember> findMembersByName(String name) {
        return null;
    }

    @Override
    public void modifyMember(String memberId, NameValueList member) {

    }

    @Override
    public void removeMember(String memberId) {

    }
}
