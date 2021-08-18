package com.bill.springboot01.service.impl;

import com.bill.springboot01.bean.TblDate;
import com.bill.springboot01.mapper.TblDateMapper;
import com.bill.springboot01.service.TblDateService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 工作日期 服务实现类
 * </p>
 *
 * @author lian
 * @since 2021-08-03
 */
@Service
public class TblDateServiceImpl extends ServiceImpl<TblDateMapper, TblDate> implements TblDateService {

}
