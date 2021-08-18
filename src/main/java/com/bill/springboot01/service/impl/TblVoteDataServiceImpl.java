package com.bill.springboot01.service.impl;

import com.bill.springboot01.bean.TblVoteData;
import com.bill.springboot01.mapper.TblVoteDataMapper;
import com.bill.springboot01.service.TblVoteDataService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 投票数据表 服务实现类
 * </p>
 *
 * @author lian
 * @since 2021-08-03
 */
@Service
public class TblVoteDataServiceImpl extends ServiceImpl<TblVoteDataMapper, TblVoteData> implements TblVoteDataService {

}
