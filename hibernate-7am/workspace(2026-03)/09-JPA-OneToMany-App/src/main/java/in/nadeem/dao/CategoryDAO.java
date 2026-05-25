package in.nadeem.dao;

import in.nadeem.entities.CategoryEntity;

public interface CategoryDAO {

	void saveCategory(CategoryEntity categoryEntity);

	CategoryEntity fetchCategory(Integer categoryId);

	void removeCategory(Integer categoryId);
}
