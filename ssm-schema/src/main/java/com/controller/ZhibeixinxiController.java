package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ZhibeixinxiEntity;
import com.entity.view.ZhibeixinxiView;

import com.service.ZhibeixinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 植被信息
 * 后端接口
 * @author 
 * @email 
 * @date 2020-10-22 19:38:19
 */
@RestController
@RequestMapping("/zhibeixinxi")
public class ZhibeixinxiController {
    @Autowired
    private ZhibeixinxiService zhibeixinxiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZhibeixinxiEntity zhibeixinxi, HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yuangong")) {
			zhibeixinxi.setGonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ZhibeixinxiEntity> ew = new EntityWrapper<ZhibeixinxiEntity>();
		PageUtils page = zhibeixinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhibeixinxi), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZhibeixinxiEntity zhibeixinxi, HttpServletRequest request){
        EntityWrapper<ZhibeixinxiEntity> ew = new EntityWrapper<ZhibeixinxiEntity>();
		PageUtils page = zhibeixinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhibeixinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZhibeixinxiEntity zhibeixinxi){
       	EntityWrapper<ZhibeixinxiEntity> ew = new EntityWrapper<ZhibeixinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zhibeixinxi, "zhibeixinxi")); 
        return R.ok().put("data", zhibeixinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZhibeixinxiEntity zhibeixinxi){
        EntityWrapper< ZhibeixinxiEntity> ew = new EntityWrapper< ZhibeixinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zhibeixinxi, "zhibeixinxi")); 
		ZhibeixinxiView zhibeixinxiView =  zhibeixinxiService.selectView(ew);
		return R.ok("查询植被信息成功").put("data", zhibeixinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") String id){
        ZhibeixinxiEntity zhibeixinxi = zhibeixinxiService.selectById(id);
        return R.ok().put("data", zhibeixinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") String id){
        ZhibeixinxiEntity zhibeixinxi = zhibeixinxiService.selectById(id);
        return R.ok().put("data", zhibeixinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZhibeixinxiEntity zhibeixinxi, HttpServletRequest request){
    	zhibeixinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zhibeixinxi);

        zhibeixinxiService.insert(zhibeixinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZhibeixinxiEntity zhibeixinxi, HttpServletRequest request){
    	zhibeixinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zhibeixinxi);

        zhibeixinxiService.insert(zhibeixinxi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ZhibeixinxiEntity zhibeixinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zhibeixinxi);
        zhibeixinxiService.updateById(zhibeixinxi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        zhibeixinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null && !map.get("remindstart").toString().equals("")) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null && !map.get("remindend").toString().equals("")) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<ZhibeixinxiEntity> wrapper = new EntityWrapper<ZhibeixinxiEntity>();
		if(map.get("remindstart")!=null && !map.get("remindstart").toString().equals("")) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null && !map.get("remindend").toString().equals("")) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yuangong")) {
			wrapper.eq("gonghao", (String)request.getSession().getAttribute("username"));
		}

		int count = zhibeixinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
