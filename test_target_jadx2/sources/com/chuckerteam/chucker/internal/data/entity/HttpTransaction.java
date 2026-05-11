package com.chuckerteam.chucker.internal.data.entity;

import Q2.j;
import Q2.k;
import Q2.m;
import Td.v;
import Td.w;
import android.R;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import co.hyperverge.hypersnapsdk.utils.AppConstants;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.conscrypt.BuildConfig;
import u5.C4870a;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\bJ\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0002¤\u0001B\u008b\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0014\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"B\t\b\u0017¢\u0006\u0004\b!\u0010#J\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b(\u0010)J!\u0010,\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u00072\b\u0010+\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u0002H\u0002¢\u0006\u0004\b/\u00100J\u0015\u00102\u001a\u0002012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b2\u00103J\u001b\u00102\u001a\u0002012\f\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&¢\u0006\u0004\b2\u00104J\u0015\u00105\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010&¢\u0006\u0004\b5\u00106J\u0015\u00107\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010&¢\u0006\u0004\b7\u00106J\u0015\u00109\u001a\u00020\u00072\u0006\u00108\u001a\u00020\u0014¢\u0006\u0004\b9\u0010:J\u0015\u0010;\u001a\u0002012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b;\u00103J\u001b\u0010;\u001a\u0002012\f\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&¢\u0006\u0004\b;\u00104J\u0015\u0010<\u001a\u00020\u00072\u0006\u00108\u001a\u00020\u0014¢\u0006\u0004\b<\u0010:J\r\u0010=\u001a\u00020\u0007¢\u0006\u0004\b=\u0010>J\r\u0010?\u001a\u00020\u0007¢\u0006\u0004\b?\u0010>J\u0015\u0010B\u001a\u00020\u00002\u0006\u0010A\u001a\u00020@¢\u0006\u0004\bB\u0010CJ\u0015\u0010E\u001a\u00020\u00072\u0006\u0010D\u001a\u00020\u0014¢\u0006\u0004\bE\u0010:J\u0015\u0010F\u001a\u00020\u00072\u0006\u0010D\u001a\u00020\u0014¢\u0006\u0004\bF\u0010:J\u0017\u0010H\u001a\u00020\u00142\b\u0010G\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\bH\u0010IR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010O\u001a\u0004\bT\u0010Q\"\u0004\bU\u0010SR$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010O\u001a\u0004\bV\u0010Q\"\u0004\bW\u0010SR$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u0010X\u001a\u0004\bY\u0010>\"\u0004\bZ\u0010[R$\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010X\u001a\u0004\b\\\u0010>\"\u0004\b]\u0010[R$\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010X\u001a\u0004\b^\u0010>\"\u0004\b_\u0010[R$\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010X\u001a\u0004\b`\u0010>\"\u0004\ba\u0010[R$\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010X\u001a\u0004\bb\u0010>\"\u0004\bc\u0010[R$\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010X\u001a\u0004\bd\u0010>\"\u0004\be\u0010[R$\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010X\u001a\u0004\bf\u0010>\"\u0004\bg\u0010[R$\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010X\u001a\u0004\bh\u0010>\"\u0004\bi\u0010[R$\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010O\u001a\u0004\bj\u0010Q\"\u0004\bk\u0010SR$\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010X\u001a\u0004\bl\u0010>\"\u0004\bm\u0010[R$\u0010\u0012\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010X\u001a\u0004\bn\u0010>\"\u0004\b2\u0010[R$\u0010\u0013\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010X\u001a\u0004\bo\u0010>\"\u0004\bp\u0010[R\"\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010q\u001a\u0004\b\u0015\u0010r\"\u0004\bs\u0010tR$\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010u\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR$\u0010\u0018\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010X\u001a\u0004\bz\u0010>\"\u0004\b{\u0010[R$\u0010\u0019\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010X\u001a\u0004\b|\u0010>\"\u0004\b}\u0010[R$\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010O\u001a\u0004\b~\u0010Q\"\u0004\b\u007f\u0010SR&\u0010\u001b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0004\b\u001b\u0010X\u001a\u0005\b\u0080\u0001\u0010>\"\u0005\b\u0081\u0001\u0010[R%\u0010\u001c\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0013\n\u0004\b\u001c\u0010X\u001a\u0005\b\u0082\u0001\u0010>\"\u0004\b;\u0010[R&\u0010\u001d\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0004\b\u001d\u0010X\u001a\u0005\b\u0083\u0001\u0010>\"\u0005\b\u0084\u0001\u0010[R#\u0010\u001e\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0013\n\u0004\b\u001e\u0010q\u001a\u0004\b\u001e\u0010r\"\u0005\b\u0085\u0001\u0010tR)\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0017\n\u0005\b \u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001\"\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0015\u0010\u008e\u0001\u001a\u00030\u008b\u00018F¢\u0006\b\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0015\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0007\u001a\u0005\b\u008f\u0001\u0010>R\u0015\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0007\u001a\u0005\b\u0091\u0001\u0010>R\u0015\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0007\u001a\u0005\b\u0093\u0001\u0010>R\u0013\u0010\u0096\u0001\u001a\u00020\u00078F¢\u0006\u0007\u001a\u0005\b\u0095\u0001\u0010>R\u0015\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0007\u001a\u0005\b\u0097\u0001\u0010>R\u0013\u0010\u009a\u0001\u001a\u00020\u00078F¢\u0006\u0007\u001a\u0005\b\u0099\u0001\u0010>R\u0015\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0007\u001a\u0005\b\u009b\u0001\u0010>R\u0013\u0010\u009e\u0001\u001a\u00020\u00078F¢\u0006\u0007\u001a\u0005\b\u009d\u0001\u0010>R\u0013\u0010\u009f\u0001\u001a\u00020\u00148F¢\u0006\u0007\u001a\u0005\b\u009f\u0001\u0010rR\u0017\u0010£\u0001\u001a\u0005\u0018\u00010 \u00018F¢\u0006\b\u001a\u0006\b¡\u0001\u0010¢\u0001¨\u0006¥\u0001"}, d2 = {"Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "id", "requestDate", "responseDate", "tookMs", BuildConfig.FLAVOR, "protocol", "method", "url", "host", "path", "scheme", "responseTlsVersion", "responseCipherSuite", "requestPayloadSize", "requestContentType", "requestHeaders", "requestBody", BuildConfig.FLAVOR, "isRequestBodyPlainText", BuildConfig.FLAVOR, "responseCode", "responseMessage", AppConstants.VIDEO_RECORDING_ERROR, "responsePayloadSize", "responseContentType", "responseHeaders", "responseBody", "isResponseBodyPlainText", BuildConfig.FLAVOR, "responseImageData", "<init>", "(JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z[B)V", "()V", "LTd/v;", "headers", BuildConfig.FLAVOR, "Lcom/chuckerteam/chucker/internal/data/entity/a;", "toHttpHeaderList", "(LTd/v;)Ljava/util/List;", "body", "contentType", "formatBody", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "bytes", "formatBytes", "(J)Ljava/lang/String;", BuildConfig.FLAVOR, "setRequestHeaders", "(LTd/v;)V", "(Ljava/util/List;)V", "getParsedRequestHeaders", "()Ljava/util/List;", "getParsedResponseHeaders", "withMarkup", "getRequestHeadersString", "(Z)Ljava/lang/String;", "setResponseHeaders", "getResponseHeadersString", "getFormattedRequestBody", "()Ljava/lang/String;", "getFormattedResponseBody", "LTd/w;", "httpUrl", "populateUrl", "(LTd/w;)Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;", "encode", "getFormattedUrl", "getFormattedPath", "other", "hasTheSameContent", "(Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;)Z", "J", "getId", "()J", "setId", "(J)V", "Ljava/lang/Long;", "getRequestDate", "()Ljava/lang/Long;", "setRequestDate", "(Ljava/lang/Long;)V", "getResponseDate", "setResponseDate", "getTookMs", "setTookMs", "Ljava/lang/String;", "getProtocol", "setProtocol", "(Ljava/lang/String;)V", "getMethod", "setMethod", "getUrl", "setUrl", "getHost", "setHost", "getPath", "setPath", "getScheme", "setScheme", "getResponseTlsVersion", "setResponseTlsVersion", "getResponseCipherSuite", "setResponseCipherSuite", "getRequestPayloadSize", "setRequestPayloadSize", "getRequestContentType", "setRequestContentType", "getRequestHeaders", "getRequestBody", "setRequestBody", "Z", "()Z", "setRequestBodyPlainText", "(Z)V", "Ljava/lang/Integer;", "getResponseCode", "()Ljava/lang/Integer;", "setResponseCode", "(Ljava/lang/Integer;)V", "getResponseMessage", "setResponseMessage", "getError", "setError", "getResponsePayloadSize", "setResponsePayloadSize", "getResponseContentType", "setResponseContentType", "getResponseHeaders", "getResponseBody", "setResponseBody", "setResponseBodyPlainText", "[B", "getResponseImageData", "()[B", "setResponseImageData", "([B)V", "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction$a;", "getStatus", "()Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction$a;", "status", "getRequestDateString", "requestDateString", "getResponseDateString", "responseDateString", "getDurationString", "durationString", "getRequestSizeString", "requestSizeString", "getResponseSizeString", "responseSizeString", "getTotalSizeString", "totalSizeString", "getResponseSummaryText", "responseSummaryText", "getNotificationText", "notificationText", "isSsl", "Landroid/graphics/Bitmap;", "getResponseImageBitmap", "()Landroid/graphics/Bitmap;", "responseImageBitmap", C4870a.f43493a, "com.github.ChuckerTeam.Chucker.library"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class HttpTransaction {
    private String error;
    private String host;
    private long id;
    private boolean isRequestBodyPlainText;
    private boolean isResponseBodyPlainText;
    private String method;
    private String path;
    private String protocol;
    private String requestBody;
    private String requestContentType;
    private Long requestDate;
    private String requestHeaders;
    private Long requestPayloadSize;
    private String responseBody;
    private String responseCipherSuite;
    private Integer responseCode;
    private String responseContentType;
    private Long responseDate;
    private String responseHeaders;
    private byte[] responseImageData;
    private String responseMessage;
    private Long responsePayloadSize;
    private String responseTlsVersion;
    private String scheme;
    private Long tookMs;
    private String url;

    public enum a {
        Requested,
        Complete,
        Failed
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20520a;

        static {
            int[] iArr = new int[a.values().length];
            iArr[a.Failed.ordinal()] = 1;
            iArr[a.Requested.ordinal()] = 2;
            f20520a = iArr;
        }
    }

    public HttpTransaction(long j10, Long l10, Long l11, Long l12, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Long l13, String str9, String str10, String str11, boolean z10, Integer num, String str12, String str13, Long l14, String str14, String str15, String str16, boolean z11, byte[] bArr) {
        this.id = j10;
        this.requestDate = l10;
        this.responseDate = l11;
        this.tookMs = l12;
        this.protocol = str;
        this.method = str2;
        this.url = str3;
        this.host = str4;
        this.path = str5;
        this.scheme = str6;
        this.responseTlsVersion = str7;
        this.responseCipherSuite = str8;
        this.requestPayloadSize = l13;
        this.requestContentType = str9;
        this.requestHeaders = str10;
        this.requestBody = str11;
        this.isRequestBodyPlainText = z10;
        this.responseCode = num;
        this.responseMessage = str12;
        this.error = str13;
        this.responsePayloadSize = l14;
        this.responseContentType = str14;
        this.responseHeaders = str15;
        this.responseBody = str16;
        this.isResponseBodyPlainText = z11;
        this.responseImageData = bArr;
    }

    private final String formatBody(String body, String contentType) {
        return (contentType == null || StringsKt.Z(contentType)) ? body : StringsKt.I(contentType, "json", true) ? j.f8092a.c(body) : StringsKt.I(contentType, "xml", true) ? j.f8092a.e(body) : StringsKt.I(contentType, "x-www-form-urlencoded", true) ? j.f8092a.d(body) : body;
    }

    private final String formatBytes(long bytes) {
        return j.f8092a.a(bytes, true);
    }

    private final List<HttpHeader> toHttpHeaderList(v headers) {
        ArrayList arrayList = new ArrayList();
        int size = headers.size();
        if (size > 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                String h10 = headers.h(i10);
                Intrinsics.checkNotNullExpressionValue(h10, "headers.name(i)");
                String v10 = headers.v(i10);
                Intrinsics.checkNotNullExpressionValue(v10, "headers.value(i)");
                arrayList.add(new HttpHeader(h10, v10));
                if (i11 >= size) {
                    break;
                }
                i10 = i11;
            }
        }
        return arrayList;
    }

    public final String getDurationString() {
        Long l10 = this.tookMs;
        if (l10 == null) {
            return null;
        }
        return l10.longValue() + " ms";
    }

    public final String getError() {
        return this.error;
    }

    public final String getFormattedPath(boolean encode) {
        String str = this.url;
        w g10 = str == null ? null : w.g(str);
        return g10 == null ? BuildConfig.FLAVOR : k.f8095f.c(g10, encode).b();
    }

    public final String getFormattedRequestBody() {
        String formatBody;
        String str = this.requestBody;
        return (str == null || (formatBody = formatBody(str, getRequestContentType())) == null) ? BuildConfig.FLAVOR : formatBody;
    }

    public final String getFormattedResponseBody() {
        String formatBody;
        String str = this.responseBody;
        return (str == null || (formatBody = formatBody(str, getResponseContentType())) == null) ? BuildConfig.FLAVOR : formatBody;
    }

    public final String getFormattedUrl(boolean encode) {
        String str = this.url;
        w g10 = str == null ? null : w.g(str);
        return g10 == null ? BuildConfig.FLAVOR : k.f8095f.c(g10, encode).d();
    }

    public final String getHost() {
        return this.host;
    }

    public final long getId() {
        return this.id;
    }

    public final String getMethod() {
        return this.method;
    }

    public final String getNotificationText() {
        int i10 = b.f20520a[getStatus().ordinal()];
        if (i10 == 1) {
            return " ! ! !  " + ((Object) this.method) + ' ' + ((Object) this.path);
        }
        if (i10 == 2) {
            return " . . .  " + ((Object) this.method) + ' ' + ((Object) this.path);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.responseCode);
        sb2.append(' ');
        sb2.append((Object) this.method);
        sb2.append(' ');
        sb2.append((Object) this.path);
        return sb2.toString();
    }

    public final List<HttpHeader> getParsedRequestHeaders() {
        return (List) m.f8102a.a().l(this.requestHeaders, new TypeToken<List<? extends HttpHeader>>() { // from class: com.chuckerteam.chucker.internal.data.entity.HttpTransaction$getParsedRequestHeaders$1
        }.getType());
    }

    public final List<HttpHeader> getParsedResponseHeaders() {
        return (List) m.f8102a.a().l(this.responseHeaders, new TypeToken<List<? extends HttpHeader>>() { // from class: com.chuckerteam.chucker.internal.data.entity.HttpTransaction$getParsedResponseHeaders$1
        }.getType());
    }

    public final String getPath() {
        return this.path;
    }

    public final String getProtocol() {
        return this.protocol;
    }

    public final String getRequestBody() {
        return this.requestBody;
    }

    public final String getRequestContentType() {
        return this.requestContentType;
    }

    public final Long getRequestDate() {
        return this.requestDate;
    }

    public final String getRequestDateString() {
        Long l10 = this.requestDate;
        if (l10 == null) {
            return null;
        }
        return new Date(l10.longValue()).toString();
    }

    public final String getRequestHeaders() {
        return this.requestHeaders;
    }

    public final String getRequestHeadersString(boolean withMarkup) {
        return j.f8092a.b(getParsedRequestHeaders(), withMarkup);
    }

    public final Long getRequestPayloadSize() {
        return this.requestPayloadSize;
    }

    public final String getRequestSizeString() {
        Long l10 = this.requestPayloadSize;
        return formatBytes(l10 == null ? 0L : l10.longValue());
    }

    public final String getResponseBody() {
        return this.responseBody;
    }

    public final String getResponseCipherSuite() {
        return this.responseCipherSuite;
    }

    public final Integer getResponseCode() {
        return this.responseCode;
    }

    public final String getResponseContentType() {
        return this.responseContentType;
    }

    public final Long getResponseDate() {
        return this.responseDate;
    }

    public final String getResponseDateString() {
        Long l10 = this.responseDate;
        if (l10 == null) {
            return null;
        }
        return new Date(l10.longValue()).toString();
    }

    public final String getResponseHeaders() {
        return this.responseHeaders;
    }

    public final String getResponseHeadersString(boolean withMarkup) {
        return j.f8092a.b(getParsedResponseHeaders(), withMarkup);
    }

    public final Bitmap getResponseImageBitmap() {
        byte[] bArr = this.responseImageData;
        if (bArr == null) {
            return null;
        }
        return BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
    }

    public final byte[] getResponseImageData() {
        return this.responseImageData;
    }

    public final String getResponseMessage() {
        return this.responseMessage;
    }

    public final Long getResponsePayloadSize() {
        return this.responsePayloadSize;
    }

    public final String getResponseSizeString() {
        Long l10 = this.responsePayloadSize;
        if (l10 == null) {
            return null;
        }
        return formatBytes(l10.longValue());
    }

    public final String getResponseSummaryText() {
        int i10 = b.f20520a[getStatus().ordinal()];
        if (i10 == 1) {
            return this.error;
        }
        if (i10 == 2) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.responseCode);
        sb2.append(' ');
        sb2.append((Object) this.responseMessage);
        return sb2.toString();
    }

    public final String getResponseTlsVersion() {
        return this.responseTlsVersion;
    }

    public final String getScheme() {
        return this.scheme;
    }

    public final a getStatus() {
        return this.error != null ? a.Failed : this.responseCode == null ? a.Requested : a.Complete;
    }

    public final Long getTookMs() {
        return this.tookMs;
    }

    public final String getTotalSizeString() {
        Long l10 = this.requestPayloadSize;
        long longValue = l10 == null ? 0L : l10.longValue();
        Long l11 = this.responsePayloadSize;
        return formatBytes(longValue + (l11 != null ? l11.longValue() : 0L));
    }

    public final String getUrl() {
        return this.url;
    }

    public final boolean hasTheSameContent(HttpTransaction other) {
        if (this == other) {
            return true;
        }
        if (other == null) {
            return false;
        }
        if (this.id == other.id && Intrinsics.b(this.requestDate, other.requestDate) && Intrinsics.b(this.responseDate, other.responseDate) && Intrinsics.b(this.tookMs, other.tookMs) && Intrinsics.b(this.protocol, other.protocol) && Intrinsics.b(this.method, other.method) && Intrinsics.b(this.url, other.url) && Intrinsics.b(this.host, other.host) && Intrinsics.b(this.path, other.path) && Intrinsics.b(this.scheme, other.scheme) && Intrinsics.b(this.responseTlsVersion, other.responseTlsVersion) && Intrinsics.b(this.responseCipherSuite, other.responseCipherSuite) && Intrinsics.b(this.requestPayloadSize, other.requestPayloadSize) && Intrinsics.b(this.requestContentType, other.requestContentType) && Intrinsics.b(this.requestHeaders, other.requestHeaders) && Intrinsics.b(this.requestBody, other.requestBody) && this.isRequestBodyPlainText == other.isRequestBodyPlainText && Intrinsics.b(this.responseCode, other.responseCode) && Intrinsics.b(this.responseMessage, other.responseMessage) && Intrinsics.b(this.error, other.error) && Intrinsics.b(this.responsePayloadSize, other.responsePayloadSize) && Intrinsics.b(this.responseContentType, other.responseContentType) && Intrinsics.b(this.responseHeaders, other.responseHeaders) && Intrinsics.b(this.responseBody, other.responseBody) && this.isResponseBodyPlainText == other.isResponseBodyPlainText) {
            byte[] bArr = this.responseImageData;
            if (bArr == null) {
                return true;
            }
            byte[] bArr2 = other.responseImageData;
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            if (Arrays.equals(bArr, bArr2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: isRequestBodyPlainText, reason: from getter */
    public final boolean getIsRequestBodyPlainText() {
        return this.isRequestBodyPlainText;
    }

    /* renamed from: isResponseBodyPlainText, reason: from getter */
    public final boolean getIsResponseBodyPlainText() {
        return this.isResponseBodyPlainText;
    }

    public final boolean isSsl() {
        return StringsKt.r(this.scheme, "https", true);
    }

    public final HttpTransaction populateUrl(w httpUrl) {
        Intrinsics.checkNotNullParameter(httpUrl, "httpUrl");
        k c10 = k.f8095f.c(httpUrl, false);
        this.url = c10.d();
        this.host = c10.a();
        this.path = c10.b();
        this.scheme = c10.c();
        return this;
    }

    public final void setError(String str) {
        this.error = str;
    }

    public final void setHost(String str) {
        this.host = str;
    }

    public final void setId(long j10) {
        this.id = j10;
    }

    public final void setMethod(String str) {
        this.method = str;
    }

    public final void setPath(String str) {
        this.path = str;
    }

    public final void setProtocol(String str) {
        this.protocol = str;
    }

    public final void setRequestBody(String str) {
        this.requestBody = str;
    }

    public final void setRequestBodyPlainText(boolean z10) {
        this.isRequestBodyPlainText = z10;
    }

    public final void setRequestContentType(String str) {
        this.requestContentType = str;
    }

    public final void setRequestDate(Long l10) {
        this.requestDate = l10;
    }

    public final void setRequestHeaders(String str) {
        this.requestHeaders = str;
    }

    public final void setRequestPayloadSize(Long l10) {
        this.requestPayloadSize = l10;
    }

    public final void setResponseBody(String str) {
        this.responseBody = str;
    }

    public final void setResponseBodyPlainText(boolean z10) {
        this.isResponseBodyPlainText = z10;
    }

    public final void setResponseCipherSuite(String str) {
        this.responseCipherSuite = str;
    }

    public final void setResponseCode(Integer num) {
        this.responseCode = num;
    }

    public final void setResponseContentType(String str) {
        this.responseContentType = str;
    }

    public final void setResponseDate(Long l10) {
        this.responseDate = l10;
    }

    public final void setResponseHeaders(String str) {
        this.responseHeaders = str;
    }

    public final void setResponseImageData(byte[] bArr) {
        this.responseImageData = bArr;
    }

    public final void setResponseMessage(String str) {
        this.responseMessage = str;
    }

    public final void setResponsePayloadSize(Long l10) {
        this.responsePayloadSize = l10;
    }

    public final void setResponseTlsVersion(String str) {
        this.responseTlsVersion = str;
    }

    public final void setScheme(String str) {
        this.scheme = str;
    }

    public final void setTookMs(Long l10) {
        this.tookMs = l10;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    public final void setRequestHeaders(v headers) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        setRequestHeaders(toHttpHeaderList(headers));
    }

    public final void setResponseHeaders(v headers) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        setResponseHeaders(toHttpHeaderList(headers));
    }

    public final void setRequestHeaders(List<HttpHeader> headers) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.requestHeaders = m.f8102a.a().t(headers);
    }

    public final void setResponseHeaders(List<HttpHeader> headers) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.responseHeaders = m.f8102a.a().t(headers);
    }

    public /* synthetic */ HttpTransaction(long j10, Long l10, Long l11, Long l12, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Long l13, String str9, String str10, String str11, boolean z10, Integer num, String str12, String str13, Long l14, String str14, String str15, String str16, boolean z11, byte[] bArr, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0L : j10, l10, l11, l12, str, str2, str3, str4, str5, str6, str7, str8, l13, str9, str10, str11, (i10 & 65536) != 0 ? true : z10, num, str12, str13, l14, str14, str15, str16, (i10 & 16777216) != 0 ? true : z11, bArr);
    }

    public HttpTransaction() {
        this(0L, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, null, R.attr.label, null);
    }
}
