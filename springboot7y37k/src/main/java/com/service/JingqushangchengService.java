package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JingqushangchengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JingqushangchengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JingqushangchengView;


/**
 * 景区商城
 *
 * @author 
 * @email 
 * @date 2020-11-26 15:12:52
 */
public interface JingqushangchengService extends IService<JingqushangchengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JingqushangchengVO> selectListVO(Wrapper<JingqushangchengEntity> wrapper);
   	
   	JingqushangchengVO selectVO(@Param("ew") Wrapper<JingqushangchengEntity> wrapper);
   	
   	List<JingqushangchengView> selectListView(Wrapper<JingqushangchengEntity> wrapper);
   	
   	JingqushangchengView selectView(@Param("ew") Wrapper<JingqushangchengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JingqushangchengEntity> wrapper);
   	
}

