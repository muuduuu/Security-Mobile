package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.N0;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public class A0 {

    /* renamed from: b, reason: collision with root package name */
    private static volatile A0 f24993b;

    /* renamed from: c, reason: collision with root package name */
    private static volatile A0 f24994c;

    /* renamed from: d, reason: collision with root package name */
    private static final A0 f24995d = new A0(true);

    /* renamed from: a, reason: collision with root package name */
    private final Map f24996a = Collections.emptyMap();

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Object f24997a;

        /* renamed from: b, reason: collision with root package name */
        private final int f24998b;

        a(Object obj, int i10) {
            this.f24997a = obj;
            this.f24998b = i10;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f24997a == aVar.f24997a && this.f24998b == aVar.f24998b;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f24997a) * 65535) + this.f24998b;
        }
    }

    private A0(boolean z10) {
    }

    public static A0 b() {
        A0 a02 = f24993b;
        if (a02 == null) {
            synchronized (A0.class) {
                try {
                    a02 = f24993b;
                    if (a02 == null) {
                        a02 = f24995d;
                        f24993b = a02;
                    }
                } finally {
                }
            }
        }
        return a02;
    }

    public static A0 c() {
        A0 a02 = f24994c;
        if (a02 != null) {
            return a02;
        }
        synchronized (A0.class) {
            try {
                A0 a03 = f24994c;
                if (a03 != null) {
                    return a03;
                }
                A0 a10 = K0.a(A0.class);
                f24994c = a10;
                return a10;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final N0.c a(InterfaceC2609t1 interfaceC2609t1, int i10) {
        android.support.v4.media.session.b.a(this.f24996a.get(new a(interfaceC2609t1, i10)));
        return null;
    }
}
