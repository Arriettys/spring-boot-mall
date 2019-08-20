package top.arrietty.mall.service;

import javax.servlet.http.HttpServletRequest;

import top.arrietty.mall.dto.OssCallbackResult;
import top.arrietty.mall.dto.OssPolicyResult;

/**
 * oss上传管理Service
 */
public interface OssService
{
	/**
     * oss上传策略生成
     */
    OssPolicyResult policy();
    /**
     * oss上传成功回调
     */
    OssCallbackResult callback(HttpServletRequest request);
}
