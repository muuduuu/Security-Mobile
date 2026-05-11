package androidx.core.text;

import android.text.SpannableStringBuilder;
import co.hyperverge.hypersnapsdk.objects.HVError;
import java.util.Locale;
import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    static final o f15982d;

    /* renamed from: e, reason: collision with root package name */
    private static final String f15983e;

    /* renamed from: f, reason: collision with root package name */
    private static final String f15984f;

    /* renamed from: g, reason: collision with root package name */
    static final a f15985g;

    /* renamed from: h, reason: collision with root package name */
    static final a f15986h;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f15987a;

    /* renamed from: b, reason: collision with root package name */
    private final int f15988b;

    /* renamed from: c, reason: collision with root package name */
    private final o f15989c;

    /* renamed from: androidx.core.text.a$a, reason: collision with other inner class name */
    public static final class C0270a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f15990a;

        /* renamed from: b, reason: collision with root package name */
        private int f15991b;

        /* renamed from: c, reason: collision with root package name */
        private o f15992c;

        public C0270a() {
            c(a.e(Locale.getDefault()));
        }

        private static a b(boolean z10) {
            return z10 ? a.f15986h : a.f15985g;
        }

        private void c(boolean z10) {
            this.f15990a = z10;
            this.f15992c = a.f15982d;
            this.f15991b = 2;
        }

        public a a() {
            return (this.f15991b == 2 && this.f15992c == a.f15982d) ? b(this.f15990a) : new a(this.f15990a, this.f15991b, this.f15992c);
        }
    }

    private static class b {

        /* renamed from: f, reason: collision with root package name */
        private static final byte[] f15993f = new byte[1792];

        /* renamed from: a, reason: collision with root package name */
        private final CharSequence f15994a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f15995b;

        /* renamed from: c, reason: collision with root package name */
        private final int f15996c;

        /* renamed from: d, reason: collision with root package name */
        private int f15997d;

        /* renamed from: e, reason: collision with root package name */
        private char f15998e;

        static {
            for (int i10 = 0; i10 < 1792; i10++) {
                f15993f[i10] = Character.getDirectionality(i10);
            }
        }

        b(CharSequence charSequence, boolean z10) {
            this.f15994a = charSequence;
            this.f15995b = z10;
            this.f15996c = charSequence.length();
        }

        private static byte c(char c10) {
            return c10 < 1792 ? f15993f[c10] : Character.getDirectionality(c10);
        }

        private byte f() {
            char charAt;
            int i10 = this.f15997d;
            do {
                int i11 = this.f15997d;
                if (i11 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f15994a;
                int i12 = i11 - 1;
                this.f15997d = i12;
                charAt = charSequence.charAt(i12);
                this.f15998e = charAt;
                if (charAt == '&') {
                    return (byte) 12;
                }
            } while (charAt != ';');
            this.f15997d = i10;
            this.f15998e = ';';
            return (byte) 13;
        }

        private byte g() {
            char charAt;
            do {
                int i10 = this.f15997d;
                if (i10 >= this.f15996c) {
                    return (byte) 12;
                }
                CharSequence charSequence = this.f15994a;
                this.f15997d = i10 + 1;
                charAt = charSequence.charAt(i10);
                this.f15998e = charAt;
            } while (charAt != ';');
            return (byte) 12;
        }

        private byte h() {
            char charAt;
            int i10 = this.f15997d;
            while (true) {
                int i11 = this.f15997d;
                if (i11 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f15994a;
                int i12 = i11 - 1;
                this.f15997d = i12;
                char charAt2 = charSequence.charAt(i12);
                this.f15998e = charAt2;
                if (charAt2 == '<') {
                    return (byte) 12;
                }
                if (charAt2 == '>') {
                    break;
                }
                if (charAt2 == '\"' || charAt2 == '\'') {
                    do {
                        int i13 = this.f15997d;
                        if (i13 > 0) {
                            CharSequence charSequence2 = this.f15994a;
                            int i14 = i13 - 1;
                            this.f15997d = i14;
                            charAt = charSequence2.charAt(i14);
                            this.f15998e = charAt;
                        }
                    } while (charAt != charAt2);
                }
            }
            this.f15997d = i10;
            this.f15998e = '>';
            return (byte) 13;
        }

        private byte i() {
            char charAt;
            int i10 = this.f15997d;
            while (true) {
                int i11 = this.f15997d;
                if (i11 >= this.f15996c) {
                    this.f15997d = i10;
                    this.f15998e = '<';
                    return (byte) 13;
                }
                CharSequence charSequence = this.f15994a;
                this.f15997d = i11 + 1;
                char charAt2 = charSequence.charAt(i11);
                this.f15998e = charAt2;
                if (charAt2 == '>') {
                    return (byte) 12;
                }
                if (charAt2 == '\"' || charAt2 == '\'') {
                    do {
                        int i12 = this.f15997d;
                        if (i12 < this.f15996c) {
                            CharSequence charSequence2 = this.f15994a;
                            this.f15997d = i12 + 1;
                            charAt = charSequence2.charAt(i12);
                            this.f15998e = charAt;
                        }
                    } while (charAt != charAt2);
                }
            }
        }

        byte a() {
            char charAt = this.f15994a.charAt(this.f15997d - 1);
            this.f15998e = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.f15994a, this.f15997d);
                this.f15997d -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f15997d--;
            byte c10 = c(this.f15998e);
            if (!this.f15995b) {
                return c10;
            }
            char c11 = this.f15998e;
            return c11 == '>' ? h() : c11 == ';' ? f() : c10;
        }

        byte b() {
            char charAt = this.f15994a.charAt(this.f15997d);
            this.f15998e = charAt;
            if (Character.isHighSurrogate(charAt)) {
                int codePointAt = Character.codePointAt(this.f15994a, this.f15997d);
                this.f15997d += Character.charCount(codePointAt);
                return Character.getDirectionality(codePointAt);
            }
            this.f15997d++;
            byte c10 = c(this.f15998e);
            if (!this.f15995b) {
                return c10;
            }
            char c11 = this.f15998e;
            return c11 == '<' ? i() : c11 == '&' ? g() : c10;
        }

        int d() {
            this.f15997d = 0;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (this.f15997d < this.f15996c && i10 == 0) {
                byte b10 = b();
                if (b10 != 0) {
                    if (b10 == 1 || b10 == 2) {
                        if (i12 == 0) {
                            return 1;
                        }
                    } else if (b10 != 9) {
                        switch (b10) {
                            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                            case HVError.SSL_CONNECT_ERROR /* 15 */:
                                i12++;
                                i11 = -1;
                                continue;
                            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                                i12++;
                                i11 = 1;
                                continue;
                            case 18:
                                i12--;
                                i11 = 0;
                                continue;
                        }
                    }
                } else if (i12 == 0) {
                    return -1;
                }
                i10 = i12;
            }
            if (i10 == 0) {
                return 0;
            }
            if (i11 != 0) {
                return i11;
            }
            while (this.f15997d > 0) {
                switch (a()) {
                    case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                    case HVError.SSL_CONNECT_ERROR /* 15 */:
                        if (i10 == i12) {
                            return -1;
                        }
                        break;
                    case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                    case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                        if (i10 == i12) {
                            return 1;
                        }
                        break;
                    case 18:
                        i12++;
                        continue;
                }
                i12--;
            }
            return 0;
        }

        int e() {
            this.f15997d = this.f15996c;
            int i10 = 0;
            while (true) {
                int i11 = i10;
                while (this.f15997d > 0) {
                    byte a10 = a();
                    if (a10 != 0) {
                        if (a10 == 1 || a10 == 2) {
                            if (i10 == 0) {
                                return 1;
                            }
                            if (i11 == 0) {
                                break;
                            }
                        } else if (a10 != 9) {
                            switch (a10) {
                                case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                                case HVError.SSL_CONNECT_ERROR /* 15 */:
                                    if (i11 == i10) {
                                        return -1;
                                    }
                                    i10--;
                                    break;
                                case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                                case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                                    if (i11 == i10) {
                                        return 1;
                                    }
                                    i10--;
                                    break;
                                case 18:
                                    i10++;
                                    break;
                                default:
                                    if (i11 != 0) {
                                        break;
                                    } else {
                                        break;
                                    }
                            }
                        } else {
                            continue;
                        }
                    } else {
                        if (i10 == 0) {
                            return -1;
                        }
                        if (i11 == 0) {
                            break;
                        }
                    }
                }
                return 0;
            }
        }
    }

    static {
        o oVar = p.f16010c;
        f15982d = oVar;
        f15983e = Character.toString((char) 8206);
        f15984f = Character.toString((char) 8207);
        f15985g = new a(false, 2, oVar);
        f15986h = new a(true, 2, oVar);
    }

    a(boolean z10, int i10, o oVar) {
        this.f15987a = z10;
        this.f15988b = i10;
        this.f15989c = oVar;
    }

    private static int a(CharSequence charSequence) {
        return new b(charSequence, false).d();
    }

    private static int b(CharSequence charSequence) {
        return new b(charSequence, false).e();
    }

    public static a c() {
        return new C0270a().a();
    }

    static boolean e(Locale locale) {
        return q.a(locale) == 1;
    }

    private String f(CharSequence charSequence, o oVar) {
        boolean a10 = oVar.a(charSequence, 0, charSequence.length());
        return (this.f15987a || !(a10 || b(charSequence) == 1)) ? this.f15987a ? (!a10 || b(charSequence) == -1) ? f15984f : BuildConfig.FLAVOR : BuildConfig.FLAVOR : f15983e;
    }

    private String g(CharSequence charSequence, o oVar) {
        boolean a10 = oVar.a(charSequence, 0, charSequence.length());
        return (this.f15987a || !(a10 || a(charSequence) == 1)) ? this.f15987a ? (!a10 || a(charSequence) == -1) ? f15984f : BuildConfig.FLAVOR : BuildConfig.FLAVOR : f15983e;
    }

    public boolean d() {
        return (this.f15988b & 2) != 0;
    }

    public CharSequence h(CharSequence charSequence) {
        return i(charSequence, this.f15989c, true);
    }

    public CharSequence i(CharSequence charSequence, o oVar, boolean z10) {
        if (charSequence == null) {
            return null;
        }
        boolean a10 = oVar.a(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (d() && z10) {
            spannableStringBuilder.append((CharSequence) g(charSequence, a10 ? p.f16009b : p.f16008a));
        }
        if (a10 != this.f15987a) {
            spannableStringBuilder.append(a10 ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z10) {
            spannableStringBuilder.append((CharSequence) f(charSequence, a10 ? p.f16009b : p.f16008a));
        }
        return spannableStringBuilder;
    }

    public String j(String str) {
        return k(str, this.f15989c, true);
    }

    public String k(String str, o oVar, boolean z10) {
        if (str == null) {
            return null;
        }
        return i(str, oVar, z10).toString();
    }
}
