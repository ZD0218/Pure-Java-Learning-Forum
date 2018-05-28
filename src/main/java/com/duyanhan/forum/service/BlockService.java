package com.duyanhan.forum.service;

import java.util.List;

public interface BlockService {

	/**
	 * 按照等级获取版块列表
	 * @return
	 */
	List<String> getBlockTitleListByLevel();

}
