package z2;

import java.util.ArrayList;
import java.util.List;

/* renamed from: z2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5243a {

    /* renamed from: a, reason: collision with root package name */
    private final List f45678a = new ArrayList();

    /* renamed from: z2.a$a, reason: collision with other inner class name */
    private static final class C0673a {

        /* renamed from: a, reason: collision with root package name */
        private final Class f45679a;

        /* renamed from: b, reason: collision with root package name */
        final i2.d f45680b;

        C0673a(Class cls, i2.d dVar) {
            this.f45679a = cls;
            this.f45680b = dVar;
        }

        boolean a(Class cls) {
            return this.f45679a.isAssignableFrom(cls);
        }
    }

    public synchronized void a(Class cls, i2.d dVar) {
        this.f45678a.add(new C0673a(cls, dVar));
    }

    public synchronized i2.d b(Class cls) {
        for (C0673a c0673a : this.f45678a) {
            if (c0673a.a(cls)) {
                return c0673a.f45680b;
            }
        }
        return null;
    }
}
