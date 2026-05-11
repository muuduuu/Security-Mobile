package t;

import A.AbstractC0700h0;
import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import u.C4844h;
import y.C5158a;

/* renamed from: t.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4590w implements androidx.camera.core.impl.F {

    /* renamed from: a, reason: collision with root package name */
    private final Context f42226a;

    /* renamed from: b, reason: collision with root package name */
    private final B.a f42227b;

    /* renamed from: c, reason: collision with root package name */
    private final androidx.camera.core.impl.P f42228c;

    /* renamed from: d, reason: collision with root package name */
    private final androidx.camera.core.impl.O f42229d;

    /* renamed from: e, reason: collision with root package name */
    private final u.P f42230e;

    /* renamed from: f, reason: collision with root package name */
    private final List f42231f;

    /* renamed from: g, reason: collision with root package name */
    private final C4545g1 f42232g;

    /* renamed from: h, reason: collision with root package name */
    private final long f42233h;

    /* renamed from: i, reason: collision with root package name */
    private final Map f42234i = new HashMap();

    public C4590w(Context context, androidx.camera.core.impl.P p10, A.r rVar, long j10) {
        this.f42226a = context;
        this.f42228c = p10;
        u.P b10 = u.P.b(context, p10.c());
        this.f42230e = b10;
        this.f42232g = C4545g1.c(context);
        this.f42231f = e(N0.b(this, rVar));
        C5158a c5158a = new C5158a(b10);
        this.f42227b = c5158a;
        androidx.camera.core.impl.O o10 = new androidx.camera.core.impl.O(c5158a, 1);
        this.f42229d = o10;
        c5158a.b(o10);
        this.f42233h = j10;
    }

    private List e(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.equals("0") || str.equals("1")) {
                arrayList.add(str);
            } else if (M0.a(this.f42230e, str)) {
                arrayList.add(str);
            } else {
                AbstractC0700h0.a("Camera2CameraFactory", "Camera " + str + " is filtered out because its capabilities do not contain REQUEST_AVAILABLE_CAPABILITIES_BACKWARD_COMPATIBLE.");
            }
        }
        return arrayList;
    }

    @Override // androidx.camera.core.impl.F
    public Set a() {
        return new LinkedHashSet(this.f42231f);
    }

    @Override // androidx.camera.core.impl.F
    public androidx.camera.core.impl.H b(String str) {
        if (this.f42231f.contains(str)) {
            return new M(this.f42226a, this.f42230e, str, f(str), this.f42227b, this.f42229d, this.f42228c.b(), this.f42228c.c(), this.f42232g, this.f42233h);
        }
        throw new IllegalArgumentException("The given camera id is not on the available camera id list.");
    }

    @Override // androidx.camera.core.impl.F
    public B.a d() {
        return this.f42227b;
    }

    U f(String str) {
        try {
            U u10 = (U) this.f42234i.get(str);
            if (u10 != null) {
                return u10;
            }
            U u11 = new U(str, this.f42230e);
            this.f42234i.put(str, u11);
            return u11;
        } catch (C4844h e10) {
            throw P0.a(e10);
        }
    }

    @Override // androidx.camera.core.impl.F
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public u.P c() {
        return this.f42230e;
    }
}
