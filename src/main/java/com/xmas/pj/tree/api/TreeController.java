package com.xmas.pj.tree.api;

import com.xmas.pj.tree.service.TreeServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class TreeController {
    private final TreeServiceImpl treeService;

    public TreeController(TreeServiceImpl treeService) {
        this.treeService = treeService;
    }
}
