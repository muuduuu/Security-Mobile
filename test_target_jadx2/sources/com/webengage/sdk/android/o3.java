package com.webengage.sdk.android;

import android.content.Context;
import com.webengage.sdk.android.m3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
class o3 {

    /* renamed from: d, reason: collision with root package name */
    private static volatile o3 f30740d;

    /* renamed from: a, reason: collision with root package name */
    Map<y3, LinkedHashSet<m3>> f30741a;

    /* renamed from: b, reason: collision with root package name */
    private Context f30742b;

    /* renamed from: c, reason: collision with root package name */
    private List<z3> f30743c = null;

    private o3(Context context) {
        this.f30741a = null;
        this.f30742b = null;
        this.f30742b = context.getApplicationContext();
        this.f30741a = new HashMap();
        a();
    }

    static o3 a(Context context) {
        if (f30740d == null) {
            synchronized (o3.class) {
                try {
                    if (f30740d == null) {
                        f30740d = new o3(context);
                    }
                } finally {
                }
            }
        }
        return f30740d;
    }

    protected List<z3> b() {
        return this.f30743c;
    }

    protected LinkedHashSet<m3> a(y3 y3Var) {
        return this.f30741a.get(y3Var);
    }

    protected boolean b(y3 y3Var, Object obj, List<z3> list) {
        boolean z10;
        if (list == null) {
            return true;
        }
        while (true) {
            for (z3 z3Var : list) {
                z10 = z10 && z3Var.b(y3Var, obj);
            }
            return z10;
        }
    }

    private LinkedHashSet<m3> a(m3.a[] aVarArr) {
        LinkedHashSet<m3> linkedHashSet = new LinkedHashSet<>();
        if (aVarArr != null) {
            for (m3.a aVar : aVarArr) {
                if (aVar != null) {
                    linkedHashSet.add(aVar.a(this.f30742b));
                }
            }
        }
        return linkedHashSet;
    }

    private void a() {
        for (y3 y3Var : y3.values()) {
            this.f30741a.put(y3Var, a(y3Var.a()));
        }
    }

    protected void a(y3 y3Var, Object obj) {
        List<z3> b10 = a(this.f30742b).b();
        if (b(y3Var, obj, b10)) {
            LinkedHashSet<m3> a10 = a(this.f30742b).a(y3Var);
            if (a10 != null) {
                Iterator<m3> it = a10.iterator();
                while (it.hasNext()) {
                    it.next().a(y3Var, obj);
                }
            }
            a(y3Var, obj, b10);
        }
    }

    protected void a(y3 y3Var, Object obj, List<z3> list) {
        if (list != null) {
            Iterator<z3> it = list.iterator();
            while (it.hasNext()) {
                it.next().a(y3Var, obj);
            }
        }
    }

    protected void a(z3 z3Var) {
        if (this.f30743c == null) {
            this.f30743c = new ArrayList();
        }
        this.f30743c.add(z3Var);
    }
}
