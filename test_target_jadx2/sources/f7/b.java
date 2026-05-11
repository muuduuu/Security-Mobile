package F7;

import V6.AbstractC1287s;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.Image;
import android.util.SparseArray;
import com.google.android.gms.internal.vision.C2;
import com.google.android.gms.internal.vision.C2577i1;
import com.google.android.gms.internal.vision.g2;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class b extends E7.a {

    /* renamed from: b, reason: collision with root package name */
    private final g2 f2642b;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private Context f2643a;

        /* renamed from: b, reason: collision with root package name */
        private C2577i1 f2644b = new C2577i1();

        public a(Context context) {
            this.f2643a = context;
        }

        public b a() {
            return new b(new g2(this.f2643a, this.f2644b));
        }

        public a b(int i10) {
            this.f2644b.f25165a = i10;
            return this;
        }
    }

    private b(g2 g2Var) {
        this.f2642b = g2Var;
    }

    public final SparseArray a(E7.b bVar) {
        F7.a[] e10;
        if (bVar == null) {
            throw new IllegalArgumentException("No frame supplied.");
        }
        C2 j10 = C2.j(bVar);
        if (bVar.a() != null) {
            e10 = this.f2642b.d((Bitmap) AbstractC1287s.m(bVar.a()), j10);
            if (e10 == null) {
                throw new IllegalArgumentException("Internal barcode detector error; check logcat output.");
            }
        } else if (bVar.d() != null) {
            e10 = this.f2642b.e((ByteBuffer) AbstractC1287s.m(((Image.Plane[]) AbstractC1287s.m(bVar.d()))[0].getBuffer()), new C2(((Image.Plane[]) AbstractC1287s.m(bVar.d()))[0].getRowStride(), j10.f25003b, j10.f25004c, j10.f25005d, j10.f25006e));
        } else {
            e10 = this.f2642b.e((ByteBuffer) AbstractC1287s.m(bVar.b()), j10);
        }
        SparseArray sparseArray = new SparseArray(e10.length);
        for (F7.a aVar : e10) {
            sparseArray.append(aVar.f2567b.hashCode(), aVar);
        }
        return sparseArray;
    }

    public final boolean b() {
        return this.f2642b.b();
    }
}
