package org.redischool.services;

import java.util.UUID;

public abstract class AbstractService {

    public UUID generateId() {
        return UUID.randomUUID();
    }
}
