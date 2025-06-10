package com.dao;

import com.entity.DiscussjingqushangchengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussjingqushangchengVO;
import com.entity.view.DiscussjingqushangchengView;


/**
 * 景区商城评论表
 * 
 * @author 
 * @email 
 * @date 2020-11-26 15:12:52
 */
public interface DiscussjingqushangchengDao extends BaseMapper<DiscussjingqushangchengEntity> {
	
	List<DiscussjingqushangchengVO> selectListVO(@Param("ew") Wrapper<DiscussjingqushangchengEntity> wrapper);
	
	DiscussjingqushangchengVO selectVO(@Param("ew") Wrapper<DiscussjingqushangchengEntity> wrapper);
	
	List<DiscussjingqushangchengView> selectListView(@Param("ew") Wrapper<DiscussjingqushangchengEntity> wrapper);

	List<DiscussjingqushangchengView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussjingqushangchengEntity> wrapper);
	
	DiscussjingqushangchengView selectView(@Param("ew") Wrapper<DiscussjingqushangchengEntity> wrapper);
	
}
