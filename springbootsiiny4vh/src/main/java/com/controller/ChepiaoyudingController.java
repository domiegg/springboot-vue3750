package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
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
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ChepiaoyudingEntity;
import com.entity.view.ChepiaoyudingView;

import com.service.ChepiaoyudingService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 车票预定
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-18 13:31:36
 */
@RestController
@RequestMapping("/chepiaoyuding")
public class ChepiaoyudingController {
    @Autowired
    private ChepiaoyudingService chepiaoyudingService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ChepiaoyudingEntity chepiaoyuding,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			chepiaoyuding.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ChepiaoyudingEntity> ew = new EntityWrapper<ChepiaoyudingEntity>();

		PageUtils page = chepiaoyudingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chepiaoyuding), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ChepiaoyudingEntity chepiaoyuding, 
		HttpServletRequest request){
        EntityWrapper<ChepiaoyudingEntity> ew = new EntityWrapper<ChepiaoyudingEntity>();

		PageUtils page = chepiaoyudingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chepiaoyuding), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ChepiaoyudingEntity chepiaoyuding){
       	EntityWrapper<ChepiaoyudingEntity> ew = new EntityWrapper<ChepiaoyudingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( chepiaoyuding, "chepiaoyuding")); 
        return R.ok().put("data", chepiaoyudingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ChepiaoyudingEntity chepiaoyuding){
        EntityWrapper< ChepiaoyudingEntity> ew = new EntityWrapper< ChepiaoyudingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( chepiaoyuding, "chepiaoyuding")); 
		ChepiaoyudingView chepiaoyudingView =  chepiaoyudingService.selectView(ew);
		return R.ok("查询车票预定成功").put("data", chepiaoyudingView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ChepiaoyudingEntity chepiaoyuding = chepiaoyudingService.selectById(id);
        return R.ok().put("data", chepiaoyuding);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ChepiaoyudingEntity chepiaoyuding = chepiaoyudingService.selectById(id);
        return R.ok().put("data", chepiaoyuding);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ChepiaoyudingEntity chepiaoyuding, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(chepiaoyuding);
        chepiaoyudingService.insert(chepiaoyuding);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ChepiaoyudingEntity chepiaoyuding, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(chepiaoyuding);
        chepiaoyudingService.insert(chepiaoyuding);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ChepiaoyudingEntity chepiaoyuding, HttpServletRequest request){
        //ValidatorUtils.validateEntity(chepiaoyuding);
        chepiaoyudingService.updateById(chepiaoyuding);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        chepiaoyudingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
