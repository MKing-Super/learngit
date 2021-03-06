package com.mk.service;

import com.mk.po.UserProductModelData;
import org.apache.ibatis.annotations.Param;

public interface UserProductModelDataService {
    //向t_user_product_model_data表添加所选商品的详细信息
    public int addUserProductModelData(UserProductModelData userProductModelData);
    //删除所选商品的详细信息
    public int deleteUserProductModelData(Integer productid);
}
