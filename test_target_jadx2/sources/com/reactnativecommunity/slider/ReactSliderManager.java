package com.reactnativecommunity.slider;

import android.content.Context;
import android.view.View;
import android.widget.SeekBar;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.C1944g0;
import com.facebook.react.uimanager.F0;
import com.facebook.react.uimanager.L0;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.c1;
import com.facebook.yoga.p;
import com.facebook.yoga.q;
import h5.C3277x;
import h5.InterfaceC3279y;
import java.util.Map;

@K4.a(name = "RNCSlider")
/* loaded from: classes2.dex */
public class ReactSliderManager extends SimpleViewManager<com.reactnativecommunity.slider.a> implements InterfaceC3279y {
    private static final SeekBar.OnSeekBarChangeListener ON_CHANGE_LISTENER = new a();
    private final c1 mDelegate = new C3277x(this);

    class a implements SeekBar.OnSeekBarChangeListener {
        a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            com.reactnativecommunity.slider.a aVar = (com.reactnativecommunity.slider.a) seekBar;
            int c10 = aVar.c(i10);
            seekBar.setProgress(c10);
            ReactContext reactContext = (ReactContext) seekBar.getContext();
            int id2 = seekBar.getId();
            L0.c(reactContext, id2).c(new b(id2, aVar.f(c10), z10));
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            ReactContext reactContext = (ReactContext) seekBar.getContext();
            int id2 = seekBar.getId();
            com.reactnativecommunity.slider.a aVar = (com.reactnativecommunity.slider.a) seekBar;
            aVar.d(true);
            L0.c(reactContext, id2).c(new f(id2, aVar.f(seekBar.getProgress())));
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            ReactContext reactContext = (ReactContext) seekBar.getContext();
            com.reactnativecommunity.slider.a aVar = (com.reactnativecommunity.slider.a) seekBar;
            aVar.d(false);
            int id2 = seekBar.getId();
            L0.c(reactContext, id2).c(new e(id2, aVar.f(seekBar.getProgress())));
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected c1 getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        return c.b();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return c.c();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNCSlider";
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public long measure(Context context, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f10, p pVar, float f11, p pVar2, float[] fArr) {
        com.reactnativecommunity.slider.a aVar = new com.reactnativecommunity.slider.a(context, null);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        aVar.measure(makeMeasureSpec, makeMeasureSpec);
        return q.a(C1944g0.e(aVar.getMeasuredWidth()), C1944g0.e(aVar.getMeasuredHeight()));
    }

    @Override // h5.InterfaceC3279y
    public void setMaximumTrackImage(com.reactnativecommunity.slider.a aVar, ReadableMap readableMap) {
    }

    @Override // h5.InterfaceC3279y
    public void setMinimumTrackImage(com.reactnativecommunity.slider.a aVar, ReadableMap readableMap) {
    }

    @Override // h5.InterfaceC3279y
    public void setTapToSeek(com.reactnativecommunity.slider.a aVar, boolean z10) {
    }

    @Override // h5.InterfaceC3279y
    public void setTrackImage(com.reactnativecommunity.slider.a aVar, ReadableMap readableMap) {
    }

    @Override // h5.InterfaceC3279y
    public void setVertical(com.reactnativecommunity.slider.a aVar, boolean z10) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(F0 f02, com.reactnativecommunity.slider.a aVar) {
        aVar.setOnSeekBarChangeListener(ON_CHANGE_LISTENER);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public com.reactnativecommunity.slider.a createViewInstance(F0 f02) {
        return c.a(f02);
    }

    @Override // h5.InterfaceC3279y
    @Z4.a(name = "accessibilityIncrements")
    public void setAccessibilityIncrements(com.reactnativecommunity.slider.a aVar, ReadableArray readableArray) {
        c.d(aVar, readableArray);
    }

    @Override // h5.InterfaceC3279y
    @Z4.a(name = "accessibilityUnits")
    public void setAccessibilityUnits(com.reactnativecommunity.slider.a aVar, String str) {
        c.e(aVar, str);
    }

    @Override // h5.InterfaceC3279y
    @Z4.a(defaultBoolean = false, name = "disabled")
    public void setDisabled(com.reactnativecommunity.slider.a aVar, boolean z10) {
        c.f(aVar, z10);
    }

    @Override // h5.InterfaceC3279y
    @Z4.a(defaultBoolean = false, name = "inverted")
    public void setInverted(com.reactnativecommunity.slider.a aVar, boolean z10) {
        c.g(aVar, z10);
    }

    @Override // h5.InterfaceC3279y
    @Z4.a(name = "lowerLimit")
    public void setLowerLimit(com.reactnativecommunity.slider.a aVar, float f10) {
        c.h(aVar, f10);
    }

    @Override // h5.InterfaceC3279y
    @Z4.a(customType = "Color", name = "maximumTrackTintColor")
    public void setMaximumTrackTintColor(com.reactnativecommunity.slider.a aVar, Integer num) {
        c.i(aVar, num);
    }

    @Override // h5.InterfaceC3279y
    @Z4.a(defaultFloat = 0.0f, name = "maximumValue")
    public void setMaximumValue(com.reactnativecommunity.slider.a aVar, double d10) {
        c.j(aVar, d10);
    }

    @Override // h5.InterfaceC3279y
    @Z4.a(customType = "Color", name = "minimumTrackTintColor")
    public void setMinimumTrackTintColor(com.reactnativecommunity.slider.a aVar, Integer num) {
        c.k(aVar, num);
    }

    @Override // h5.InterfaceC3279y
    @Z4.a(defaultFloat = 0.0f, name = "minimumValue")
    public void setMinimumValue(com.reactnativecommunity.slider.a aVar, double d10) {
        c.l(aVar, d10);
    }

    @Override // h5.InterfaceC3279y
    @Z4.a(defaultFloat = 0.0f, name = "step")
    public void setStep(com.reactnativecommunity.slider.a aVar, double d10) {
        c.m(aVar, d10);
    }

    @Override // h5.InterfaceC3279y
    public void setTestID(com.reactnativecommunity.slider.a aVar, String str) {
        super.setTestId(aVar, str);
    }

    @Override // h5.InterfaceC3279y
    @Z4.a(name = "thumbImage")
    public void setThumbImage(com.reactnativecommunity.slider.a aVar, ReadableMap readableMap) {
        c.n(aVar, readableMap);
    }

    @Override // h5.InterfaceC3279y
    @Z4.a(customType = "Color", name = "thumbTintColor")
    public void setThumbTintColor(com.reactnativecommunity.slider.a aVar, Integer num) {
        c.o(aVar, num);
    }

    @Override // h5.InterfaceC3279y
    @Z4.a(name = "upperLimit")
    public void setUpperLimit(com.reactnativecommunity.slider.a aVar, float f10) {
        c.p(aVar, f10);
    }

    @Override // h5.InterfaceC3279y
    @Z4.a(defaultFloat = 0.0f, name = "value")
    public void setValue(com.reactnativecommunity.slider.a aVar, float f10) {
        c.q(aVar, f10);
    }
}
