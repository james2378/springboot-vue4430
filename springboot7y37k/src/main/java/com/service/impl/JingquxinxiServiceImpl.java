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


import com.dao.JingquxinxiDao;
import com.entity.JingquxinxiEntity;
import com.service.JingquxinxiService;
import com.entity.vo.JingquxinxiVO;
import com.entity.view.JingquxinxiView;

@Service("jingquxinxiService")
public class JingquxinxiServiceImpl extends ServiceImpl<JingquxinxiDao, JingquxinxiEntity> implements JingquxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JingquxinxiEntity> page = this.selectPage(
                new Query<JingquxinxiEntity>(params).getPage(),
                new EntityWrapper<JingquxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JingquxinxiEntity> wrapper) {
		  Page<JingquxinxiView> page =new Query<JingquxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JingquxinxiVO> selectListVO(Wrapper<JingquxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JingquxinxiVO selectVO(Wrapper<JingquxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JingquxinxiView> selectListView(Wrapper<JingquxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JingquxinxiView selectView(Wrapper<JingquxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
