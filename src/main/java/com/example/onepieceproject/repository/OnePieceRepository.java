package com.example.onepieceproject.repository;

import com.example.onepieceproject.model.OnePiece;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OnePieceRepository extends R2dbcRepository<OnePiece,Long> {
}
