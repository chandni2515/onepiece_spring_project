package com.example.springproject.repository;

import com.example.springproject.model.OnePiece;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OnePieceRepository extends R2dbcRepository<OnePiece,Long> {
}
