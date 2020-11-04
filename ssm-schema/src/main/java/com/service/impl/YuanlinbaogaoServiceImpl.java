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


import com.dao.YuanlinbaogaoDao;
import com.entity.YuanlinbaogaoEntity;
import com.service.YuanlinbaogaoService;
import com.entity.vo.YuanlinbaogaoVO;
import com.entity.view.YuanlinbaogaoView;

@Service("yuanlinbaogaoService")
public class YuanlinbaogaoServiceImpl extends ServiceImpl<YuanlinbaogaoDao, YuanlinbaogaoEntity> implements YuanlinbaogaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YuanlinbaogaoEntity> page = this.selectPage(
                new Query<YuanlinbaogaoEntity>(params).getPage(),
                new EntityWrapper<YuanlinbaogaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YuanlinbaogaoEntity> wrapper) {
		  Page<YuanlinbaogaoView> page =new Query<YuanlinbaogaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YuanlinbaogaoVO> selectListVO(Wrapper<YuanlinbaogaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YuanlinbaogaoVO selectVO(Wrapper<YuanlinbaogaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YuanlinbaogaoView> selectListView(Wrapper<YuanlinbaogaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YuanlinbaogaoView selectView(Wrapper<YuanlinbaogaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
