package yb;

import kotlin.jvm.internal.Intrinsics;
import wb.q;

/* renamed from: yb.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C5189g {

    /* renamed from: a, reason: collision with root package name */
    private final String f45417a;

    /* renamed from: b, reason: collision with root package name */
    private q f45418b;

    /* renamed from: c, reason: collision with root package name */
    private q f45419c;

    public C5189g(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f45417a = name;
    }

    public final C5188f a() {
        return new C5188f(this.f45417a, this.f45418b, this.f45419c);
    }

    public final void b(q qVar) {
        this.f45418b = qVar;
    }

    public final void c(q qVar) {
        this.f45419c = qVar;
    }
}
