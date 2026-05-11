package com.facebook.react.views.switchview;

import android.content.Context;
import android.view.View;
import android.widget.CompoundButton;
import co.hyperverge.hypersnapsdk.utils.AppConstants;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.C1944g0;
import com.facebook.react.uimanager.F0;
import com.facebook.react.uimanager.L0;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.V;
import com.facebook.react.uimanager.c1;
import com.facebook.yoga.o;
import com.facebook.yoga.p;
import com.facebook.yoga.q;
import com.facebook.yoga.r;
import h5.C3244g;
import h5.InterfaceC3246h;

/* loaded from: classes2.dex */
public class ReactSwitchManager extends SimpleViewManager<com.facebook.react.views.switchview.a> implements InterfaceC3246h {
    private static final CompoundButton.OnCheckedChangeListener ON_CHECKED_CHANGE_LISTENER = new a();
    public static final String REACT_CLASS = "AndroidSwitch";
    private final c1 mDelegate = new C3244g(this);

    class a implements CompoundButton.OnCheckedChangeListener {
        a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            ReactContext reactContext = (ReactContext) compoundButton.getContext();
            int id2 = compoundButton.getId();
            L0.c(reactContext, id2).c(new com.facebook.react.views.switchview.b(L0.e(reactContext), id2, z10));
        }
    }

    static class b extends V implements o {

        /* renamed from: A, reason: collision with root package name */
        private int f22748A;

        /* renamed from: B, reason: collision with root package name */
        private int f22749B;

        /* renamed from: C, reason: collision with root package name */
        private boolean f22750C;

        private void w1() {
            Y0(this);
        }

        @Override // com.facebook.yoga.o
        public long W(r rVar, float f10, p pVar, float f11, p pVar2) {
            if (!this.f22750C) {
                com.facebook.react.views.switchview.a aVar = new com.facebook.react.views.switchview.a(H());
                aVar.setShowText(false);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                aVar.measure(makeMeasureSpec, makeMeasureSpec);
                this.f22748A = aVar.getMeasuredWidth();
                this.f22749B = aVar.getMeasuredHeight();
                this.f22750C = true;
            }
            return q.b(this.f22748A, this.f22749B);
        }

        private b() {
            w1();
        }
    }

    private static void setValueInternal(com.facebook.react.views.switchview.a aVar, boolean z10) {
        aVar.setOnCheckedChangeListener(null);
        aVar.setOn(z10);
        aVar.setOnCheckedChangeListener(ON_CHECKED_CHANGE_LISTENER);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: getDelegate */
    protected c1 getMDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.SimpleViewManager, com.facebook.react.uimanager.ViewManager
    public Class getShadowNodeClass() {
        return b.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public long measure(Context context, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f10, p pVar, float f11, p pVar2, float[] fArr) {
        com.facebook.react.views.switchview.a aVar = new com.facebook.react.views.switchview.a(context);
        aVar.setShowText(false);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        aVar.measure(makeMeasureSpec, makeMeasureSpec);
        return q.a(C1944g0.e(aVar.getMeasuredWidth()), C1944g0.e(aVar.getMeasuredHeight()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(F0 f02, com.facebook.react.views.switchview.a aVar) {
        aVar.setOnCheckedChangeListener(ON_CHECKED_CHANGE_LISTENER);
    }

    @Override // com.facebook.react.uimanager.SimpleViewManager, com.facebook.react.uimanager.ViewManager
    public V createShadowNodeInstance() {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public com.facebook.react.views.switchview.a createViewInstance(F0 f02) {
        com.facebook.react.views.switchview.a aVar = new com.facebook.react.views.switchview.a(f02);
        aVar.setShowText(false);
        return aVar;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(com.facebook.react.views.switchview.a aVar, String str, ReadableArray readableArray) {
        str.hashCode();
        if (str.equals("setNativeValue")) {
            boolean z10 = false;
            if (readableArray != null && readableArray.getBoolean(0)) {
                z10 = true;
            }
            setValueInternal(aVar, z10);
        }
    }

    @Override // h5.InterfaceC3246h
    @Z4.a(defaultBoolean = false, name = "disabled")
    public void setDisabled(com.facebook.react.views.switchview.a aVar, boolean z10) {
        aVar.setEnabled(!z10);
    }

    @Override // h5.InterfaceC3246h
    @Z4.a(defaultBoolean = true, name = AppConstants.VIDEO_RECORDING_ENABLED)
    public void setEnabled(com.facebook.react.views.switchview.a aVar, boolean z10) {
        aVar.setEnabled(z10);
    }

    @Override // h5.InterfaceC3246h
    public void setNativeValue(com.facebook.react.views.switchview.a aVar, boolean z10) {
        setValueInternal(aVar, z10);
    }

    @Override // h5.InterfaceC3246h
    @Z4.a(name = "on")
    public void setOn(com.facebook.react.views.switchview.a aVar, boolean z10) {
        setValueInternal(aVar, z10);
    }

    @Override // h5.InterfaceC3246h
    @Z4.a(customType = "Color", name = "thumbColor")
    public void setThumbColor(com.facebook.react.views.switchview.a aVar, Integer num) {
        aVar.setThumbColor(num);
    }

    @Override // h5.InterfaceC3246h
    @Z4.a(customType = "Color", name = "thumbTintColor")
    public void setThumbTintColor(com.facebook.react.views.switchview.a aVar, Integer num) {
        setThumbColor(aVar, num);
    }

    @Override // h5.InterfaceC3246h
    @Z4.a(customType = "Color", name = "trackColorForFalse")
    public void setTrackColorForFalse(com.facebook.react.views.switchview.a aVar, Integer num) {
        aVar.setTrackColorForFalse(num);
    }

    @Override // h5.InterfaceC3246h
    @Z4.a(customType = "Color", name = "trackColorForTrue")
    public void setTrackColorForTrue(com.facebook.react.views.switchview.a aVar, Integer num) {
        aVar.setTrackColorForTrue(num);
    }

    @Override // h5.InterfaceC3246h
    @Z4.a(customType = "Color", name = "trackTintColor")
    public void setTrackTintColor(com.facebook.react.views.switchview.a aVar, Integer num) {
        aVar.setTrackColor(num);
    }

    @Override // h5.InterfaceC3246h
    @Z4.a(name = "value")
    public void setValue(com.facebook.react.views.switchview.a aVar, boolean z10) {
        setValueInternal(aVar, z10);
    }
}
