package com.savvyapps.togglebuttonlayout.sample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.savvyapps.togglebuttonlayout.Toggle;
import com.savvyapps.togglebuttonlayout.ToggleButtonLayout;

public class ToggleButtonLayoutActivity extends AppCompatActivity {

    ViewGroup root;
    ToggleButtonLayout toggleButtonLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle_button);

        root =  findViewById(R.id.root);
        toggleButtonLayout = findViewById(R.id.toggle);

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.app_name);

        Button buttonSelectMiddle = findViewById(R.id.button_set_middle_selected);
        buttonSelectMiddle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleButtonLayout.setToggled(R.id.toggle_center, true);
            }
        });

        toggleButtonLayout.setOnToggleSelectedListener(new ToggleButtonLayout.OnToggledListener() {
            @Override
            public void onToggled(Toggle toggle, boolean selected) {
                Snackbar.make(root, "Toggle " + toggle.getId() + " selected state " + selected, Snackbar.LENGTH_LONG)
                        .show();
            }
        });
    }
}
