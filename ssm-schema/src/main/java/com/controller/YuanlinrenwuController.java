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

import com.entity.YuanlinrenwuEntity;
import com.entity.view.YuanlinrenwuView;

import com.service.YuanlinrenwuService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 园林任务
 * 后端接口
 * @author 
 * @email 
 * @date 2020-10-22 19:38:19
 */
@RestController
@RequestMapping("/yuanlinrenwu")
public class YuanlinrenwuController {
    @Autowired
    private YuanlinrenwuService yuanlinrenwuService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YuanlinrenwuEntity yuanlinrenwu, HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("quyuguanlirenyuan")) {
			yuanlinrenwu.setZhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yuangong")) {
			yuanlinrenwu.setGonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<YuanlinrenwuEntity> ew = new EntityWrapper<YuanlinrenwuEntity>();
		PageUtils page = yuanlinrenwuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yuanlinrenwu), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YuanlinrenwuEntity yuanlinrenwu, HttpServletRequest request){
        EntityWrapper<YuanlinrenwuEntity> ew = new EntityWrapper<YuanlinrenwuEntity>();
		PageUtils page = yuanlinrenwuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yuanlinrenwu), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YuanlinrenwuEntity yuanlinrenwu){
       	EntityWrapper<YuanlinrenwuEntity> ew = new EntityWrapper<YuanlinrenwuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yuanlinrenwu, "yuanlinrenwu")); 
        return R.ok().put("data", yuanlinrenwuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YuanlinrenwuEntity yuanlinrenwu){
        EntityWrapper< YuanlinrenwuEntity> ew = new EntityWrapper< YuanlinrenwuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yuanlinrenwu, "yuanlinrenwu")); 
		YuanlinrenwuView yuanlinrenwuView =  yuanlinrenwuService.selectView(ew);
		return R.ok("查询园林任务成功").put("data", yuanlinrenwuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") String id){
        YuanlinrenwuEntity yuanlinrenwu = yuanlinrenwuService.selectById(id);
        return R.ok().put("data", yuanlinrenwu);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") String id){
        YuanlinrenwuEntity yuanlinrenwu = yuanlinrenwuService.selectById(id);
        return R.ok().put("data", yuanlinrenwu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YuanlinrenwuEntity yuanlinrenwu, HttpServletRequest request){
    	yuanlinrenwu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yuanlinrenwu);

        yuanlinrenwuService.insert(yuanlinrenwu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YuanlinrenwuEntity yuanlinrenwu, HttpServletRequest request){
    	yuanlinrenwu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yuanlinrenwu);

        yuanlinrenwuService.insert(yuanlinrenwu);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody YuanlinrenwuEntity yuanlinrenwu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yuanlinrenwu);
        yuanlinrenwuService.updateById(yuanlinrenwu);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yuanlinrenwuService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<YuanlinrenwuEntity> wrapper = new EntityWrapper<YuanlinrenwuEntity>();
		if(map.get("remindstart")!=null && !map.get("remindstart").toString().equals("")) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null && !map.get("remindend").toString().equals("")) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("quyuguanlirenyuan")) {
			wrapper.eq("zhanghao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yuangong")) {
			wrapper.eq("gonghao", (String)request.getSession().getAttribute("username"));
		}

		int count = yuanlinrenwuService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
