package com.sky.mapper;

import com.sky.entity.SetmealDish;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SetmealDishMapper {

    /**
     * 根据菜品id查询对应的套餐id
     * @param dishIds
     * @return
     */
    List<Long> getSetmealIdsByDishIds(List<Long> dishIds);

    void insertBatch(List<SetmealDish> setmealDishes);

    void deleteBetch(List<Long> setmealids);

    @Select("select * from setmeal_dish where setmeal_id = #{setmealid}")
    List<SetmealDish> getBySetmealId(Long setmealid);

    @Delete("delete from setmeal_dish where setmeal_id = #{setmealDishId}")
    void deleteById(Long setmealDishId);
}
