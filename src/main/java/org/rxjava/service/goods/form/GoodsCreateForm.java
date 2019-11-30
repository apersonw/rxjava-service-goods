package org.rxjava.service.goods.form;

import lombok.Data;
import org.rxjava.common.core.entity.Image;
import org.rxjava.service.goods.status.GoodsStatus;
import org.rxjava.service.goods.type.ExcessType;

import javax.validation.constraints.NotEmpty;
import java.util.List;

/**
 * @author happy 2019-03-27 23:09
 */
@Data
public class GoodsCreateForm {
    private String id;
    /**
     * 商品名称
     */
    @NotEmpty
    private String name;
    /**
     * 缩略图
     */
    private Image thumb;
    /**
     * 商品描述
     */
    private String desc;
    /**
     * 类目Id
     */
    private String categoryId;
    /**
     * 品牌Id
     */
    private String brandId;
    /**
     * 商品状态
     */
    private String status = GoodsStatus.INIT.name();
    /**
     * 优先级
     */
    private int priority;
    /**
     * 标签
     */
    private List<String> tags;
    /**
     * 超售，默认不允许
     */
    private String excess = ExcessType.NOTALLOWED.name();
}
