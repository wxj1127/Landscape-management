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


import com.dao.RenwufabuDao;
import com.entity.RenwufabuEntity;
import com.service.RenwufabuService;
import com.entity.vo.RenwufabuVO;
import com.entity.view.RenwufabuView;

@Service("renwufabuService")
public class RenwufabuServiceImpl extends ServiceImpl<RenwufabuDao, RenwufabuEntity> implements RenwufabuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RenwufabuEntity> page = this.selectPage(
                new Query<RenwufabuEntity>(params).getPage(),
                new EntityWrapper<RenwufabuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RenwufabuEntity> wrapper) {
		  Page<RenwufabuView> page =new Query<RenwufabuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<RenwufabuVO> selectListVO(Wrapper<RenwufabuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RenwufabuVO selectVO(Wrapper<RenwufabuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RenwufabuView> selectListView(Wrapper<RenwufabuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RenwufabuView selectView(Wrapper<RenwufabuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
