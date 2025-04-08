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


import com.dao.QichexiadanDao;
import com.entity.QichexiadanEntity;
import com.service.QichexiadanService;
import com.entity.vo.QichexiadanVO;
import com.entity.view.QichexiadanView;

@Service("qichexiadanService")
public class QichexiadanServiceImpl extends ServiceImpl<QichexiadanDao, QichexiadanEntity> implements QichexiadanService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QichexiadanEntity> page = this.selectPage(
                new Query<QichexiadanEntity>(params).getPage(),
                new EntityWrapper<QichexiadanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QichexiadanEntity> wrapper) {
		  Page<QichexiadanView> page =new Query<QichexiadanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QichexiadanVO> selectListVO(Wrapper<QichexiadanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QichexiadanVO selectVO(Wrapper<QichexiadanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QichexiadanView> selectListView(Wrapper<QichexiadanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QichexiadanView selectView(Wrapper<QichexiadanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
