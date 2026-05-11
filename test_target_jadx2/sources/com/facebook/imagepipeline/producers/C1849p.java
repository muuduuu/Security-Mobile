package com.facebook.imagepipeline.producers;

import android.graphics.Bitmap;
import android.net.Uri;
import b4.C1649a;
import c3.AbstractC1721a;
import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import com.facebook.imagepipeline.producers.C1849p;
import com.facebook.imagepipeline.producers.G;
import e3.InterfaceC3074a;
import e4.C3077a;
import f3.AbstractC3142a;
import g4.InterfaceC3189d;
import g4.InterfaceC3190e;
import j3.C3485a;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import m4.b;
import o4.C3748a;
import q4.C3919a;

/* renamed from: com.facebook.imagepipeline.producers.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1849p implements d0 {

    /* renamed from: m, reason: collision with root package name */
    public static final a f20978m = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3074a f20979a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f20980b;

    /* renamed from: c, reason: collision with root package name */
    private final e4.c f20981c;

    /* renamed from: d, reason: collision with root package name */
    private final e4.e f20982d;

    /* renamed from: e, reason: collision with root package name */
    private final b4.e f20983e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f20984f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f20985g;

    /* renamed from: h, reason: collision with root package name */
    private final d0 f20986h;

    /* renamed from: i, reason: collision with root package name */
    private final int f20987i;

    /* renamed from: j, reason: collision with root package name */
    private final C1649a f20988j;

    /* renamed from: k, reason: collision with root package name */
    private final Runnable f20989k;

    /* renamed from: l, reason: collision with root package name */
    private final b3.o f20990l;

    /* renamed from: com.facebook.imagepipeline.producers.p$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean b(g4.i iVar, a4.c cVar) {
            return (((long) iVar.getWidth()) * ((long) iVar.getHeight())) * ((long) C3919a.e(cVar.f12581h)) > 104857600;
        }

        private a() {
        }
    }

    /* renamed from: com.facebook.imagepipeline.producers.p$b */
    private final class b extends d {

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ C1849p f20991k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C1849p c1849p, InterfaceC1847n consumer, e0 producerContext, boolean z10, int i10) {
            super(c1849p, consumer, producerContext, z10, i10);
            Intrinsics.checkNotNullParameter(consumer, "consumer");
            Intrinsics.checkNotNullParameter(producerContext, "producerContext");
            this.f20991k = c1849p;
        }

        @Override // com.facebook.imagepipeline.producers.C1849p.d
        protected synchronized boolean I(g4.i iVar, int i10) {
            return AbstractC1836c.e(i10) ? false : super.I(iVar, i10);
        }

        @Override // com.facebook.imagepipeline.producers.C1849p.d
        protected int w(g4.i encodedImage) {
            Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
            return encodedImage.p();
        }

        @Override // com.facebook.imagepipeline.producers.C1849p.d
        protected g4.n y() {
            g4.n d10 = g4.m.d(0, false, false);
            Intrinsics.checkNotNullExpressionValue(d10, "of(0, false, false)");
            return d10;
        }
    }

    /* renamed from: com.facebook.imagepipeline.producers.p$c */
    private final class c extends d {

        /* renamed from: k, reason: collision with root package name */
        private final e4.f f20992k;

        /* renamed from: l, reason: collision with root package name */
        private final e4.e f20993l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ C1849p f20994m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C1849p c1849p, InterfaceC1847n consumer, e0 producerContext, e4.f progressiveJpegParser, e4.e progressiveJpegConfig, boolean z10, int i10) {
            super(c1849p, consumer, producerContext, z10, i10);
            Intrinsics.checkNotNullParameter(consumer, "consumer");
            Intrinsics.checkNotNullParameter(producerContext, "producerContext");
            Intrinsics.checkNotNullParameter(progressiveJpegParser, "progressiveJpegParser");
            Intrinsics.checkNotNullParameter(progressiveJpegConfig, "progressiveJpegConfig");
            this.f20994m = c1849p;
            this.f20992k = progressiveJpegParser;
            this.f20993l = progressiveJpegConfig;
            H(0);
        }

        @Override // com.facebook.imagepipeline.producers.C1849p.d
        protected synchronized boolean I(g4.i iVar, int i10) {
            if (iVar == null) {
                return false;
            }
            try {
                boolean I10 = super.I(iVar, i10);
                if (!AbstractC1836c.e(i10)) {
                    if (AbstractC1836c.m(i10, 8)) {
                    }
                    return I10;
                }
                if (!AbstractC1836c.m(i10, 4) && g4.i.y(iVar) && iVar.j() == S3.b.f8722b) {
                    if (!this.f20992k.g(iVar)) {
                        return false;
                    }
                    int d10 = this.f20992k.d();
                    if (d10 <= x()) {
                        return false;
                    }
                    if (d10 < this.f20993l.b(x()) && !this.f20992k.e()) {
                        return false;
                    }
                    H(d10);
                }
                return I10;
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // com.facebook.imagepipeline.producers.C1849p.d
        protected int w(g4.i encodedImage) {
            Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
            return this.f20992k.c();
        }

        @Override // com.facebook.imagepipeline.producers.C1849p.d
        protected g4.n y() {
            g4.n a10 = this.f20993l.a(this.f20992k.d());
            Intrinsics.checkNotNullExpressionValue(a10, "progressiveJpegConfig.ge…pegParser.bestScanNumber)");
            return a10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.imagepipeline.producers.p$d */
    abstract class d extends AbstractC1852t {

        /* renamed from: c, reason: collision with root package name */
        private final e0 f20995c;

        /* renamed from: d, reason: collision with root package name */
        private final String f20996d;

        /* renamed from: e, reason: collision with root package name */
        private final g0 f20997e;

        /* renamed from: f, reason: collision with root package name */
        private final a4.c f20998f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f20999g;

        /* renamed from: h, reason: collision with root package name */
        private final G f21000h;

        /* renamed from: i, reason: collision with root package name */
        private int f21001i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ C1849p f21002j;

        /* renamed from: com.facebook.imagepipeline.producers.p$d$a */
        public static final class a extends AbstractC1839f {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f21004b;

            a(boolean z10) {
                this.f21004b = z10;
            }

            @Override // com.facebook.imagepipeline.producers.f0
            public void a() {
                if (this.f21004b) {
                    d.this.z();
                }
            }

            @Override // com.facebook.imagepipeline.producers.AbstractC1839f, com.facebook.imagepipeline.producers.f0
            public void b() {
                if (d.this.f20995c.q()) {
                    d.this.f21000h.h();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(final C1849p c1849p, InterfaceC1847n consumer, e0 producerContext, boolean z10, final int i10) {
            super(consumer);
            Intrinsics.checkNotNullParameter(consumer, "consumer");
            Intrinsics.checkNotNullParameter(producerContext, "producerContext");
            this.f21002j = c1849p;
            this.f20995c = producerContext;
            this.f20996d = "ProgressiveDecoder";
            this.f20997e = producerContext.p();
            a4.c g10 = producerContext.c().g();
            Intrinsics.checkNotNullExpressionValue(g10, "producerContext.imageRequest.imageDecodeOptions");
            this.f20998f = g10;
            this.f21000h = new G(c1849p.f(), new G.d() { // from class: com.facebook.imagepipeline.producers.q
                @Override // com.facebook.imagepipeline.producers.G.d
                public final void a(g4.i iVar, int i11) {
                    C1849p.d.q(C1849p.d.this, c1849p, i10, iVar, i11);
                }
            }, g10.f12574a);
            producerContext.d(new a(z10));
        }

        private final void A(Throwable th) {
            D(true);
            o().onFailure(th);
        }

        private final void B(InterfaceC3190e interfaceC3190e, int i10) {
            AbstractC3142a b10 = this.f21002j.c().b(interfaceC3190e);
            try {
                D(AbstractC1836c.d(i10));
                o().c(b10, i10);
            } finally {
                AbstractC3142a.n(b10);
            }
        }

        private final InterfaceC3190e C(g4.i iVar, int i10, g4.n nVar) {
            boolean z10;
            try {
                if (this.f21002j.h() != null) {
                    Object obj = this.f21002j.i().get();
                    Intrinsics.checkNotNullExpressionValue(obj, "recoverFromDecoderOOM.get()");
                    if (((Boolean) obj).booleanValue()) {
                        z10 = true;
                        return this.f21002j.g().a(iVar, i10, nVar, this.f20998f);
                    }
                }
                return this.f21002j.g().a(iVar, i10, nVar, this.f20998f);
            } catch (OutOfMemoryError e10) {
                if (!z10) {
                    throw e10;
                }
                Runnable h10 = this.f21002j.h();
                if (h10 != null) {
                    h10.run();
                }
                System.gc();
                return this.f21002j.g().a(iVar, i10, nVar, this.f20998f);
            }
            z10 = false;
        }

        private final void D(boolean z10) {
            synchronized (this) {
                if (z10) {
                    if (!this.f20999g) {
                        o().b(1.0f);
                        this.f20999g = true;
                        Unit unit = Unit.f36324a;
                        this.f21000h.c();
                    }
                }
            }
        }

        private final void E(g4.i iVar) {
            if (iVar.j() != S3.b.f8722b) {
                return;
            }
            iVar.o0(C3748a.c(iVar, C3919a.e(this.f20998f.f12581h), 104857600));
        }

        private final void G(g4.i iVar, InterfaceC3190e interfaceC3190e, int i10) {
            this.f20995c.n("encoded_width", Integer.valueOf(iVar.getWidth()));
            this.f20995c.n("encoded_height", Integer.valueOf(iVar.getHeight()));
            this.f20995c.n("encoded_size", Integer.valueOf(iVar.p()));
            this.f20995c.n("image_color_space", iVar.g());
            if (interfaceC3190e instanceof InterfaceC3189d) {
                this.f20995c.n("bitmap_config", String.valueOf(((InterfaceC3189d) interfaceC3190e).p1().getConfig()));
            }
            if (interfaceC3190e != null) {
                interfaceC3190e.g(this.f20995c.getExtras());
            }
            this.f20995c.n("last_scan_num", Integer.valueOf(i10));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void q(d this$0, C1849p this$1, int i10, g4.i iVar, int i11) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            if (iVar != null) {
                m4.b c10 = this$0.f20995c.c();
                this$0.f20995c.n("image_format", iVar.j().a());
                Uri u10 = c10.u();
                iVar.y0(u10 != null ? u10.toString() : null);
                boolean m10 = AbstractC1836c.m(i11, 16);
                if ((this$1.e() == b4.e.ALWAYS || (this$1.e() == b4.e.AUTO && !m10)) && (this$1.d() || !j3.f.n(c10.u()))) {
                    a4.g s10 = c10.s();
                    Intrinsics.checkNotNullExpressionValue(s10, "request.rotationOptions");
                    iVar.o0(C3748a.b(s10, c10.q(), iVar, i10));
                }
                if (this$0.f20995c.e().F().h()) {
                    this$0.E(iVar);
                }
                this$0.u(iVar, i11, this$0.f21001i);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:49:0x013e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private final void u(g4.i iVar, int i10, int i11) {
            String str;
            int p10;
            g4.n quality;
            String str2;
            InterfaceC3190e interfaceC3190e;
            InterfaceC3190e C10;
            String a10;
            int i12 = i10;
            if (iVar.j() != S3.b.f8722b && AbstractC1836c.e(i10)) {
                return;
            }
            if (this.f20999g || !g4.i.y(iVar)) {
                return;
            }
            if (Intrinsics.b(iVar.j(), S3.b.f8724d) && C1849p.f20978m.b(iVar, this.f20998f)) {
                IllegalStateException illegalStateException = new IllegalStateException("Image is too big to attempt decoding: w = " + iVar.getWidth() + ", h = " + iVar.getHeight() + ", pixel config = " + this.f20998f.f12581h + ", max bitmap size = 104857600");
                this.f20997e.k(this.f20995c, "DecodeProducer", illegalStateException, null);
                A(illegalStateException);
                return;
            }
            S3.c j10 = iVar.j();
            String str3 = (j10 == null || (a10 = j10.a()) == null) ? "unknown" : a10;
            String str4 = iVar.getWidth() + "x" + iVar.getHeight();
            String valueOf = String.valueOf(iVar.o());
            boolean d10 = AbstractC1836c.d(i10);
            boolean z10 = d10 && !AbstractC1836c.m(i12, 8);
            boolean m10 = AbstractC1836c.m(i12, 4);
            a4.f q10 = this.f20995c.c().q();
            if (q10 != null) {
                str = q10.f12599a + "x" + q10.f12600b;
            } else {
                str = "unknown";
            }
            try {
                long f10 = this.f21000h.f();
                String uri = this.f20995c.c().u().toString();
                Intrinsics.checkNotNullExpressionValue(uri, "producerContext.imageRequest.sourceUri.toString()");
                try {
                    try {
                        try {
                            try {
                                if (!z10 && !m10) {
                                    p10 = w(iVar);
                                    if (!z10 && !m10) {
                                        quality = y();
                                        this.f20997e.e(this.f20995c, "DecodeProducer");
                                        Intrinsics.checkNotNullExpressionValue(quality, "quality");
                                        C10 = C(iVar, p10, quality);
                                        if (iVar.o() != 1) {
                                            i12 |= 16;
                                        }
                                        this.f20997e.j(this.f20995c, "DecodeProducer", v(C10, f10, quality, d10, str3, str4, str, valueOf));
                                        G(iVar, C10, i11);
                                        B(C10, i12);
                                        g4.i.c(iVar);
                                        return;
                                    }
                                    quality = g4.m.f33552d;
                                    this.f20997e.e(this.f20995c, "DecodeProducer");
                                    Intrinsics.checkNotNullExpressionValue(quality, "quality");
                                    C10 = C(iVar, p10, quality);
                                    if (iVar.o() != 1) {
                                    }
                                    this.f20997e.j(this.f20995c, "DecodeProducer", v(C10, f10, quality, d10, str3, str4, str, valueOf));
                                    G(iVar, C10, i11);
                                    B(C10, i12);
                                    g4.i.c(iVar);
                                    return;
                                }
                                if (!z10) {
                                    quality = y();
                                    this.f20997e.e(this.f20995c, "DecodeProducer");
                                    Intrinsics.checkNotNullExpressionValue(quality, "quality");
                                    C10 = C(iVar, p10, quality);
                                    if (iVar.o() != 1) {
                                    }
                                    this.f20997e.j(this.f20995c, "DecodeProducer", v(C10, f10, quality, d10, str3, str4, str, valueOf));
                                    G(iVar, C10, i11);
                                    B(C10, i12);
                                    g4.i.c(iVar);
                                    return;
                                }
                                if (iVar.o() != 1) {
                                }
                                this.f20997e.j(this.f20995c, "DecodeProducer", v(C10, f10, quality, d10, str3, str4, str, valueOf));
                                G(iVar, C10, i11);
                                B(C10, i12);
                                g4.i.c(iVar);
                                return;
                            } catch (Exception e10) {
                                e = e10;
                                str2 = "DecodeProducer";
                                interfaceC3190e = C10;
                                Intrinsics.checkNotNullExpressionValue(quality, "quality");
                                try {
                                    this.f20997e.k(this.f20995c, str2, e, v(interfaceC3190e, f10, quality, d10, str3, str4, str, valueOf));
                                    A(e);
                                    g4.i.c(iVar);
                                    return;
                                } catch (Throwable th) {
                                    th = th;
                                    g4.i.c(iVar);
                                    throw th;
                                }
                            }
                            Intrinsics.checkNotNullExpressionValue(quality, "quality");
                            C10 = C(iVar, p10, quality);
                        } catch (C3077a e11) {
                            g4.i a11 = e11.a();
                            str2 = "DecodeProducer";
                            try {
                                AbstractC1721a.L(this.f20996d, "%s, {uri: %s, firstEncodedBytes: %s, length: %d}", e11.getMessage(), uri, a11.i(10), Integer.valueOf(a11.p()));
                                throw e11;
                            } catch (Exception e12) {
                                e = e12;
                                interfaceC3190e = null;
                                Intrinsics.checkNotNullExpressionValue(quality, "quality");
                                this.f20997e.k(this.f20995c, str2, e, v(interfaceC3190e, f10, quality, d10, str3, str4, str, valueOf));
                                A(e);
                                g4.i.c(iVar);
                                return;
                            }
                        }
                    } catch (Exception e13) {
                        e = e13;
                        str2 = "DecodeProducer";
                        interfaceC3190e = null;
                        Intrinsics.checkNotNullExpressionValue(quality, "quality");
                        this.f20997e.k(this.f20995c, str2, e, v(interfaceC3190e, f10, quality, d10, str3, str4, str, valueOf));
                        A(e);
                        g4.i.c(iVar);
                        return;
                    }
                    this.f20997e.e(this.f20995c, "DecodeProducer");
                } catch (Throwable th2) {
                    th = th2;
                }
                p10 = iVar.p();
                quality = g4.m.f33552d;
            } catch (Throwable th3) {
                th = th3;
            }
        }

        private final Map v(InterfaceC3190e interfaceC3190e, long j10, g4.n nVar, boolean z10, String str, String str2, String str3, String str4) {
            Map extras;
            Object obj;
            String str5 = null;
            if (!this.f20997e.g(this.f20995c, "DecodeProducer")) {
                return null;
            }
            String valueOf = String.valueOf(j10);
            String valueOf2 = String.valueOf(nVar.b());
            String valueOf3 = String.valueOf(z10);
            if (interfaceC3190e != null && (extras = interfaceC3190e.getExtras()) != null && (obj = extras.get("non_fatal_decode_error")) != null) {
                str5 = obj.toString();
            }
            String str6 = str5;
            if (!(interfaceC3190e instanceof g4.f)) {
                HashMap hashMap = new HashMap(7);
                hashMap.put("queueTime", valueOf);
                hashMap.put("hasGoodQuality", valueOf2);
                hashMap.put("isFinal", valueOf3);
                hashMap.put("encodedImageSize", str2);
                hashMap.put(Keys.IMAGE_FORMAT, str);
                hashMap.put("requestedImageSize", str3);
                hashMap.put("sampleSize", str4);
                if (str6 != null) {
                    hashMap.put("non_fatal_decode_error", str6);
                }
                return b3.g.a(hashMap);
            }
            Bitmap p12 = ((g4.f) interfaceC3190e).p1();
            Intrinsics.checkNotNullExpressionValue(p12, "image.underlyingBitmap");
            String str7 = p12.getWidth() + "x" + p12.getHeight();
            HashMap hashMap2 = new HashMap(8);
            hashMap2.put("bitmapSize", str7);
            hashMap2.put("queueTime", valueOf);
            hashMap2.put("hasGoodQuality", valueOf2);
            hashMap2.put("isFinal", valueOf3);
            hashMap2.put("encodedImageSize", str2);
            hashMap2.put(Keys.IMAGE_FORMAT, str);
            hashMap2.put("requestedImageSize", str3);
            hashMap2.put("sampleSize", str4);
            int byteCount = p12.getByteCount();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(byteCount);
            hashMap2.put("byteCount", sb2.toString());
            if (str6 != null) {
                hashMap2.put("non_fatal_decode_error", str6);
            }
            return b3.g.a(hashMap2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void z() {
            D(true);
            o().a();
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC1836c
        /* renamed from: F, reason: merged with bridge method [inline-methods] */
        public void h(g4.i iVar, int i10) {
            if (!n4.b.d()) {
                boolean d10 = AbstractC1836c.d(i10);
                if (d10) {
                    if (iVar == null) {
                        boolean b10 = Intrinsics.b(this.f20995c.j("cached_value_found"), Boolean.TRUE);
                        if (!this.f20995c.e().F().g() || this.f20995c.r() == b.c.FULL_FETCH || b10) {
                            A(new C3485a("Encoded image is null."));
                            return;
                        }
                    } else if (!iVar.x()) {
                        A(new C3485a("Encoded image is not valid."));
                        return;
                    }
                }
                if (I(iVar, i10)) {
                    boolean m10 = AbstractC1836c.m(i10, 4);
                    if (d10 || m10 || this.f20995c.q()) {
                        this.f21000h.h();
                        return;
                    }
                    return;
                }
                return;
            }
            n4.b.a("DecodeProducer#onNewResultImpl");
            try {
                boolean d11 = AbstractC1836c.d(i10);
                if (d11) {
                    if (iVar == null) {
                        boolean b11 = Intrinsics.b(this.f20995c.j("cached_value_found"), Boolean.TRUE);
                        if (this.f20995c.e().F().g()) {
                            if (this.f20995c.r() != b.c.FULL_FETCH) {
                                if (b11) {
                                }
                            }
                        }
                        A(new C3485a("Encoded image is null."));
                        n4.b.b();
                        return;
                    }
                    if (!iVar.x()) {
                        A(new C3485a("Encoded image is not valid."));
                        n4.b.b();
                        return;
                    }
                }
                if (!I(iVar, i10)) {
                    n4.b.b();
                    return;
                }
                boolean m11 = AbstractC1836c.m(i10, 4);
                if (d11 || m11 || this.f20995c.q()) {
                    this.f21000h.h();
                }
                Unit unit = Unit.f36324a;
                n4.b.b();
            } catch (Throwable th) {
                n4.b.b();
                throw th;
            }
        }

        protected final void H(int i10) {
            this.f21001i = i10;
        }

        protected boolean I(g4.i iVar, int i10) {
            return this.f21000h.k(iVar, i10);
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC1852t, com.facebook.imagepipeline.producers.AbstractC1836c
        public void f() {
            z();
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC1852t, com.facebook.imagepipeline.producers.AbstractC1836c
        public void g(Throwable t10) {
            Intrinsics.checkNotNullParameter(t10, "t");
            A(t10);
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC1852t, com.facebook.imagepipeline.producers.AbstractC1836c
        protected void i(float f10) {
            super.i(f10 * 0.99f);
        }

        protected abstract int w(g4.i iVar);

        protected final int x() {
            return this.f21001i;
        }

        protected abstract g4.n y();
    }

    public C1849p(InterfaceC3074a byteArrayPool, Executor executor, e4.c imageDecoder, e4.e progressiveJpegConfig, b4.e downsampleMode, boolean z10, boolean z11, d0 inputProducer, int i10, C1649a closeableReferenceFactory, Runnable runnable, b3.o recoverFromDecoderOOM) {
        Intrinsics.checkNotNullParameter(byteArrayPool, "byteArrayPool");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(imageDecoder, "imageDecoder");
        Intrinsics.checkNotNullParameter(progressiveJpegConfig, "progressiveJpegConfig");
        Intrinsics.checkNotNullParameter(downsampleMode, "downsampleMode");
        Intrinsics.checkNotNullParameter(inputProducer, "inputProducer");
        Intrinsics.checkNotNullParameter(closeableReferenceFactory, "closeableReferenceFactory");
        Intrinsics.checkNotNullParameter(recoverFromDecoderOOM, "recoverFromDecoderOOM");
        this.f20979a = byteArrayPool;
        this.f20980b = executor;
        this.f20981c = imageDecoder;
        this.f20982d = progressiveJpegConfig;
        this.f20983e = downsampleMode;
        this.f20984f = z10;
        this.f20985g = z11;
        this.f20986h = inputProducer;
        this.f20987i = i10;
        this.f20988j = closeableReferenceFactory;
        this.f20989k = runnable;
        this.f20990l = recoverFromDecoderOOM;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void a(InterfaceC1847n consumer, e0 context) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        Intrinsics.checkNotNullParameter(context, "context");
        if (!n4.b.d()) {
            m4.b c10 = context.c();
            this.f20986h.a((j3.f.n(c10.u()) || m4.c.r(c10.u())) ? new c(this, consumer, context, new e4.f(this.f20979a), this.f20982d, this.f20985g, this.f20987i) : new b(this, consumer, context, this.f20985g, this.f20987i), context);
            return;
        }
        n4.b.a("DecodeProducer#produceResults");
        try {
            m4.b c11 = context.c();
            this.f20986h.a((j3.f.n(c11.u()) || m4.c.r(c11.u())) ? new c(this, consumer, context, new e4.f(this.f20979a), this.f20982d, this.f20985g, this.f20987i) : new b(this, consumer, context, this.f20985g, this.f20987i), context);
            Unit unit = Unit.f36324a;
            n4.b.b();
        } catch (Throwable th) {
            n4.b.b();
            throw th;
        }
    }

    public final C1649a c() {
        return this.f20988j;
    }

    public final boolean d() {
        return this.f20984f;
    }

    public final b4.e e() {
        return this.f20983e;
    }

    public final Executor f() {
        return this.f20980b;
    }

    public final e4.c g() {
        return this.f20981c;
    }

    public final Runnable h() {
        return this.f20989k;
    }

    public final b3.o i() {
        return this.f20990l;
    }
}
