package com.destcorse.sprig.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.destcorse.sprig.model.Destination;

public interface DestinationRepository extends JpaRepository<Destination, Long> {

	Destination save(Long destination);

}
