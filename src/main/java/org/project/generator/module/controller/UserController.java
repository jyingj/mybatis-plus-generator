package org.project.generator.module.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.project.generator.module.vo.VQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

import org.project.generator.module.entity.User;
import org.project.generator.module.service.UserService;

/**
* UserController
* @Author jyj
* @Date 2020-04-26
**/
@Api(description = "User Controller")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private  UserService userService;

    /**
    * 新增
    *
    * @param user
    */
    @ApiOperation(value = "add", notes = "")
    @PostMapping("/add")
    public void add(@RequestBody User user) {
        userService.save(user);
    }

    /**
    * 删除
    *
    * @param ids
    */
    @ApiOperation(value = "delete", notes = "")
    @GetMapping("/delete")
    public void delete(@RequestParam("ids") Long... ids) {
        userService.removeByIds(Arrays.asList(ids));
    }

    /**
    * 更新
    *
    * @param user
    */
    @ApiOperation(value = "update", notes = "")
    @PostMapping("/update")
    public void update(@RequestBody User user) {
        userService.updateById(user);
    }

    /**
    * 详情
    *
    * @param id
    * @return
    */
    @ApiOperation(value = "detail", notes = "")
    @GetMapping("/detail")
    public User detail(@RequestParam("id") Long id) {
        return userService.getById(id);
    }

    /**
    * 分页
    *
    * @param query
    * @return
    */
    @ApiOperation(value = "page", notes = "")
    @PostMapping("/page")
    public IPage<User> userList(@RequestBody(required = false) VQuery query) {
        return userService.page(query);
    }

}