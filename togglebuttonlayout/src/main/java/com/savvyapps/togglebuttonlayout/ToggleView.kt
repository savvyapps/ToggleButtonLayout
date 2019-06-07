package com.savvyapps.togglebuttonlayout

import android.annotation.SuppressLint
import android.content.Context
import androidx.annotation.LayoutRes
import android.view.View
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView

/**
 * Default view for Toggle. Be sure to use references [android.R.id.text1] and
 * [android.R.id.icon] if using your own layout
 */
@Suppress("MemberVisibilityCanBePrivate")
@SuppressLint("ViewConstructor")
class ToggleView(context: Context, toggle: Toggle, @LayoutRes layoutRes: Int?) : FrameLayout(context) {
    val textView: TextView?
    val imageView: ImageView?

    init {
        id = toggle.id
        if (layoutRes != null) {
            View.inflate(context, layoutRes, this)
            textView = findViewById(android.R.id.text1)
            imageView = findViewById(android.R.id.icon)
        } else {
            textView = TextView(context)
            imageView = ImageView(context)
            addView(imageView)
            addView(textView)
            val eightDp = Utils.dpToPx(getContext(), 8)
            setPadding(eightDp, eightDp, eightDp, eightDp)
        }
        setTag(R.id.tb_toggle_id, toggle)
        textView?.text = toggle.title
        if (toggle.icon != null) {
            imageView?.setImageDrawable(toggle.icon)
        }
        foreground = Utils.getThemeAttrDrawable(getContext(), R.attr.selectableItemBackground)
    }
}
