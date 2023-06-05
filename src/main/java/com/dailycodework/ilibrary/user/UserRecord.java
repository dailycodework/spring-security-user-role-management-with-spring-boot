package com.dailycodework.ilibrary.user;


import com.dailycodework.ilibrary.role.Role;

import java.util.Set;

public record UserRecord(Long id, String firstName, String lastName, String email, Set<Role> roles){}
