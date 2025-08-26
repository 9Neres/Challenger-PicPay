package com.picpaychallenger.repositories;

import com.picpaychallenger.domain.user.transection.Transection;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransectionRepository extends JpaRepository<Transection, Long> {
}
