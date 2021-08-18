package com.bill.springboot01.service.impl;

import com.bill.springboot01.bean.TblVod;
import com.bill.springboot01.mapper.TblVodMapper;
import com.bill.springboot01.service.TblVodService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 视频点播 服务实现类
 * </p>
 *
 * @author lian
 * @since 2021-08-03
 */
@Service
public class TblVodServiceImpl extends ServiceImpl<TblVodMapper, TblVod> implements TblVodService {

}
