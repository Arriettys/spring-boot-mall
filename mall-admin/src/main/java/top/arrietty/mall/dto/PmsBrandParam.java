package top.arrietty.mall.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import top.arrietty.mall.validator.FlagValidator;

/**
 * 品牌传递参数
 */
@Getter
@Setter
public class PmsBrandParam
{
	@ApiModelProperty(value = "品牌名称",required = true)
    @NotEmpty(message = "名称不能为空")
    private String name;
    @ApiModelProperty(value = "品牌首字母")
    private String firstLetter;
    @ApiModelProperty(value = "排序字段")
    @Min(value = 0, message = "排序最小为0")
    private Integer sort;
    @ApiModelProperty(value = "是否为厂家制造商")
    @FlagValidator(value = {"0","1"}, message = "厂家状态不正确")
    private Integer factoryStatus;
    @ApiModelProperty(value = "是否进行显示")
    @FlagValidator(value = {"0","1"}, message = "显示状态不正确")
    private Integer showStatus;
    @ApiModelProperty(value = "品牌logo",required = true)
    @NotEmpty(message = "品牌logo不能为空")
    private String logo;
    @ApiModelProperty(value = "品牌大图")
    private String bigPic;
    @ApiModelProperty(value = "品牌故事")
    private String brandStory;
}
