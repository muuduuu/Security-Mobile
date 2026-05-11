package com.swmansion.rnscreens;

import android.content.Context;
import android.view.ViewGroup;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.C1944g0;
import com.facebook.react.uimanager.E0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.swmansion.rnscreens.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2935e extends ViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public static final a f29949d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private E0 f29950a;

    /* renamed from: b, reason: collision with root package name */
    private float f29951b;

    /* renamed from: c, reason: collision with root package name */
    private float f29952c;

    /* renamed from: com.swmansion.rnscreens.e$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public AbstractC2935e(Context context) {
        super(context);
    }

    public final void a(int i10, int i11) {
        b(i10, i11);
    }

    public final void b(int i10, int i11) {
        float f10 = i10;
        float e10 = C1944g0.e(f10);
        float f11 = i11;
        float e11 = C1944g0.e(f11);
        if (Math.abs(this.f29951b - f10) >= 0.9f || Math.abs(this.f29952c - f11) >= 0.9f) {
            this.f29951b = e10;
            this.f29952c = e11;
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putDouble("paddingStart", e10);
            writableNativeMap.putDouble("paddingEnd", e11);
            E0 e02 = this.f29950a;
            if (e02 != null) {
                e02.updateState(writableNativeMap);
            }
        }
    }

    public final void setStateWrapper(E0 e02) {
        this.f29950a = e02;
    }
}
