package T5;

import java.lang.reflect.Array;

/* loaded from: classes2.dex */
public abstract class b {

    static class a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Class f9272a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f9273b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f9274c;

        a(Class cls, int i10, Object obj) {
            this.f9272a = cls;
            this.f9273b = i10;
            this.f9274c = obj;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!f.D(obj, this.f9272a) || Array.getLength(obj) != this.f9273b) {
                return false;
            }
            for (int i10 = 0; i10 < this.f9273b; i10++) {
                Object obj2 = Array.get(this.f9274c, i10);
                Object obj3 = Array.get(obj, i10);
                if (obj2 != obj3 && obj2 != null && !obj2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        }
    }

    public static Object a(Object obj) {
        return new a(obj.getClass(), Array.getLength(obj), obj);
    }
}
