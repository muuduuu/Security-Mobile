package io.sentry;

import java.io.File;

/* renamed from: io.sentry.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3396b {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f35000a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3421j0 f35001b;

    /* renamed from: c, reason: collision with root package name */
    private String f35002c;

    /* renamed from: d, reason: collision with root package name */
    private final String f35003d;

    /* renamed from: e, reason: collision with root package name */
    private final String f35004e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f35005f;

    /* renamed from: g, reason: collision with root package name */
    private String f35006g;

    public C3396b(byte[] bArr, String str, String str2, boolean z10) {
        this(bArr, str, str2, "event.attachment", z10);
    }

    public static C3396b a(byte[] bArr) {
        return new C3396b(bArr, "screenshot.png", "image/png", false);
    }

    public static C3396b b(byte[] bArr) {
        return new C3396b(bArr, "thread-dump.txt", "text/plain", false);
    }

    public static C3396b c(io.sentry.protocol.C c10) {
        return new C3396b((InterfaceC3421j0) c10, "view-hierarchy.json", "application/json", "event.view_hierarchy", false);
    }

    public String d() {
        return this.f35006g;
    }

    public byte[] e() {
        return this.f35000a;
    }

    public String f() {
        return this.f35004e;
    }

    public String g() {
        return this.f35003d;
    }

    public String h() {
        return this.f35002c;
    }

    public InterfaceC3421j0 i() {
        return this.f35001b;
    }

    boolean j() {
        return this.f35005f;
    }

    public C3396b(byte[] bArr, String str, String str2, String str3, boolean z10) {
        this.f35000a = bArr;
        this.f35001b = null;
        this.f35003d = str;
        this.f35004e = str2;
        this.f35006g = str3;
        this.f35005f = z10;
    }

    public C3396b(InterfaceC3421j0 interfaceC3421j0, String str, String str2, String str3, boolean z10) {
        this.f35000a = null;
        this.f35001b = interfaceC3421j0;
        this.f35003d = str;
        this.f35004e = str2;
        this.f35006g = str3;
        this.f35005f = z10;
    }

    public C3396b(String str) {
        this(str, new File(str).getName());
    }

    public C3396b(String str, String str2) {
        this(str, str2, null);
    }

    public C3396b(String str, String str2, String str3) {
        this(str, str2, str3, "event.attachment", false);
    }

    public C3396b(String str, String str2, String str3, String str4, boolean z10) {
        this.f35002c = str;
        this.f35003d = str2;
        this.f35001b = null;
        this.f35004e = str3;
        this.f35006g = str4;
        this.f35005f = z10;
    }
}
