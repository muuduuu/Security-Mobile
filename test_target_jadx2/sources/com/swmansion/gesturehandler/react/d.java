package com.swmansion.gesturehandler.react;

import android.util.SparseArray;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.swmansion.gesturehandler.react.i;
import ea.AbstractC3109d;
import ea.InterfaceC3110e;
import ea.o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class d implements InterfaceC3110e {

    /* renamed from: d, reason: collision with root package name */
    public static final a f29766d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final SparseArray f29767a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    private final SparseArray f29768b = new SparseArray();

    /* renamed from: c, reason: collision with root package name */
    private final SparseArray f29769c = new SparseArray();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final int[] f(ReadableMap readableMap, String str) {
        ReadableArray array = readableMap.getArray(str);
        Intrinsics.d(array);
        int size = array.size();
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = array.getInt(i10);
        }
        return iArr;
    }

    @Override // ea.InterfaceC3110e
    public boolean a(AbstractC3109d handler, AbstractC3109d otherHandler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(otherHandler, "otherHandler");
        int[] iArr = (int[]) this.f29769c.get(handler.R());
        if (iArr == null) {
            return false;
        }
        for (int i10 : iArr) {
            if (i10 == otherHandler.R()) {
                return true;
            }
        }
        return false;
    }

    @Override // ea.InterfaceC3110e
    public boolean b(AbstractC3109d handler, AbstractC3109d otherHandler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(otherHandler, "otherHandler");
        int[] iArr = (int[]) this.f29768b.get(handler.R());
        if (iArr == null) {
            return false;
        }
        for (int i10 : iArr) {
            if (i10 == otherHandler.R()) {
                return true;
            }
        }
        return false;
    }

    @Override // ea.InterfaceC3110e
    public boolean c(AbstractC3109d handler, AbstractC3109d otherHandler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(otherHandler, "otherHandler");
        int[] iArr = (int[]) this.f29767a.get(handler.R());
        if (iArr == null) {
            return false;
        }
        for (int i10 : iArr) {
            if (i10 == otherHandler.R()) {
                return true;
            }
        }
        return false;
    }

    @Override // ea.InterfaceC3110e
    public boolean d(AbstractC3109d handler, AbstractC3109d otherHandler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(otherHandler, "otherHandler");
        return otherHandler instanceof o ? ((o) otherHandler).R0() : otherHandler instanceof i.b;
    }

    public final void e(AbstractC3109d handler, ReadableMap config) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(config, "config");
        handler.x0(this);
        if (config.hasKey("waitFor")) {
            this.f29767a.put(handler.R(), f(config, "waitFor"));
        }
        if (config.hasKey("simultaneousHandlers")) {
            this.f29768b.put(handler.R(), f(config, "simultaneousHandlers"));
        }
        if (config.hasKey("blocksHandlers")) {
            this.f29769c.put(handler.R(), f(config, "blocksHandlers"));
        }
    }

    public final void g(int i10) {
        this.f29767a.remove(i10);
        this.f29768b.remove(i10);
    }

    public final void h() {
        this.f29767a.clear();
        this.f29768b.clear();
    }
}
