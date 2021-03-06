package com.torn.scratchcard;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;

import com.alibaba.weex.plugin.annotation.WeexComponent;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.dom.WXDomObject;
import com.taobao.weex.ui.component.WXComponent;
import com.taobao.weex.ui.component.WXVContainer;
import com.torn.scratchcard.lib.ScratchAwardView;

import java.util.ArrayList;
import java.util.List;

/**
 * 刮刮卡
 * https://github.com/panpf/scratch-award-view
 */
@WeexComponent(names = {"tr-scratchcard"})
public class ScratchcardComponent extends WXComponent<FrameLayout> {

    public ScratchcardComponent(WXSDKInstance instance, WXDomObject dom, WXVContainer parent) {
        super(instance, dom, parent);
    }

    public ScratchcardComponent(WXSDKInstance instance, WXDomObject dom, WXVContainer parent, int type) {
        super(instance, dom, parent, type);
    }

    @Override
    protected FrameLayout initComponentHostView(@NonNull Context context) {
        FrameLayout view = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.view_scratch, null);
        final ScratchAwardView scratchAwardView = (ScratchAwardView) view.findViewById(R.id.rubberView_main);
        scratchAwardView.enableAcrossMonitor(view.findViewById(R.id.text_main), new ScratchAwardView.OnAcrossHintViewListener() {
            private boolean across;

            @Override
            public void onAcrossHintView(View hintView) {
                if (!across) {
                    across = true;
                    scratchAwardView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                        }
                    });
                }
            }
        });
        return view;
    }
}
