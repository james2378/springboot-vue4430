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


import com.dao.JingqushangchengDao;
import com.entity.JingqushangchengEntity;
import com.service.JingqushangchengService;
import com.entity.vo.JingqushangchengVO;
import com.entity.view.JingqushangchengView;

@Service("jingqushangchengService")
public class JingqushangchengServiceImpl extends ServiceImpl<JingqushangchengDao, JingqushangchengEntity> implements JingqushangchengService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JingqushangchengEntity> page = this.selectPage(
                new Query<JingqushangchengEntity>(params).getPage(),
                new EntityWrapper<JingqushangchengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JingqushangchengEntity> wrapper) {
		  Page<JingqushangchengView> page =new Query<JingqushangchengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JingqushangchengVO> selectListVO(Wrapper<JingqushangchengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JingqushangchengVO selectVO(Wrapper<JingqushangchengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JingqushangchengView> selectListView(Wrapper<JingqushangchengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JingqushangchengView selectView(Wrapper<JingqushangchengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
