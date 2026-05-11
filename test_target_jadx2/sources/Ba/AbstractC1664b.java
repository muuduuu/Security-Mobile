package ba;

import java.io.Closeable;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: ba.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1664b implements Iterable, Closeable {

    /* renamed from: ba.b$a */
    public interface a {
        Object from(byte[] bArr);

        void toStream(Object obj, OutputStream outputStream);
    }

    public static AbstractC1664b j(C1665c c1665c, a aVar) {
        return new C1663a(c1665c, aVar);
    }

    public abstract void c(Object obj);

    public List e() {
        return r(size());
    }

    public abstract boolean isEmpty();

    public abstract Object peek();

    public List r(int i10) {
        int min = Math.min(i10, size());
        ArrayList arrayList = new ArrayList(min);
        Iterator it = iterator();
        for (int i11 = 0; i11 < min; i11++) {
            arrayList.add(it.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public abstract int size();

    public abstract void t(int i10);
}
