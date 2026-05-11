package androidx.camera.core.impl;

import A.AbstractC0700h0;
import androidx.camera.core.impl.V0;
import androidx.camera.core.impl.k1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class k1 {

    /* renamed from: a, reason: collision with root package name */
    private final String f14619a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f14620b = new LinkedHashMap();

    /* JADX INFO: Access modifiers changed from: private */
    interface a {
        boolean a(b bVar);
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final V0 f14621a;

        /* renamed from: b, reason: collision with root package name */
        private final l1 f14622b;

        /* renamed from: c, reason: collision with root package name */
        private final Z0 f14623c;

        /* renamed from: d, reason: collision with root package name */
        private final List f14624d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f14625e = false;

        /* renamed from: f, reason: collision with root package name */
        private boolean f14626f = false;

        b(V0 v02, l1 l1Var, Z0 z02, List list) {
            this.f14621a = v02;
            this.f14622b = l1Var;
            this.f14623c = z02;
            this.f14624d = list;
        }

        boolean a() {
            return this.f14626f;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean b() {
            return this.f14625e;
        }

        public List c() {
            return this.f14624d;
        }

        public V0 d() {
            return this.f14621a;
        }

        public Z0 e() {
            return this.f14623c;
        }

        public l1 f() {
            return this.f14622b;
        }

        void g(boolean z10) {
            this.f14626f = z10;
        }

        void h(boolean z10) {
            this.f14625e = z10;
        }

        public String toString() {
            return "UseCaseAttachInfo{mSessionConfig=" + this.f14621a + ", mUseCaseConfig=" + this.f14622b + ", mStreamSpec=" + this.f14623c + ", mCaptureTypes=" + this.f14624d + ", mAttached=" + this.f14625e + ", mActive=" + this.f14626f + '}';
        }
    }

    public k1(String str) {
        this.f14619a = str;
    }

    private b k(String str, V0 v02, l1 l1Var, Z0 z02, List list) {
        b bVar = (b) this.f14620b.get(str);
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(v02, l1Var, z02, list);
        this.f14620b.put(str, bVar2);
        return bVar2;
    }

    private Collection l(a aVar) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f14620b.entrySet()) {
            if (aVar == null || aVar.a((b) entry.getValue())) {
                arrayList.add(((b) entry.getValue()).d());
            }
        }
        return arrayList;
    }

    private Collection m(a aVar) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f14620b.entrySet()) {
            if (aVar == null || aVar.a((b) entry.getValue())) {
                arrayList.add(((b) entry.getValue()).f());
            }
        }
        return arrayList;
    }

    private Collection n(a aVar) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f14620b.entrySet()) {
            if (aVar == null || aVar.a((b) entry.getValue())) {
                arrayList.add((b) entry.getValue());
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean p(b bVar) {
        return bVar.a() && bVar.b();
    }

    public V0.h e() {
        V0.h hVar = new V0.h();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f14620b.entrySet()) {
            b bVar = (b) entry.getValue();
            if (bVar.a() && bVar.b()) {
                String str = (String) entry.getKey();
                hVar.b(bVar.d());
                arrayList.add(str);
            }
        }
        AbstractC0700h0.a("UseCaseAttachState", "Active and attached use case: " + arrayList + " for camera: " + this.f14619a);
        return hVar;
    }

    public Collection f() {
        return Collections.unmodifiableCollection(l(new a() { // from class: androidx.camera.core.impl.i1
            @Override // androidx.camera.core.impl.k1.a
            public final boolean a(k1.b bVar) {
                boolean p10;
                p10 = k1.p(bVar);
                return p10;
            }
        }));
    }

    public V0.h g() {
        V0.h hVar = new V0.h();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f14620b.entrySet()) {
            b bVar = (b) entry.getValue();
            if (bVar.b()) {
                hVar.b(bVar.d());
                arrayList.add((String) entry.getKey());
            }
        }
        AbstractC0700h0.a("UseCaseAttachState", "All use case: " + arrayList + " for camera: " + this.f14619a);
        return hVar;
    }

    public Collection h() {
        return Collections.unmodifiableCollection(l(new a() { // from class: androidx.camera.core.impl.g1
            @Override // androidx.camera.core.impl.k1.a
            public final boolean a(k1.b bVar) {
                boolean b10;
                b10 = bVar.b();
                return b10;
            }
        }));
    }

    public Collection i() {
        return Collections.unmodifiableCollection(m(new a() { // from class: androidx.camera.core.impl.h1
            @Override // androidx.camera.core.impl.k1.a
            public final boolean a(k1.b bVar) {
                boolean b10;
                b10 = bVar.b();
                return b10;
            }
        }));
    }

    public Collection j() {
        return Collections.unmodifiableCollection(n(new a() { // from class: androidx.camera.core.impl.j1
            @Override // androidx.camera.core.impl.k1.a
            public final boolean a(k1.b bVar) {
                boolean b10;
                b10 = bVar.b();
                return b10;
            }
        }));
    }

    public boolean o(String str) {
        if (this.f14620b.containsKey(str)) {
            return ((b) this.f14620b.get(str)).b();
        }
        return false;
    }

    public void t(String str) {
        this.f14620b.remove(str);
    }

    public void u(String str, V0 v02, l1 l1Var, Z0 z02, List list) {
        k(str, v02, l1Var, z02, list).g(true);
    }

    public void v(String str, V0 v02, l1 l1Var, Z0 z02, List list) {
        k(str, v02, l1Var, z02, list).h(true);
        y(str, v02, l1Var, z02, list);
    }

    public void w(String str) {
        if (this.f14620b.containsKey(str)) {
            b bVar = (b) this.f14620b.get(str);
            bVar.h(false);
            if (bVar.a()) {
                return;
            }
            this.f14620b.remove(str);
        }
    }

    public void x(String str) {
        if (this.f14620b.containsKey(str)) {
            b bVar = (b) this.f14620b.get(str);
            bVar.g(false);
            if (bVar.b()) {
                return;
            }
            this.f14620b.remove(str);
        }
    }

    public void y(String str, V0 v02, l1 l1Var, Z0 z02, List list) {
        if (this.f14620b.containsKey(str)) {
            b bVar = new b(v02, l1Var, z02, list);
            b bVar2 = (b) this.f14620b.get(str);
            bVar.h(bVar2.b());
            bVar.g(bVar2.a());
            this.f14620b.put(str, bVar);
        }
    }
}
