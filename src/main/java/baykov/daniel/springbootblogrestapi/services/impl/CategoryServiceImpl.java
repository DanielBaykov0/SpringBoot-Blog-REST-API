package baykov.daniel.springbootblogrestapi.services.impl;

import baykov.daniel.springbootblogrestapi.entity.Category;
import baykov.daniel.springbootblogrestapi.payload.CategoryDto;
import baykov.daniel.springbootblogrestapi.repositories.CategoryRepository;
import baykov.daniel.springbootblogrestapi.services.CategoryService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {

    private CategoryRepository categoryRepository;
    private ModelMapper modelMapper;

    public CategoryServiceImpl(CategoryRepository categoryRepository, ModelMapper modelMapper) {
        this.categoryRepository = categoryRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public CategoryDto addCategory(CategoryDto categoryDto) {
        Category category = modelMapper.map(categoryDto, Category.class);
        Category savedCategory = categoryRepository.save(category);
        return modelMapper.map(savedCategory, CategoryDto.class);
    }
}
