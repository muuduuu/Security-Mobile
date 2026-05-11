package Y3;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import e3.h;
import f3.AbstractC3142a;
import g4.i;
import j4.C3491E;
import k3.InterfaceC3538a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c implements InterfaceC3538a {

    /* renamed from: c, reason: collision with root package name */
    public static final a f12003c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final b f12004a;

    /* renamed from: b, reason: collision with root package name */
    private final com.facebook.imagepipeline.memory.d f12005b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final BitmapFactory.Options b(int i10, Bitmap.Config config) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inDither = true;
            options.inPreferredConfig = config;
            options.inPurgeable = true;
            options.inInputShareable = true;
            options.inSampleSize = i10;
            options.inMutable = true;
            return options;
        }

        private a() {
        }
    }

    public c(C3491E poolFactory) {
        Intrinsics.checkNotNullParameter(poolFactory, "poolFactory");
        this.f12004a = new b(poolFactory.h());
        com.facebook.imagepipeline.memory.d d10 = poolFactory.d();
        Intrinsics.checkNotNullExpressionValue(d10, "poolFactory.flexByteArrayPool");
        this.f12005b = d10;
    }

    @Override // k3.InterfaceC3538a
    public Bitmap a(int i10, int i11, Bitmap.Config bitmapConfig) {
        i iVar;
        Intrinsics.checkNotNullParameter(bitmapConfig, "bitmapConfig");
        AbstractC3142a a10 = this.f12004a.a((short) i10, (short) i11);
        Intrinsics.checkNotNullExpressionValue(a10, "jpegGenerator.generate(w…hort(), height.toShort())");
        try {
            iVar = new i(a10);
        } catch (Throwable th) {
            th = th;
            iVar = null;
        }
        try {
            iVar.Q(S3.b.f8722b);
            BitmapFactory.Options b10 = f12003c.b(iVar.o(), bitmapConfig);
            int size = ((h) a10.p()).size();
            Object p10 = a10.p();
            Intrinsics.checkNotNullExpressionValue(p10, "jpgRef.get()");
            AbstractC3142a a11 = this.f12005b.a(size + 2);
            Object p11 = a11.p();
            Intrinsics.checkNotNullExpressionValue(p11, "encodedBytesArrayRef.get()");
            byte[] bArr = (byte[]) p11;
            ((h) p10).E(0, bArr, 0, size);
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, size, b10);
            if (decodeByteArray == null) {
                throw new IllegalStateException("Required value was null.");
            }
            decodeByteArray.setHasAlpha(true);
            decodeByteArray.eraseColor(0);
            AbstractC3142a.n(a11);
            i.c(iVar);
            AbstractC3142a.n(a10);
            return decodeByteArray;
        } catch (Throwable th2) {
            th = th2;
            AbstractC3142a.n(null);
            i.c(iVar);
            AbstractC3142a.n(a10);
            throw th;
        }
    }
}
