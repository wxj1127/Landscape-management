package com.dao;

import com.entity.RenwufabuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.RenwufabuVO;
import com.entity.view.RenwufabuView;


/**
 * 任务发布
 * 
 * @author 
 * @email 
 * @date 2020-10-22 19:38:19
 */
public interface RenwufabuDao extends BaseMapper<RenwufabuEntity> {
	
	List<RenwufabuVO> selectListVO(@Param("ew") Wrapper<RenwufabuEntity> wrapper);
	
	RenwufabuVO selectVO(@Param("ew") Wrapper<RenwufabuEntity> wrapper);
	
	List<RenwufabuView> selectListView(@Param("ew") Wrapper<RenwufabuEntity> wrapper);

	List<RenwufabuView> selectListView(Pagination page,@Param("ew") Wrapper<RenwufabuEntity> wrapper);
	
	RenwufabuView selectView(@Param("ew") Wrapper<RenwufabuEntity> wrapper);
	
}
