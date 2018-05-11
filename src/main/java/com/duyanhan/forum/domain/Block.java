package com.duyanhan.forum.domain;

import java.util.List;

/**
 * 版块实体类
 * @author duyanhan
 *
 */
public class Block {

	private Integer id;
	private String title;
	private String content;
	private Integer level;
	// 一个版块包含多个帖子
	private List<Post> postList;

}
