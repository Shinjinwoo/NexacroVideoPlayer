package com.androidruntime;

import com.nexacro.NexacroUpdatorActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends NexacroUpdatorActivity {

    public MainActivity() {
        super();

        //VideoSample
            setBootstrapURL("http://smart.tobesoft.co.kr/17.1/VideoPlayerSample/_android_/start_android.json");
            setProjectURL("http://smart.tobesoft.co.kr/17.1/VideoPlayerSample/_android_/");

        this.setStartupClass(NexacroActivityExt.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Intent intent = getIntent();
        if(intent != null) {
            String bootstrapURL = intent.getStringExtra("bootstrapURL");
            String projectUrl = intent.getStringExtra("projectUrl");
            if(bootstrapURL != null) {
                setBootstrapURL(bootstrapURL);
                setProjectURL(projectUrl);
            }
        }

        super.onCreate(savedInstanceState);
    }

    @Override
    public void setContentView(View view) {
        super.setContentView(view);
    }

}