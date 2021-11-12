package com.mealProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import com.mealProject.mapper.MemberMapper;
import com.mealProject.model.MemberModel;

@Service
@Transactional
public class MemberService {
    @Autowired
    private MemberMapper memberMapper;

    public List<MemberModel> selectAllMember(){
        return memberMapper.findAll();
    }

    public MemberModel selectMemberByName(String name){
        return memberMapper.findByName(name);
    }

}
