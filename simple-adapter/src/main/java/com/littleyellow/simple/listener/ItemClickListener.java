package com.littleyellow.simple.listener;

import android.view.MotionEvent;
import android.view.View;

/**
 * Created by 小黄 on 2018/12/17.
 */

public interface ItemClickListener {

    void onItemClick(View view, int position,MotionEvent e);

}
