package com.google.android.gms.internal.vision;

import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes2.dex */
public abstract class D2 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f25010a;

    /* renamed from: c, reason: collision with root package name */
    private final String f25012c;

    /* renamed from: d, reason: collision with root package name */
    private final String f25013d;

    /* renamed from: e, reason: collision with root package name */
    private final String f25014e;

    /* renamed from: h, reason: collision with root package name */
    private Object f25017h;

    /* renamed from: b, reason: collision with root package name */
    private final Object f25011b = new Object();

    /* renamed from: f, reason: collision with root package name */
    private boolean f25015f = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f25016g = false;

    public D2(Context context, String str, String str2) {
        this.f25010a = context;
        this.f25012c = str;
        String valueOf = String.valueOf(str2);
        this.f25013d = valueOf.length() != 0 ? "com.google.android.gms.vision.dynamite.".concat(valueOf) : new String("com.google.android.gms.vision.dynamite.");
        this.f25014e = str2;
    }

    protected abstract Object a(DynamiteModule dynamiteModule, Context context);

    public final boolean b() {
        return c() != null;
    }

    protected final Object c() {
        DynamiteModule dynamiteModule;
        synchronized (this.f25011b) {
            Object obj = this.f25017h;
            if (obj != null) {
                return obj;
            }
            try {
                dynamiteModule = DynamiteModule.d(this.f25010a, DynamiteModule.f23558g, this.f25013d);
            } catch (DynamiteModule.a unused) {
                String format = String.format("%s.%s", "com.google.android.gms.vision", this.f25014e);
                E7.c.a("Cannot load thick client module, fall back to load optional module %s", format);
                try {
                    dynamiteModule = DynamiteModule.d(this.f25010a, DynamiteModule.f23553b, format);
                } catch (DynamiteModule.a e10) {
                    E7.c.c(e10, "Error loading optional module %s", format);
                    if (!this.f25015f) {
                        E7.c.a("Broadcasting download intent for dependency %s", this.f25014e);
                        String str = this.f25014e;
                        Intent intent = new Intent();
                        intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
                        intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", str);
                        intent.setAction("com.google.android.gms.vision.DEPENDENCY");
                        this.f25010a.sendBroadcast(intent);
                        this.f25015f = true;
                    }
                    dynamiteModule = null;
                }
            }
            if (dynamiteModule != null) {
                try {
                    this.f25017h = a(dynamiteModule, this.f25010a);
                } catch (RemoteException | DynamiteModule.a e11) {
                    Log.e(this.f25012c, "Error creating remote native handle", e11);
                }
            }
            boolean z10 = this.f25016g;
            if (!z10 && this.f25017h == null) {
                Log.w(this.f25012c, "Native handle not yet available. Reverting to no-op handle.");
                this.f25016g = true;
            } else if (z10 && this.f25017h != null) {
                Log.w(this.f25012c, "Native handle is now available.");
            }
            return this.f25017h;
        }
    }
}
