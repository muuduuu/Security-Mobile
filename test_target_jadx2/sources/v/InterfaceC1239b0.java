package V;

import android.util.Size;
import java.util.ArrayList;
import java.util.List;

/* renamed from: V.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1239b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final InterfaceC1239b0 f10597a = new a();

    /* renamed from: V.b0$a */
    class a implements InterfaceC1239b0 {
        a() {
        }

        @Override // V.InterfaceC1239b0
        public List b(A.B b10) {
            return new ArrayList();
        }
    }

    default AbstractC1258v a(Size size, A.B b10) {
        return AbstractC1258v.f10732g;
    }

    List b(A.B b10);

    default X.g c(AbstractC1258v abstractC1258v, A.B b10) {
        return null;
    }

    default X.g d(Size size, A.B b10) {
        return null;
    }
}
