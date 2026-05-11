package com.google.firebase.abt.component;

import A8.b;
import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import k8.C3554c;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final Map f27940a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Context f27941b;

    /* renamed from: c, reason: collision with root package name */
    private final b f27942c;

    protected a(Context context, b bVar) {
        this.f27941b = context;
        this.f27942c = bVar;
    }

    protected C3554c a(String str) {
        return new C3554c(this.f27941b, this.f27942c, str);
    }

    public synchronized C3554c b(String str) {
        try {
            if (!this.f27940a.containsKey(str)) {
                this.f27940a.put(str, a(str));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (C3554c) this.f27940a.get(str);
    }
}
