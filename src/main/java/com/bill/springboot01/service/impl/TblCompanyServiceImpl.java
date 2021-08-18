package com.bill.springboot01.service.impl;

import com.bill.springboot01.bean.TblCompany;
import com.bill.springboot01.mapper.TblCompanyMapper;
import com.bill.springboot01.service.TblCompanyService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 企业档案 服务实现类
 * </p>
 *
 * @author lian
 * @since 2021-08-03
 */
@Service
public class TblCompanyServiceImpl extends ServiceImpl<TblCompanyMapper, TblCompany> implements TblCompanyService {

}
