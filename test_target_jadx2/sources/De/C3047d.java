package de;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import pe.C3880h;

/* renamed from: de.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3047d {

    /* renamed from: d, reason: collision with root package name */
    public static final a f31898d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final C3880h f31899e;

    /* renamed from: f, reason: collision with root package name */
    public static final C3880h f31900f;

    /* renamed from: g, reason: collision with root package name */
    public static final C3880h f31901g;

    /* renamed from: h, reason: collision with root package name */
    public static final C3880h f31902h;

    /* renamed from: i, reason: collision with root package name */
    public static final C3880h f31903i;

    /* renamed from: j, reason: collision with root package name */
    public static final C3880h f31904j;

    /* renamed from: a, reason: collision with root package name */
    public final C3880h f31905a;

    /* renamed from: b, reason: collision with root package name */
    public final C3880h f31906b;

    /* renamed from: c, reason: collision with root package name */
    public final int f31907c;

    /* renamed from: de.d$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        C3880h.a aVar = C3880h.f38683d;
        f31899e = aVar.d(":");
        f31900f = aVar.d(":status");
        f31901g = aVar.d(":method");
        f31902h = aVar.d(":path");
        f31903i = aVar.d(":scheme");
        f31904j = aVar.d(":authority");
    }

    public C3047d(C3880h name, C3880h value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f31905a = name;
        this.f31906b = value;
        this.f31907c = name.L() + 32 + value.L();
    }

    public final C3880h a() {
        return this.f31905a;
    }

    public final C3880h b() {
        return this.f31906b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3047d)) {
            return false;
        }
        C3047d c3047d = (C3047d) obj;
        return Intrinsics.b(this.f31905a, c3047d.f31905a) && Intrinsics.b(this.f31906b, c3047d.f31906b);
    }

    public int hashCode() {
        return (this.f31905a.hashCode() * 31) + this.f31906b.hashCode();
    }

    public String toString() {
        return this.f31905a.R() + ": " + this.f31906b.R();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3047d(String name, String value) {
        this(r0.d(name), r0.d(value));
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        C3880h.a aVar = C3880h.f38683d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3047d(C3880h name, String value) {
        this(name, C3880h.f38683d.d(value));
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
    }
}
