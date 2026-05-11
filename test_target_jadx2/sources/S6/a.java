package S6;

import S6.h;
import T6.InterfaceC1169e;
import T6.InterfaceC1184n;
import V6.AbstractC1267c;
import V6.AbstractC1287s;
import V6.C1271e;
import V6.InterfaceC1280k;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import com.google.android.gms.common.C2012d;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC0172a f8815a;

    /* renamed from: b, reason: collision with root package name */
    private final g f8816b;

    /* renamed from: c, reason: collision with root package name */
    private final String f8817c;

    /* renamed from: S6.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0172a extends e {
        public f c(Context context, Looper looper, C1271e c1271e, Object obj, h.b bVar, h.c cVar) {
            return d(context, looper, c1271e, obj, bVar, cVar);
        }

        public f d(Context context, Looper looper, C1271e c1271e, Object obj, InterfaceC1169e interfaceC1169e, InterfaceC1184n interfaceC1184n) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    public interface b {
    }

    public static class c {
    }

    public interface d {

        /* renamed from: Q, reason: collision with root package name */
        public static final C0173a f8818Q = new C0173a(null);

        /* renamed from: S6.a$d$a, reason: collision with other inner class name */
        public static final class C0173a implements d {
            /* synthetic */ C0173a(s sVar) {
            }
        }
    }

    public static abstract class e {
        public List a(Object obj) {
            return Collections.emptyList();
        }

        public int b() {
            return Integer.MAX_VALUE;
        }
    }

    public interface f extends b {
        boolean a();

        boolean b();

        Set c();

        void d(String str);

        boolean e();

        String f();

        void g(AbstractC1267c.e eVar);

        void h();

        void j(AbstractC1267c.InterfaceC0202c interfaceC0202c);

        void k(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

        boolean l();

        int m();

        C2012d[] n();

        String p();

        void q(InterfaceC1280k interfaceC1280k, Set set);

        Intent r();

        boolean s();
    }

    public static final class g extends c {
    }

    public a(String str, AbstractC0172a abstractC0172a, g gVar) {
        AbstractC1287s.n(abstractC0172a, "Cannot construct an Api with a null ClientBuilder");
        AbstractC1287s.n(gVar, "Cannot construct an Api with a null ClientKey");
        this.f8817c = str;
        this.f8815a = abstractC0172a;
        this.f8816b = gVar;
    }

    public final AbstractC0172a a() {
        return this.f8815a;
    }

    public final c b() {
        return this.f8816b;
    }

    public final e c() {
        return this.f8815a;
    }

    public final String d() {
        return this.f8817c;
    }
}
