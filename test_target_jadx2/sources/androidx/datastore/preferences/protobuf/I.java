package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.r0;

/* loaded from: classes.dex */
public class I {

    /* renamed from: a, reason: collision with root package name */
    private final a f16294a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f16295b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f16296c;

    static class a {

        /* renamed from: a, reason: collision with root package name */
        public final r0.b f16297a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f16298b;

        /* renamed from: c, reason: collision with root package name */
        public final r0.b f16299c;

        /* renamed from: d, reason: collision with root package name */
        public final Object f16300d;

        public a(r0.b bVar, Object obj, r0.b bVar2, Object obj2) {
            this.f16297a = bVar;
            this.f16298b = obj;
            this.f16299c = bVar2;
            this.f16300d = obj2;
        }
    }

    private I(r0.b bVar, Object obj, r0.b bVar2, Object obj2) {
        this.f16294a = new a(bVar, obj, bVar2, obj2);
        this.f16295b = obj;
        this.f16296c = obj2;
    }

    static int b(a aVar, Object obj, Object obj2) {
        return C1551s.b(aVar.f16297a, 1, obj) + C1551s.b(aVar.f16299c, 2, obj2);
    }

    public static I d(r0.b bVar, Object obj, r0.b bVar2, Object obj2) {
        return new I(bVar, obj, bVar2, obj2);
    }

    static void e(AbstractC1543j abstractC1543j, a aVar, Object obj, Object obj2) {
        C1551s.u(abstractC1543j, aVar.f16297a, 1, obj);
        C1551s.u(abstractC1543j, aVar.f16299c, 2, obj2);
    }

    public int a(int i10, Object obj, Object obj2) {
        return AbstractC1543j.O(i10) + AbstractC1543j.y(b(this.f16294a, obj, obj2));
    }

    a c() {
        return this.f16294a;
    }
}
