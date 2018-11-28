package com.cg.SharePrice.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.cg.SharePrice.dto.SharePrice;

@Repository
public class SharePricedaoImpl implements SharePricedao{
	
	@PersistenceContext
	EntityManager manager;
	public EntityManager getManager() {
		return manager;
	}
	public void setManager(EntityManager manager) {
		this.manager = manager;
	}
	@Override
	public List<SharePrice> getAll() {
		System.out.println("In dao1");
		String str  = "select price from SharePrice price";
		TypedQuery<SharePrice> query = manager.createQuery(str,SharePrice.class);
		System.out.println("In dao2");
		return query.getResultList();
	}

}
