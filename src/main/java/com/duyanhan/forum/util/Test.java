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
		String test = "<div class=\"box\">"
					+ "<article class=\"media\">"
						+ "<figure class=\"media-left\">"
							+ "<p class=\"image is-64x64\">"
								+ "<img src=\"https://bulma.io/images/placeholders/128x128.png\">"
							+ "</p>"
						+ "</figure>"
						+ "<divclass=\"media-content\">"
							+ "<div class=\"content\">"
								+ "<p><strong>用户昵称</strong><small>@用户名</small><br>评论内容</p>"
							+ "</div>"
						+ "</div>"
					+ "</article><br>"
					+ "<nav class=\"level is-mobile\">"
						+ "<a class=\"level-item subtitle is-3 has-text-info\"> <i	class=\"icon ion-heart\"></i></a>"
						+ "<a class=\"level-item subtitle is-3 has-text-info\"><i	class=\"icon ion-thumbsup\"></i></a>"
						+ "<a class=\"level-item subtitle is-3 has-text-info\"><i class=\"icon ion-thumbsdown\"></i></a>"
					+ "</nav>"
				+ "</div>";
	}
}
