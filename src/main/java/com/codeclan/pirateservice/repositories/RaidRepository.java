package com.codeclan.pirateservice.repositories;

import com.codeclan.pirateservice.models.Raid;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RaidRepository extends JpaRepository<Raid , Long> {

}
