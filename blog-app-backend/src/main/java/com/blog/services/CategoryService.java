package com.blog.services;

import java.util.List;

import com.blog.payloads.CategoryDto;

public interface CategoryService {

	public CategoryDto createCategory(CategoryDto categoryDto);

	public CategoryDto updateCategory(CategoryDto categoryDto, int categoryId);

	public void deleteCategory(int categoryId);

	public CategoryDto getCategory(int categoryId);

	public List<CategoryDto> getCategories();

}
