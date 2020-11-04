package com.dao;

import com.entity.YuanlinrenwuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YuanlinrenwuVO;
import com.entity.view.YuanlinrenwuView;


/**
 * 园林任务
 * 
 * @author 
 * @email 
 * @date 2020-10-22 19:38:19
 */
public interface YuanlinrenwuDao extends BaseMapper<YuanlinrenwuEntity> {
	
	List<YuanlinrenwuVO> selectListVO(@Param("ew") Wrapper<YuanlinrenwuEntity> wrapper);
	
	YuanlinrenwuVO selectVO(@Param("ew") Wrapper<YuanlinrenwuEntity> wrapper);
	
	List<YuanlinrenwuView> selectListView(@Param("ew") Wrapper<YuanlinrenwuEntity> wrapper);

	List<YuanlinrenwuView> selectListView(Pagination page,@Param("ew") Wrapper<YuanlinrenwuEntity> wrapper);
	
	YuanlinrenwuView selectView(@Param("ew") Wrapper<YuanlinrenwuEntity> wrapper);
	
}
