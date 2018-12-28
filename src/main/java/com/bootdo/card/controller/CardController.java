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

import com.bootdo.card.domain.CardDO;
import com.bootdo.card.service.CardService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author wenriyan
 * @email 1992lcg@163.com
 * @date 2018-12-27 10:25:17
 */
 
@Controller
@RequestMapping("/card/card")
public class CardController {
	@Autowired
	private CardService cardService;
	
	@GetMapping()
	@RequiresPermissions("card:card:card")
	String Card(){
	    return "card/card/card";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("card:card:card")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<CardDO> cardList = cardService.list(query);
		int total = cardService.count(query);
		PageUtils pageUtils = new PageUtils(cardList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("card:card:add")
	String add(){
	    return "card/card/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("card:card:edit")
	String edit(@PathVariable("id") String id,Model model){
		CardDO card = cardService.get(id);
		model.addAttribute("card", card);
	    return "card/card/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("card:card:add")
	public R save( CardDO card){
		if(cardService.save(card)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("card:card:edit")
	public R update( CardDO card){
		cardService.update(card);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("card:card:remove")
	public R remove( String id){
		if(cardService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("card:card:batchRemove")
	public R remove(@RequestParam("ids[]") String[] ids){
		cardService.batchRemove(ids);
		return R.ok();
	}
	
}
