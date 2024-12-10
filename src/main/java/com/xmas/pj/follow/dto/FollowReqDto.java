package com.xmas.pj.follow.dto;

import com.xmas.pj.follow.domain.FollowId;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FollowReqDto {
    private FollowId followId;
}
