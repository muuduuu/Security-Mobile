package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableMap;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public class x extends b {

    /* renamed from: f, reason: collision with root package name */
    public double f21376f;

    /* renamed from: g, reason: collision with root package name */
    public double f21377g;

    /* renamed from: h, reason: collision with root package name */
    private c f21378h;

    public x(ReadableMap readableMap) {
        this.f21376f = readableMap != null ? readableMap.getDouble("value") : Double.NaN;
        this.f21377g = readableMap != null ? readableMap.getDouble("offset") : 0.0d;
    }

    @Override // com.facebook.react.animated.b
    public String e() {
        return "ValueAnimatedNode[" + this.f21267d + "]: value: " + this.f21376f + " offset: " + this.f21377g;
    }

    public final void i() {
        this.f21377g += this.f21376f;
        this.f21376f = 0.0d;
    }

    public final void j() {
        this.f21376f += this.f21377g;
        this.f21377g = 0.0d;
    }

    public Object k() {
        return null;
    }

    public final double l() {
        if (Double.isNaN(this.f21377g + this.f21376f)) {
            h();
        }
        return this.f21377g + this.f21376f;
    }

    public final void m() {
        c cVar = this.f21378h;
        if (cVar != null) {
            cVar.a(l());
        }
    }

    public final void n(c cVar) {
        this.f21378h = cVar;
    }

    public /* synthetic */ x(ReadableMap readableMap, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : readableMap);
    }
}
