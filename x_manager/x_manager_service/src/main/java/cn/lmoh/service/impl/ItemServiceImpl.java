/**
 * Copyright (C), 2015-2018
 * FileName: ItemServiceImpl
 * Author:   lmoh
 * Date:     2018/8/21 12:55
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.lmoh.service.impl;

import cn.lmoh.mapper.TbItemMapper;
import cn.lmoh.pojo.TbItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author lmoh
 * @create 2018/8/21
 * @since 1.0.0
 */
@Service
public class ItemServiceImpl implements ItemService{
    @Autowired
    private TbItemMapper itemMapper;


    @Override
    public TbItem getTbItemById(long itemId) {
        //这里是根据逆向工程生成的来查询

        //--根据主键
       TbItem tbItem = itemMapper.selectByPrimaryKey(itemId);

       /* //--根据条件
        TbItemExample example = new TbItemExample();
        TbItemExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(itemId);
        //设置查询条件
        List<TbItem> list = itemMapper.selectByExample(example);
        if(list!=null && list.size()>0){
            return list.get(0);
        }*/
        return tbItem;
    }
}