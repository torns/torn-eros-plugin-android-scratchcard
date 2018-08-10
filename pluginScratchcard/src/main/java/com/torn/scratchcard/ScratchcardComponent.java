package com.torn.scratchcard;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;

import com.alibaba.weex.plugin.annotation.WeexComponent;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.dom.WXDomObject;
import com.taobao.weex.ui.component.WXComponent;
import com.taobao.weex.ui.component.WXVContainer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liuyuanxiao on 2018/5/4.
 * 基于https://github.com/yukunkun/RotateView
 */
@WeexComponent(names = {"tr-scratchcard"})
public class ScratchcardComponent extends WXComponent<View> {

    List<Integer> images = new ArrayList<>();
    List<String> names = new ArrayList<>();

    public ScratchcardComponent(WXSDKInstance instance, WXDomObject dom, WXVContainer parent) {
        super(instance, dom, parent);
    }

    public ScratchcardComponent(WXSDKInstance instance, WXDomObject dom, WXVContainer parent, int type) {
        super(instance, dom, parent, type);
    }

    @Override
    protected View initComponentHostView(@NonNull Context context) {
        View view = new View(context);
        return view;
    }
}
