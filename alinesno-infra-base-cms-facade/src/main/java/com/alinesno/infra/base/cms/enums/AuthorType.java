package com.alinesno.infra.base.cms.enums;

import lombok.Getter;

@Getter
public enum AuthorType {
    // agent/person

    AGENT("agent" , "智能体"),
    PERSON("person" , "人类");

    private final String type;
    private final String desc;

    AuthorType(String type, String desc) {
        this.type = type;
        this.desc = desc;
    }

}
