package com.facebook.hermes.intl;

import android.icu.text.RuleBasedCollator;
import com.facebook.hermes.intl.a;

/* loaded from: classes.dex */
public class h implements com.facebook.hermes.intl.a {

    /* renamed from: a, reason: collision with root package name */
    private RuleBasedCollator f20674a = null;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f20675a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f20676b;

        static {
            int[] iArr = new int[a.b.values().length];
            f20676b = iArr;
            try {
                iArr[a.b.UPPER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20676b[a.b.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20676b[a.b.FALSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[a.c.values().length];
            f20675a = iArr2;
            try {
                iArr2[a.c.BASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20675a[a.c.ACCENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20675a[a.c.CASE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20675a[a.c.VARIANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    h() {
    }

    @Override // com.facebook.hermes.intl.a
    public int a(String str, String str2) {
        return this.f20674a.compare(str, str2);
    }

    @Override // com.facebook.hermes.intl.a
    public a.c b() {
        RuleBasedCollator ruleBasedCollator = this.f20674a;
        if (ruleBasedCollator == null) {
            return a.c.LOCALE;
        }
        int strength = ruleBasedCollator.getStrength();
        return strength == 0 ? this.f20674a.isCaseLevel() ? a.c.CASE : a.c.BASE : strength == 1 ? a.c.ACCENT : a.c.VARIANT;
    }

    @Override // com.facebook.hermes.intl.a
    public com.facebook.hermes.intl.a c(a.b bVar) {
        int i10 = a.f20676b[bVar.ordinal()];
        if (i10 == 1) {
            this.f20674a.setUpperCaseFirst(true);
        } else if (i10 != 2) {
            this.f20674a.setCaseFirstDefault();
        } else {
            this.f20674a.setLowerCaseFirst(true);
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.a
    public com.facebook.hermes.intl.a d(boolean z10) {
        if (z10) {
            this.f20674a.setNumericCollation(Q3.d.e(Boolean.TRUE));
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.a
    public com.facebook.hermes.intl.a e(Q3.b bVar) {
        RuleBasedCollator ruleBasedCollator = (RuleBasedCollator) android.icu.text.Collator.getInstance(((Q3.g) bVar).h());
        this.f20674a = ruleBasedCollator;
        ruleBasedCollator.setDecomposition(17);
        return this;
    }

    @Override // com.facebook.hermes.intl.a
    public com.facebook.hermes.intl.a f(a.c cVar) {
        int i10 = a.f20675a[cVar.ordinal()];
        if (i10 == 1) {
            this.f20674a.setStrength(0);
        } else if (i10 == 2) {
            this.f20674a.setStrength(1);
        } else if (i10 == 3) {
            this.f20674a.setStrength(0);
            this.f20674a.setCaseLevel(true);
        } else if (i10 == 4) {
            this.f20674a.setStrength(2);
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.a
    public com.facebook.hermes.intl.a g(boolean z10) {
        if (z10) {
            this.f20674a.setAlternateHandlingShifted(true);
        }
        return this;
    }
}
