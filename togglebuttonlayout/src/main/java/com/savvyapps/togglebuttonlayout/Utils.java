package com.savvyapps.togglebuttonlayout;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.annotation.AttrRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.DisplayMetrics;

class Utils {

    private static float xdpi = Float.MIN_VALUE;

    public static int dpToPx(Context context, int dp) {
        if (xdpi == Float.MIN_VALUE) {
            xdpi = context.getResources().getDisplayMetrics().xdpi;
        }
        return Math.round(dp * (xdpi / DisplayMetrics.DENSITY_DEFAULT));
    }

    @Nullable
    public static Drawable getThemeAttrDrawable(@NonNull Context context, @AttrRes int attributeDrawable) {
        int[] attrs = new int[]{attributeDrawable};
        TypedArray ta = context.obtainStyledAttributes(attrs);
        Drawable drawableFromTheme = ta.getDrawable(0);
        ta.recycle();
        return drawableFromTheme;
    }

    public static int getThemeAttrColor(@NonNull Context context, @AttrRes int attributeColor) {
        int[] attrs = new int[]{attributeColor};
        TypedArray ta = context.obtainStyledAttributes(attrs);
        int color = ta.getColor(0, Color.TRANSPARENT);
        ta.recycle();
        return color;
    }
}
