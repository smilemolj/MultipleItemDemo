package com.smilemolj.multipleitemdemo;

import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

public class MultiItemAdapter extends BaseMultiItemQuickAdapter<MtestEntity, BaseViewHolder>  {

    /**
     * Same as QuickAdapter#QuickAdapter(Context,int) but with
     * some initialization data.
     *
     * @param data A new list is created out of this one to avoid mutable list
     */
    public MultiItemAdapter(List<MtestEntity> data) {
        super(data);

        addItemType(1, R.layout.item_test_one);
        addItemType(2, R.layout.item_test_two);
        addItemType(3, R.layout.item_test_threed);
    }

    @Override
    protected void convert(BaseViewHolder helper, MtestEntity item) {
        int viewType = helper.getItemViewType();
        switch (viewType) {
            case 1:
                helper.setText(R.id.button, item.name)
                        .addOnClickListener(R.id.button);
                break;
            case 2:
                helper.setImageResource(R.id.imageView,R.mipmap.ic_launcher )
                        .addOnClickListener(R.id.imageView);
                break;
            case 3:
                helper.setText(R.id.textView, item.name)
                        .addOnClickListener(R.id.textView);
                break;
            default:
                break;
        }
    }
}
