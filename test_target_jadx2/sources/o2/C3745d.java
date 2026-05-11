package o2;

import android.util.Log;
import com.bumptech.glide.load.data.d;
import i2.EnumC3313a;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import o2.n;

/* renamed from: o2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3745d implements n {
    @Override // o2.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a b(File file, int i10, int i11, i2.h hVar) {
        return new n.a(new C2.c(file), new a(file));
    }

    @Override // o2.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(File file) {
        return true;
    }

    /* renamed from: o2.d$a */
    private static final class a implements com.bumptech.glide.load.data.d {

        /* renamed from: a, reason: collision with root package name */
        private final File f37816a;

        a(File file) {
            this.f37816a = file;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class a() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.d
        public EnumC3313a e() {
            return EnumC3313a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void f(com.bumptech.glide.h hVar, d.a aVar) {
            try {
                aVar.d(D2.a.a(this.f37816a));
            } catch (IOException e10) {
                if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                    Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e10);
                }
                aVar.c(e10);
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }
    }

    /* renamed from: o2.d$b */
    public static class b implements o {
        @Override // o2.o
        public n e(r rVar) {
            return new C3745d();
        }

        @Override // o2.o
        public void d() {
        }
    }
}
