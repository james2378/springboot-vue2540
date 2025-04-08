package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QichexiadanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QichexiadanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QichexiadanView;


/**
 * 汽车下单
 *
 * @author 
 * @email 
 * @date 2022-03-12 15:08:50
 */
public interface QichexiadanService extends IService<QichexiadanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QichexiadanVO> selectListVO(Wrapper<QichexiadanEntity> wrapper);
   	
   	QichexiadanVO selectVO(@Param("ew") Wrapper<QichexiadanEntity> wrapper);
   	
   	List<QichexiadanView> selectListView(Wrapper<QichexiadanEntity> wrapper);
   	
   	QichexiadanView selectView(@Param("ew") Wrapper<QichexiadanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QichexiadanEntity> wrapper);
   	

}

