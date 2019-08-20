package top.arrietty.mall.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import top.arrietty.mall.dto.PmsBrandParam;
import top.arrietty.mall.model.PmsBrand;

/**
 * 商品品牌Service
 */
public interface PmsBrandService
{
	List<PmsBrand> listAllBrand();

    int createBrand(PmsBrandParam pmsBrandParam);
    @Transactional
    int updateBrand(Long id, PmsBrandParam pmsBrandParam);

    int deleteBrand(Long id);

    int deleteBrand(List<Long> ids);

    List<PmsBrand> listBrand(String keyword, int pageNum, int pageSize);

    PmsBrand getBrand(Long id);

    int updateShowStatus(List<Long> ids, Integer showStatus);

    int updateFactoryStatus(List<Long> ids, Integer factoryStatus);
}
