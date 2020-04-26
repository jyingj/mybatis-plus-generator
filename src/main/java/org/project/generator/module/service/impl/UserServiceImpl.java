package org.project.generator.module.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.project.generator.module.vo.VQuery;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import org.project.generator.module.service.UserService;
import org.project.generator.module.mapper.UserMapper;
import org.project.generator.module.entity.User;


/**
* UserServiceImpl
* @Author jyj
* @Date 2020-04-26
**/
@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Override
    public IPage<User> page(VQuery query) {
        IPage<User> page = new Page<>();
        Integer pageNum = query.getPageNum();
        Integer pageSize = query.getPageSize();
        page.setCurrent(pageNum == null ? 1 : pageNum);
        page.setSize(pageSize == null ? 10 : pageSize);
        return baseMapper.findByQuery(page, query);
    }

}