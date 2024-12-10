package com.xmas.pj.tree.service;

import com.xmas.pj.tree.domain.Tree;
import java.util.Optional;

public interface TreeService {
    Optional<Tree> findOne(Long userId);
}
