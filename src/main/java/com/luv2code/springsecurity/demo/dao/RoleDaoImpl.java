package com.luv2code.springsecurity.demo.dao;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springsecurity.demo.entity.Role;

import jakarta.persistence.EntityManager;

@Repository
public class RoleDaoImpl implements RoleDao {

	private EntityManager entityManager;

	@Autowired
	public RoleDaoImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public Role findRoleByName(String theRoleName) {

		// get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);

		// now retrieve/read from database using name
		Query<Role> theQuery = currentSession.createQuery("from Role where name=:roleName", Role.class);
		theQuery.setParameter("roleName", theRoleName);
		
		Role theRole = null;
		
		try {
			theRole = theQuery.getSingleResult();
		} catch (Exception e) {
			theRole = null;
		}
		
		return theRole;
	}
}
