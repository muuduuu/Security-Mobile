package com.webengage.sdk.android;

import co.hyperverge.hypersnapsdk.objects.HVError;
import com.appsflyer.attribution.RequestError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
class j1 implements Iterator<String> {

    /* renamed from: a, reason: collision with root package name */
    private String f30659a;

    /* renamed from: e, reason: collision with root package name */
    private int f30663e;

    /* renamed from: h, reason: collision with root package name */
    private List<Integer> f30666h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f30667i;

    /* renamed from: b, reason: collision with root package name */
    private int f30660b = 0;

    /* renamed from: c, reason: collision with root package name */
    private char f30661c = 0;

    /* renamed from: d, reason: collision with root package name */
    private String f30662d = BuildConfig.FLAVOR;

    /* renamed from: f, reason: collision with root package name */
    private int f30664f = 0;

    /* renamed from: g, reason: collision with root package name */
    private int f30665g = 0;

    public j1(String str, boolean z10) {
        this.f30659a = null;
        this.f30663e = 0;
        this.f30667i = false;
        String trim = str.trim();
        this.f30659a = trim;
        this.f30663e = trim.length();
        this.f30666h = new ArrayList();
        this.f30667i = z10;
        if (z10) {
            c();
        }
    }

    private int a(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.f30659a.length()) {
            return this.f30659a.charAt(i11);
        }
        return -1;
    }

    private void c() {
        StringBuilder sb2 = new StringBuilder();
        this.f30665g = 0;
        boolean z10 = false;
        int i10 = -1;
        while (this.f30665g < this.f30659a.length()) {
            sb2.setLength(0);
            this.f30664f = this.f30665g;
            int i11 = 0;
            int i12 = -1;
            while (true) {
                if (this.f30664f >= this.f30659a.length()) {
                    break;
                }
                char charAt = this.f30659a.charAt(this.f30664f);
                this.f30661c = charAt;
                sb2.append(charAt);
                char c10 = this.f30661c;
                if (c10 == '\"' && i10 == -1 && z10) {
                    this.f30665g = this.f30664f;
                    z10 = false;
                    break;
                }
                if (c10 == '\"' && i10 == 1) {
                    i10 = -1;
                } else if (sb2.toString().equals("\"") && i10 == -1 && !z10) {
                    z10 = true;
                } else if (this.f30661c == '\\' && z10) {
                    i10 *= -1;
                } else if (!z10 && l0.a().e(sb2.toString())) {
                    i11 = sb2.length();
                    i12 = this.f30664f;
                }
                this.f30664f++;
            }
            if (i12 != -1) {
                if (this.f30666h.size() == 0) {
                    this.f30666h.add(0);
                    this.f30666h.add(Integer.valueOf((i12 - i11) + 1));
                }
                if (this.f30666h.size() > 0) {
                    List<Integer> list = this.f30666h;
                    int i13 = (i12 - i11) + 1;
                    if (list.get(list.size() - 1).intValue() != i13) {
                        List<Integer> list2 = this.f30666h;
                        list2.add(list2.get(list2.size() - 1));
                        this.f30666h.add(Integer.valueOf(i13));
                    }
                }
                this.f30666h.add(Integer.valueOf((i12 - i11) + 1));
                this.f30666h.add(Integer.valueOf(i12 + 1));
                this.f30665g = i12;
            }
            this.f30665g++;
        }
        if (this.f30666h.size() == 0) {
            this.f30666h.add(0);
            this.f30666h.add(Integer.valueOf(this.f30663e));
        }
        if (this.f30666h.size() > 0) {
            List<Integer> list3 = this.f30666h;
            if (list3.get(list3.size() - 1).intValue() != this.f30663e) {
                List<Integer> list4 = this.f30666h;
                list4.add(list4.get(list4.size() - 1));
                this.f30666h.add(Integer.valueOf(this.f30663e));
            }
        }
    }

    int b(int i10) {
        do {
            i10++;
            if (i10 >= this.f30659a.length()) {
                return -1;
            }
        } while (this.f30659a.charAt(i10) == ' ');
        return this.f30659a.charAt(i10);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f30667i ? this.f30660b < this.f30666h.size() : this.f30664f < this.f30659a.length();
    }

    @Override // java.util.Iterator
    public void remove() {
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public String next() {
        if (!this.f30667i) {
            return b();
        }
        String str = this.f30659a;
        List<Integer> list = this.f30666h;
        int i10 = this.f30660b;
        this.f30660b = i10 + 1;
        int intValue = list.get(i10).intValue();
        List<Integer> list2 = this.f30666h;
        int i11 = this.f30660b;
        this.f30660b = i11 + 1;
        String substring = str.substring(intValue, list2.get(i11).intValue());
        this.f30662d = substring;
        return substring;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003f, code lost:
    
        if (r3 != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String b() {
        char c10;
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        while (this.f30664f < this.f30659a.length()) {
            char charAt = this.f30659a.charAt(this.f30664f);
            this.f30661c = charAt;
            if (!z11) {
                if (Character.isJavaIdentifierStart(charAt)) {
                    while (this.f30664f < this.f30659a.length()) {
                        char charAt2 = this.f30659a.charAt(this.f30664f);
                        this.f30661c = charAt2;
                        if (!Character.isJavaIdentifierPart(charAt2)) {
                            return sb2.toString();
                        }
                        sb2.append(this.f30661c);
                        this.f30664f++;
                    }
                    return sb2.toString();
                }
                char c11 = this.f30661c;
                if (c11 != '%') {
                    if (c11 == '&') {
                        if (c11 == a(this.f30664f)) {
                            this.f30664f += 2;
                            return "&&";
                        }
                        this.f30664f++;
                        return "&";
                    }
                    if (c11 != '/' && c11 != '[') {
                        if (c11 == '|') {
                            if (c11 == a(this.f30664f)) {
                                this.f30664f += 2;
                                return "||";
                            }
                            this.f30664f++;
                            return "|";
                        }
                        if (c11 != '~' && c11 != ']') {
                            if (c11 == '^') {
                                this.f30664f++;
                                return "^";
                            }
                            switch (c11) {
                                case ' ':
                                    break;
                                case HVError.GPS_ACCESS_DENIED /* 33 */:
                                    if (61 == a(this.f30664f)) {
                                        this.f30664f += 2;
                                        return "!=";
                                    }
                                    this.f30664f++;
                                    return "!";
                                case '\"':
                                    sb2.append(c11);
                                    z11 = true;
                                    continue;
                                default:
                                    switch (c11) {
                                        case RequestError.NETWORK_FAILURE /* 40 */:
                                        case RequestError.NO_DEV_KEY /* 41 */:
                                        case HVError.CONSENT_DENIED /* 42 */:
                                        case HVError.SDK_CLOSE_ERROR /* 44 */:
                                            break;
                                        case HVError.ENCRYPTION_ERROR /* 43 */:
                                            this.f30664f++;
                                            return this.f30661c + BuildConfig.FLAVOR;
                                        case HVError.PERMISSION_REVOKED_ERROR /* 45 */:
                                            if (62 == a(this.f30664f)) {
                                                this.f30664f += 2;
                                                return "->";
                                            }
                                            break;
                                        default:
                                            switch (c11) {
                                                case HVError.DETECTOR_NOT_AVAILABLE_ERROR /* 60 */:
                                                    if (61 == a(this.f30664f)) {
                                                        this.f30664f += 2;
                                                        return "<=";
                                                    }
                                                    if (60 == a(this.f30664f)) {
                                                        this.f30664f += 2;
                                                        return "<<";
                                                    }
                                                    this.f30664f++;
                                                    return "<";
                                                case '=':
                                                    if (c11 == a(this.f30664f)) {
                                                        this.f30664f += 2;
                                                        return "==";
                                                    }
                                                    this.f30664f++;
                                                    return "=";
                                                case '>':
                                                    if (61 == a(this.f30664f)) {
                                                        this.f30664f += 2;
                                                        return ">=";
                                                    }
                                                    if (62 == a(this.f30664f)) {
                                                        this.f30664f += 2;
                                                        return ">>";
                                                    }
                                                    this.f30664f++;
                                                    return ">";
                                                default:
                                                    if (!Character.isDigit(c11) && (this.f30661c != '.' || !Character.isDigit(b(this.f30664f)))) {
                                                        this.f30664f++;
                                                        return this.f30661c + BuildConfig.FLAVOR;
                                                    }
                                                    while (this.f30664f < this.f30659a.length()) {
                                                        char charAt3 = this.f30659a.charAt(this.f30664f);
                                                        this.f30661c = charAt3;
                                                        if (!Character.isDigit(charAt3)) {
                                                            char c12 = this.f30661c;
                                                            if (c12 == '.' && !z10) {
                                                                sb2.append(c12);
                                                                z10 = true;
                                                            }
                                                            return sb2.toString();
                                                        }
                                                        sb2.append(this.f30661c);
                                                        this.f30664f++;
                                                    }
                                                    return sb2.toString();
                                            }
                                    }
                            }
                        }
                    }
                }
                this.f30664f++;
                return this.f30661c + BuildConfig.FLAVOR;
            }
            if (charAt != '\"') {
                if (charAt != '\'') {
                    if (charAt == '\\') {
                        boolean z13 = !z12;
                        if (z12) {
                            z12 = z13;
                        } else {
                            z12 = z13;
                        }
                    } else if (charAt != 'b') {
                        if (charAt != 'f') {
                            if (charAt != 'n') {
                                if (charAt != 'r') {
                                    if (charAt == 't') {
                                        if (z12) {
                                            c10 = '\t';
                                            sb2.append(c10);
                                            z12 = false;
                                        }
                                    }
                                } else if (z12) {
                                    c10 = '\r';
                                    sb2.append(c10);
                                    z12 = false;
                                }
                            } else if (z12) {
                                c10 = '\n';
                                sb2.append(c10);
                                z12 = false;
                            }
                        } else if (z12) {
                            c10 = '\f';
                            sb2.append(c10);
                            z12 = false;
                        }
                    } else if (z12) {
                        c10 = '\b';
                        sb2.append(c10);
                        z12 = false;
                    }
                    sb2.append(charAt);
                } else {
                    if (z12) {
                        sb2.append('\'');
                        z12 = false;
                    }
                    sb2.append(charAt);
                }
            } else if (!z12) {
                sb2.append(charAt);
                this.f30664f++;
                return sb2.toString();
            }
            sb2.append(charAt);
            z12 = false;
            this.f30664f++;
        }
        return sb2.toString();
    }
}
