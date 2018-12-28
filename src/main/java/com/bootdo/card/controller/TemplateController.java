package com.bootdo.card.controller;

import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bootdo.card.domain.TemplateDO;
import com.bootdo.card.service.TemplateService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author wenriyan
 * @email 1992lcg@163.com
 * @date 2018-12-27 10:25:18
 */
 
@Controller
@RequestMapping("/card/template")
public class TemplateController {
	@Autowired
	private TemplateService templateService;
	
	@GetMapping()
	@RequiresPermissions("card:template:template")
	String Template(){
	    return "card/template/template";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("card:template:template")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<TemplateDO> templateList = templateService.list(query);
		int total = templateService.count(query);
		PageUtils pageUtils = new PageUtils(templateList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("card:template:add")
	String add(){
	    return "card/template/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("card:template:edit")
	String edit(@PathVariable("id") String id,Model model){
		TemplateDO template = templateService.get(id);
		model.addAttribute("template", template);
	    return "card/template/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("card:template:add")
	public R save( TemplateDO template){
		if(templateService.save(template)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("card:template:edit")
	public R update( TemplateDO template){
		templateService.update(template);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("card:template:remove")
	public R remove( String id){
		if(templateService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("card:template:batchRemove")
	public R remove(@RequestParam("ids[]") String[] ids){
		templateService.batchRemove(ids);
		return R.ok();
	}
	
}
