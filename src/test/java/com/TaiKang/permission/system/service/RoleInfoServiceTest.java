package com.TaiKang.permission.system.service;

import com.TaiKang.permission.ShiroProjectApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;


@SpringBootTest(classes = ShiroProjectApplication.class)
@RunWith(SpringRunner.class)
public class RoleInfoServiceTest {

    @Autowired
    RoleInfoService roleInfoService;

    @Test
    public void addRole() {
    }

    @Test
    public void delRole() {
    }

    @Test
    public void updateRole() {
    }

    @Test
    public void getAll() {
    }

    @Test
    public void getOne() {
    }

    @Test
    public void getRoleListByUserId() {
    }

    @Test
    public void getRoleNames() {
        List<String> roleNames = roleInfoService.getRoleNames(12);
        System.err.println(roleNames);

    }
}