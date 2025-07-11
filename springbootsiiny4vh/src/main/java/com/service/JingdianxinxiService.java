package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JingdianxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JingdianxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JingdianxinxiView;


/**
 * 景点信息
 *
 * @author 
 * @email 
 * @date 2024-04-18 13:31:36
 */
public interface JingdianxinxiService extends IService<JingdianxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JingdianxinxiVO> selectListVO(Wrapper<JingdianxinxiEntity> wrapper);
   	
   	JingdianxinxiVO selectVO(@Param("ew") Wrapper<JingdianxinxiEntity> wrapper);
   	
   	List<JingdianxinxiView> selectListView(Wrapper<JingdianxinxiEntity> wrapper);
   	
   	JingdianxinxiView selectView(@Param("ew") Wrapper<JingdianxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JingdianxinxiEntity> wrapper);

   	

}

