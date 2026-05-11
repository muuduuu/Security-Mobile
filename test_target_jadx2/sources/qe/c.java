package qe;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import kotlin.collections.C3573h;
import kotlin.jvm.internal.Intrinsics;
import pe.AbstractC3884l;
import pe.C3883k;
import pe.S;

/* loaded from: classes3.dex */
public abstract class c {
    public static final void a(AbstractC3884l abstractC3884l, S dir, boolean z10) {
        Intrinsics.checkNotNullParameter(abstractC3884l, "<this>");
        Intrinsics.checkNotNullParameter(dir, "dir");
        C3573h c3573h = new C3573h();
        for (S s10 = dir; s10 != null && !abstractC3884l.j(s10); s10 = s10.q()) {
            c3573h.addFirst(s10);
        }
        if (z10 && c3573h.isEmpty()) {
            throw new IOException(dir + " already exists.");
        }
        Iterator<E> it = c3573h.iterator();
        while (it.hasNext()) {
            abstractC3884l.f((S) it.next());
        }
    }

    public static final boolean b(AbstractC3884l abstractC3884l, S path) {
        Intrinsics.checkNotNullParameter(abstractC3884l, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        return abstractC3884l.m(path) != null;
    }

    public static final C3883k c(AbstractC3884l abstractC3884l, S path) {
        Intrinsics.checkNotNullParameter(abstractC3884l, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        C3883k m10 = abstractC3884l.m(path);
        if (m10 != null) {
            return m10;
        }
        throw new FileNotFoundException("no such file: " + path);
    }
}
