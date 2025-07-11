package com.dao;

import com.entity.DiscussjingdianxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussjingdianxinxiVO;
import com.entity.view.DiscussjingdianxinxiView;


/**
 * 景点信息评论表
 * 
 * @author 
 * @email 
 * @date 2024-04-18 13:31:37
 */
public interface DiscussjingdianxinxiDao extends BaseMapper<DiscussjingdianxinxiEntity> {
	
	List<DiscussjingdianxinxiVO> selectListVO(@Param("ew") Wrapper<DiscussjingdianxinxiEntity> wrapper);
	
	DiscussjingdianxinxiVO selectVO(@Param("ew") Wrapper<DiscussjingdianxinxiEntity> wrapper);
	
	List<DiscussjingdianxinxiView> selectListView(@Param("ew") Wrapper<DiscussjingdianxinxiEntity> wrapper);

	List<DiscussjingdianxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussjingdianxinxiEntity> wrapper);

	
	DiscussjingdianxinxiView selectView(@Param("ew") Wrapper<DiscussjingdianxinxiEntity> wrapper);
	

}
