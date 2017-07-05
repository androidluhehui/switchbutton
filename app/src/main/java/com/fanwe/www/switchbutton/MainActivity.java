package com.fanwe.www.switchbutton;

import android.os.Bundle;

import com.fanwe.library.SDLibrary;
import com.fanwe.library.activity.SDBaseActivity;
import com.fanwe.library.switchbutton.SDSwitchButton;
import com.fanwe.library.utils.SDToast;

public class MainActivity extends SDBaseActivity
{
    private SDSwitchButton sb;

    @Override
    protected void init(Bundle savedInstanceState)
    {
        SDLibrary.getInstance().init(getApplication());
        setContentView(R.layout.activity_main);
        sb = (SDSwitchButton) findViewById(R.id.sb);

        sb.setDebug(true);

        sb.getViewNormal().setBackgroundResource(R.drawable.switch_setting_white_corner_track);
        sb.getViewChecked().setBackgroundResource(R.drawable.switch_setting_main_color_corner_track);
        sb.getViewHandle().setBackgroundResource(R.drawable.switch_setting_white_round_thumb);

        sb.setOnCheckedChangedCallback(new SDSwitchButton.OnCheckedChangedCallback()
        {
            @Override
            public void onCheckedChanged(boolean checked, SDSwitchButton view)
            {
                SDToast.showToast("" + checked);
            }
        });

//        sb.setChecked(true, false, false);
    }
}