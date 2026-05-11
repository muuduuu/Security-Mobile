package com.facebook.react.devsupport;

import android.content.Context;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.facebook.react.devsupport.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1872h implements I {

    /* renamed from: a, reason: collision with root package name */
    private static final a f21615a = new a(null);

    /* renamed from: com.facebook.react.devsupport.h$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Override // com.facebook.react.devsupport.I
    public C4.e a(Context applicationContext, d0 reactInstanceManagerHelper, String str, boolean z10, C4.i iVar, C4.b bVar, int i10, Map map, v4.j jVar, C4.c cVar, C4.h hVar) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(reactInstanceManagerHelper, "reactInstanceManagerHelper");
        if (!z10) {
            return new j0();
        }
        try {
            String str2 = "com.facebook.react.devsupport.BridgeDevSupportManager";
            Intrinsics.checkNotNullExpressionValue(str2, "toString(...)");
            Object newInstance = Class.forName(str2).getConstructor(Context.class, d0.class, String.class, Boolean.TYPE, C4.i.class, C4.b.class, Integer.TYPE, Map.class, v4.j.class, C4.c.class, C4.h.class).newInstance(applicationContext, reactInstanceManagerHelper, str, Boolean.TRUE, iVar, bVar, Integer.valueOf(i10), map, jVar, cVar, hVar);
            Intrinsics.e(newInstance, "null cannot be cast to non-null type com.facebook.react.devsupport.interfaces.DevSupportManager");
            return (C4.e) newInstance;
        } catch (Exception unused) {
            return new c0(applicationContext);
        }
    }
}
