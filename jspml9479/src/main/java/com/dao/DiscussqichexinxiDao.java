package com.dao;

import com.entity.DiscussqichexinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussqichexinxiVO;
import com.entity.view.DiscussqichexinxiView;


/**
 * 汽车信息评论表
 * 
 * @author 
 * @email 
 * @date 2022-03-12 15:08:50
 */
public interface DiscussqichexinxiDao extends BaseMapper<DiscussqichexinxiEntity> {
	
	List<DiscussqichexinxiVO> selectListVO(@Param("ew") Wrapper<DiscussqichexinxiEntity> wrapper);
	
	DiscussqichexinxiVO selectVO(@Param("ew") Wrapper<DiscussqichexinxiEntity> wrapper);
	
	List<DiscussqichexinxiView> selectListView(@Param("ew") Wrapper<DiscussqichexinxiEntity> wrapper);

	List<DiscussqichexinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussqichexinxiEntity> wrapper);
	
	DiscussqichexinxiView selectView(@Param("ew") Wrapper<DiscussqichexinxiEntity> wrapper);
	

}
