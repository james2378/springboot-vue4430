package com.dao;

import com.entity.JingqufenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JingqufenleiVO;
import com.entity.view.JingqufenleiView;


/**
 * 景区分类
 * 
 * @author 
 * @email 
 * @date 2020-11-26 15:12:52
 */
public interface JingqufenleiDao extends BaseMapper<JingqufenleiEntity> {
	
	List<JingqufenleiVO> selectListVO(@Param("ew") Wrapper<JingqufenleiEntity> wrapper);
	
	JingqufenleiVO selectVO(@Param("ew") Wrapper<JingqufenleiEntity> wrapper);
	
	List<JingqufenleiView> selectListView(@Param("ew") Wrapper<JingqufenleiEntity> wrapper);

	List<JingqufenleiView> selectListView(Pagination page,@Param("ew") Wrapper<JingqufenleiEntity> wrapper);
	
	JingqufenleiView selectView(@Param("ew") Wrapper<JingqufenleiEntity> wrapper);
	
}
