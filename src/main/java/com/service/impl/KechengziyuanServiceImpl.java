package com.service.impl;

import com.utils.StringUtil;
import org.springframework.stereotype.Service;
import java.lang.reflect.Field;
import java.util.*;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import com.dao.KechengziyuanDao;
import com.entity.KechengziyuanEntity;
import com.service.KechengziyuanService;
import com.entity.view.KechengziyuanView;

/**
 * 课程资源 服务实现类
 */
@Service("kechengziyuanService")
@Transactional
public class KechengziyuanServiceImpl extends ServiceImpl<KechengziyuanDao, KechengziyuanEntity> implements KechengziyuanService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<KechengziyuanView> page =new Query<KechengziyuanView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
