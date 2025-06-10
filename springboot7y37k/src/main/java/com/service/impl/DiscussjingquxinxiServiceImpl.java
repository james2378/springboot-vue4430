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


import com.dao.DiscussjingquxinxiDao;
import com.entity.DiscussjingquxinxiEntity;
import com.service.DiscussjingquxinxiService;
import com.entity.vo.DiscussjingquxinxiVO;
import com.entity.view.DiscussjingquxinxiView;

@Service("discussjingquxinxiService")
public class DiscussjingquxinxiServiceImpl extends ServiceImpl<DiscussjingquxinxiDao, DiscussjingquxinxiEntity> implements DiscussjingquxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussjingquxinxiEntity> page = this.selectPage(
                new Query<DiscussjingquxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussjingquxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussjingquxinxiEntity> wrapper) {
		  Page<DiscussjingquxinxiView> page =new Query<DiscussjingquxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussjingquxinxiVO> selectListVO(Wrapper<DiscussjingquxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussjingquxinxiVO selectVO(Wrapper<DiscussjingquxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussjingquxinxiView> selectListView(Wrapper<DiscussjingquxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussjingquxinxiView selectView(Wrapper<DiscussjingquxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
