package com.TaiKang.permission.system.service;
import com.TaiKang.permission.system.bean.RoleInfo;

import java.util.List;

public interface RoleInfoService {


    List<RoleInfo> getRolesByUserId(int userId);
}
