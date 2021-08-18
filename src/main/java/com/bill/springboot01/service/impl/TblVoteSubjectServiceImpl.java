package com.bill.springboot01.service.impl;

import com.bill.springboot01.bean.TblVoteSubject;
import com.bill.springboot01.mapper.TblVoteSubjectMapper;
import com.bill.springboot01.service.TblVoteSubjectService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 投票题目表 服务实现类
 * </p>
 *
 * @author lian
 * @since 2021-08-03
 */
@Service
public class TblVoteSubjectServiceImpl extends ServiceImpl<TblVoteSubjectMapper, TblVoteSubject> implements TblVoteSubjectService {

}
