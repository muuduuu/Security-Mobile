package x8;

import o8.AbstractC3761C;

/* renamed from: x8.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C5133a {

    /* renamed from: a, reason: collision with root package name */
    private final Class f44895a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f44896b;

    public C5133a(Class cls, Object obj) {
        this.f44895a = (Class) AbstractC3761C.b(cls);
        this.f44896b = AbstractC3761C.b(obj);
    }

    public Object a() {
        return this.f44896b;
    }

    public Class b() {
        return this.f44895a;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", this.f44895a, this.f44896b);
    }
}
