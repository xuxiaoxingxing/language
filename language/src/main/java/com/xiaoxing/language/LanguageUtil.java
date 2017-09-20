package com.xiaoxing.language;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;

import java.util.Locale;

/**
 * 国际化，设置app语言切换
 * Created by ASUS on 2017/9/20.
 */

public class LanguageUtil {


    /**
     * 设置app语言切换
     *
     * @param context
     * @param lan     zh_simple:简体中文；zh_tw：繁体 ；en:英文
     */
    public static void getLanguage(Context context, String lan) {
        Resources resources = context.getResources();
        Configuration config = resources.getConfiguration();
        DisplayMetrics dm = resources.getDisplayMetrics();
        if (lan.equals("zh_simple")) {
            config.locale = Locale.SIMPLIFIED_CHINESE;
        } else if (lan.equals("zh_tw")) {
            config.locale = Locale.TRADITIONAL_CHINESE;
        } else if (lan.equals("en")) {
            config.locale = Locale.ENGLISH;
        } else {
            config.locale = Locale.getDefault();
        }
        resources.updateConfiguration(config, dm);
    }


}
