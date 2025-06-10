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

import com.entity.JingquxinxiEntity;
import com.entity.view.JingquxinxiView;

import com.service.JingquxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 景区信息
 * 后端接口
 * @author 
 * @email 
 * @date 2020-11-26 15:12:52
 */
@RestController
@RequestMapping("/jingquxinxi")
public class JingquxinxiController {
    @Autowired
    private JingquxinxiService jingquxinxiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JingquxinxiEntity jingquxinxi, HttpServletRequest request){
        EntityWrapper<JingquxinxiEntity> ew = new EntityWrapper<JingquxinxiEntity>();
		PageUtils page = jingquxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jingquxinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JingquxinxiEntity jingquxinxi, HttpServletRequest request){
        EntityWrapper<JingquxinxiEntity> ew = new EntityWrapper<JingquxinxiEntity>();
		PageUtils page = jingquxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jingquxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JingquxinxiEntity jingquxinxi){
       	EntityWrapper<JingquxinxiEntity> ew = new EntityWrapper<JingquxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jingquxinxi, "jingquxinxi")); 
        return R.ok().put("data", jingquxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JingquxinxiEntity jingquxinxi){
        EntityWrapper< JingquxinxiEntity> ew = new EntityWrapper< JingquxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jingquxinxi, "jingquxinxi")); 
		JingquxinxiView jingquxinxiView =  jingquxinxiService.selectView(ew);
		return R.ok("查询景区信息成功").put("data", jingquxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") String id){
        JingquxinxiEntity jingquxinxi = jingquxinxiService.selectById(id);
		jingquxinxi.setClicknum(jingquxinxi.getClicknum()+1);
		jingquxinxi.setClicktime(new Date());
		jingquxinxiService.updateById(jingquxinxi);
        return R.ok().put("data", jingquxinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") String id){
        JingquxinxiEntity jingquxinxi = jingquxinxiService.selectById(id);
		jingquxinxi.setClicknum(jingquxinxi.getClicknum()+1);
		jingquxinxi.setClicktime(new Date());
		jingquxinxiService.updateById(jingquxinxi);
        return R.ok().put("data", jingquxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JingquxinxiEntity jingquxinxi, HttpServletRequest request){
    	jingquxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jingquxinxi);
        jingquxinxiService.insert(jingquxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JingquxinxiEntity jingquxinxi, HttpServletRequest request){
    	jingquxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jingquxinxi);
        jingquxinxiService.insert(jingquxinxi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody JingquxinxiEntity jingquxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jingquxinxi);
        jingquxinxiService.updateById(jingquxinxi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jingquxinxiService.deleteBatchIds(Arrays.asList(ids));
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
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<JingquxinxiEntity> wrapper = new EntityWrapper<JingquxinxiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = jingquxinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,JingquxinxiEntity jingquxinxi, HttpServletRequest request,String pre){
        EntityWrapper<JingquxinxiEntity> ew = new EntityWrapper<JingquxinxiEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicknum");
        params.put("order", "desc");
		PageUtils page = jingquxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jingquxinxi), params), params));
        return R.ok().put("data", page);
    }


}
