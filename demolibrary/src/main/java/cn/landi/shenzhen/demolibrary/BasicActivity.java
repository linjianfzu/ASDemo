package cn.landi.shenzhen.demolibrary;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by lin on 2017/10/15.
 */

public abstract class BasicActivity extends AppCompatActivity {

    protected Context context;

    /**
     * 初始化界面
     */
    protected abstract void initView();

    /**
     * 初始化数据
     */
    protected abstract void initData();
}
