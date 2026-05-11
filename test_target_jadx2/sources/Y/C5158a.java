package y;

import A.AbstractC0700h0;
import A.C0696f0;
import A.InterfaceC0713p;
import B.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import t.M0;
import u.C4844h;
import u.P;
import z.h;

/* renamed from: y.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5158a implements B.a {

    /* renamed from: a, reason: collision with root package name */
    private final P f45124a;

    /* renamed from: f, reason: collision with root package name */
    private int f45129f = 0;

    /* renamed from: c, reason: collision with root package name */
    private final Map f45126c = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private Set f45128e = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    private final List f45125b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private List f45127d = new ArrayList();

    public C5158a(P p10) {
        this.f45124a = p10;
        e();
    }

    private void e() {
        Set hashSet = new HashSet();
        try {
            hashSet = this.f45124a.e();
        } catch (C4844h unused) {
            AbstractC0700h0.c("Camera2CameraCoordinator", "Failed to get concurrent camera ids");
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ArrayList arrayList = new ArrayList((Set) it.next());
            if (arrayList.size() >= 2) {
                String str = (String) arrayList.get(0);
                String str2 = (String) arrayList.get(1);
                try {
                    if (M0.a(this.f45124a, str) && M0.a(this.f45124a, str2)) {
                        this.f45128e.add(new HashSet(Arrays.asList(str, str2)));
                        if (!this.f45126c.containsKey(str)) {
                            this.f45126c.put(str, new ArrayList());
                        }
                        if (!this.f45126c.containsKey(str2)) {
                            this.f45126c.put(str2, new ArrayList());
                        }
                        ((List) this.f45126c.get(str)).add((String) arrayList.get(1));
                        ((List) this.f45126c.get(str2)).add((String) arrayList.get(0));
                    }
                } catch (C0696f0 unused2) {
                    AbstractC0700h0.a("Camera2CameraCoordinator", "Concurrent camera id pair: (" + str + ", " + str2 + ") is not backward compatible");
                }
            }
        }
    }

    @Override // B.a
    public int a() {
        return this.f45129f;
    }

    @Override // B.a
    public void b(a.InterfaceC0008a interfaceC0008a) {
        this.f45125b.add(interfaceC0008a);
    }

    @Override // B.a
    public String c(String str) {
        if (!this.f45126c.containsKey(str)) {
            return null;
        }
        for (String str2 : (List) this.f45126c.get(str)) {
            Iterator it = this.f45127d.iterator();
            while (it.hasNext()) {
                if (str2.equals(h.a((InterfaceC0713p) it.next()).c())) {
                    return str2;
                }
            }
        }
        return null;
    }

    @Override // B.a
    public void d(int i10) {
        if (i10 != this.f45129f) {
            Iterator it = this.f45125b.iterator();
            while (it.hasNext()) {
                ((a.InterfaceC0008a) it.next()).a(this.f45129f, i10);
            }
        }
        if (this.f45129f == 2 && i10 != 2) {
            this.f45127d.clear();
        }
        this.f45129f = i10;
    }
}
