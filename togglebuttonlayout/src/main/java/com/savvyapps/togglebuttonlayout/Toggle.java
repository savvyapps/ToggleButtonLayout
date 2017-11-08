package com.savvyapps.togglebuttonlayout;

import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;

/**
 * An item within a {@link ToggleButtonLayout}
 */
public class Toggle {

    private int id;
    private Drawable icon;
    private CharSequence title;
    protected boolean selected;

    public Toggle(int id, @Nullable Drawable icon, @Nullable CharSequence title) {
        if (id == 0) {
            throw new IllegalArgumentException("Toggle must have a non-zero id");
        }
        this.id = id;
        this.icon = icon;
        this.title = title;
    }

    /**
     * The ID provided within the Toggle
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * The icon drawable inflated by the menu resource or passed during creation
     * @return the icon
     */
    public Drawable getIcon() {
        return icon;
    }

    public CharSequence getTitle() {
        return title;
    }

    /**
     * The selection state of the toggle
     * @return true if toggle is selected, false otherwise
     */
    public boolean isSelected() {
        return selected;
    }
}
