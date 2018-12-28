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

import com.bootdo.card.domain.HContentDO;
import com.bootdo.card.service.HContentService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-12-27 14:21:37
 */
 
@Controller
@RequestMapping("/card/hContent")
public class HContentController {
	@Autowired
	private HContentService hContentService;
	
	@GetMapping()
	@RequiresPermissions("card:hContent:hContent")
	String HContent(){
	    return "card/hContent/hContent";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("card:hContent:hContent")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<HContentDO> hContentList = hContentService.list(query);
		int total = hContentService.count(query);
		PageUtils pageUtils = new PageUtils(hContentList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("card:hContent:add")
	String add(){
	    return "card/hContent/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("card:hContent:edit")
	String edit(@PathVariable("id") String id,Model model){
		HContentDO hContent = hContentService.get(id);
		model.addAttribute("hContent", hContent);
	    return "card/hContent/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("card:hContent:add")
	public R save( HContentDO hContent){
		if(hContentService.save(hContent)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("card:hContent:edit")
	public R update( HContentDO hContent){
		hContentService.update(hContent);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("card:hContent:remove")
	public R remove( String id){
		if(hContentService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("card:hContent:batchRemove")
	public R remove(@RequestParam("ids[]") String[] ids){
		hContentService.batchRemove(ids);
		return R.ok();
	}
	
}
