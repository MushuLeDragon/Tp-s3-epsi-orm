package net.joastbg.sampleapp.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.joastbg.sampleapp.entities.Disk;

@Service
@Transactional
public class DiskDao {

	@Autowired
	SessionFactory sessionFactory;
	
	public Long persist(Disk disk){
		Session session = sessionFactory.getCurrentSession();
		return null;
	}
	
	public Disk find(Long id){
		Session session = sessionFactory.getCurrentSession();
		return null;
	}
}
