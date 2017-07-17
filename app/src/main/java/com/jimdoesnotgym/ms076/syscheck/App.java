package com.jimdoesnotgym.ms076.syscheck;

import android.app.Application;
import android.graphics.Typeface;

/**
 * Created by ms076 on 2017-07-17.
 */

public class App extends Application{
    private static final String CANARO_EXTRA_BOLD_PATH = "fonts/canaro_extra_bold.otf";
    public static Typeface canaroExtraBold;

    @Override
    public void onCreate() {
        super.onCreate();
        initTypeface();
    }

    private void initTypeface() {
        canaroExtraBold = Typeface.createFromAsset(getAssets(), CANARO_EXTRA_BOLD_PATH);

    }
}
