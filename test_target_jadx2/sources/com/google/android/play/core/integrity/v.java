package com.google.android.play.core.integrity;

import android.content.Context;
import c8.AbstractC1744d;

/* loaded from: classes2.dex */
final class v implements x {

    /* renamed from: a, reason: collision with root package name */
    private Context f27862a;

    /* synthetic */ v(AbstractC1744d abstractC1744d) {
    }

    public final v a(Context context) {
        context.getClass();
        this.f27862a = context;
        return this;
    }

    @Override // com.google.android.play.core.integrity.x
    public final w b() {
        e8.n.a(this.f27862a, Context.class);
        return new w(this.f27862a, null);
    }
}
