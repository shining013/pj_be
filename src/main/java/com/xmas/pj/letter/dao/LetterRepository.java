package com.xmas.pj.letter.dao;

import com.xmas.pj.follow.domain.Follow;
import com.xmas.pj.letter.domain.Letter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LetterRepository extends JpaRepository<Letter, Long> {
}
