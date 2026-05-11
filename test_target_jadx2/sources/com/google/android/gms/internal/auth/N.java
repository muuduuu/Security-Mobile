package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.StrictMode;
import j0.C3476a;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class N implements InterfaceC2091u {

    /* renamed from: a, reason: collision with root package name */
    private static final Map f23633a = new C3476a();

    static N b(Context context, String str, Runnable runnable) {
        if (AbstractC2068m.b()) {
            throw null;
        }
        synchronized (N.class) {
            android.support.v4.media.session.b.a(f23633a.get(null));
            StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
            try {
                throw null;
            } finally {
            }
        }
    }

    static synchronized void c() {
        synchronized (N.class) {
            Map map = f23633a;
            Iterator it = map.values().iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.b.a(it.next());
                throw null;
            }
            map.clear();
        }
    }
}
