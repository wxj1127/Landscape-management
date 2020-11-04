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


import com.dao.QuyuguanlirenyuanDao;
import com.entity.QuyuguanlirenyuanEntity;
import com.service.QuyuguanlirenyuanService;
import com.entity.vo.QuyuguanlirenyuanVO;
import com.entity.view.QuyuguanlirenyuanView;

@Service("quyuguanlirenyuanService")
public class QuyuguanlirenyuanServiceImpl extends ServiceImpl<QuyuguanlirenyuanDao, QuyuguanlirenyuanEntity> implements QuyuguanlirenyuanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QuyuguanlirenyuanEntity> page = this.selectPage(
                new Query<QuyuguanlirenyuanEntity>(params).getPage(),
                new EntityWrapper<QuyuguanlirenyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QuyuguanlirenyuanEntity> wrapper) {
		  Page<QuyuguanlirenyuanView> page =new Query<QuyuguanlirenyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QuyuguanlirenyuanVO> selectListVO(Wrapper<QuyuguanlirenyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QuyuguanlirenyuanVO selectVO(Wrapper<QuyuguanlirenyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QuyuguanlirenyuanView> selectListView(Wrapper<QuyuguanlirenyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QuyuguanlirenyuanView selectView(Wrapper<QuyuguanlirenyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
