package com.google.android.gms.internal.auth;

import D7.C0787k;
import S6.a;
import S6.g;
import T6.AbstractC1191v;
import T6.AbstractC1192w;
import V6.AbstractC1287s;
import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;

/* renamed from: com.google.android.gms.internal.auth.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2035b extends S6.g implements InterfaceC2040c1 {

    /* renamed from: l, reason: collision with root package name */
    private static final a.g f23677l;

    /* renamed from: m, reason: collision with root package name */
    private static final a.AbstractC0172a f23678m;

    /* renamed from: n, reason: collision with root package name */
    private static final S6.a f23679n;

    /* renamed from: o, reason: collision with root package name */
    private static final Y6.a f23680o;

    /* renamed from: k, reason: collision with root package name */
    private final Context f23681k;

    static {
        a.g gVar = new a.g();
        f23677l = gVar;
        W1 w12 = new W1();
        f23678m = w12;
        f23679n = new S6.a("GoogleAuthService.API", w12, gVar);
        f23680o = I6.d.a("GoogleAuthServiceClient");
    }

    C2035b(Context context) {
        super(context, f23679n, a.d.f8818Q, g.a.f8847c);
        this.f23681k = context;
    }

    static /* bridge */ /* synthetic */ void M(Status status, Object obj, C0787k c0787k) {
        if (AbstractC1192w.c(status, obj, c0787k)) {
            return;
        }
        f23680o.e("The task is already complete.", new Object[0]);
    }

    @Override // com.google.android.gms.internal.auth.InterfaceC2040c1
    public final Task f(final Account account, final String str, final Bundle bundle) {
        AbstractC1287s.n(account, "Account name cannot be null!");
        AbstractC1287s.h(str, "Scope cannot be null!");
        return A(AbstractC1191v.a().d(I6.e.f4319l).b(new T6.r() { // from class: com.google.android.gms.internal.auth.U1
            @Override // T6.r
            public final void a(Object obj, Object obj2) {
                C2035b c2035b = C2035b.this;
                ((T1) ((Q1) obj).I()).n1(new X1(c2035b, (C0787k) obj2), account, str, bundle);
            }
        }).e(1512).a());
    }

    @Override // com.google.android.gms.internal.auth.InterfaceC2040c1
    public final Task q(final C2050g c2050g) {
        return A(AbstractC1191v.a().d(I6.e.f4319l).b(new T6.r() { // from class: com.google.android.gms.internal.auth.V1
            @Override // T6.r
            public final void a(Object obj, Object obj2) {
                C2035b c2035b = C2035b.this;
                ((T1) ((Q1) obj).I()).m1(new Y1(c2035b, (C0787k) obj2), c2050g);
            }
        }).e(1513).a());
    }
}
