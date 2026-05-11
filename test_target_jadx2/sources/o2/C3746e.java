package o2;

import android.util.Base64;
import com.bumptech.glide.load.data.d;
import i2.EnumC3313a;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import o2.n;

/* renamed from: o2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3746e implements n {

    /* renamed from: a, reason: collision with root package name */
    private final a f37817a;

    /* renamed from: o2.e$a */
    public interface a {
        Class a();

        void b(Object obj);

        Object c(String str);
    }

    public C3746e(a aVar) {
        this.f37817a = aVar;
    }

    @Override // o2.n
    public boolean a(Object obj) {
        return obj.toString().startsWith("data:image");
    }

    @Override // o2.n
    public n.a b(Object obj, int i10, int i11, i2.h hVar) {
        return new n.a(new C2.c(obj), new b(obj.toString(), this.f37817a));
    }

    /* renamed from: o2.e$b */
    private static final class b implements com.bumptech.glide.load.data.d {

        /* renamed from: a, reason: collision with root package name */
        private final String f37818a;

        /* renamed from: b, reason: collision with root package name */
        private final a f37819b;

        /* renamed from: c, reason: collision with root package name */
        private Object f37820c;

        b(String str, a aVar) {
            this.f37818a = str;
            this.f37819b = aVar;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class a() {
            return this.f37819b.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            try {
                this.f37819b.b(this.f37820c);
            } catch (IOException unused) {
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public EnumC3313a e() {
            return EnumC3313a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void f(com.bumptech.glide.h hVar, d.a aVar) {
            try {
                Object c10 = this.f37819b.c(this.f37818a);
                this.f37820c = c10;
                aVar.d(c10);
            } catch (IllegalArgumentException e10) {
                aVar.c(e10);
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }
    }

    /* renamed from: o2.e$c */
    public static final class c implements o {

        /* renamed from: a, reason: collision with root package name */
        private final a f37821a = new a();

        /* renamed from: o2.e$c$a */
        class a implements a {
            a() {
            }

            @Override // o2.C3746e.a
            public Class a() {
                return InputStream.class;
            }

            @Override // o2.C3746e.a
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public void b(InputStream inputStream) {
                inputStream.close();
            }

            @Override // o2.C3746e.a
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public InputStream c(String str) {
                if (!str.startsWith("data:image")) {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
                int indexOf = str.indexOf(44);
                if (indexOf == -1) {
                    throw new IllegalArgumentException("Missing comma in data URL.");
                }
                if (str.substring(0, indexOf).endsWith(";base64")) {
                    return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                }
                throw new IllegalArgumentException("Not a base64 image data URL.");
            }
        }

        @Override // o2.o
        public n e(r rVar) {
            return new C3746e(this.f37821a);
        }

        @Override // o2.o
        public void d() {
        }
    }
}
