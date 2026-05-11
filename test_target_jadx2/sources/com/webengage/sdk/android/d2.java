package com.webengage.sdk.android;

/* loaded from: classes2.dex */
public abstract class d2 {

    /* renamed from: a, reason: collision with root package name */
    private String f30495a;

    /* renamed from: b, reason: collision with root package name */
    int f30496b;

    /* renamed from: c, reason: collision with root package name */
    boolean f30497c;

    public d2(String str, int i10) {
        this(str, i10, true);
    }

    public abstract Object a(Object obj, Object obj2);

    public String a() {
        return this.f30495a;
    }

    public int b() {
        return this.f30496b;
    }

    public boolean c() {
        return this.f30497c;
    }

    public d2(String str, int i10, boolean z10) {
        this.f30495a = str;
        this.f30496b = i10;
        this.f30497c = z10;
    }
}
