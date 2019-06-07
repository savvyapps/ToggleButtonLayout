package com.savvyapps.togglebuttonlayout

import android.graphics.drawable.Drawable

/**
 * An item within a [ToggleButtonLayout]
 */
class Toggle(

        /**
         * The ID provided within the Toggle
         */
        val id: Int,

        /**
         * The icon drawable inflated by the menu resource or passed during creation
         */
        val icon: Drawable?,

        /**
         * Optional title
         */
        val title: CharSequence?) {

    /**
     * The selection state of the toggle
     */
    var isSelected: Boolean = false

    internal var parentRef: ToggleButtonLayout? = null

    fun getToggleButtonLayout(): ToggleButtonLayout? {
        return parentRef
    }

    init {
        if (id == 0) {
            throw IllegalArgumentException("Toggle must have a non-zero id")
        }
    }
}
