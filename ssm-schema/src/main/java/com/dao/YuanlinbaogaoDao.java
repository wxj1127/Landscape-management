package com.dao;

import com.entity.YuanlinbaogaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YuanlinbaogaoVO;
import com.entity.view.YuanlinbaogaoView;


/**
 * 园林报告
 * 
 * @author 
 * @email 
 * @date 2020-10-22 19:38:19
 */
public interface YuanlinbaogaoDao extends BaseMapper<YuanlinbaogaoEntity> {
	
	List<YuanlinbaogaoVO> selectListVO(@Param("ew") Wrapper<YuanlinbaogaoEntity> wrapper);
	
	YuanlinbaogaoVO selectVO(@Param("ew") Wrapper<YuanlinbaogaoEntity> wrapper);
	
	List<YuanlinbaogaoView> selectListView(@Param("ew") Wrapper<YuanlinbaogaoEntity> wrapper);

	List<YuanlinbaogaoView> selectListView(Pagination page,@Param("ew") Wrapper<YuanlinbaogaoEntity> wrapper);
	
	YuanlinbaogaoView selectView(@Param("ew") Wrapper<YuanlinbaogaoEntity> wrapper);
	
}
