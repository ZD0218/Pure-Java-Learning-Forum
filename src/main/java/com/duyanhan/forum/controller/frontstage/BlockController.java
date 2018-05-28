package com.duyanhan.forum.controller.frontstage;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.duyanhan.forum.service.BlockService;
import com.google.gson.Gson;

@Controller
@RequestMapping("/json")
public class BlockController {
	private static final Log logger = LogFactory.getLog(BlockController.class);
	
	@Autowired
	private BlockService blockService;
	
	@RequestMapping("/blockTitleList")
	public void getBlockTitleList(HttpServletResponse response) throws Exception {

		List<String> blockTitleList = blockService.getBlockTitleListByLevel();
		Gson gson = new Gson();
		String blockTitleListJson = gson.toJson(blockTitleList);
		logger.info("获取版块标题列表Json：" + blockTitleListJson);
		response.setContentType("text/html;charset=UTF-8");
		response.getWriter().println(blockTitleListJson);
	}
}
