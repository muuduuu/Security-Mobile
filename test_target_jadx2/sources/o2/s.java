package o2;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import java.io.InputStream;
import o2.n;

/* loaded from: classes.dex */
public class s implements n {

    /* renamed from: a, reason: collision with root package name */
    private final n f37891a;

    /* renamed from: b, reason: collision with root package name */
    private final Resources f37892b;

    public s(Resources resources, n nVar) {
        this.f37892b = resources;
        this.f37891a = nVar;
    }

    private Uri d(Integer num) {
        try {
            return Uri.parse("android.resource://" + this.f37892b.getResourcePackageName(num.intValue()) + '/' + this.f37892b.getResourceTypeName(num.intValue()) + '/' + this.f37892b.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException e10) {
            if (!Log.isLoggable("ResourceLoader", 5)) {
                return null;
            }
            Log.w("ResourceLoader", "Received invalid resource id: " + num, e10);
            return null;
        }
    }

    @Override // o2.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a b(Integer num, int i10, int i11, i2.h hVar) {
        Uri d10 = d(num);
        if (d10 == null) {
            return null;
        }
        return this.f37891a.b(d10, i10, i11, hVar);
    }

    @Override // o2.n
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean a(Integer num) {
        return true;
    }

    public static final class a implements o {

        /* renamed from: a, reason: collision with root package name */
        private final Resources f37893a;

        public a(Resources resources) {
            this.f37893a = resources;
        }

        @Override // o2.o
        public n e(r rVar) {
            return new s(this.f37893a, rVar.d(Uri.class, AssetFileDescriptor.class));
        }

        @Override // o2.o
        public void d() {
        }
    }

    public static class b implements o {

        /* renamed from: a, reason: collision with root package name */
        private final Resources f37894a;

        public b(Resources resources) {
            this.f37894a = resources;
        }

        @Override // o2.o
        public n e(r rVar) {
            return new s(this.f37894a, rVar.d(Uri.class, InputStream.class));
        }

        @Override // o2.o
        public void d() {
        }
    }

    public static class c implements o {

        /* renamed from: a, reason: collision with root package name */
        private final Resources f37895a;

        public c(Resources resources) {
            this.f37895a = resources;
        }

        @Override // o2.o
        public n e(r rVar) {
            return new s(this.f37895a, w.c());
        }

        @Override // o2.o
        public void d() {
        }
    }
}
