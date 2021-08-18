package com.bill.springboot01.service.impl;

import com.bill.springboot01.bean.TblMyplan;
import com.bill.springboot01.mapper.TblMyplanMapper;
import com.bill.springboot01.service.TblMyplanService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 我的日程 服务实现类
 * </p>
 *
 * @author lian
 * @since 2021-08-03
 */
@Service
public class TblMyplanServiceImpl extends ServiceImpl<TblMyplanMapper, TblMyplan> implements TblMyplanService {

}
