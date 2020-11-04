package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QuyuguanlirenyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QuyuguanlirenyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QuyuguanlirenyuanView;


/**
 * 区域管理人员
 *
 * @author 
 * @email 
 * @date 2020-10-22 19:38:19
 */
public interface QuyuguanlirenyuanService extends IService<QuyuguanlirenyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QuyuguanlirenyuanVO> selectListVO(Wrapper<QuyuguanlirenyuanEntity> wrapper);
   	
   	QuyuguanlirenyuanVO selectVO(@Param("ew") Wrapper<QuyuguanlirenyuanEntity> wrapper);
   	
   	List<QuyuguanlirenyuanView> selectListView(Wrapper<QuyuguanlirenyuanEntity> wrapper);
   	
   	QuyuguanlirenyuanView selectView(@Param("ew") Wrapper<QuyuguanlirenyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QuyuguanlirenyuanEntity> wrapper);
   	
}

