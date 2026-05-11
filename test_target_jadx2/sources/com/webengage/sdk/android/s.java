package com.webengage.sdk.android;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public class s implements d3 {

    /* renamed from: a, reason: collision with root package name */
    private u f30798a;

    /* renamed from: b, reason: collision with root package name */
    private t0 f30799b;

    s(u uVar, t0 t0Var) {
        this.f30798a = uVar;
        this.f30799b = t0Var;
    }

    @Override // com.webengage.sdk.android.d3
    public boolean a(p0 p0Var) {
        ArrayList<p0> arrayList = new ArrayList<>();
        arrayList.add(p0Var);
        return a(arrayList);
    }

    public boolean a(ArrayList<p0> arrayList) {
        return this.f30798a.a(arrayList) && this.f30799b.a(arrayList);
    }
}
