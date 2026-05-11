package W2;

import W2.i;

/* loaded from: classes.dex */
public class f implements m {

    class a implements l {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(i.a aVar, i.a aVar2) {
            long a10 = aVar.a();
            long a11 = aVar2.a();
            if (a10 < a11) {
                return -1;
            }
            return a11 == a10 ? 0 : 1;
        }
    }

    @Override // W2.m
    public l get() {
        return new a();
    }
}
