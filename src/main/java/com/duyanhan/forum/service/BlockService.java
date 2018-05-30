package com.duyanhan.forum.service;

import java.util.List;

import com.duyanhan.forum.dto.QueryPage;
import com.duyanhan.forum.entity.Block;

public interface BlockService {

	/**
	 * 按照等级获取版块列表
	 * @return
	 */
	List<Block> getBlockListByLevel();

	
	/**
	 * 按照等级和分页信息获取版块列表
	 * @return
	 */
	List<Block> getBlockListByLevelAndQueryPage(QueryPage queryPage);
	
}
