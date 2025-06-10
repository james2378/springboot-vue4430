package com.dao;

import com.entity.JingqushangchengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JingqushangchengVO;
import com.entity.view.JingqushangchengView;


/**
 * 景区商城
 * 
 * @author 
 * @email 
 * @date 2020-11-26 15:12:52
 */
public interface JingqushangchengDao extends BaseMapper<JingqushangchengEntity> {
	
	List<JingqushangchengVO> selectListVO(@Param("ew") Wrapper<JingqushangchengEntity> wrapper);
	
	JingqushangchengVO selectVO(@Param("ew") Wrapper<JingqushangchengEntity> wrapper);
	
	List<JingqushangchengView> selectListView(@Param("ew") Wrapper<JingqushangchengEntity> wrapper);

	List<JingqushangchengView> selectListView(Pagination page,@Param("ew") Wrapper<JingqushangchengEntity> wrapper);
	
	JingqushangchengView selectView(@Param("ew") Wrapper<JingqushangchengEntity> wrapper);
	
}
