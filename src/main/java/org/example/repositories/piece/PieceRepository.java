package org.example.repositories.piece;

import org.example.model.Piece;

import java.util.List;

public interface PieceRepository {

    void save(Piece piece);
    void update(Piece piece);
    List<Piece> findAll();
}
