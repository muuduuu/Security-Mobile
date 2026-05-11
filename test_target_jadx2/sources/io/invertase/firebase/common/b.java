package io.invertase.firebase.common;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private final a f34337a = new a(e());

    /* renamed from: b, reason: collision with root package name */
    private final Context f34338b;

    /* renamed from: c, reason: collision with root package name */
    private final String f34339c;

    protected b(Context context, String str) {
        this.f34338b = context;
        this.f34339c = str;
    }

    public Context a() {
        return c().getApplicationContext();
    }

    public Map b() {
        return new HashMap();
    }

    public Context c() {
        return this.f34338b;
    }

    protected ExecutorService d() {
        return this.f34337a.b();
    }

    public String e() {
        return "Universal" + this.f34339c + "Module";
    }
}
