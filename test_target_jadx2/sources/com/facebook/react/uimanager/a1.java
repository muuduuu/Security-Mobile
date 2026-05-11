package com.facebook.react.uimanager;

import java.util.Comparator;

/* loaded from: classes.dex */
public class a1 {

    /* renamed from: c, reason: collision with root package name */
    public static Comparator f22317c = new a();

    /* renamed from: a, reason: collision with root package name */
    public final int f22318a;

    /* renamed from: b, reason: collision with root package name */
    public final int f22319b;

    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(a1 a1Var, a1 a1Var2) {
            return a1Var.f22319b - a1Var2.f22319b;
        }
    }

    public a1(int i10, int i11) {
        this.f22318a = i10;
        this.f22319b = i11;
    }

    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return this.f22319b == a1Var.f22319b && this.f22318a == a1Var.f22318a;
    }

    public String toString() {
        return "[" + this.f22318a + ", " + this.f22319b + "]";
    }
}
