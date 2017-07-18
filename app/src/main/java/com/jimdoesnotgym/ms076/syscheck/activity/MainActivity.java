package com.jimdoesnotgym.ms076.syscheck.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.jimdoesnotgym.ms076.syscheck.R;
import com.jimdoesnotgym.ms076.syscheck.widget.CanaroTextView;
import com.yalantis.guillotine.animation.GuillotineAnimation;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private static final long RIPPLE_DURATION = 250;

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.root)
    FrameLayout root;
    @BindView(R.id.content_hamburger)
    View contentHamburger;
    /*@BindView(R.id.system_menu_text)
    CanaroTextView systemView;
    @BindView(R.id.battery_menu_text)
    CanaroTextView batteryView;
    @BindView(R.id.network_menu_text)
    CanaroTextView networkView;
    @BindView(R.id.apps_menu_text)
    CanaroTextView appsView;
    @BindView(R.id.hardware_menu_text)
    CanaroTextView hardwareView;*/
    private CanaroTextView systemView;
    private CanaroTextView batteryView;
    private CanaroTextView networkView;
    private CanaroTextView appsView;
    private CanaroTextView hardwareView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        if (toolbar != null) {
            setSupportActionBar(toolbar);
            getSupportActionBar().setTitle(null);
        }

        createGuillotineMenu();
        setCanaroTextView();
        setMenuOnClickListener();
    }

    private void createGuillotineMenu(){
        View guillotineMenu = LayoutInflater.from(this).inflate(R.layout.main_menu, null);
        root.addView(guillotineMenu);

        new GuillotineAnimation.GuillotineBuilder(guillotineMenu, guillotineMenu.findViewById(R.id.guillotine_hamburger), contentHamburger)
                .setStartDelay(RIPPLE_DURATION)
                .setActionBarViewForAnimation(toolbar)
                .setClosedOnStart(true)
                .build();
    }

    private void setCanaroTextView() {
        systemView = (CanaroTextView)findViewById(R.id.system_menu_text);
        batteryView = (CanaroTextView)findViewById(R.id.battery_menu_text);
        networkView = (CanaroTextView)findViewById(R.id.network_menu_text);
        appsView = (CanaroTextView)findViewById(R.id.apps_menu_text);
        hardwareView = (CanaroTextView)findViewById(R.id.hardware_menu_text);
    }

    private void setMenuOnClickListener() {
        systemView.setOnClickListener(this);
        batteryView.setOnClickListener(this);
        networkView.setOnClickListener(this);
        appsView.setOnClickListener(this);
        hardwareView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.system_menu_text:
                //TODO
                break;

            case R.id.battery_menu_text:
                //TODO
                Toast.makeText(this, "batteryView", Toast.LENGTH_SHORT).show();
                break;

            case R.id.network_menu_text:
                //TODO
                break;

            case R.id.apps_menu_text:
                //TODO
                break;

            case R.id.hardware_menu_text:
                //TODO
                break;
        }
    }
}
