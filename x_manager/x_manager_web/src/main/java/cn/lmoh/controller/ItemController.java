/**
 * Copyright (C), 2015-2018
 * FileName: ItemController
 * Author:   lmoh
 * Date:     2018/8/21 13:07
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.lmoh.controller;

import cn.lmoh.pojo.TbItem;
import cn.lmoh.service.impl.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author lmoh
 * @create 2018/8/21
 * @since 1.0.0
 */
@Controller
public class ItemController {
    @Autowired
    private ItemService itemService;

    @RequestMapping("/item/{itemId}")
    @ResponseBody
    public TbItem getTbItemById(@PathVariable long itemId){
        TbItem tbItem = itemService.getTbItemById(itemId);
        return tbItem;
    }

}