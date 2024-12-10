package com.xmas.pj.user.service;

import com.xmas.pj.user.domain.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    Long join(User user);
    List<User> findUsers();
    Optional<User> findOne(Long userId);
}
