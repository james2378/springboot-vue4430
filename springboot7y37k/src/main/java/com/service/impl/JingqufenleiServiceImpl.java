package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.JingqufenleiDao;
import com.entity.JingqufenleiEntity;
import com.service.JingqufenleiService;
import com.entity.vo.JingqufenleiVO;
import com.entity.view.JingqufenleiView;

@Service("jingqufenleiService")
public class JingqufenleiServiceImpl extends ServiceImpl<JingqufenleiDao, JingqufenleiEntity> implements JingqufenleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JingqufenleiEntity> page = this.selectPage(
                new Query<JingqufenleiEntity>(params).getPage(),
                new EntityWrapper<JingqufenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JingqufenleiEntity> wrapper) {
		  Page<JingqufenleiView> page =new Query<JingqufenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JingqufenleiVO> selectListVO(Wrapper<JingqufenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JingqufenleiVO selectVO(Wrapper<JingqufenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JingqufenleiView> selectListView(Wrapper<JingqufenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JingqufenleiView selectView(Wrapper<JingqufenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
