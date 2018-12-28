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

import com.bootdo.card.domain.MusicDO;
import com.bootdo.card.service.MusicService;
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
@RequestMapping("/card/music")
public class MusicController {
	@Autowired
	private MusicService musicService;
	
	@GetMapping()
	@RequiresPermissions("card:music:music")
	String Music(){
	    return "card/music/music";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("card:music:music")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<MusicDO> musicList = musicService.list(query);
		int total = musicService.count(query);
		PageUtils pageUtils = new PageUtils(musicList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("card:music:add")
	String add(){
	    return "card/music/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("card:music:edit")
	String edit(@PathVariable("id") String id,Model model){
		MusicDO music = musicService.get(id);
		model.addAttribute("music", music);
	    return "card/music/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("card:music:add")
	public R save( MusicDO music){
		if(musicService.save(music)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("card:music:edit")
	public R update( MusicDO music){
		musicService.update(music);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("card:music:remove")
	public R remove( String id){
		if(musicService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("card:music:batchRemove")
	public R remove(@RequestParam("ids[]") String[] ids){
		musicService.batchRemove(ids);
		return R.ok();
	}
	
}
