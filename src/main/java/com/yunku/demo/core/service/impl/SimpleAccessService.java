package com.yunku.demo.core.service.impl;

import com.yunku.demo.core.dao.AccessMapper;
import com.yunku.demo.core.service.AccessService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Jeddden
 * @create 2019-08-18 16:00
 */
@Service
public class SimpleAccessService implements AccessService {
    @Resource
    AccessMapper accessMapper;

    @Cacheable(value = "loginAuth", key = "#root.targetClass", unless = "#result eq null")
    @Override
    public List<Long> getLoginAccess() {
        return accessMapper.getAllIdentifier(9342L);
    }
}
