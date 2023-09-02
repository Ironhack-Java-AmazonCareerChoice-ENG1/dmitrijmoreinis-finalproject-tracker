package com.activitytracker.EquipmentTracker.repository;

import com.activitytracker.EquipmentTracker.model.RunningShoe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RunningShoeRepository extends JpaRepository<RunningShoe, Integer> {
}
