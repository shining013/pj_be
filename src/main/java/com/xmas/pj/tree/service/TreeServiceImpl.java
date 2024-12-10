package com.xmas.pj.tree.service;

import com.xmas.pj.tree.domain.Tree;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TreeServiceImpl implements TreeService{
    @Override
    public Optional<Tree> findOne(Long userId) {
        return Optional.empty();
    }
}
