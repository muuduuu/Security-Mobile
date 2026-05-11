package io.sentry;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: io.sentry.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3472z {

    /* renamed from: b, reason: collision with root package name */
    private static final C3472z f35658b = new C3472z();

    /* renamed from: a, reason: collision with root package name */
    private final List f35659a = new CopyOnWriteArrayList();

    /* renamed from: io.sentry.z$a */
    public interface a {
    }

    private C3472z() {
    }

    public static C3472z a() {
        return f35658b;
    }

    public void b(a aVar) {
        this.f35659a.add(aVar);
    }
}
