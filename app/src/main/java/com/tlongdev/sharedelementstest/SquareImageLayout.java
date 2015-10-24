package com.tlongdev.sharedelementstest;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

public class SquareImageLayout extends ImageView {
    public SquareImageLayout(Context context) {
        super(context);
    }

    public SquareImageLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SquareImageLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(getMeasuredWidth(), getMeasuredWidth());
    }
}
