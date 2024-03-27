package org.example.repositories.piece;

import org.example.model.Piece;

import java.util.ArrayList;
import java.util.List;

public class PieceRepositoryImpl implements PieceRepository {

    private List<Piece> pieces = new ArrayList<>();

    @Override
    public void save(Piece piece) {
        pieces.add(piece);
    }

    @Override
    public void update(Piece piece) {
        for (Piece p : pieces) {
            if (p.getId() == piece.getId()) {
                p.setName(piece.getName());
                p.setCar(piece.getCar());
                p.setPrice(piece.getPrice());
            }
        }
    }

    @Override
    public List<Piece> findAll() {
        return pieces;
    }
}
