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


import com.dao.DiscussjingqushangchengDao;
import com.entity.DiscussjingqushangchengEntity;
import com.service.DiscussjingqushangchengService;
import com.entity.vo.DiscussjingqushangchengVO;
import com.entity.view.DiscussjingqushangchengView;

@Service("discussjingqushangchengService")
public class DiscussjingqushangchengServiceImpl extends ServiceImpl<DiscussjingqushangchengDao, DiscussjingqushangchengEntity> implements DiscussjingqushangchengService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussjingqushangchengEntity> page = this.selectPage(
                new Query<DiscussjingqushangchengEntity>(params).getPage(),
                new EntityWrapper<DiscussjingqushangchengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussjingqushangchengEntity> wrapper) {
		  Page<DiscussjingqushangchengView> page =new Query<DiscussjingqushangchengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussjingqushangchengVO> selectListVO(Wrapper<DiscussjingqushangchengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussjingqushangchengVO selectVO(Wrapper<DiscussjingqushangchengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussjingqushangchengView> selectListView(Wrapper<DiscussjingqushangchengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussjingqushangchengView selectView(Wrapper<DiscussjingqushangchengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
