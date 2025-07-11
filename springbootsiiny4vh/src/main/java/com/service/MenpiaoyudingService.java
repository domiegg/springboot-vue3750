package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.MenpiaoyudingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.MenpiaoyudingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.MenpiaoyudingView;


/**
 * 门票预定
 *
 * @author 
 * @email 
 * @date 2024-04-18 13:31:36
 */
public interface MenpiaoyudingService extends IService<MenpiaoyudingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<MenpiaoyudingVO> selectListVO(Wrapper<MenpiaoyudingEntity> wrapper);
   	
   	MenpiaoyudingVO selectVO(@Param("ew") Wrapper<MenpiaoyudingEntity> wrapper);
   	
   	List<MenpiaoyudingView> selectListView(Wrapper<MenpiaoyudingEntity> wrapper);
   	
   	MenpiaoyudingView selectView(@Param("ew") Wrapper<MenpiaoyudingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<MenpiaoyudingEntity> wrapper);

   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<MenpiaoyudingEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<MenpiaoyudingEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<MenpiaoyudingEntity> wrapper);



}

