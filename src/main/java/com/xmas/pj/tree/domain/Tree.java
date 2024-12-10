package com.xmas.pj.tree.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tree")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Tree {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="tree_id")
    private Long treeId;
}
