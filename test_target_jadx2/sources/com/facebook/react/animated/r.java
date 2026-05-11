package com.facebook.react.animated;

import a5.C1351a;
import android.view.View;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.UIManager;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import lc.o;

/* loaded from: classes.dex */
public final class r extends b {

    /* renamed from: f, reason: collision with root package name */
    private final p f21335f;

    /* renamed from: g, reason: collision with root package name */
    private int f21336g;

    /* renamed from: h, reason: collision with root package name */
    private final Map f21337h;

    /* renamed from: i, reason: collision with root package name */
    private final JavaOnlyMap f21338i;

    /* renamed from: j, reason: collision with root package name */
    private UIManager f21339j;

    public r(ReadableMap config, p nativeAnimatedNodesManager) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(nativeAnimatedNodesManager, "nativeAnimatedNodesManager");
        this.f21335f = nativeAnimatedNodesManager;
        this.f21336g = -1;
        this.f21338i = new JavaOnlyMap();
        ReadableMap map = config.getMap("props");
        ReadableMapKeySetIterator keySetIterator = map != null ? map.keySetIterator() : null;
        this.f21337h = new LinkedHashMap();
        while (keySetIterator != null && keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            this.f21337h.put(nextKey, Integer.valueOf(map.getInt(nextKey)));
        }
    }

    @Override // com.facebook.react.animated.b
    public String e() {
        return "PropsAnimatedNode[" + this.f21267d + "] connectedViewTag: " + this.f21336g + " propNodeMapping: " + this.f21337h + " propMap: " + this.f21338i;
    }

    public final void i(int i10, UIManager uIManager) {
        if (this.f21336g == -1) {
            this.f21336g = i10;
            this.f21339j = uIManager;
            return;
        }
        throw new JSApplicationIllegalArgumentException("Animated node " + this.f21267d + " is already attached to a view: " + this.f21336g);
    }

    public final void j(int i10) {
        int i11 = this.f21336g;
        if (i11 == i10 || i11 == -1) {
            this.f21336g = -1;
            return;
        }
        throw new JSApplicationIllegalArgumentException("Attempting to disconnect view that has not been connected with the given animated node: " + i10 + " but is connected to view " + this.f21336g);
    }

    public final View k() {
        Object b10;
        try {
            o.a aVar = lc.o.f37128b;
            UIManager uIManager = this.f21339j;
            b10 = lc.o.b(uIManager != null ? uIManager.resolveView(this.f21336g) : null);
        } catch (Throwable th) {
            o.a aVar2 = lc.o.f37128b;
            b10 = lc.o.b(lc.p.a(th));
        }
        return (View) (lc.o.f(b10) ? null : b10);
    }

    public final void l() {
        int i10 = this.f21336g;
        if (i10 == -1 || C1351a.a(i10) == 2) {
            return;
        }
        ReadableMapKeySetIterator keySetIterator = this.f21338i.keySetIterator();
        Intrinsics.checkNotNullExpressionValue(keySetIterator, "keySetIterator(...)");
        while (keySetIterator.hasNextKey()) {
            this.f21338i.putNull(keySetIterator.nextKey());
        }
        UIManager uIManager = this.f21339j;
        if (uIManager != null) {
            uIManager.synchronouslyUpdateViewOnUIThread(this.f21336g, this.f21338i);
        }
    }

    public final void m() {
        if (this.f21336g == -1) {
            return;
        }
        for (Map.Entry entry : this.f21337h.entrySet()) {
            String str = (String) entry.getKey();
            b k10 = this.f21335f.k(((Number) entry.getValue()).intValue());
            if (k10 == null) {
                throw new IllegalArgumentException("Mapped property node does not exist");
            }
            if (k10 instanceof t) {
                ((t) k10).i(this.f21338i);
            } else if (k10 instanceof x) {
                x xVar = (x) k10;
                Object k11 = xVar.k();
                if (k11 instanceof Integer) {
                    this.f21338i.putInt(str, ((Number) k11).intValue());
                } else if (k11 instanceof String) {
                    this.f21338i.putString(str, (String) k11);
                } else {
                    this.f21338i.putDouble(str, xVar.l());
                }
            } else if (k10 instanceof f) {
                this.f21338i.putInt(str, ((f) k10).i());
            } else {
                if (!(k10 instanceof q)) {
                    throw new IllegalArgumentException("Unsupported type of node used in property node " + k10.getClass());
                }
                ((q) k10).i(str, this.f21338i);
            }
        }
        UIManager uIManager = this.f21339j;
        if (uIManager != null) {
            uIManager.synchronouslyUpdateViewOnUIThread(this.f21336g, this.f21338i);
        }
    }
}
