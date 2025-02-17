package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.model.Product;
import com.repo.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repo;

	public List<Product> getAllRecords() {

		return repo.findAll();
	}

	public List<Product> getFirstPage() {

		PageRequest req = PageRequest.of(0, 10);

		Page<Product> page = repo.findAll(req);
		return page.toList();
	}

	public List<Product> getSecondPage() {
		PageRequest req = PageRequest.of(1, 10);

		Page<Product> page = repo.findAll(req);
		return page.toList();
	}

	public List<Product> lowToHigh() {
		PageRequest req = PageRequest.of(0, 100, Sort.by("pprice"));
		//PageRequest req = PageRequest.of(0, 100, Sort.by("pprice").descending());
		Page<Product> page = repo.findAll(req);
		return page.toList();
	}

	public List<Product> getProductByName(String text) {
		
	
		return repo.findByPname(text);
	}

	public long CountRecords() {
		return repo.count();
	}

}