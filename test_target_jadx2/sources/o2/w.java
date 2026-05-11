package o2;

import com.bumptech.glide.load.data.d;
import i2.EnumC3313a;
import o2.n;

/* loaded from: classes.dex */
public class w implements n {

    /* renamed from: a, reason: collision with root package name */
    private static final w f37902a = new w();

    public static w c() {
        return f37902a;
    }

    @Override // o2.n
    public boolean a(Object obj) {
        return true;
    }

    @Override // o2.n
    public n.a b(Object obj, int i10, int i11, i2.h hVar) {
        return new n.a(new C2.c(obj), new b(obj));
    }

    public static class a implements o {

        /* renamed from: a, reason: collision with root package name */
        private static final a f37903a = new a();

        public static a a() {
            return f37903a;
        }

        @Override // o2.o
        public n e(r rVar) {
            return w.c();
        }

        @Override // o2.o
        public void d() {
        }
    }

    private static class b implements com.bumptech.glide.load.data.d {

        /* renamed from: a, reason: collision with root package name */
        private final Object f37904a;

        b(Object obj) {
            this.f37904a = obj;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class a() {
            return this.f37904a.getClass();
        }

        @Override // com.bumptech.glide.load.data.d
        public EnumC3313a e() {
            return EnumC3313a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void f(com.bumptech.glide.h hVar, d.a aVar) {
            aVar.d(this.f37904a);
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }
    }
}
