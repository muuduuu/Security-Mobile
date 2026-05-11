package com.webengage.sdk.android;

import com.webengage.sdk.android.i1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public final class w {

    /* renamed from: i, reason: collision with root package name */
    public static int f31080i = 1;

    /* renamed from: a, reason: collision with root package name */
    private final List<String> f31081a;

    /* renamed from: b, reason: collision with root package name */
    private String f31082b;

    /* renamed from: c, reason: collision with root package name */
    private String f31083c;

    /* renamed from: d, reason: collision with root package name */
    private String f31084d;

    /* renamed from: e, reason: collision with root package name */
    private final List<h2> f31085e;

    /* renamed from: f, reason: collision with root package name */
    private c3 f31086f;

    /* renamed from: g, reason: collision with root package name */
    private Character f31087g;

    /* renamed from: h, reason: collision with root package name */
    private c3 f31088h;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f31089a;

        static {
            int[] iArr = new int[c3.values().length];
            f31089a = iArr;
            try {
                iArr[c3.INSIDE_SELECTOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31089a[c3.INSIDE_COMMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31089a[c3.INSIDE_PROPERTY_NAME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31089a[c3.INSIDE_VALUE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31089a[c3.INSIDE_VALUE_ROUND_BRACKET.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private w() {
        f31080i = 1;
        this.f31082b = BuildConfig.FLAVOR;
        this.f31083c = BuildConfig.FLAVOR;
        this.f31084d = BuildConfig.FLAVOR;
        this.f31085e = new ArrayList();
        this.f31086f = c3.INSIDE_SELECTOR;
        this.f31087g = null;
        this.f31088h = null;
        this.f31081a = new ArrayList();
    }

    public static List<s2> a(String str) {
        Character valueOf;
        Character ch;
        w wVar = new w();
        ArrayList arrayList = new ArrayList();
        if (str != null && str.trim().length() != 0) {
            for (int i10 = 0; i10 < str.length(); i10++) {
                char charAt = str.charAt(i10);
                if (i10 < str.length() - 1) {
                    char charAt2 = str.charAt(i10 + 1);
                    valueOf = Character.valueOf(charAt);
                    ch = Character.valueOf(charAt2);
                } else {
                    valueOf = Character.valueOf(charAt);
                    ch = null;
                }
                wVar.a(arrayList, valueOf, ch);
            }
        }
        return arrayList;
    }

    private void b(Character ch) {
        if (z.f31177e.equals(ch)) {
            this.f31086f = c3.INSIDE_PROPERTY_NAME;
            return;
        }
        if (z.f31176d.equals(ch)) {
            if (this.f31082b.trim().length() == 0) {
                throw new i1(i1.a.FOUND_COLON_WHEN_READING_SELECTOR_NAME, "Found an ',' in a selector name without any actual name before it.");
            }
            this.f31081a.add(this.f31082b.trim());
            this.f31082b = BuildConfig.FLAVOR;
            return;
        }
        this.f31082b += ch;
    }

    private void c(Character ch) {
        if (z.f31180h.equals(ch) || z.f31178f.equals(ch)) {
            this.f31085e.add(new h2(this.f31083c.trim(), this.f31084d.trim()));
            this.f31083c = BuildConfig.FLAVOR;
            this.f31084d = BuildConfig.FLAVOR;
            this.f31086f = c3.INSIDE_PROPERTY_NAME;
            return;
        }
        Character ch2 = z.f31181i;
        if (ch2.equals(ch)) {
            this.f31084d += ch2;
            this.f31086f = c3.INSIDE_VALUE_ROUND_BRACKET;
            return;
        }
        if (z.f31179g.equals(ch)) {
            this.f31084d += ch;
            return;
        }
        this.f31084d += ch;
    }

    private void d(Character ch) {
        Character ch2 = z.f31182j;
        if (!ch2.equals(ch)) {
            this.f31084d += ch;
            return;
        }
        this.f31084d += ch2;
        this.f31086f = c3.INSIDE_VALUE;
    }

    private void a(Character ch) {
        if (z.f31173a.equals(this.f31087g) && z.f31174b.equals(ch)) {
            this.f31086f = this.f31088h;
        }
    }

    private void a(List<s2> list, Character ch) {
        if (z.f31179g.equals(ch)) {
            this.f31086f = c3.INSIDE_VALUE;
            return;
        }
        if (z.f31180h.equals(ch)) {
            throw new i1(i1.a.FOUND_SEMICOLON_WHEN_READING_PROPERTY_NAME, "Unexpected character '" + ch + "' for property '" + this.f31083c.trim() + "' in the selector '" + this.f31082b.trim() + "' should end with an ';', not with '}'.");
        }
        if (!z.f31178f.equals(ch)) {
            this.f31083c += ch;
            return;
        }
        s2 s2Var = new s2();
        Iterator<String> it = this.f31081a.iterator();
        while (it.hasNext()) {
            s2Var.a(new y2(it.next().trim()));
        }
        this.f31081a.clear();
        y2 y2Var = new y2(this.f31082b.trim());
        this.f31082b = BuildConfig.FLAVOR;
        s2Var.a(y2Var);
        Iterator<h2> it2 = this.f31085e.iterator();
        while (it2.hasNext()) {
            s2Var.a(it2.next());
        }
        this.f31085e.clear();
        if (!s2Var.a().isEmpty()) {
            list.add(s2Var);
        }
        this.f31086f = c3.INSIDE_SELECTOR;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004a, code lost:
    
        if (r5 == com.webengage.sdk.android.z.f31178f) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(List<s2> list, Character ch, Character ch2) {
        if (ch.charValue() == '\n') {
            f31080i++;
        }
        if (z.f31174b.equals(ch) && z.f31173a.equals(ch2)) {
            c3 c3Var = this.f31086f;
            c3 c3Var2 = c3.INSIDE_COMMENT;
            if (c3Var != c3Var2) {
                this.f31088h = c3Var;
            }
            this.f31086f = c3Var2;
        }
        int i10 = a.f31089a[this.f31086f.ordinal()];
        if (i10 == 1) {
            b(ch);
        } else if (i10 != 2) {
            if (i10 != 3) {
                if (i10 == 4) {
                    c(ch);
                } else if (i10 == 5) {
                    d(ch);
                }
            }
            a(list, ch);
        } else {
            a(ch);
        }
        this.f31087g = ch;
    }
}
