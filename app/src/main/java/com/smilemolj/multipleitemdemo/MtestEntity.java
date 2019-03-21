package com.smilemolj.multipleitemdemo;

import com.chad.library.adapter.base.entity.MultiItemEntity;

public class MtestEntity implements MultiItemEntity {
    public String name;
    public int type;
    @Override
    public int getItemType() {
        return type;
    }
}
