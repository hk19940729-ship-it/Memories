package com.Entities;
import jakarta.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class AnyCodeKey {
    private String codeKbn;
    private String code;
}
