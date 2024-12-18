package com.alinesno.infra.base.cms.gateway.enums;

import lombok.Getter;

@Getter
public enum CardType {

    article("article"),
    audio("audio"),
    video("video"),
    image("image");

    private final String value;

    CardType(String value) {
        this.value = value;
    }

    public static CardType fromValue(String value) {
        for (CardType type : values()) {
            if (type.getValue().equals(value)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Invalid card type: " + value);
    }
}