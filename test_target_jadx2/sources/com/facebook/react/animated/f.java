package com.facebook.react.animated;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import u5.C4870a;

/* loaded from: classes.dex */
public final class f extends b implements d {

    /* renamed from: n, reason: collision with root package name */
    public static final a f21272n = new a(null);

    /* renamed from: f, reason: collision with root package name */
    private final p f21273f;

    /* renamed from: g, reason: collision with root package name */
    private final ReactApplicationContext f21274g;

    /* renamed from: h, reason: collision with root package name */
    private int f21275h;

    /* renamed from: i, reason: collision with root package name */
    private int f21276i;

    /* renamed from: j, reason: collision with root package name */
    private int f21277j;

    /* renamed from: k, reason: collision with root package name */
    private int f21278k;

    /* renamed from: l, reason: collision with root package name */
    private ReadableMap f21279l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f21280m;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Context b(b bVar) {
            List list = bVar.f21264a;
            if (list == null) {
                return null;
            }
            Iterator it = list.iterator();
            if (!it.hasNext()) {
                return null;
            }
            b bVar2 = (b) it.next();
            if (!(bVar2 instanceof r)) {
                return f.f21272n.b(bVar2);
            }
            View k10 = ((r) bVar2).k();
            if (k10 != null) {
                return k10.getContext();
            }
            return null;
        }

        private a() {
        }
    }

    public f(ReadableMap config, p nativeAnimatedNodesManager, ReactApplicationContext reactApplicationContext) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(nativeAnimatedNodesManager, "nativeAnimatedNodesManager");
        Intrinsics.checkNotNullParameter(reactApplicationContext, "reactApplicationContext");
        this.f21273f = nativeAnimatedNodesManager;
        this.f21274g = reactApplicationContext;
        a(config);
    }

    private final Context j() {
        Activity currentActivity = this.f21274g.getCurrentActivity();
        return currentActivity != null ? currentActivity : f21272n.b(this);
    }

    private final void k() {
        Context j10;
        if (this.f21279l == null || this.f21280m || (j10 = j()) == null) {
            return;
        }
        Integer color = ColorPropConverter.getColor(this.f21279l, j10);
        x xVar = (x) this.f21273f.k(this.f21275h);
        x xVar2 = (x) this.f21273f.k(this.f21276i);
        x xVar3 = (x) this.f21273f.k(this.f21277j);
        x xVar4 = (x) this.f21273f.k(this.f21278k);
        if (xVar != null) {
            Intrinsics.d(color);
            xVar.f21376f = Color.red(color.intValue());
        }
        if (xVar2 != null) {
            Intrinsics.d(color);
            xVar2.f21376f = Color.green(color.intValue());
        }
        if (xVar3 != null) {
            Intrinsics.d(color);
            xVar3.f21376f = Color.blue(color.intValue());
        }
        if (xVar4 != null) {
            Intrinsics.d(color);
            xVar4.f21376f = Color.alpha(color.intValue()) / 255.0d;
        }
        this.f21280m = true;
    }

    @Override // com.facebook.react.animated.d
    public void a(ReadableMap readableMap) {
        if (readableMap == null) {
            this.f21275h = 0;
            this.f21276i = 0;
            this.f21277j = 0;
            this.f21278k = 0;
            this.f21279l = null;
            this.f21280m = false;
            return;
        }
        this.f21275h = readableMap.getInt("r");
        this.f21276i = readableMap.getInt("g");
        this.f21277j = readableMap.getInt("b");
        this.f21278k = readableMap.getInt(C4870a.f43493a);
        this.f21279l = readableMap.getMap("nativeColor");
        this.f21280m = false;
        k();
    }

    @Override // com.facebook.react.animated.b
    public String e() {
        return "ColorAnimatedNode[" + this.f21267d + "]: r: " + this.f21275h + "  g: " + this.f21276i + " b: " + this.f21277j + " a: " + this.f21278k;
    }

    public final int i() {
        k();
        x xVar = (x) this.f21273f.k(this.f21275h);
        x xVar2 = (x) this.f21273f.k(this.f21276i);
        x xVar3 = (x) this.f21273f.k(this.f21277j);
        x xVar4 = (x) this.f21273f.k(this.f21278k);
        return com.facebook.react.views.view.d.b(xVar != null ? xVar.f21376f : 0.0d, xVar2 != null ? xVar2.f21376f : 0.0d, xVar3 != null ? xVar3.f21376f : 0.0d, xVar4 != null ? xVar4.f21376f : 0.0d);
    }
}
