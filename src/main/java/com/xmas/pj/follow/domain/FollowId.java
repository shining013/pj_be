package com.xmas.pj.follow.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class FollowId implements Serializable {

    @Column(name = "toUser_id")
    private Long toUser;

    @Column(name = "fromUser_id")
    private Long fromUser;
}
