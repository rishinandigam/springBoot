package myDairy.Application.mydairy.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myDairy.Application.mydairy.entity.Entry;
import myDairy.Application.mydairy.repository.EntryRepository;

@Service
public class EntryService {

	@Autowired
	EntryRepository entryRepository;
	
	public Entry  addEntry(Entry entry)
	{
		return entryRepository.save(entry);
	}
	
	
	public Entry updateEntry(Entry entry)
	
	{
		return entryRepository.save(entry);
		
	}
	
	public void deleteEntry(Integer id)
	
	{
		entryRepository.deleteById(id);
	
	}
	
	public Optional<Entry> findById(Integer id)
	{
		return entryRepository.findById(id);
		
		
	}
	
	public List<Entry> findAll()
	{
		return entryRepository.findAll();
	}
	
}

