package P2;

import android.database.Cursor;
import androidx.lifecycle.AbstractC1604v;
import co.hyperverge.hypersnapsdk.utils.AppConstants;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import h1.AbstractC3222A;
import h1.s;
import h1.v;
import j1.AbstractC3478a;
import j1.AbstractC3479b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class b implements P2.a {

    /* renamed from: a, reason: collision with root package name */
    private final s f7432a;

    /* renamed from: b, reason: collision with root package name */
    private final h1.k f7433b;

    /* renamed from: c, reason: collision with root package name */
    private final h1.j f7434c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC3222A f7435d;

    /* renamed from: e, reason: collision with root package name */
    private final AbstractC3222A f7436e;

    class a implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ v f7437a;

        a(v vVar) {
            this.f7437a = vVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public HttpTransaction call() {
            HttpTransaction httpTransaction;
            String string;
            int i10;
            String string2;
            int i11;
            String string3;
            int i12;
            int i13;
            boolean z10;
            Integer valueOf;
            int i14;
            String string4;
            int i15;
            String string5;
            int i16;
            Long valueOf2;
            int i17;
            String string6;
            int i18;
            String string7;
            int i19;
            String string8;
            int i20;
            Cursor c10 = AbstractC3479b.c(b.this.f7432a, this.f7437a, false, null);
            try {
                int e10 = AbstractC3478a.e(c10, "id");
                int e11 = AbstractC3478a.e(c10, "requestDate");
                int e12 = AbstractC3478a.e(c10, "responseDate");
                int e13 = AbstractC3478a.e(c10, "tookMs");
                int e14 = AbstractC3478a.e(c10, "protocol");
                int e15 = AbstractC3478a.e(c10, "method");
                int e16 = AbstractC3478a.e(c10, "url");
                int e17 = AbstractC3478a.e(c10, "host");
                int e18 = AbstractC3478a.e(c10, "path");
                int e19 = AbstractC3478a.e(c10, "scheme");
                int e20 = AbstractC3478a.e(c10, "responseTlsVersion");
                int e21 = AbstractC3478a.e(c10, "responseCipherSuite");
                int e22 = AbstractC3478a.e(c10, "requestPayloadSize");
                int e23 = AbstractC3478a.e(c10, "requestContentType");
                int e24 = AbstractC3478a.e(c10, "requestHeaders");
                int e25 = AbstractC3478a.e(c10, "requestBody");
                int e26 = AbstractC3478a.e(c10, "isRequestBodyPlainText");
                int e27 = AbstractC3478a.e(c10, "responseCode");
                int e28 = AbstractC3478a.e(c10, "responseMessage");
                int e29 = AbstractC3478a.e(c10, AppConstants.VIDEO_RECORDING_ERROR);
                int e30 = AbstractC3478a.e(c10, "responsePayloadSize");
                int e31 = AbstractC3478a.e(c10, "responseContentType");
                int e32 = AbstractC3478a.e(c10, "responseHeaders");
                int e33 = AbstractC3478a.e(c10, "responseBody");
                int e34 = AbstractC3478a.e(c10, "isResponseBodyPlainText");
                int e35 = AbstractC3478a.e(c10, "responseImageData");
                if (c10.moveToFirst()) {
                    long j10 = c10.getLong(e10);
                    Long valueOf3 = c10.isNull(e11) ? null : Long.valueOf(c10.getLong(e11));
                    Long valueOf4 = c10.isNull(e12) ? null : Long.valueOf(c10.getLong(e12));
                    Long valueOf5 = c10.isNull(e13) ? null : Long.valueOf(c10.getLong(e13));
                    String string9 = c10.isNull(e14) ? null : c10.getString(e14);
                    String string10 = c10.isNull(e15) ? null : c10.getString(e15);
                    String string11 = c10.isNull(e16) ? null : c10.getString(e16);
                    String string12 = c10.isNull(e17) ? null : c10.getString(e17);
                    String string13 = c10.isNull(e18) ? null : c10.getString(e18);
                    String string14 = c10.isNull(e19) ? null : c10.getString(e19);
                    String string15 = c10.isNull(e20) ? null : c10.getString(e20);
                    String string16 = c10.isNull(e21) ? null : c10.getString(e21);
                    Long valueOf6 = c10.isNull(e22) ? null : Long.valueOf(c10.getLong(e22));
                    if (c10.isNull(e23)) {
                        i10 = e24;
                        string = null;
                    } else {
                        string = c10.getString(e23);
                        i10 = e24;
                    }
                    if (c10.isNull(i10)) {
                        i11 = e25;
                        string2 = null;
                    } else {
                        string2 = c10.getString(i10);
                        i11 = e25;
                    }
                    if (c10.isNull(i11)) {
                        i12 = e26;
                        string3 = null;
                    } else {
                        string3 = c10.getString(i11);
                        i12 = e26;
                    }
                    if (c10.getInt(i12) != 0) {
                        z10 = true;
                        i13 = e27;
                    } else {
                        i13 = e27;
                        z10 = false;
                    }
                    if (c10.isNull(i13)) {
                        i14 = e28;
                        valueOf = null;
                    } else {
                        valueOf = Integer.valueOf(c10.getInt(i13));
                        i14 = e28;
                    }
                    if (c10.isNull(i14)) {
                        i15 = e29;
                        string4 = null;
                    } else {
                        string4 = c10.getString(i14);
                        i15 = e29;
                    }
                    if (c10.isNull(i15)) {
                        i16 = e30;
                        string5 = null;
                    } else {
                        string5 = c10.getString(i15);
                        i16 = e30;
                    }
                    if (c10.isNull(i16)) {
                        i17 = e31;
                        valueOf2 = null;
                    } else {
                        valueOf2 = Long.valueOf(c10.getLong(i16));
                        i17 = e31;
                    }
                    if (c10.isNull(i17)) {
                        i18 = e32;
                        string6 = null;
                    } else {
                        string6 = c10.getString(i17);
                        i18 = e32;
                    }
                    if (c10.isNull(i18)) {
                        i19 = e33;
                        string7 = null;
                    } else {
                        string7 = c10.getString(i18);
                        i19 = e33;
                    }
                    if (c10.isNull(i19)) {
                        i20 = e34;
                        string8 = null;
                    } else {
                        string8 = c10.getString(i19);
                        i20 = e34;
                    }
                    httpTransaction = new HttpTransaction(j10, valueOf3, valueOf4, valueOf5, string9, string10, string11, string12, string13, string14, string15, string16, valueOf6, string, string2, string3, z10, valueOf, string4, string5, valueOf2, string6, string7, string8, c10.getInt(i20) != 0, c10.isNull(e35) ? null : c10.getBlob(e35));
                } else {
                    httpTransaction = null;
                }
                return httpTransaction;
            } finally {
                c10.close();
            }
        }

        protected void finalize() {
            this.f7437a.f();
        }
    }

    /* renamed from: P2.b$b, reason: collision with other inner class name */
    class CallableC0143b implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ v f7439a;

        CallableC0143b(v vVar) {
            this.f7439a = vVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            CallableC0143b callableC0143b;
            int e10;
            int e11;
            int e12;
            int e13;
            int e14;
            int e15;
            int e16;
            int e17;
            int e18;
            int e19;
            int e20;
            int e21;
            int e22;
            int e23;
            Long valueOf;
            int i10;
            byte[] blob;
            int i11;
            Cursor c10 = AbstractC3479b.c(b.this.f7432a, this.f7439a, false, null);
            try {
                e10 = AbstractC3478a.e(c10, "id");
                e11 = AbstractC3478a.e(c10, "requestDate");
                e12 = AbstractC3478a.e(c10, "responseDate");
                e13 = AbstractC3478a.e(c10, "tookMs");
                e14 = AbstractC3478a.e(c10, "protocol");
                e15 = AbstractC3478a.e(c10, "method");
                e16 = AbstractC3478a.e(c10, "url");
                e17 = AbstractC3478a.e(c10, "host");
                e18 = AbstractC3478a.e(c10, "path");
                e19 = AbstractC3478a.e(c10, "scheme");
                e20 = AbstractC3478a.e(c10, "responseTlsVersion");
                e21 = AbstractC3478a.e(c10, "responseCipherSuite");
                e22 = AbstractC3478a.e(c10, "requestPayloadSize");
                e23 = AbstractC3478a.e(c10, "requestContentType");
            } catch (Throwable th) {
                th = th;
                callableC0143b = this;
            }
            try {
                int e24 = AbstractC3478a.e(c10, "requestHeaders");
                int e25 = AbstractC3478a.e(c10, "requestBody");
                int e26 = AbstractC3478a.e(c10, "isRequestBodyPlainText");
                int e27 = AbstractC3478a.e(c10, "responseCode");
                int e28 = AbstractC3478a.e(c10, "responseMessage");
                int e29 = AbstractC3478a.e(c10, AppConstants.VIDEO_RECORDING_ERROR);
                int e30 = AbstractC3478a.e(c10, "responsePayloadSize");
                int e31 = AbstractC3478a.e(c10, "responseContentType");
                int e32 = AbstractC3478a.e(c10, "responseHeaders");
                int e33 = AbstractC3478a.e(c10, "responseBody");
                int e34 = AbstractC3478a.e(c10, "isResponseBodyPlainText");
                int e35 = AbstractC3478a.e(c10, "responseImageData");
                int i12 = e23;
                ArrayList arrayList = new ArrayList(c10.getCount());
                while (c10.moveToNext()) {
                    long j10 = c10.getLong(e10);
                    Long valueOf2 = c10.isNull(e11) ? null : Long.valueOf(c10.getLong(e11));
                    Long valueOf3 = c10.isNull(e12) ? null : Long.valueOf(c10.getLong(e12));
                    Long valueOf4 = c10.isNull(e13) ? null : Long.valueOf(c10.getLong(e13));
                    String string = c10.isNull(e14) ? null : c10.getString(e14);
                    String string2 = c10.isNull(e15) ? null : c10.getString(e15);
                    String string3 = c10.isNull(e16) ? null : c10.getString(e16);
                    String string4 = c10.isNull(e17) ? null : c10.getString(e17);
                    String string5 = c10.isNull(e18) ? null : c10.getString(e18);
                    String string6 = c10.isNull(e19) ? null : c10.getString(e19);
                    String string7 = c10.isNull(e20) ? null : c10.getString(e20);
                    String string8 = c10.isNull(e21) ? null : c10.getString(e21);
                    if (c10.isNull(e22)) {
                        i10 = i12;
                        valueOf = null;
                    } else {
                        valueOf = Long.valueOf(c10.getLong(e22));
                        i10 = i12;
                    }
                    String string9 = c10.isNull(i10) ? null : c10.getString(i10);
                    int i13 = e24;
                    int i14 = e10;
                    String string10 = c10.isNull(i13) ? null : c10.getString(i13);
                    int i15 = e25;
                    String string11 = c10.isNull(i15) ? null : c10.getString(i15);
                    int i16 = e26;
                    boolean z10 = c10.getInt(i16) != 0;
                    int i17 = e27;
                    Integer valueOf5 = c10.isNull(i17) ? null : Integer.valueOf(c10.getInt(i17));
                    int i18 = e28;
                    String string12 = c10.isNull(i18) ? null : c10.getString(i18);
                    int i19 = e29;
                    String string13 = c10.isNull(i19) ? null : c10.getString(i19);
                    int i20 = e30;
                    Long valueOf6 = c10.isNull(i20) ? null : Long.valueOf(c10.getLong(i20));
                    int i21 = e31;
                    String string14 = c10.isNull(i21) ? null : c10.getString(i21);
                    int i22 = e32;
                    String string15 = c10.isNull(i22) ? null : c10.getString(i22);
                    int i23 = e33;
                    String string16 = c10.isNull(i23) ? null : c10.getString(i23);
                    int i24 = e34;
                    boolean z11 = c10.getInt(i24) != 0;
                    int i25 = e35;
                    if (c10.isNull(i25)) {
                        i11 = i25;
                        blob = null;
                    } else {
                        blob = c10.getBlob(i25);
                        i11 = i25;
                    }
                    arrayList.add(new HttpTransaction(j10, valueOf2, valueOf3, valueOf4, string, string2, string3, string4, string5, string6, string7, string8, valueOf, string9, string10, string11, z10, valueOf5, string12, string13, valueOf6, string14, string15, string16, z11, blob));
                    e10 = i14;
                    e24 = i13;
                    e25 = i15;
                    e26 = i16;
                    e27 = i17;
                    e28 = i18;
                    e29 = i19;
                    e30 = i20;
                    e31 = i21;
                    e32 = i22;
                    e33 = i23;
                    e34 = i24;
                    e35 = i11;
                    i12 = i10;
                }
                c10.close();
                this.f7439a.f();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                callableC0143b = this;
                c10.close();
                callableC0143b.f7439a.f();
                throw th;
            }
        }
    }

    class c extends h1.k {
        c(s sVar) {
            super(sVar);
        }

        @Override // h1.AbstractC3222A
        public String e() {
            return "INSERT OR ABORT INTO `transactions` (`id`,`requestDate`,`responseDate`,`tookMs`,`protocol`,`method`,`url`,`host`,`path`,`scheme`,`responseTlsVersion`,`responseCipherSuite`,`requestPayloadSize`,`requestContentType`,`requestHeaders`,`requestBody`,`isRequestBodyPlainText`,`responseCode`,`responseMessage`,`error`,`responsePayloadSize`,`responseContentType`,`responseHeaders`,`responseBody`,`isResponseBodyPlainText`,`responseImageData`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // h1.k
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(l1.k kVar, HttpTransaction httpTransaction) {
            kVar.G0(1, httpTransaction.getId());
            if (httpTransaction.getRequestDate() == null) {
                kVar.s1(2);
            } else {
                kVar.G0(2, httpTransaction.getRequestDate().longValue());
            }
            if (httpTransaction.getResponseDate() == null) {
                kVar.s1(3);
            } else {
                kVar.G0(3, httpTransaction.getResponseDate().longValue());
            }
            if (httpTransaction.getTookMs() == null) {
                kVar.s1(4);
            } else {
                kVar.G0(4, httpTransaction.getTookMs().longValue());
            }
            if (httpTransaction.getProtocol() == null) {
                kVar.s1(5);
            } else {
                kVar.b0(5, httpTransaction.getProtocol());
            }
            if (httpTransaction.getMethod() == null) {
                kVar.s1(6);
            } else {
                kVar.b0(6, httpTransaction.getMethod());
            }
            if (httpTransaction.getUrl() == null) {
                kVar.s1(7);
            } else {
                kVar.b0(7, httpTransaction.getUrl());
            }
            if (httpTransaction.getHost() == null) {
                kVar.s1(8);
            } else {
                kVar.b0(8, httpTransaction.getHost());
            }
            if (httpTransaction.getPath() == null) {
                kVar.s1(9);
            } else {
                kVar.b0(9, httpTransaction.getPath());
            }
            if (httpTransaction.getScheme() == null) {
                kVar.s1(10);
            } else {
                kVar.b0(10, httpTransaction.getScheme());
            }
            if (httpTransaction.getResponseTlsVersion() == null) {
                kVar.s1(11);
            } else {
                kVar.b0(11, httpTransaction.getResponseTlsVersion());
            }
            if (httpTransaction.getResponseCipherSuite() == null) {
                kVar.s1(12);
            } else {
                kVar.b0(12, httpTransaction.getResponseCipherSuite());
            }
            if (httpTransaction.getRequestPayloadSize() == null) {
                kVar.s1(13);
            } else {
                kVar.G0(13, httpTransaction.getRequestPayloadSize().longValue());
            }
            if (httpTransaction.getRequestContentType() == null) {
                kVar.s1(14);
            } else {
                kVar.b0(14, httpTransaction.getRequestContentType());
            }
            if (httpTransaction.getRequestHeaders() == null) {
                kVar.s1(15);
            } else {
                kVar.b0(15, httpTransaction.getRequestHeaders());
            }
            if (httpTransaction.getRequestBody() == null) {
                kVar.s1(16);
            } else {
                kVar.b0(16, httpTransaction.getRequestBody());
            }
            kVar.G0(17, httpTransaction.getIsRequestBodyPlainText() ? 1L : 0L);
            if (httpTransaction.getResponseCode() == null) {
                kVar.s1(18);
            } else {
                kVar.G0(18, httpTransaction.getResponseCode().intValue());
            }
            if (httpTransaction.getResponseMessage() == null) {
                kVar.s1(19);
            } else {
                kVar.b0(19, httpTransaction.getResponseMessage());
            }
            if (httpTransaction.getError() == null) {
                kVar.s1(20);
            } else {
                kVar.b0(20, httpTransaction.getError());
            }
            if (httpTransaction.getResponsePayloadSize() == null) {
                kVar.s1(21);
            } else {
                kVar.G0(21, httpTransaction.getResponsePayloadSize().longValue());
            }
            if (httpTransaction.getResponseContentType() == null) {
                kVar.s1(22);
            } else {
                kVar.b0(22, httpTransaction.getResponseContentType());
            }
            if (httpTransaction.getResponseHeaders() == null) {
                kVar.s1(23);
            } else {
                kVar.b0(23, httpTransaction.getResponseHeaders());
            }
            if (httpTransaction.getResponseBody() == null) {
                kVar.s1(24);
            } else {
                kVar.b0(24, httpTransaction.getResponseBody());
            }
            kVar.G0(25, httpTransaction.getIsResponseBodyPlainText() ? 1L : 0L);
            if (httpTransaction.getResponseImageData() == null) {
                kVar.s1(26);
            } else {
                kVar.P0(26, httpTransaction.getResponseImageData());
            }
        }
    }

    class d extends h1.j {
        d(s sVar) {
            super(sVar);
        }

        @Override // h1.AbstractC3222A
        public String e() {
            return "UPDATE OR REPLACE `transactions` SET `id` = ?,`requestDate` = ?,`responseDate` = ?,`tookMs` = ?,`protocol` = ?,`method` = ?,`url` = ?,`host` = ?,`path` = ?,`scheme` = ?,`responseTlsVersion` = ?,`responseCipherSuite` = ?,`requestPayloadSize` = ?,`requestContentType` = ?,`requestHeaders` = ?,`requestBody` = ?,`isRequestBodyPlainText` = ?,`responseCode` = ?,`responseMessage` = ?,`error` = ?,`responsePayloadSize` = ?,`responseContentType` = ?,`responseHeaders` = ?,`responseBody` = ?,`isResponseBodyPlainText` = ?,`responseImageData` = ? WHERE `id` = ?";
        }

        @Override // h1.j
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(l1.k kVar, HttpTransaction httpTransaction) {
            kVar.G0(1, httpTransaction.getId());
            if (httpTransaction.getRequestDate() == null) {
                kVar.s1(2);
            } else {
                kVar.G0(2, httpTransaction.getRequestDate().longValue());
            }
            if (httpTransaction.getResponseDate() == null) {
                kVar.s1(3);
            } else {
                kVar.G0(3, httpTransaction.getResponseDate().longValue());
            }
            if (httpTransaction.getTookMs() == null) {
                kVar.s1(4);
            } else {
                kVar.G0(4, httpTransaction.getTookMs().longValue());
            }
            if (httpTransaction.getProtocol() == null) {
                kVar.s1(5);
            } else {
                kVar.b0(5, httpTransaction.getProtocol());
            }
            if (httpTransaction.getMethod() == null) {
                kVar.s1(6);
            } else {
                kVar.b0(6, httpTransaction.getMethod());
            }
            if (httpTransaction.getUrl() == null) {
                kVar.s1(7);
            } else {
                kVar.b0(7, httpTransaction.getUrl());
            }
            if (httpTransaction.getHost() == null) {
                kVar.s1(8);
            } else {
                kVar.b0(8, httpTransaction.getHost());
            }
            if (httpTransaction.getPath() == null) {
                kVar.s1(9);
            } else {
                kVar.b0(9, httpTransaction.getPath());
            }
            if (httpTransaction.getScheme() == null) {
                kVar.s1(10);
            } else {
                kVar.b0(10, httpTransaction.getScheme());
            }
            if (httpTransaction.getResponseTlsVersion() == null) {
                kVar.s1(11);
            } else {
                kVar.b0(11, httpTransaction.getResponseTlsVersion());
            }
            if (httpTransaction.getResponseCipherSuite() == null) {
                kVar.s1(12);
            } else {
                kVar.b0(12, httpTransaction.getResponseCipherSuite());
            }
            if (httpTransaction.getRequestPayloadSize() == null) {
                kVar.s1(13);
            } else {
                kVar.G0(13, httpTransaction.getRequestPayloadSize().longValue());
            }
            if (httpTransaction.getRequestContentType() == null) {
                kVar.s1(14);
            } else {
                kVar.b0(14, httpTransaction.getRequestContentType());
            }
            if (httpTransaction.getRequestHeaders() == null) {
                kVar.s1(15);
            } else {
                kVar.b0(15, httpTransaction.getRequestHeaders());
            }
            if (httpTransaction.getRequestBody() == null) {
                kVar.s1(16);
            } else {
                kVar.b0(16, httpTransaction.getRequestBody());
            }
            kVar.G0(17, httpTransaction.getIsRequestBodyPlainText() ? 1L : 0L);
            if (httpTransaction.getResponseCode() == null) {
                kVar.s1(18);
            } else {
                kVar.G0(18, httpTransaction.getResponseCode().intValue());
            }
            if (httpTransaction.getResponseMessage() == null) {
                kVar.s1(19);
            } else {
                kVar.b0(19, httpTransaction.getResponseMessage());
            }
            if (httpTransaction.getError() == null) {
                kVar.s1(20);
            } else {
                kVar.b0(20, httpTransaction.getError());
            }
            if (httpTransaction.getResponsePayloadSize() == null) {
                kVar.s1(21);
            } else {
                kVar.G0(21, httpTransaction.getResponsePayloadSize().longValue());
            }
            if (httpTransaction.getResponseContentType() == null) {
                kVar.s1(22);
            } else {
                kVar.b0(22, httpTransaction.getResponseContentType());
            }
            if (httpTransaction.getResponseHeaders() == null) {
                kVar.s1(23);
            } else {
                kVar.b0(23, httpTransaction.getResponseHeaders());
            }
            if (httpTransaction.getResponseBody() == null) {
                kVar.s1(24);
            } else {
                kVar.b0(24, httpTransaction.getResponseBody());
            }
            kVar.G0(25, httpTransaction.getIsResponseBodyPlainText() ? 1L : 0L);
            if (httpTransaction.getResponseImageData() == null) {
                kVar.s1(26);
            } else {
                kVar.P0(26, httpTransaction.getResponseImageData());
            }
            kVar.G0(27, httpTransaction.getId());
        }
    }

    class e extends AbstractC3222A {
        e(s sVar) {
            super(sVar);
        }

        @Override // h1.AbstractC3222A
        public String e() {
            return "DELETE FROM transactions";
        }
    }

    class f extends AbstractC3222A {
        f(s sVar) {
            super(sVar);
        }

        @Override // h1.AbstractC3222A
        public String e() {
            return "DELETE FROM transactions WHERE requestDate <= ?";
        }
    }

    class g implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ HttpTransaction f7445a;

        g(HttpTransaction httpTransaction) {
            this.f7445a = httpTransaction;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long call() {
            b.this.f7432a.e();
            try {
                long k10 = b.this.f7433b.k(this.f7445a);
                b.this.f7432a.D();
                return Long.valueOf(k10);
            } finally {
                b.this.f7432a.i();
            }
        }
    }

    class h implements Callable {
        h() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit call() {
            l1.k b10 = b.this.f7435d.b();
            b.this.f7432a.e();
            try {
                b10.j0();
                b.this.f7432a.D();
                return Unit.f36324a;
            } finally {
                b.this.f7432a.i();
                b.this.f7435d.h(b10);
            }
        }
    }

    class i implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f7448a;

        i(long j10) {
            this.f7448a = j10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit call() {
            l1.k b10 = b.this.f7436e.b();
            b10.G0(1, this.f7448a);
            b.this.f7432a.e();
            try {
                b10.j0();
                b.this.f7432a.D();
                return Unit.f36324a;
            } finally {
                b.this.f7432a.i();
                b.this.f7436e.h(b10);
            }
        }
    }

    class j implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ v f7450a;

        j(v vVar) {
            this.f7450a = vVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            Cursor c10 = AbstractC3479b.c(b.this.f7432a, this.f7450a, false, null);
            try {
                int e10 = AbstractC3478a.e(c10, "id");
                int e11 = AbstractC3478a.e(c10, "requestDate");
                int e12 = AbstractC3478a.e(c10, "tookMs");
                int e13 = AbstractC3478a.e(c10, "protocol");
                int e14 = AbstractC3478a.e(c10, "method");
                int e15 = AbstractC3478a.e(c10, "host");
                int e16 = AbstractC3478a.e(c10, "path");
                int e17 = AbstractC3478a.e(c10, "scheme");
                int e18 = AbstractC3478a.e(c10, "responseCode");
                int e19 = AbstractC3478a.e(c10, "requestPayloadSize");
                int e20 = AbstractC3478a.e(c10, "responsePayloadSize");
                int e21 = AbstractC3478a.e(c10, AppConstants.VIDEO_RECORDING_ERROR);
                ArrayList arrayList = new ArrayList(c10.getCount());
                while (c10.moveToNext()) {
                    arrayList.add(new com.chuckerteam.chucker.internal.data.entity.b(c10.getLong(e10), c10.isNull(e11) ? null : Long.valueOf(c10.getLong(e11)), c10.isNull(e12) ? null : Long.valueOf(c10.getLong(e12)), c10.isNull(e13) ? null : c10.getString(e13), c10.isNull(e14) ? null : c10.getString(e14), c10.isNull(e15) ? null : c10.getString(e15), c10.isNull(e16) ? null : c10.getString(e16), c10.isNull(e17) ? null : c10.getString(e17), c10.isNull(e18) ? null : Integer.valueOf(c10.getInt(e18)), c10.isNull(e19) ? null : Long.valueOf(c10.getLong(e19)), c10.isNull(e20) ? null : Long.valueOf(c10.getLong(e20)), c10.isNull(e21) ? null : c10.getString(e21)));
                }
                return arrayList;
            } finally {
                c10.close();
            }
        }

        protected void finalize() {
            this.f7450a.f();
        }
    }

    class k implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ v f7452a;

        k(v vVar) {
            this.f7452a = vVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            Cursor c10 = AbstractC3479b.c(b.this.f7432a, this.f7452a, false, null);
            try {
                int e10 = AbstractC3478a.e(c10, "id");
                int e11 = AbstractC3478a.e(c10, "requestDate");
                int e12 = AbstractC3478a.e(c10, "tookMs");
                int e13 = AbstractC3478a.e(c10, "protocol");
                int e14 = AbstractC3478a.e(c10, "method");
                int e15 = AbstractC3478a.e(c10, "host");
                int e16 = AbstractC3478a.e(c10, "path");
                int e17 = AbstractC3478a.e(c10, "scheme");
                int e18 = AbstractC3478a.e(c10, "responseCode");
                int e19 = AbstractC3478a.e(c10, "requestPayloadSize");
                int e20 = AbstractC3478a.e(c10, "responsePayloadSize");
                int e21 = AbstractC3478a.e(c10, AppConstants.VIDEO_RECORDING_ERROR);
                ArrayList arrayList = new ArrayList(c10.getCount());
                while (c10.moveToNext()) {
                    arrayList.add(new com.chuckerteam.chucker.internal.data.entity.b(c10.getLong(e10), c10.isNull(e11) ? null : Long.valueOf(c10.getLong(e11)), c10.isNull(e12) ? null : Long.valueOf(c10.getLong(e12)), c10.isNull(e13) ? null : c10.getString(e13), c10.isNull(e14) ? null : c10.getString(e14), c10.isNull(e15) ? null : c10.getString(e15), c10.isNull(e16) ? null : c10.getString(e16), c10.isNull(e17) ? null : c10.getString(e17), c10.isNull(e18) ? null : Integer.valueOf(c10.getInt(e18)), c10.isNull(e19) ? null : Long.valueOf(c10.getLong(e19)), c10.isNull(e20) ? null : Long.valueOf(c10.getLong(e20)), c10.isNull(e21) ? null : c10.getString(e21)));
                }
                return arrayList;
            } finally {
                c10.close();
            }
        }

        protected void finalize() {
            this.f7452a.f();
        }
    }

    public b(s sVar) {
        this.f7432a = sVar;
        this.f7433b = new c(sVar);
        this.f7434c = new d(sVar);
        this.f7435d = new e(sVar);
        this.f7436e = new f(sVar);
    }

    public static List m() {
        return Collections.emptyList();
    }

    @Override // P2.a
    public AbstractC1604v a(long j10) {
        v c10 = v.c("SELECT * FROM transactions WHERE id = ?", 1);
        c10.G0(1, j10);
        return this.f7432a.m().e(new String[]{"transactions"}, false, new a(c10));
    }

    @Override // P2.a
    public Object b(kotlin.coroutines.d dVar) {
        return h1.f.b(this.f7432a, true, new h(), dVar);
    }

    @Override // P2.a
    public Object c(long j10, kotlin.coroutines.d dVar) {
        return h1.f.b(this.f7432a, true, new i(j10), dVar);
    }

    @Override // P2.a
    public int d(HttpTransaction httpTransaction) {
        this.f7432a.d();
        this.f7432a.e();
        try {
            int j10 = this.f7434c.j(httpTransaction);
            this.f7432a.D();
            return j10;
        } finally {
            this.f7432a.i();
        }
    }

    @Override // P2.a
    public Object e(kotlin.coroutines.d dVar) {
        v c10 = v.c("SELECT * FROM transactions", 0);
        return h1.f.a(this.f7432a, false, AbstractC3479b.a(), new CallableC0143b(c10), dVar);
    }

    @Override // P2.a
    public Object f(HttpTransaction httpTransaction, kotlin.coroutines.d dVar) {
        return h1.f.b(this.f7432a, true, new g(httpTransaction), dVar);
    }

    @Override // P2.a
    public AbstractC1604v g(String str, String str2) {
        v c10 = v.c("SELECT id, requestDate, tookMs, protocol, method, host, path, scheme, responseCode, requestPayloadSize, responsePayloadSize, error FROM transactions WHERE responseCode LIKE ? AND path LIKE ? ORDER BY requestDate DESC", 2);
        if (str == null) {
            c10.s1(1);
        } else {
            c10.b0(1, str);
        }
        if (str2 == null) {
            c10.s1(2);
        } else {
            c10.b0(2, str2);
        }
        return this.f7432a.m().e(new String[]{"transactions"}, false, new k(c10));
    }

    @Override // P2.a
    public AbstractC1604v h() {
        return this.f7432a.m().e(new String[]{"transactions"}, false, new j(v.c("SELECT id, requestDate, tookMs, protocol, method, host, path, scheme, responseCode, requestPayloadSize, responsePayloadSize, error FROM transactions ORDER BY requestDate DESC", 0)));
    }
}
