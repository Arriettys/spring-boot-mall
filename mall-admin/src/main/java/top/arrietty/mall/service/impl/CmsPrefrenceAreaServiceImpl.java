package top.arrietty.mall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import top.arrietty.mall.mapper.CmsPrefrenceAreaMapper;
import top.arrietty.mall.model.CmsPrefrenceArea;
import top.arrietty.mall.model.CmsPrefrenceAreaExample;
import top.arrietty.mall.service.CmsPrefrenceAreaService;
/**
 * 商品优选Service实现类
 */
@Service
public class CmsPrefrenceAreaServiceImpl implements CmsPrefrenceAreaService
{
	@Autowired
	private CmsPrefrenceAreaMapper prefrenceAreaMapper;
	@Override
	public List<CmsPrefrenceArea> listAll()
	{
		return prefrenceAreaMapper.selectByExample(new CmsPrefrenceAreaExample());
	}
}
