package k2;

import i2.EnumC3313a;
import i2.EnumC3315c;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final j f36072a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final j f36073b = new b();

    /* renamed from: c, reason: collision with root package name */
    public static final j f36074c = new c();

    /* renamed from: d, reason: collision with root package name */
    public static final j f36075d = new d();

    /* renamed from: e, reason: collision with root package name */
    public static final j f36076e = new e();

    class a extends j {
        a() {
        }

        @Override // k2.j
        public boolean a() {
            return true;
        }

        @Override // k2.j
        public boolean b() {
            return true;
        }

        @Override // k2.j
        public boolean c(EnumC3313a enumC3313a) {
            return enumC3313a == EnumC3313a.REMOTE;
        }

        @Override // k2.j
        public boolean d(boolean z10, EnumC3313a enumC3313a, EnumC3315c enumC3315c) {
            return (enumC3313a == EnumC3313a.RESOURCE_DISK_CACHE || enumC3313a == EnumC3313a.MEMORY_CACHE) ? false : true;
        }
    }

    class b extends j {
        b() {
        }

        @Override // k2.j
        public boolean a() {
            return false;
        }

        @Override // k2.j
        public boolean b() {
            return false;
        }

        @Override // k2.j
        public boolean c(EnumC3313a enumC3313a) {
            return false;
        }

        @Override // k2.j
        public boolean d(boolean z10, EnumC3313a enumC3313a, EnumC3315c enumC3315c) {
            return false;
        }
    }

    class c extends j {
        c() {
        }

        @Override // k2.j
        public boolean a() {
            return true;
        }

        @Override // k2.j
        public boolean b() {
            return false;
        }

        @Override // k2.j
        public boolean c(EnumC3313a enumC3313a) {
            return (enumC3313a == EnumC3313a.DATA_DISK_CACHE || enumC3313a == EnumC3313a.MEMORY_CACHE) ? false : true;
        }

        @Override // k2.j
        public boolean d(boolean z10, EnumC3313a enumC3313a, EnumC3315c enumC3315c) {
            return false;
        }
    }

    class d extends j {
        d() {
        }

        @Override // k2.j
        public boolean a() {
            return false;
        }

        @Override // k2.j
        public boolean b() {
            return true;
        }

        @Override // k2.j
        public boolean c(EnumC3313a enumC3313a) {
            return false;
        }

        @Override // k2.j
        public boolean d(boolean z10, EnumC3313a enumC3313a, EnumC3315c enumC3315c) {
            return (enumC3313a == EnumC3313a.RESOURCE_DISK_CACHE || enumC3313a == EnumC3313a.MEMORY_CACHE) ? false : true;
        }
    }

    class e extends j {
        e() {
        }

        @Override // k2.j
        public boolean a() {
            return true;
        }

        @Override // k2.j
        public boolean b() {
            return true;
        }

        @Override // k2.j
        public boolean c(EnumC3313a enumC3313a) {
            return enumC3313a == EnumC3313a.REMOTE;
        }

        @Override // k2.j
        public boolean d(boolean z10, EnumC3313a enumC3313a, EnumC3315c enumC3315c) {
            return ((z10 && enumC3313a == EnumC3313a.DATA_DISK_CACHE) || enumC3313a == EnumC3313a.LOCAL) && enumC3315c == EnumC3315c.TRANSFORMED;
        }
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c(EnumC3313a enumC3313a);

    public abstract boolean d(boolean z10, EnumC3313a enumC3313a, EnumC3315c enumC3315c);
}
