package o8;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import x8.C5133a;
import x8.InterfaceC5135c;

/* renamed from: o8.E, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3763E implements InterfaceC3767d {

    /* renamed from: a, reason: collision with root package name */
    private final Set f37967a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f37968b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f37969c;

    /* renamed from: d, reason: collision with root package name */
    private final Set f37970d;

    /* renamed from: e, reason: collision with root package name */
    private final Set f37971e;

    /* renamed from: f, reason: collision with root package name */
    private final Set f37972f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3767d f37973g;

    /* renamed from: o8.E$a */
    private static class a implements InterfaceC5135c {

        /* renamed from: a, reason: collision with root package name */
        private final Set f37974a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC5135c f37975b;

        public a(Set set, InterfaceC5135c interfaceC5135c) {
            this.f37974a = set;
            this.f37975b = interfaceC5135c;
        }

        @Override // x8.InterfaceC5135c
        public void d(C5133a c5133a) {
            if (!this.f37974a.contains(c5133a.b())) {
                throw new s(String.format("Attempting to publish an undeclared event %s.", c5133a));
            }
            this.f37975b.d(c5133a);
        }
    }

    C3763E(C3766c c3766c, InterfaceC3767d interfaceC3767d) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (q qVar : c3766c.g()) {
            if (qVar.d()) {
                if (qVar.f()) {
                    hashSet4.add(qVar.b());
                } else {
                    hashSet.add(qVar.b());
                }
            } else if (qVar.c()) {
                hashSet3.add(qVar.b());
            } else if (qVar.f()) {
                hashSet5.add(qVar.b());
            } else {
                hashSet2.add(qVar.b());
            }
        }
        if (!c3766c.k().isEmpty()) {
            hashSet.add(C3762D.b(InterfaceC5135c.class));
        }
        this.f37967a = Collections.unmodifiableSet(hashSet);
        this.f37968b = Collections.unmodifiableSet(hashSet2);
        this.f37969c = Collections.unmodifiableSet(hashSet3);
        this.f37970d = Collections.unmodifiableSet(hashSet4);
        this.f37971e = Collections.unmodifiableSet(hashSet5);
        this.f37972f = c3766c.k();
        this.f37973g = interfaceC3767d;
    }

    @Override // o8.InterfaceC3767d
    public Object a(Class cls) {
        if (!this.f37967a.contains(C3762D.b(cls))) {
            throw new s(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        Object a10 = this.f37973g.a(cls);
        return !cls.equals(InterfaceC5135c.class) ? a10 : new a(this.f37972f, (InterfaceC5135c) a10);
    }

    @Override // o8.InterfaceC3767d
    public Set b(C3762D c3762d) {
        if (this.f37970d.contains(c3762d)) {
            return this.f37973g.b(c3762d);
        }
        throw new s(String.format("Attempting to request an undeclared dependency Set<%s>.", c3762d));
    }

    @Override // o8.InterfaceC3767d
    public A8.b c(C3762D c3762d) {
        if (this.f37968b.contains(c3762d)) {
            return this.f37973g.c(c3762d);
        }
        throw new s(String.format("Attempting to request an undeclared dependency Provider<%s>.", c3762d));
    }

    @Override // o8.InterfaceC3767d
    public A8.b d(Class cls) {
        return c(C3762D.b(cls));
    }

    @Override // o8.InterfaceC3767d
    public A8.b f(C3762D c3762d) {
        if (this.f37971e.contains(c3762d)) {
            return this.f37973g.f(c3762d);
        }
        throw new s(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", c3762d));
    }

    @Override // o8.InterfaceC3767d
    public Object g(C3762D c3762d) {
        if (this.f37967a.contains(c3762d)) {
            return this.f37973g.g(c3762d);
        }
        throw new s(String.format("Attempting to request an undeclared dependency %s.", c3762d));
    }
}
