package io.sentry;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
public final class I1 {

    /* renamed from: c, reason: collision with root package name */
    private static volatile I1 f34495c;

    /* renamed from: a, reason: collision with root package name */
    private final Set f34496a = new CopyOnWriteArraySet();

    /* renamed from: b, reason: collision with root package name */
    private final Set f34497b = new CopyOnWriteArraySet();

    private I1() {
    }

    public static I1 c() {
        if (f34495c == null) {
            synchronized (I1.class) {
                try {
                    if (f34495c == null) {
                        f34495c = new I1();
                    }
                } finally {
                }
            }
        }
        return f34495c;
    }

    public void a(String str) {
        io.sentry.util.n.c(str, "integration is required.");
        this.f34496a.add(str);
    }

    public void b(String str, String str2) {
        io.sentry.util.n.c(str, "name is required.");
        io.sentry.util.n.c(str2, "version is required.");
        this.f34497b.add(new io.sentry.protocol.s(str, str2));
    }

    public Set d() {
        return this.f34496a;
    }

    public Set e() {
        return this.f34497b;
    }
}
