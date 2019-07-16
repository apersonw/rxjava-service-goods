package org.rxjava.service.goods.model;

import lombok.Data;
import org.rxjava.common.core.entity.Resource;

import java.util.List;

/**
 * @author happy 2019-03-23 00:19
 * 商品
 */
@Data
public class GoodsModel {
    private String id;
    /**
     * 商品名称
     */
    private String name;
    /**
     * 缩略图
     */
    private Resource thumb;
    /**
     * 封面价
     */
    private int coverPrice;
}
