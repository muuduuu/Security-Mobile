package com.webengage.sdk.android;

import com.webengage.sdk.android.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class b0 {

    /* renamed from: a, reason: collision with root package name */
    private List<List<v.a0>> f30464a;

    /* renamed from: b, reason: collision with root package name */
    private List<v.y> f30465b;

    /* renamed from: c, reason: collision with root package name */
    private final f1 f30466c;

    /* renamed from: d, reason: collision with root package name */
    private final String f30467d;

    b0(f1 f1Var, List<List<v.a0>> list, List<v.y> list2, String str) {
        this.f30464a = new ArrayList();
        new ArrayList();
        this.f30466c = f1Var;
        this.f30464a = list;
        this.f30465b = list2;
        this.f30467d = str;
    }

    public f3 a(f3 f3Var) {
        Iterator<v.y> it = this.f30465b.iterator();
        while (it.hasNext()) {
            f3Var = it.next().a(f3Var, this.f30466c);
        }
        return f3Var;
    }

    public String toString() {
        return this.f30467d;
    }

    private static boolean a(List<v.a0> list, ze.D d10) {
        Iterator<v.a0> it = list.iterator();
        while (it.hasNext()) {
            if (!it.next().a(d10)) {
                return false;
            }
            d10 = d10.c();
        }
        return true;
    }

    public boolean a(ze.D d10) {
        Iterator<List<v.a0>> it = this.f30464a.iterator();
        while (it.hasNext()) {
            if (a(it.next(), d10)) {
                return true;
            }
        }
        return false;
    }
}
