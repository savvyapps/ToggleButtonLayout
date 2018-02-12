package com.savvyapps.togglebuttonlayout

import android.content.Context
import android.graphics.Color
import android.graphics.drawable.Drawable
import android.support.annotation.AttrRes
import android.util.DisplayMetrics

internal object Utils {

    private var xdpi = java.lang.Float.MIN_VALUE

    fun dpToPx(context: Context, dp: Int): Int {
        if (xdpi == java.lang.Float.MIN_VALUE) {
            xdpi = context.resources.displayMetrics.xdpi
        }
        return Math.round(dp * (xdpi / DisplayMetrics.DENSITY_DEFAULT))
    }

    fun getThemeAttrDrawable(context: Context, @AttrRes attributeDrawable: Int): Drawable? {
        val attrs = intArrayOf(attributeDrawable)
        val ta = context.obtainStyledAttributes(attrs)
        val drawableFromTheme = ta.getDrawable(0)
        ta.recycle()
        return drawableFromTheme
    }

    fun getThemeAttrColor(context: Context, @AttrRes attributeColor: Int): Int {
        val attrs = intArrayOf(attributeColor)
        val ta = context.obtainStyledAttributes(attrs)
        val color = ta.getColor(0, Color.TRANSPARENT)
        ta.recycle()
        return color
    }
}
