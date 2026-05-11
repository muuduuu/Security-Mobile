package S3;

import S3.c;
import b3.AbstractC1646a;
import b3.q;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lc.i;
import lc.l;
import xc.m;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final b f8739d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    private static final Lazy f8740e = i.b(l.SYNCHRONIZED, a.f8744a);

    /* renamed from: a, reason: collision with root package name */
    private int f8741a;

    /* renamed from: b, reason: collision with root package name */
    private List f8742b;

    /* renamed from: c, reason: collision with root package name */
    private final S3.a f8743c;

    static final class a extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f8744a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d invoke() {
            return new d(null);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int e(int i10, InputStream inputStream, byte[] bArr) {
            if (bArr.length < i10) {
                throw new IllegalStateException("Check failed.");
            }
            if (!inputStream.markSupported()) {
                return AbstractC1646a.b(inputStream, bArr, 0, i10);
            }
            try {
                inputStream.mark(i10);
                return AbstractC1646a.b(inputStream, bArr, 0, i10);
            } finally {
                inputStream.reset();
            }
        }

        public final c b(InputStream is) {
            Intrinsics.checkNotNullParameter(is, "is");
            return d().b(is);
        }

        public final c c(InputStream is) {
            Intrinsics.checkNotNullParameter(is, "is");
            try {
                return b(is);
            } catch (IOException e10) {
                RuntimeException a10 = q.a(e10);
                Intrinsics.checkNotNullExpressionValue(a10, "propagate(ioe)");
                throw a10;
            }
        }

        public final d d() {
            return (d) d.f8740e.getValue();
        }

        private b() {
        }
    }

    public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final c c(InputStream inputStream) {
        return f8739d.c(inputStream);
    }

    private final void d() {
        this.f8741a = this.f8743c.a();
        List list = this.f8742b;
        if (list != null) {
            Intrinsics.d(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f8741a = Math.max(this.f8741a, ((c.b) it.next()).a());
            }
        }
    }

    public final c b(InputStream is) {
        Intrinsics.checkNotNullParameter(is, "is");
        int i10 = this.f8741a;
        byte[] bArr = new byte[i10];
        int e10 = f8739d.e(i10, is, bArr);
        c b10 = this.f8743c.b(bArr, e10);
        if (b10 != c.f8736d) {
            return b10;
        }
        List list = this.f8742b;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                c b11 = ((c.b) it.next()).b(bArr, e10);
                if (b11 != c.f8736d) {
                    return b11;
                }
            }
        }
        return c.f8736d;
    }

    private d() {
        this.f8743c = new S3.a();
        d();
    }
}
