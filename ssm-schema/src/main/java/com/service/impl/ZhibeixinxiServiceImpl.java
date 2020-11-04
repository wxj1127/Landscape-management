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


import com.dao.ZhibeixinxiDao;
import com.entity.ZhibeixinxiEntity;
import com.service.ZhibeixinxiService;
import com.entity.vo.ZhibeixinxiVO;
import com.entity.view.ZhibeixinxiView;

@Service("zhibeixinxiService")
public class ZhibeixinxiServiceImpl extends ServiceImpl<ZhibeixinxiDao, ZhibeixinxiEntity> implements ZhibeixinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhibeixinxiEntity> page = this.selectPage(
                new Query<ZhibeixinxiEntity>(params).getPage(),
                new EntityWrapper<ZhibeixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhibeixinxiEntity> wrapper) {
		  Page<ZhibeixinxiView> page =new Query<ZhibeixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhibeixinxiVO> selectListVO(Wrapper<ZhibeixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhibeixinxiVO selectVO(Wrapper<ZhibeixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhibeixinxiView> selectListView(Wrapper<ZhibeixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhibeixinxiView selectView(Wrapper<ZhibeixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
