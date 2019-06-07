package com.savvyapps.togglebuttonlayout.sample

import android.graphics.Color
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_toggle_button.*

class ToggleButtonLayoutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toggle_button)

        toolbar.setTitle(R.string.app_name)

        toggleButtonLayout.onToggledListener = { _, toggle, selected ->
            Snackbar.make(root, "Toggle ${toggle.id} selected state $selected", Snackbar.LENGTH_LONG)
                    .show()
        }

        buttonSetSelectedColor.setOnClickListener {
            val primary = ContextCompat.getColor(this, R.color.colorPrimary)
            val accent = ContextCompat.getColor(this, R.color.colorAccent)
            if (toggleButtonLayoutText.selectedColor == accent) {
                toggleButtonLayoutText.selectedColor = primary
            } else {
                toggleButtonLayoutText.selectedColor = accent
            }
        }

        buttonSetDividerColor.setOnClickListener {
            val gray = Color.GRAY
            val red = Color.RED
            if (toggleButtonLayoutText.dividerColor == gray) {
                toggleButtonLayoutText.dividerColor = red
            } else {
                toggleButtonLayoutText.dividerColor = gray
            }
        }
    }
}
