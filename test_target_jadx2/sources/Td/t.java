package Td;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import pe.C3877e;
import pe.InterfaceC3878f;

/* loaded from: classes3.dex */
public final class t extends E {

    /* renamed from: c, reason: collision with root package name */
    public static final b f10202c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    private static final z f10203d = z.f10239e.a("application/x-www-form-urlencoded");

    /* renamed from: a, reason: collision with root package name */
    private final List f10204a;

    /* renamed from: b, reason: collision with root package name */
    private final List f10205b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Charset f10206a;

        /* renamed from: b, reason: collision with root package name */
        private final List f10207b;

        /* renamed from: c, reason: collision with root package name */
        private final List f10208c;

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final a a(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f10207b.add(ke.a.d(name, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, this.f10206a, 91, null));
            this.f10208c.add(ke.a.d(value, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, this.f10206a, 91, null));
            return this;
        }

        public final a b(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f10207b.add(ke.a.d(name, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, this.f10206a, 83, null));
            this.f10208c.add(ke.a.d(value, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, this.f10206a, 83, null));
            return this;
        }

        public final t c() {
            return new t(this.f10207b, this.f10208c);
        }

        public a(Charset charset) {
            this.f10206a = charset;
            this.f10207b = new ArrayList();
            this.f10208c = new ArrayList();
        }

        public /* synthetic */ a(Charset charset, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : charset);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public t(List encodedNames, List encodedValues) {
        Intrinsics.checkNotNullParameter(encodedNames, "encodedNames");
        Intrinsics.checkNotNullParameter(encodedValues, "encodedValues");
        this.f10204a = Wd.p.w(encodedNames);
        this.f10205b = Wd.p.w(encodedValues);
    }

    private final long a(InterfaceC3878f interfaceC3878f, boolean z10) {
        C3877e m10;
        if (z10) {
            m10 = new C3877e();
        } else {
            Intrinsics.d(interfaceC3878f);
            m10 = interfaceC3878f.m();
        }
        int size = this.f10204a.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (i10 > 0) {
                m10.q0(38);
            }
            m10.T0((String) this.f10204a.get(i10));
            m10.q0(61);
            m10.T0((String) this.f10205b.get(i10));
        }
        if (!z10) {
            return 0L;
        }
        long size2 = m10.size();
        m10.a();
        return size2;
    }

    @Override // Td.E
    public long contentLength() {
        return a(null, true);
    }

    @Override // Td.E
    /* renamed from: contentType */
    public z getContentType() {
        return f10203d;
    }

    @Override // Td.E
    public void writeTo(InterfaceC3878f sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        a(sink, false);
    }
}
