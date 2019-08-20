package top.arrietty.mall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.github.pagehelper.PageHelper;

import top.arrietty.mall.mapper.CmsSubjectMapper;
import top.arrietty.mall.model.CmsSubject;
import top.arrietty.mall.model.CmsSubjectExample;
import top.arrietty.mall.service.CmsSubjectService;
/**
 * 商品专题Service实现类
 */
@Service
public class CmsSubjectServiceImpl implements CmsSubjectService
{
	@Autowired
    private CmsSubjectMapper subjectMapper;

    @Override
    public List<CmsSubject> listAll() 
    {
        return subjectMapper.selectByExample(new CmsSubjectExample());
    }

    @Override
    public List<CmsSubject> list(String keyword, Integer pageNum, Integer pageSize) 
    {
        PageHelper.startPage(pageNum, pageSize);
        CmsSubjectExample example = new CmsSubjectExample();
        CmsSubjectExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(keyword)) {
            criteria.andTitleLike("%" + keyword + "%");
        }
        return subjectMapper.selectByExample(example);
    }
}
