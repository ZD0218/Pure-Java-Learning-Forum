package com.duyanhan.forum.util;

import com.duyanhan.forum.dto.QueryPage;
import com.duyanhan.forum.dto.QueryPageWithBlockId;
import com.google.gson.Gson;

public class Test {

	public static void main(String[] args) {
		Gson g = new Gson();
		QueryPageWithBlockId en = new QueryPageWithBlockId();
		QueryPage queryPage = new QueryPage();
		queryPage.setPage(1);
		queryPage.setPageSize(5);
		en.setQueryPage(queryPage);
		en.setBlockId(15);
		String json = g.toJson(en);
		System.out.println(json);
	}
}
