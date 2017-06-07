package com.gmh.service.impl;

import com.gmh.dao.MemberDao;
import com.gmh.entity.Member;
import com.gmh.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by gmh on 2017/6/7 0007.
 */
@Service

public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberDao memberDao;

    public Member searchMember(Integer id) {
       return  memberDao.getMemberById(id);
    }

}
