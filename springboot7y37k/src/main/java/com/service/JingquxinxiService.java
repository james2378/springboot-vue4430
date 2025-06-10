package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JingquxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JingquxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JingquxinxiView;


/**
 * 景区信息
 *
 * @author 
 * @email 
 * @date 2020-11-26 15:12:52
 */
public interface JingquxinxiService extends IService<JingquxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JingquxinxiVO> selectListVO(Wrapper<JingquxinxiEntity> wrapper);
   	
   	JingquxinxiVO selectVO(@Param("ew") Wrapper<JingquxinxiEntity> wrapper);
   	
   	List<JingquxinxiView> selectListView(Wrapper<JingquxinxiEntity> wrapper);
   	
   	JingquxinxiView selectView(@Param("ew") Wrapper<JingquxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JingquxinxiEntity> wrapper);
   	
}

