package org.project.generator.module.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import org.project.generator.module.vo.VQuery;
import org.project.generator.module.entity.User;

/**
* UserService
* @Author jyj
* @Date 2020-04-26
**/
public interface UserService extends IService<User> {

    IPage<User> page(VQuery query);

}
