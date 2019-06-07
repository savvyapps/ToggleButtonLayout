package com.savvyapps.togglebuttonlayout

import android.graphics.drawable.Drawable

/**
 * An item within a [ToggleButtonLayout]
 */
data class Toggle(

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
        val title: CharSequence?
) {

    /**
     * The selection state of the toggle
     */
    var isSelected: Boolean = false


    /**
     * Get the parent view of the toggle. Null if its view has not been inflated
     */
    var toggleButtonLayout: ToggleButtonLayout? = null
        internal set

    /**
     * The current toggle view. Null if its view has not been inflated
     */
    var toggleView: ToggleView? = null
        internal set

    init {
        if (id == 0) {
            throw IllegalArgumentException("Toggle must have a non-zero id")
        }
    }
}
