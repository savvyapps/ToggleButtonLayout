package com.savvyapps.togglebuttonlayout.sample

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_toggle_button.*

class ToggleButtonLayoutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toggle_button)

        toolbar.setTitle(R.string.app_name)

        toggleButtonLayout.onToggledListener = { toggle, selected ->
            Snackbar.make(root, "Toggle " + toggle.id + " selected state " + selected, Snackbar.LENGTH_LONG)
                    .show()
        }
    }
}
