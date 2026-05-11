package com.google.protobuf;

import com.google.protobuf.AbstractC2891w;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.protobuf.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2884o {

    /* renamed from: b, reason: collision with root package name */
    private static boolean f28799b = true;

    /* renamed from: c, reason: collision with root package name */
    private static volatile C2884o f28800c;

    /* renamed from: d, reason: collision with root package name */
    static final C2884o f28801d = new C2884o(true);

    /* renamed from: a, reason: collision with root package name */
    private final Map f28802a = Collections.emptyMap();

    /* renamed from: com.google.protobuf.o$a */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Object f28803a;

        /* renamed from: b, reason: collision with root package name */
        private final int f28804b;

        a(Object obj, int i10) {
            this.f28803a = obj;
            this.f28804b = i10;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f28803a == aVar.f28803a && this.f28804b == aVar.f28804b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f28803a) * 65535) + this.f28804b;
        }
    }

    C2884o(boolean z10) {
    }

    public static C2884o b() {
        C2884o c2884o = f28800c;
        if (c2884o == null) {
            synchronized (C2884o.class) {
                try {
                    c2884o = f28800c;
                    if (c2884o == null) {
                        c2884o = f28799b ? AbstractC2883n.a() : f28801d;
                        f28800c = c2884o;
                    }
                } finally {
                }
            }
        }
        return c2884o;
    }

    public AbstractC2891w.c a(N n10, int i10) {
        android.support.v4.media.session.b.a(this.f28802a.get(new a(n10, i10)));
        return null;
    }
}
