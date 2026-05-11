package o2;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import i2.EnumC3313a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import o2.n;

/* loaded from: classes.dex */
public class g implements n {

    /* renamed from: a, reason: collision with root package name */
    private final d f37833a;

    public static class b extends a {

        class a implements d {
            a() {
            }

            @Override // o2.g.d
            public Class a() {
                return ParcelFileDescriptor.class;
            }

            @Override // o2.g.d
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public void b(ParcelFileDescriptor parcelFileDescriptor) {
                parcelFileDescriptor.close();
            }

            @Override // o2.g.d
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public ParcelFileDescriptor c(File file) {
                return ParcelFileDescriptor.open(file, 268435456);
            }
        }

        public b() {
            super(new a());
        }
    }

    public interface d {
        Class a();

        void b(Object obj);

        Object c(File file);
    }

    public static class e extends a {

        class a implements d {
            a() {
            }

            @Override // o2.g.d
            public Class a() {
                return InputStream.class;
            }

            @Override // o2.g.d
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public void b(InputStream inputStream) {
                inputStream.close();
            }

            @Override // o2.g.d
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public InputStream c(File file) {
                return new FileInputStream(file);
            }
        }

        public e() {
            super(new a());
        }
    }

    public g(d dVar) {
        this.f37833a = dVar;
    }

    @Override // o2.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a b(File file, int i10, int i11, i2.h hVar) {
        return new n.a(new C2.c(file), new c(file, this.f37833a));
    }

    @Override // o2.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(File file) {
        return true;
    }

    public static class a implements o {

        /* renamed from: a, reason: collision with root package name */
        private final d f37834a;

        public a(d dVar) {
            this.f37834a = dVar;
        }

        @Override // o2.o
        public final n e(r rVar) {
            return new g(this.f37834a);
        }

        @Override // o2.o
        public final void d() {
        }
    }

    private static final class c implements com.bumptech.glide.load.data.d {

        /* renamed from: a, reason: collision with root package name */
        private final File f37835a;

        /* renamed from: b, reason: collision with root package name */
        private final d f37836b;

        /* renamed from: c, reason: collision with root package name */
        private Object f37837c;

        c(File file, d dVar) {
            this.f37835a = file;
            this.f37836b = dVar;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class a() {
            return this.f37836b.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            Object obj = this.f37837c;
            if (obj != null) {
                try {
                    this.f37836b.b(obj);
                } catch (IOException unused) {
                }
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public EnumC3313a e() {
            return EnumC3313a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void f(com.bumptech.glide.h hVar, d.a aVar) {
            try {
                Object c10 = this.f37836b.c(this.f37835a);
                this.f37837c = c10;
                aVar.d(c10);
            } catch (FileNotFoundException e10) {
                if (Log.isLoggable("FileLoader", 3)) {
                    Log.d("FileLoader", "Failed to open file", e10);
                }
                aVar.c(e10);
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }
    }
}
