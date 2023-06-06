package com.circus.models.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.security.core.GrantedAuthority;

@AllArgsConstructor
@Getter
public enum Role implements GrantedAuthority {
    USER("Клиент"),
    ADMIN("Директор цирка"),
    PUB("Менеджер");

    private final String name;

    @Override
    public String getAuthority() {
        return name();
    }
}
