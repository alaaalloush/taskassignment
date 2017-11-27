package org.redischool.models;

import java.util.Set;
import java.util.UUID;

public class Task {

    private UUID id;

    private String title;
    private Priority priority;
    private Set<Language> languages;

}
