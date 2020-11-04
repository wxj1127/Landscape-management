package com.dao;

import com.entity.QuyuguanlirenyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QuyuguanlirenyuanVO;
import com.entity.view.QuyuguanlirenyuanView;


/**
 * 区域管理人员
 * 
 * @author 
 * @email 
 * @date 2020-10-22 19:38:19
 */
public interface QuyuguanlirenyuanDao extends BaseMapper<QuyuguanlirenyuanEntity> {
	
	List<QuyuguanlirenyuanVO> selectListVO(@Param("ew") Wrapper<QuyuguanlirenyuanEntity> wrapper);
	
	QuyuguanlirenyuanVO selectVO(@Param("ew") Wrapper<QuyuguanlirenyuanEntity> wrapper);
	
	List<QuyuguanlirenyuanView> selectListView(@Param("ew") Wrapper<QuyuguanlirenyuanEntity> wrapper);

	List<QuyuguanlirenyuanView> selectListView(Pagination page,@Param("ew") Wrapper<QuyuguanlirenyuanEntity> wrapper);
	
	QuyuguanlirenyuanView selectView(@Param("ew") Wrapper<QuyuguanlirenyuanEntity> wrapper);
	
}
