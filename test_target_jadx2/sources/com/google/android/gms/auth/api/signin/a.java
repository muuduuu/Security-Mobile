package com.google.android.gms.auth.api.signin;

import D7.AbstractC0789m;
import O6.q;
import O6.r;
import V6.AbstractC1265b;
import V6.AbstractC1287s;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.tasks.Task;

/* loaded from: classes2.dex */
public abstract class a {
    public static b a(Context context, GoogleSignInOptions googleSignInOptions) {
        return new b(context, (GoogleSignInOptions) AbstractC1287s.m(googleSignInOptions));
    }

    public static GoogleSignInAccount b(Context context) {
        return r.a(context).d();
    }

    public static Task c(Intent intent) {
        N6.b g10 = q.g(intent);
        GoogleSignInAccount a10 = g10.a();
        return (!g10.c().Z0() || a10 == null) ? AbstractC0789m.f(AbstractC1265b.a(g10.c())) : AbstractC0789m.g(a10);
    }

    public static void d(Activity activity, int i10, GoogleSignInAccount googleSignInAccount, Scope... scopeArr) {
        AbstractC1287s.n(activity, "Please provide a non-null Activity");
        AbstractC1287s.n(scopeArr, "Please provide at least one scope");
        activity.startActivityForResult(e(activity, googleSignInAccount, scopeArr), i10);
    }

    private static Intent e(Activity activity, GoogleSignInAccount googleSignInAccount, Scope... scopeArr) {
        GoogleSignInOptions.a aVar = new GoogleSignInOptions.a();
        if (scopeArr.length > 0) {
            aVar.e(scopeArr[0], scopeArr);
        }
        if (googleSignInAccount != null && !TextUtils.isEmpty(googleSignInAccount.u())) {
            aVar.g((String) AbstractC1287s.m(googleSignInAccount.u()));
        }
        return new b(activity, aVar.a()).M();
    }
}
