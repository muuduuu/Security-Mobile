package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.P;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: androidx.datastore.preferences.protobuf.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1534a implements P {
    protected int memoizedHashCode = 0;

    /* renamed from: androidx.datastore.preferences.protobuf.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0279a implements P.a {
        protected static void b(Iterable iterable, List list) {
            AbstractC1557y.a(iterable);
            if (!(iterable instanceof C)) {
                if (iterable instanceof Z) {
                    list.addAll((Collection) iterable);
                    return;
                } else {
                    d(iterable, list);
                    return;
                }
            }
            List o10 = ((C) iterable).o();
            C c10 = (C) list;
            int size = list.size();
            for (Object obj : o10) {
                if (obj == null) {
                    String str = "Element at index " + (c10.size() - size) + " is null.";
                    for (int size2 = c10.size() - 1; size2 >= size; size2--) {
                        c10.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof AbstractC1540g) {
                    c10.A0((AbstractC1540g) obj);
                } else if (obj instanceof byte[]) {
                    c10.A0(AbstractC1540g.k((byte[]) obj));
                } else {
                    c10.add((String) obj);
                }
            }
        }

        private static void d(Iterable iterable, List list) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size = list.size();
            for (Object obj : iterable) {
                if (obj == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(obj);
            }
        }

        protected static l0 h(P p10) {
            return new l0(p10);
        }
    }

    protected static void b(Iterable iterable, List list) {
        AbstractC0279a.b(iterable, list);
    }

    abstract int c(f0 f0Var);

    l0 d() {
        return new l0(this);
    }

    public void e(OutputStream outputStream) {
        AbstractC1543j Y10 = AbstractC1543j.Y(outputStream, AbstractC1543j.C(getSerializedSize()));
        a(Y10);
        Y10.V();
    }
}
