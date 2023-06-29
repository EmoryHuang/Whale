package org.huang.whale.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.huang.whale.bean.Category;

import java.util.List;

/**
 * create category mapper interface
 *
 * @author Boyi Huang
 * @version 1.0.0
 */
@Mapper
public interface CategoryMapper {

    List<Category> getAllCategories();

    int deleteCategoryByIds(@Param("ids") String[] ids);

    int updateCategoryById(Category category);

    int addCategory(Category category);
}
