package androidx.work.impl;

import D1.RunnableC0773c;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import x1.AbstractC5095B;
import x1.EnumC5103g;

/* loaded from: classes.dex */
public class C extends x1.y {

    /* renamed from: j, reason: collision with root package name */
    private static final String f18155j = x1.n.i("WorkContinuationImpl");

    /* renamed from: a, reason: collision with root package name */
    private final P f18156a;

    /* renamed from: b, reason: collision with root package name */
    private final String f18157b;

    /* renamed from: c, reason: collision with root package name */
    private final EnumC5103g f18158c;

    /* renamed from: d, reason: collision with root package name */
    private final List f18159d;

    /* renamed from: e, reason: collision with root package name */
    private final List f18160e;

    /* renamed from: f, reason: collision with root package name */
    private final List f18161f;

    /* renamed from: g, reason: collision with root package name */
    private final List f18162g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f18163h;

    /* renamed from: i, reason: collision with root package name */
    private x1.r f18164i;

    public C(P p10, List list) {
        this(p10, null, EnumC5103g.KEEP, list, null);
    }

    private static boolean i(C c10, Set set) {
        set.addAll(c10.c());
        Set l10 = l(c10);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (l10.contains((String) it.next())) {
                return true;
            }
        }
        List e10 = c10.e();
        if (e10 != null && !e10.isEmpty()) {
            Iterator it2 = e10.iterator();
            while (it2.hasNext()) {
                if (i((C) it2.next(), set)) {
                    return true;
                }
            }
        }
        set.removeAll(c10.c());
        return false;
    }

    public static Set l(C c10) {
        HashSet hashSet = new HashSet();
        List e10 = c10.e();
        if (e10 != null && !e10.isEmpty()) {
            Iterator it = e10.iterator();
            while (it.hasNext()) {
                hashSet.addAll(((C) it.next()).c());
            }
        }
        return hashSet;
    }

    public x1.r a() {
        if (this.f18163h) {
            x1.n.e().k(f18155j, "Already enqueued work ids (" + TextUtils.join(", ", this.f18160e) + ")");
        } else {
            RunnableC0773c runnableC0773c = new RunnableC0773c(this);
            this.f18156a.t().d(runnableC0773c);
            this.f18164i = runnableC0773c.d();
        }
        return this.f18164i;
    }

    public EnumC5103g b() {
        return this.f18158c;
    }

    public List c() {
        return this.f18160e;
    }

    public String d() {
        return this.f18157b;
    }

    public List e() {
        return this.f18162g;
    }

    public List f() {
        return this.f18159d;
    }

    public P g() {
        return this.f18156a;
    }

    public boolean h() {
        return i(this, new HashSet());
    }

    public boolean j() {
        return this.f18163h;
    }

    public void k() {
        this.f18163h = true;
    }

    public C(P p10, String str, EnumC5103g enumC5103g, List list) {
        this(p10, str, enumC5103g, list, null);
    }

    public C(P p10, String str, EnumC5103g enumC5103g, List list, List list2) {
        this.f18156a = p10;
        this.f18157b = str;
        this.f18158c = enumC5103g;
        this.f18159d = list;
        this.f18162g = list2;
        this.f18160e = new ArrayList(list.size());
        this.f18161f = new ArrayList();
        if (list2 != null) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                this.f18161f.addAll(((C) it.next()).f18161f);
            }
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (enumC5103g == EnumC5103g.REPLACE && ((AbstractC5095B) list.get(i10)).d().g() != Long.MAX_VALUE) {
                throw new IllegalArgumentException("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
            }
            String b10 = ((AbstractC5095B) list.get(i10)).b();
            this.f18160e.add(b10);
            this.f18161f.add(b10);
        }
    }
}
