package com.google.android.gms.internal.measurement;

import V6.AbstractC1287s;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.measurement.internal.AbstractC2664e3;
import e7.BinderC3090b;
import java.util.Objects;

/* loaded from: classes2.dex */
final class V0 extends AbstractRunnableC2322p1 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Context f24392e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Bundle f24393f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C2411z1 f24394g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    V0(C2411z1 c2411z1, Context context, Bundle bundle) {
        super(c2411z1, true);
        this.f24392e = context;
        this.f24393f = bundle;
        Objects.requireNonNull(c2411z1);
        this.f24394g = c2411z1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2322p1
    public final void a() {
        try {
            Context context = this.f24392e;
            AbstractC1287s.m(context);
            String a10 = AbstractC2664e3.a(context);
            AbstractC1287s.m(context);
            Resources resources = context.getResources();
            if (TextUtils.isEmpty(a10)) {
                a10 = AbstractC2664e3.a(context);
            }
            Boolean c10 = AbstractC2664e3.c("google_analytics_force_disable_updates", resources, a10);
            C2411z1 c2411z1 = this.f24394g;
            c2411z1.o(c2411z1.u(context, c10 == null || !c10.booleanValue()));
            if (c2411z1.n() == null) {
                Log.w(c2411z1.l(), "Failed to connect to measurement client.");
                return;
            }
            int a11 = DynamiteModule.a(context, ModuleDescriptor.MODULE_ID);
            ((InterfaceC2374v0) AbstractC1287s.m(c2411z1.n())).initialize(BinderC3090b.m1(context), new H0(133005L, Math.max(a11, r0), Boolean.TRUE.equals(c10) || DynamiteModule.b(context, ModuleDescriptor.MODULE_ID) < a11, this.f24393f, AbstractC2664e3.a(context)), this.f24612a);
        } catch (Exception e10) {
            this.f24394g.k(e10, true, false);
        }
    }
}
