package com.app.admin_1o1.repo;

import java.util.List;

import com.app.admin_1o1.model.RoleModel;

public interface Role {
    public RoleModel updateRole(RoleModel role);
    public RoleModel getRole(String  roleId);

}
