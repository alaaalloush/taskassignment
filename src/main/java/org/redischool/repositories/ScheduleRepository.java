package org.redischool.repositories;

import org.redischool.models.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public abstract class ScheduleRepository implements JpaRepository<Schedule, UUID> {
}
