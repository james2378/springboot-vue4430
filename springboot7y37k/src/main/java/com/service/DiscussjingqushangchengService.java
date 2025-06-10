package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussjingqushangchengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussjingqushangchengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussjingqushangchengView;


/**
 * 景区商城评论表
 *
 * @author 
 * @email 
 * @date 2020-11-26 15:12:52
 */
public interface DiscussjingqushangchengService extends IService<DiscussjingqushangchengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussjingqushangchengVO> selectListVO(Wrapper<DiscussjingqushangchengEntity> wrapper);
   	
   	DiscussjingqushangchengVO selectVO(@Param("ew") Wrapper<DiscussjingqushangchengEntity> wrapper);
   	
   	List<DiscussjingqushangchengView> selectListView(Wrapper<DiscussjingqushangchengEntity> wrapper);
   	
   	DiscussjingqushangchengView selectView(@Param("ew") Wrapper<DiscussjingqushangchengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjingqushangchengEntity> wrapper);
   	
}

