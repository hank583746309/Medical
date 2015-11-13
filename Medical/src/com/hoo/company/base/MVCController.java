package com.hoo.company.base;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import cn.gilight.framework.mvc.CoreController;
import cn.gilight.framework.mvc.model.Ajax;

@Controller
public class MVCController extends CoreController {
	
	@Override
	@ResponseBody
	@RequestMapping("controller/extcore")
	public Ajax doHandler(@RequestParam("server") String server,
							@RequestParam("method") String methodname,
							@RequestParam("params") String params){
		return super.doHandler(server, methodname, params);
	}
	
}
