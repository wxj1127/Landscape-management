package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.YuanlinrenwuDao;
import com.entity.YuanlinrenwuEntity;
import com.service.YuanlinrenwuService;
import com.entity.vo.YuanlinrenwuVO;
import com.entity.view.YuanlinrenwuView;

@Service("yuanlinrenwuService")
public class YuanlinrenwuServiceImpl extends ServiceImpl<YuanlinrenwuDao, YuanlinrenwuEntity> implements YuanlinrenwuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YuanlinrenwuEntity> page = this.selectPage(
                new Query<YuanlinrenwuEntity>(params).getPage(),
                new EntityWrapper<YuanlinrenwuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YuanlinrenwuEntity> wrapper) {
		  Page<YuanlinrenwuView> page =new Query<YuanlinrenwuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YuanlinrenwuVO> selectListVO(Wrapper<YuanlinrenwuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YuanlinrenwuVO selectVO(Wrapper<YuanlinrenwuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YuanlinrenwuView> selectListView(Wrapper<YuanlinrenwuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YuanlinrenwuView selectView(Wrapper<YuanlinrenwuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
