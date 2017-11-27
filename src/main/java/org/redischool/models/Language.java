package org.redischool.models;

import lombok.*;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "LANGUAGE")
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@EqualsAndHashCode(of = {"id"})
@Builder(toBuilder = true)
@Getter
public class Language {

    @Id
    @Column(name = "ID")
    private UUID id;

    @Enumerated(EnumType.STRING)
    @Column(unique = true, nullable = false)
    private LanguageNames languageNames;


}
