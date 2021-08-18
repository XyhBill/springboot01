package com.bill.springboot01.service.impl;

import com.bill.springboot01.bean.WyCommunityEvent;
import com.bill.springboot01.mapper.WyCommunityEventMapper;
import com.bill.springboot01.service.WyCommunityEventService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 社区活动 服务实现类
 * </p>
 *
 * @author lian
 * @since 2021-08-03
 */
@Service
public class WyCommunityEventServiceImpl extends ServiceImpl<WyCommunityEventMapper, WyCommunityEvent> implements WyCommunityEventService {

}
