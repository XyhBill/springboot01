package com.bill.springboot01.service.impl;

import com.bill.springboot01.bean.TblColor;
import com.bill.springboot01.mapper.TblColorMapper;
import com.bill.springboot01.service.TblColorService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 颜色管理 服务实现类
 * </p>
 *
 * @author lian
 * @since 2021-08-03
 */
@Service
public class TblColorServiceImpl extends ServiceImpl<TblColorMapper, TblColor> implements TblColorService {

}
