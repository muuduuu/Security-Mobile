package com.fasterxml.jackson.core;

import y5.AbstractC5174a;

/* loaded from: classes2.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    protected int f23144a;

    /* renamed from: b, reason: collision with root package name */
    protected int f23145b;

    protected j() {
    }

    public final int a() {
        int i10 = this.f23145b;
        if (i10 < 0) {
            return 0;
        }
        return i10;
    }

    public abstract String b();

    public final int c() {
        return this.f23145b + 1;
    }

    public final boolean d() {
        return this.f23144a == 1;
    }

    public final boolean e() {
        return this.f23144a == 2;
    }

    public String f() {
        int i10 = this.f23144a;
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? "?" : "Object" : "Array" : "root";
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        int i10 = this.f23144a;
        if (i10 == 0) {
            sb2.append("/");
        } else if (i10 != 1) {
            sb2.append('{');
            String b10 = b();
            if (b10 != null) {
                sb2.append('\"');
                AbstractC5174a.a(sb2, b10);
                sb2.append('\"');
            } else {
                sb2.append('?');
            }
            sb2.append('}');
        } else {
            sb2.append('[');
            sb2.append(a());
            sb2.append(']');
        }
        return sb2.toString();
    }
}
