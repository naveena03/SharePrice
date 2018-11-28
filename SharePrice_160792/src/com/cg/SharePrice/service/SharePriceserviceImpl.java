package com.cg.SharePrice.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.SharePrice.dao.SharePricedao;
import com.cg.SharePrice.dto.SharePrice;

@Service
@Transactional
public class SharePriceserviceImpl implements SharePriceservice{

	@Autowired
	SharePricedao dao;

	@Override
	public List<SharePrice> getAll() {
		// TODO Auto-generated method stub
		System.out.println("In service class");
		return dao.getAll();
	}
}
