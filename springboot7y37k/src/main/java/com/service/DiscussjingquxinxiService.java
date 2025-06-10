package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussjingquxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussjingquxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussjingquxinxiView;


/**
 * 景区信息评论表
 *
 * @author 
 * @email 
 * @date 2020-11-26 15:12:52
 */
public interface DiscussjingquxinxiService extends IService<DiscussjingquxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussjingquxinxiVO> selectListVO(Wrapper<DiscussjingquxinxiEntity> wrapper);
   	
   	DiscussjingquxinxiVO selectVO(@Param("ew") Wrapper<DiscussjingquxinxiEntity> wrapper);
   	
   	List<DiscussjingquxinxiView> selectListView(Wrapper<DiscussjingquxinxiEntity> wrapper);
   	
   	DiscussjingquxinxiView selectView(@Param("ew") Wrapper<DiscussjingquxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjingquxinxiEntity> wrapper);
   	
}

