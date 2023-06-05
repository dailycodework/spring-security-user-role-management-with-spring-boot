package com.dailycodework.ilibrary.role;

import com.dailycodework.ilibrary.user.User;

import java.util.List;

/**
 * @author Simpson Alfred
 */

public interface IRoleService {
    List<Role> getAllRoles();
    Role createRole(Role theRole);
    void deleteRole(Long roleId);
    Role findByName(String name);
    Role findById(Long roelId);
    User removeUserFromRole(Long userId, Long roleId);
    User assignUerToRole(Long userId, Long roleId);
    Role removeAllUserFromRole(Long roleId);
}
