package com.google.gson;

import com.google.gson.internal.bind.c;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private P8.d f28491a = P8.d.f7576g;

    /* renamed from: b, reason: collision with root package name */
    private p f28492b = p.DEFAULT;

    /* renamed from: c, reason: collision with root package name */
    private c f28493c = b.IDENTITY;

    /* renamed from: d, reason: collision with root package name */
    private final Map f28494d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final List f28495e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private final List f28496f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private boolean f28497g = false;

    /* renamed from: h, reason: collision with root package name */
    private String f28498h = e.f28456B;

    /* renamed from: i, reason: collision with root package name */
    private int f28499i = 2;

    /* renamed from: j, reason: collision with root package name */
    private int f28500j = 2;

    /* renamed from: k, reason: collision with root package name */
    private boolean f28501k = false;

    /* renamed from: l, reason: collision with root package name */
    private boolean f28502l = false;

    /* renamed from: m, reason: collision with root package name */
    private boolean f28503m = true;

    /* renamed from: n, reason: collision with root package name */
    private d f28504n = e.f28455A;

    /* renamed from: o, reason: collision with root package name */
    private boolean f28505o = false;

    /* renamed from: p, reason: collision with root package name */
    private r f28506p = e.f28460z;

    /* renamed from: q, reason: collision with root package name */
    private boolean f28507q = true;

    /* renamed from: r, reason: collision with root package name */
    private t f28508r = e.f28458D;

    /* renamed from: s, reason: collision with root package name */
    private t f28509s = e.f28459E;

    /* renamed from: t, reason: collision with root package name */
    private final ArrayDeque f28510t = new ArrayDeque();

    private static void a(String str, int i10, int i11, List list) {
        v vVar;
        v vVar2;
        boolean z10 = com.google.gson.internal.sql.d.f28649a;
        v vVar3 = null;
        if (str != null && !str.trim().isEmpty()) {
            vVar = c.b.f28521b.b(str);
            if (z10) {
                vVar3 = com.google.gson.internal.sql.d.f28651c.b(str);
                vVar2 = com.google.gson.internal.sql.d.f28650b.b(str);
            }
            vVar2 = null;
        } else {
            if (i10 == 2 && i11 == 2) {
                return;
            }
            v a10 = c.b.f28521b.a(i10, i11);
            if (z10) {
                vVar3 = com.google.gson.internal.sql.d.f28651c.a(i10, i11);
                v a11 = com.google.gson.internal.sql.d.f28650b.a(i10, i11);
                vVar = a10;
                vVar2 = a11;
            } else {
                vVar = a10;
                vVar2 = null;
            }
        }
        list.add(vVar);
        if (z10) {
            list.add(vVar3);
            list.add(vVar2);
        }
    }

    public e b() {
        ArrayList arrayList = new ArrayList(this.f28495e.size() + this.f28496f.size() + 3);
        arrayList.addAll(this.f28495e);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(this.f28496f);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        a(this.f28498h, this.f28499i, this.f28500j, arrayList);
        return new e(this.f28491a, this.f28493c, new HashMap(this.f28494d), this.f28497g, this.f28501k, this.f28505o, this.f28503m, this.f28504n, this.f28506p, this.f28502l, this.f28507q, this.f28492b, this.f28498h, this.f28499i, this.f28500j, new ArrayList(this.f28495e), new ArrayList(this.f28496f), arrayList, this.f28508r, this.f28509s, new ArrayList(this.f28510t));
    }

    public f c() {
        this.f28503m = false;
        return this;
    }

    public f d() {
        this.f28497g = true;
        return this;
    }

    public f e(d dVar) {
        Objects.requireNonNull(dVar);
        this.f28504n = dVar;
        return this;
    }

    public f f() {
        return e(d.f28451e);
    }
}
