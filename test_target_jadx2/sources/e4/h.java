package e4;

import b3.l;
import g4.m;
import g4.n;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class h implements e {

    /* renamed from: a, reason: collision with root package name */
    private final b f32212a;

    private static class a implements b {
        @Override // e4.h.b
        public List a() {
            return Collections.EMPTY_LIST;
        }

        @Override // e4.h.b
        public int b() {
            return 0;
        }

        private a() {
        }
    }

    public interface b {
        List a();

        int b();
    }

    public h() {
        this(new a());
    }

    @Override // e4.e
    public n a(int i10) {
        return m.d(i10, i10 >= this.f32212a.b(), false);
    }

    @Override // e4.e
    public int b(int i10) {
        List a10 = this.f32212a.a();
        if (a10 == null || a10.isEmpty()) {
            return i10 + 1;
        }
        for (int i11 = 0; i11 < a10.size(); i11++) {
            if (((Integer) a10.get(i11)).intValue() > i10) {
                return ((Integer) a10.get(i11)).intValue();
            }
        }
        return Integer.MAX_VALUE;
    }

    @Override // e4.e
    public boolean c() {
        return true;
    }

    public h(b bVar) {
        this.f32212a = (b) l.g(bVar);
    }
}
