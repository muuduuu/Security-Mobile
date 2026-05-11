package mb;

import pb.m;

/* renamed from: mb.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC3663a {

    /* renamed from: mb.a$a, reason: collision with other inner class name */
    class C0561a implements Ba.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ m f37426a;

        C0561a(m mVar) {
            this.f37426a = mVar;
        }

        @Override // Ba.d
        public void reject(String str, String str2, Throwable th) {
            this.f37426a.reject(str, str2, th);
        }

        @Override // Ba.d
        public void resolve(Object obj) {
            this.f37426a.resolve(obj);
        }
    }

    /* renamed from: mb.a$b */
    class b implements Ba.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ m f37427a;

        b(m mVar) {
            this.f37427a = mVar;
        }

        @Override // Ba.d
        public void reject(String str, String str2, Throwable th) {
            this.f37427a.reject(str, str2, th);
        }

        @Override // Ba.d
        public void resolve(Object obj) {
            this.f37427a.resolve(obj);
        }
    }

    static void a(InterfaceC3663a interfaceC3663a, m mVar, String... strArr) {
        j(interfaceC3663a, new C0561a(mVar), strArr);
    }

    static void d(InterfaceC3663a interfaceC3663a, m mVar, String... strArr) {
        k(interfaceC3663a, new b(mVar), strArr);
    }

    static void j(InterfaceC3663a interfaceC3663a, Ba.d dVar, String... strArr) {
        if (interfaceC3663a == null) {
            dVar.reject("E_NO_PERMISSIONS", "Permissions module is null. Are you sure all the installed Expo modules are properly linked?");
        } else {
            interfaceC3663a.b(dVar, strArr);
        }
    }

    static void k(InterfaceC3663a interfaceC3663a, Ba.d dVar, String... strArr) {
        if (interfaceC3663a == null) {
            dVar.reject("E_NO_PERMISSIONS", "Permissions module is null. Are you sure all the installed Expo modules are properly linked?");
        } else {
            interfaceC3663a.l(dVar, strArr);
        }
    }

    void b(Ba.d dVar, String... strArr);

    boolean f(String str);

    void g(c cVar, String... strArr);

    boolean h(String... strArr);

    void l(Ba.d dVar, String... strArr);

    void m(c cVar, String... strArr);
}
