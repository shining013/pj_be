package com.xmas.pj.follow.dto;

import com.xmas.pj.follow.domain.FollowId;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FollowResDto {
    private final FollowId followId;
}
