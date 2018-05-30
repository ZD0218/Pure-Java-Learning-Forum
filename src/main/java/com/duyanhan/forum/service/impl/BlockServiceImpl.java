package com.duyanhan.forum.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.duyanhan.forum.dao.BlockMapper;
import com.duyanhan.forum.dto.QueryPage;
import com.duyanhan.forum.entity.Block;
import com.duyanhan.forum.entity.BlockExample;
import com.duyanhan.forum.service.BlockService;


@Service("blockService")
public class BlockServiceImpl implements BlockService {

	@Autowired
	private BlockMapper blockMapper;
	
	@Override
	public List<Block> getBlockListByLevel() {
		BlockExample blockExample = new BlockExample();
		// 优先按照等级排序，再按名称排序
		blockExample.setOrderByClause("level ASC, `title` ASC");
		List<Block> blockList = blockMapper.selectByExampleWithBLOBs(blockExample);
		return blockList;
	}

	@Override
	public List<Block> getBlockListByLevelAndQueryPage(QueryPage queryPage) {
		BlockExample blockExample = new BlockExample();
		blockExample.page(queryPage.getPage(), queryPage.getPageSize()).setOrderByClause("level ASC, `title` ASC");
		List<Block> blockList = blockMapper.selectByExampleWithBLOBs(blockExample);
		return blockList;
	}

}
