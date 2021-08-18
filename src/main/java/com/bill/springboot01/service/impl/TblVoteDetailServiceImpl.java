package com.bill.springboot01.service.impl;

import com.bill.springboot01.bean.TblVoteDetail;
import com.bill.springboot01.mapper.TblVoteDetailMapper;
import com.bill.springboot01.service.TblVoteDetailService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 投票数据明细表 服务实现类
 * </p>
 *
 * @author lian
 * @since 2021-08-03
 */
@Service
public class TblVoteDetailServiceImpl extends ServiceImpl<TblVoteDetailMapper, TblVoteDetail> implements TblVoteDetailService {

}
