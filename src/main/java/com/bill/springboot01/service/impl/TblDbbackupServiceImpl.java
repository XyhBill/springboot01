package com.bill.springboot01.service.impl;

import com.bill.springboot01.bean.TblDbbackup;
import com.bill.springboot01.mapper.TblDbbackupMapper;
import com.bill.springboot01.service.TblDbbackupService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 数据库备份 服务实现类
 * </p>
 *
 * @author lian
 * @since 2021-08-03
 */
@Service
public class TblDbbackupServiceImpl extends ServiceImpl<TblDbbackupMapper, TblDbbackup> implements TblDbbackupService {

}
