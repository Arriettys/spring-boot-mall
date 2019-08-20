package top.arrietty.mall.service;

import java.util.List;

import top.arrietty.mall.dto.PmsBrandDto;
import top.arrietty.mall.model.PmsBrand;

/**
 * DemoService接口
 */
public interface DemoService
{
	List<PmsBrand> listAllBrand();

    int createBrand(PmsBrandDto pmsBrandDto);

    int updateBrand(Long id, PmsBrandDto pmsBrandDto);

    int deleteBrand(Long id);

    List<PmsBrand> listBrand(int pageNum, int pageSize);

    PmsBrand getBrand(Long id);
}
