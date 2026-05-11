package com.webengage.sdk.android;

import com.webengage.sdk.android.actions.database.DataHolder;
import java.util.List;

/* loaded from: classes2.dex */
public class s0 {

    /* renamed from: a, reason: collision with root package name */
    private String f30800a;

    /* renamed from: b, reason: collision with root package name */
    private List<String> f30801b;

    public s0(String str) {
        this.f30801b = null;
        this.f30800a = str;
        this.f30801b = l0.a().a(this.f30800a, DataHolder.get().R());
    }

    public Object a() {
        boolean R10 = DataHolder.get().R();
        if (this.f30801b == null) {
            this.f30801b = l0.a().a(this.f30800a, R10);
        }
        try {
            return l0.a().a(this.f30801b, R10);
        } catch (Exception unused) {
            return null;
        }
    }

    public String toString() {
        return this.f30800a;
    }

    public s0(List<String> list) {
        this.f30800a = null;
        this.f30801b = list;
    }
}
