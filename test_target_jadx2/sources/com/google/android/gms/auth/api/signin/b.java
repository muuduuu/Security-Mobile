package com.google.android.gms.auth.api.signin;

import O6.q;
import S6.a;
import S6.g;
import T6.C1161a;
import T6.InterfaceC1189t;
import V6.r;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.AbstractC2022n;
import com.google.android.gms.common.C2017i;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;

/* loaded from: classes2.dex */
public class b extends S6.g {

    /* renamed from: k, reason: collision with root package name */
    private static final f f23274k = new f(null);

    /* renamed from: l, reason: collision with root package name */
    static int f23275l = 1;

    b(Activity activity, GoogleSignInOptions googleSignInOptions) {
        super(activity, J6.a.f4788b, (a.d) googleSignInOptions, (InterfaceC1189t) new C1161a());
    }

    private final synchronized int Q() {
        int i10;
        try {
            i10 = f23275l;
            if (i10 == 1) {
                Context E10 = E();
                C2017i q10 = C2017i.q();
                int j10 = q10.j(E10, AbstractC2022n.f23510a);
                if (j10 == 0) {
                    i10 = 4;
                    f23275l = 4;
                } else if (q10.d(E10, j10, null) != null || DynamiteModule.a(E10, "com.google.android.gms.auth.api.fallback") == 0) {
                    i10 = 2;
                    f23275l = 2;
                } else {
                    i10 = 3;
                    f23275l = 3;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return i10;
    }

    public Intent M() {
        Context E10 = E();
        int Q10 = Q();
        int i10 = Q10 - 1;
        if (Q10 != 0) {
            return i10 != 2 ? i10 != 3 ? q.c(E10, (GoogleSignInOptions) D()) : q.a(E10, (GoogleSignInOptions) D()) : q.b(E10, (GoogleSignInOptions) D());
        }
        throw null;
    }

    public Task N() {
        return r.b(q.f(r(), E(), Q() == 3));
    }

    public Task O() {
        return r.b(q.e(r(), E(), Q() == 3));
    }

    public Task P() {
        return r.a(q.d(r(), E(), (GoogleSignInOptions) D(), Q() == 3), f23274k);
    }

    b(Context context, GoogleSignInOptions googleSignInOptions) {
        super(context, J6.a.f4788b, googleSignInOptions, new g.a.C0174a().c(new C1161a()).a());
    }
}
