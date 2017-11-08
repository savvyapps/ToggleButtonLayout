package com.savvyapps.togglebuttonlayout;

import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;

/**
 * An item within a {@link ToggleButtonLayout}
 */
public class Toggle {

    private int id;
    private Drawable icon;
    private CharSequence title;
    protected boolean selected;

    public Toggle(int id, @NonNull Drawable icon, @NonNull CharSequence title) {
        if (id == 0) {
            throw new IllegalArgumentException("Toggle must have a non-zero id");
        }
        this.id = id;
        this.icon = icon;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public Drawable getIcon() {
        return icon;
    }

    public CharSequence getTitle() {
        return title;
    }

    public boolean isSelected() {
        return selected;
    }
}
