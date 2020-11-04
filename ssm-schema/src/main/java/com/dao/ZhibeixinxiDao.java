package com.dao;

import com.entity.ZhibeixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhibeixinxiVO;
import com.entity.view.ZhibeixinxiView;


/**
 * 植被信息
 * 
 * @author 
 * @email 
 * @date 2020-10-22 19:38:19
 */
public interface ZhibeixinxiDao extends BaseMapper<ZhibeixinxiEntity> {
	
	List<ZhibeixinxiVO> selectListVO(@Param("ew") Wrapper<ZhibeixinxiEntity> wrapper);
	
	ZhibeixinxiVO selectVO(@Param("ew") Wrapper<ZhibeixinxiEntity> wrapper);
	
	List<ZhibeixinxiView> selectListView(@Param("ew") Wrapper<ZhibeixinxiEntity> wrapper);

	List<ZhibeixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ZhibeixinxiEntity> wrapper);
	
	ZhibeixinxiView selectView(@Param("ew") Wrapper<ZhibeixinxiEntity> wrapper);
	
}
