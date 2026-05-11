package fb;

import android.graphics.BitmapFactory;
import java.io.File;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lc.i;
import xc.m;

/* renamed from: fb.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3162b {

    /* renamed from: a, reason: collision with root package name */
    private final File f32963a;

    /* renamed from: b, reason: collision with root package name */
    private final Lazy f32964b;

    /* renamed from: c, reason: collision with root package name */
    private final Lazy f32965c;

    /* renamed from: fb.b$a */
    static final class a extends m implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            int i10 = new androidx.exifinterface.media.a(C3162b.this.f32963a.getAbsolutePath()).i("Orientation", 0);
            return Boolean.valueOf(i10 == 6 || i10 == 8 || i10 == 5 || i10 == 7);
        }
    }

    /* renamed from: fb.b$b, reason: collision with other inner class name */
    static final class C0483b extends m implements Function0 {
        C0483b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BitmapFactory.Options invoke() {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(C3162b.this.f32963a.getAbsolutePath(), options);
            return options;
        }
    }

    public C3162b(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        this.f32963a = file;
        this.f32964b = i.a(new a());
        this.f32965c = i.a(new C0483b());
    }

    private final BitmapFactory.Options c() {
        return (BitmapFactory.Options) this.f32965c.getValue();
    }

    private final boolean e() {
        return ((Boolean) this.f32964b.getValue()).booleanValue();
    }

    public final int b() {
        return e() ? c().outWidth : c().outHeight;
    }

    public final int d() {
        return e() ? c().outHeight : c().outWidth;
    }
}
