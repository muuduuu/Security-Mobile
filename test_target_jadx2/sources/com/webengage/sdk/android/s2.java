package com.webengage.sdk.android;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class s2 {

    /* renamed from: a, reason: collision with root package name */
    private final List<y2> f30804a;

    /* renamed from: b, reason: collision with root package name */
    private final List<h2> f30805b;

    public s2() {
        this(new ArrayList());
    }

    private String a(List<y2> list) {
        StringBuilder sb2 = new StringBuilder();
        Iterator<y2> it = list.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().toString());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        return sb2.toString();
    }

    public List<y2> b() {
        return this.f30804a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(a(this.f30804a));
        sb2.append(" {\n");
        for (h2 h2Var : this.f30805b) {
            sb2.append("\t");
            sb2.append(h2Var);
            sb2.append(";\n");
        }
        sb2.append("}\n");
        return sb2.toString();
    }

    public s2(List<y2> list) {
        this.f30804a = list;
        this.f30805b = new ArrayList();
    }

    public List<h2> a() {
        return this.f30805b;
    }

    public void a(h2 h2Var) {
        this.f30805b.add(h2Var);
    }

    public void a(y2 y2Var) {
        this.f30804a.add(y2Var);
    }
}
