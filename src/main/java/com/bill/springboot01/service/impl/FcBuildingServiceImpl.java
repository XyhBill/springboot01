package com.bill.springboot01.service.impl;

import com.bill.springboot01.bean.FcBuilding;
import com.bill.springboot01.mapper.FcBuildingMapper;
import com.bill.springboot01.service.FcBuildingService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 楼宇信息表 服务实现类
 * </p>
 *
 * @author lian
 * @since 2021-08-03
 */
@Service
public class FcBuildingServiceImpl extends ServiceImpl<FcBuildingMapper, FcBuilding> implements FcBuildingService {

}
