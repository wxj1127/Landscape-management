package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RenwufabuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.RenwufabuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.RenwufabuView;


/**
 * 任务发布
 *
 * @author 
 * @email 
 * @date 2020-10-22 19:38:19
 */
public interface RenwufabuService extends IService<RenwufabuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RenwufabuVO> selectListVO(Wrapper<RenwufabuEntity> wrapper);
   	
   	RenwufabuVO selectVO(@Param("ew") Wrapper<RenwufabuEntity> wrapper);
   	
   	List<RenwufabuView> selectListView(Wrapper<RenwufabuEntity> wrapper);
   	
   	RenwufabuView selectView(@Param("ew") Wrapper<RenwufabuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RenwufabuEntity> wrapper);
   	
}

