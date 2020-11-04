package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhibeixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhibeixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhibeixinxiView;


/**
 * 植被信息
 *
 * @author 
 * @email 
 * @date 2020-10-22 19:38:19
 */
public interface ZhibeixinxiService extends IService<ZhibeixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhibeixinxiVO> selectListVO(Wrapper<ZhibeixinxiEntity> wrapper);
   	
   	ZhibeixinxiVO selectVO(@Param("ew") Wrapper<ZhibeixinxiEntity> wrapper);
   	
   	List<ZhibeixinxiView> selectListView(Wrapper<ZhibeixinxiEntity> wrapper);
   	
   	ZhibeixinxiView selectView(@Param("ew") Wrapper<ZhibeixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhibeixinxiEntity> wrapper);
   	
}

