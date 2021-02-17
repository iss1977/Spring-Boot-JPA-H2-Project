package com.jpa.jpaminiproject.entity.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.jpa.jpaminiproject.entity.User;


/*Short explanation to entityManager.persist()
 * if we say
 *  User jack = new User("Jack","Admin")
 *  entityManager.persist(jack)
 *  
 *  ...
 *  
 *  that means, that the user jack will be saved to the database and also it will be tracked by the entity manager
 * */

// @Repository indicates, that we are interacting with the database
@Repository
//each method will be involved in a transaction
@Transactional
public class UserDAOService {

		@PersistenceContext
		private EntityManager entityManager;
		
		
		public long insert(User user) {
			entityManager.persist(user);
			return user.getId();
		}
}
