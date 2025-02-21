package myDairy.Application.mydairy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import myDairy.Application.mydairy.entity.Entry;

public interface EntryRepository extends JpaRepository<Entry, Integer>{

}
