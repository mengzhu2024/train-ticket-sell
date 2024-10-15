package com.dao;

import com.entity.GaiqiandingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GaiqiandingdanVO;
import com.entity.view.GaiqiandingdanView;


/**
 * 改签订单
 *
 */
public interface GaiqiandingdanDao extends BaseMapper<GaiqiandingdanEntity> {

	List<GaiqiandingdanVO> selectListVO(@Param("ew") Wrapper<GaiqiandingdanEntity> wrapper);

	GaiqiandingdanVO selectVO(@Param("ew") Wrapper<GaiqiandingdanEntity> wrapper);

	List<GaiqiandingdanView> selectListView(@Param("ew") Wrapper<GaiqiandingdanEntity> wrapper);

	List<GaiqiandingdanView> selectListView(Pagination page,@Param("ew") Wrapper<GaiqiandingdanEntity> wrapper);

	GaiqiandingdanView selectView(@Param("ew") Wrapper<GaiqiandingdanEntity> wrapper);

}
