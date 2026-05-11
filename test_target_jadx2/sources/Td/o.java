package Td;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public interface o {

    /* renamed from: a, reason: collision with root package name */
    public static final a f10186a = a.f10188a;

    /* renamed from: b, reason: collision with root package name */
    public static final o f10187b = new a.C0192a();

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f10188a = new a();

        /* renamed from: Td.o$a$a, reason: collision with other inner class name */
        private static final class C0192a implements o {
            @Override // Td.o
            public void b(w url, List cookies) {
                Intrinsics.checkNotNullParameter(url, "url");
                Intrinsics.checkNotNullParameter(cookies, "cookies");
            }

            @Override // Td.o
            public List d(w url) {
                Intrinsics.checkNotNullParameter(url, "url");
                return CollectionsKt.j();
            }
        }

        private a() {
        }
    }

    void b(w wVar, List list);

    List d(w wVar);
}
