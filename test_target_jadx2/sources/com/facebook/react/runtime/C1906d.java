package com.facebook.react.runtime;

import c3.AbstractC1721a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.facebook.react.runtime.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1906d {

    /* renamed from: c, reason: collision with root package name */
    private static final a f22074c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final boolean f22075a;

    /* renamed from: b, reason: collision with root package name */
    private final List f22076b = Collections.synchronizedList(new ArrayList());

    /* renamed from: com.facebook.react.runtime.d$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C1906d(boolean z10) {
        this.f22075a = z10;
    }

    protected final void a(String state) {
        Intrinsics.checkNotNullParameter(state, "state");
        AbstractC1721a.J("BridgelessReact", state);
        if (this.f22075a) {
            this.f22076b.add(state);
        }
    }
}
