package com.duyanhan.forum.service;

import java.util.List;

import com.duyanhan.forum.entity.Block;

public interface BlockService {

	/**
	 * 按照等级获取版块列表
	 * @return
	 */
	List<Block> getBlockListByLevel();
	
}
