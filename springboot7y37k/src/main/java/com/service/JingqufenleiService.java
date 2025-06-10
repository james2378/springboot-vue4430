package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JingqufenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JingqufenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JingqufenleiView;


/**
 * 景区分类
 *
 * @author 
 * @email 
 * @date 2020-11-26 15:12:52
 */
public interface JingqufenleiService extends IService<JingqufenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JingqufenleiVO> selectListVO(Wrapper<JingqufenleiEntity> wrapper);
   	
   	JingqufenleiVO selectVO(@Param("ew") Wrapper<JingqufenleiEntity> wrapper);
   	
   	List<JingqufenleiView> selectListView(Wrapper<JingqufenleiEntity> wrapper);
   	
   	JingqufenleiView selectView(@Param("ew") Wrapper<JingqufenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JingqufenleiEntity> wrapper);
   	
}

