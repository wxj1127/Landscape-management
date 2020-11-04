package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YuanlinbaogaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YuanlinbaogaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YuanlinbaogaoView;


/**
 * 园林报告
 *
 * @author 
 * @email 
 * @date 2020-10-22 19:38:19
 */
public interface YuanlinbaogaoService extends IService<YuanlinbaogaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuanlinbaogaoVO> selectListVO(Wrapper<YuanlinbaogaoEntity> wrapper);
   	
   	YuanlinbaogaoVO selectVO(@Param("ew") Wrapper<YuanlinbaogaoEntity> wrapper);
   	
   	List<YuanlinbaogaoView> selectListView(Wrapper<YuanlinbaogaoEntity> wrapper);
   	
   	YuanlinbaogaoView selectView(@Param("ew") Wrapper<YuanlinbaogaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YuanlinbaogaoEntity> wrapper);
   	
}

