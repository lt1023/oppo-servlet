package com.heytap.cdo.card.domain.dto.entity;

import com.heytap.cdo.card.domain.dto.CardDto;
import io.protostuff.Tag;
import java.util.List;

public class ViewFoot {
    @Tag(1)
    List<CardDto> cards;

    public List<CardDto> getCards() {
        return this.cards;
    }

    public void setCards(List<CardDto> cards) {
        this.cards = cards;
    }
}