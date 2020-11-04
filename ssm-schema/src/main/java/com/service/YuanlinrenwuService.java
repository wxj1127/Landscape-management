package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YuanlinrenwuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YuanlinrenwuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YuanlinrenwuView;


/**
 * 园林任务
 *
 * @author 
 * @email 
 * @date 2020-10-22 19:38:19
 */
public interface YuanlinrenwuService extends IService<YuanlinrenwuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuanlinrenwuVO> selectListVO(Wrapper<YuanlinrenwuEntity> wrapper);
   	
   	YuanlinrenwuVO selectVO(@Param("ew") Wrapper<YuanlinrenwuEntity> wrapper);
   	
   	List<YuanlinrenwuView> selectListView(Wrapper<YuanlinrenwuEntity> wrapper);
   	
   	YuanlinrenwuView selectView(@Param("ew") Wrapper<YuanlinrenwuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YuanlinrenwuEntity> wrapper);
   	
}

