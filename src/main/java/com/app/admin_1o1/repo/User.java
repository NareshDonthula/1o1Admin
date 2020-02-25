package com.app.admin_1o1.repo;

import java.util.List;

import com.app.admin_1o1.model.RoleModel;
import com.app.admin_1o1.model.UserModel;

public interface User {
    public UserModel getUser(UserModel user);
    public List<UserModel> getUsersByRoleId(String roleId);
    public UserModel checkUser(String mailId);
    public UserModel updateUser(UserModel userModel);
}
