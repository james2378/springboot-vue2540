package com.dao;

import com.entity.QichexiadanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QichexiadanVO;
import com.entity.view.QichexiadanView;


/**
 * 汽车下单
 * 
 * @author 
 * @email 
 * @date 2022-03-12 15:08:50
 */
public interface QichexiadanDao extends BaseMapper<QichexiadanEntity> {
	
	List<QichexiadanVO> selectListVO(@Param("ew") Wrapper<QichexiadanEntity> wrapper);
	
	QichexiadanVO selectVO(@Param("ew") Wrapper<QichexiadanEntity> wrapper);
	
	List<QichexiadanView> selectListView(@Param("ew") Wrapper<QichexiadanEntity> wrapper);

	List<QichexiadanView> selectListView(Pagination page,@Param("ew") Wrapper<QichexiadanEntity> wrapper);
	
	QichexiadanView selectView(@Param("ew") Wrapper<QichexiadanEntity> wrapper);
	

}
