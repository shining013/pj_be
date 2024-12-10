package com.xmas.pj.follow.dao;
import com.xmas.pj.follow.domain.Follow;
import com.xmas.pj.follow.dto.FollowResDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FollowRepository extends JpaRepository<Follow, Long> {

}
