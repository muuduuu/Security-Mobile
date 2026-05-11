package com.facebook.hermes.intl;

import android.icu.text.CompactDecimalFormat;
import android.icu.text.DecimalFormat;
import android.icu.text.DecimalFormatSymbols;
import android.icu.text.MeasureFormat;
import android.icu.text.NumberFormat;
import android.icu.text.NumberingSystem;
import android.icu.util.Currency;
import android.icu.util.Measure;
import android.icu.util.MeasureUnit;
import android.icu.util.ULocale;
import com.facebook.hermes.intl.c;
import java.text.AttributedCharacterIterator;
import java.text.Format;
import java.util.ArrayList;
import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
public class j implements c {

    /* renamed from: a, reason: collision with root package name */
    private Format f20680a;

    /* renamed from: b, reason: collision with root package name */
    private android.icu.text.NumberFormat f20681b;

    /* renamed from: c, reason: collision with root package name */
    private Q3.g f20682c;

    /* renamed from: d, reason: collision with root package name */
    private c.h f20683d;

    /* renamed from: e, reason: collision with root package name */
    private MeasureUnit f20684e;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f20685a;

        static {
            int[] iArr = new int[c.g.values().length];
            f20685a = iArr;
            try {
                iArr[c.g.NEVER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20685a[c.g.ALWAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20685a[c.g.EXCEPTZERO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    j() {
    }

    public static int n(String str) {
        try {
            return Currency.getInstance(str).getDefaultFractionDigits();
        } catch (IllegalArgumentException unused) {
            throw new Q3.e("Invalid currency code !");
        }
    }

    private void o(android.icu.text.NumberFormat numberFormat, Q3.b bVar, c.h hVar) {
        this.f20681b = numberFormat;
        this.f20680a = numberFormat;
        this.f20682c = (Q3.g) bVar;
        this.f20683d = hVar;
        numberFormat.setRoundingMode(4);
    }

    private static MeasureUnit p(String str) {
        for (MeasureUnit measureUnit : MeasureUnit.getAvailable()) {
            if (!measureUnit.getSubtype().equals(str)) {
                if (measureUnit.getSubtype().equals(measureUnit.getType() + "-" + str)) {
                }
            }
            return measureUnit;
        }
        throw new Q3.e("Unknown unit: " + str);
    }

    @Override // com.facebook.hermes.intl.c
    public AttributedCharacterIterator a(double d10) {
        try {
            try {
                Format format = this.f20680a;
                return (!(format instanceof MeasureFormat) || this.f20684e == null) ? format.formatToCharacterIterator(Double.valueOf(d10)) : format.formatToCharacterIterator(new Measure(Double.valueOf(d10), this.f20684e));
            } catch (RuntimeException unused) {
                return android.icu.text.NumberFormat.getInstance(ULocale.forLanguageTag("en")).formatToCharacterIterator(Double.valueOf(d10));
            }
        } catch (NumberFormatException unused2) {
            return android.icu.text.NumberFormat.getInstance(ULocale.getDefault()).formatToCharacterIterator(Double.valueOf(d10));
        } catch (Exception unused3) {
            return android.icu.text.NumberFormat.getInstance(ULocale.forLanguageTag("en")).formatToCharacterIterator(Double.valueOf(d10));
        }
    }

    @Override // com.facebook.hermes.intl.c
    public String b(Q3.b bVar) {
        return NumberingSystem.getInstance((ULocale) bVar.h()).getName();
    }

    @Override // com.facebook.hermes.intl.c
    public String c(double d10) {
        try {
            try {
                Format format = this.f20680a;
                return (!(format instanceof MeasureFormat) || this.f20684e == null) ? format.format(Double.valueOf(d10)) : format.format(new Measure(Double.valueOf(d10), this.f20684e));
            } catch (NumberFormatException unused) {
                return android.icu.text.NumberFormat.getInstance(ULocale.getDefault()).format(d10);
            }
        } catch (RuntimeException unused2) {
            return android.icu.text.NumberFormat.getInstance(ULocale.forLanguageTag("en")).format(d10);
        }
    }

    @Override // com.facebook.hermes.intl.c
    public String i(AttributedCharacterIterator.Attribute attribute, double d10) {
        return attribute == NumberFormat.Field.SIGN ? Double.compare(d10, 0.0d) >= 0 ? "plusSign" : "minusSign" : attribute == NumberFormat.Field.INTEGER ? Double.isNaN(d10) ? "nan" : Double.isInfinite(d10) ? "infinity" : "integer" : attribute == NumberFormat.Field.FRACTION ? "fraction" : attribute == NumberFormat.Field.EXPONENT ? "exponentInteger" : attribute == NumberFormat.Field.EXPONENT_SIGN ? "exponentMinusSign" : attribute == NumberFormat.Field.EXPONENT_SYMBOL ? "exponentSeparator" : attribute == NumberFormat.Field.DECIMAL_SEPARATOR ? "decimal" : attribute == NumberFormat.Field.GROUPING_SEPARATOR ? "group" : attribute == NumberFormat.Field.PERCENT ? "percentSign" : attribute == NumberFormat.Field.PERMILLE ? "permilleSign" : attribute == NumberFormat.Field.CURRENCY ? "currency" : attribute.toString().equals("android.icu.text.NumberFormat$Field(compact)") ? "compact" : "literal";
    }

    @Override // com.facebook.hermes.intl.c
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public j d(Q3.b bVar, String str, c.h hVar, c.d dVar, c.e eVar, c.b bVar2) {
        if (!str.isEmpty()) {
            try {
                if (NumberingSystem.getInstanceByName(Q3.d.h(str)) == null) {
                    throw new Q3.e("Invalid numbering system: " + str);
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(Q3.d.h(str));
                bVar.g("nu", arrayList);
            } catch (RuntimeException unused) {
                throw new Q3.e("Invalid numbering system: " + str);
            }
        }
        if (eVar == c.e.COMPACT && (hVar == c.h.DECIMAL || hVar == c.h.UNIT)) {
            o(CompactDecimalFormat.getInstance((ULocale) bVar.h(), bVar2 == c.b.SHORT ? CompactDecimalFormat.CompactStyle.SHORT : CompactDecimalFormat.CompactStyle.LONG), bVar, hVar);
        } else {
            android.icu.text.NumberFormat numberFormat = android.icu.text.NumberFormat.getInstance((ULocale) bVar.h(), hVar.getInitialNumberFormatStyle(eVar, dVar));
            if (eVar == c.e.ENGINEERING) {
                numberFormat.setMaximumIntegerDigits(3);
            }
            o(numberFormat, bVar, hVar);
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.c
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public j g(String str, c.EnumC0366c enumC0366c) {
        if (this.f20683d == c.h.CURRENCY) {
            Currency currency = Currency.getInstance(str);
            this.f20681b.setCurrency(currency);
            if (enumC0366c != c.EnumC0366c.CODE) {
                str = currency.getName(this.f20682c.h(), enumC0366c.getNameStyle(), (boolean[]) null);
            }
            android.icu.text.NumberFormat numberFormat = this.f20681b;
            if (numberFormat instanceof DecimalFormat) {
                DecimalFormat decimalFormat = (DecimalFormat) numberFormat;
                DecimalFormatSymbols decimalFormatSymbols = decimalFormat.getDecimalFormatSymbols();
                decimalFormatSymbols.setCurrencySymbol(str);
                decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
            }
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.c
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public j l(c.f fVar, int i10, int i11) {
        if (fVar == c.f.FRACTION_DIGITS) {
            if (i10 >= 0) {
                this.f20681b.setMinimumFractionDigits(i10);
            }
            if (i11 >= 0) {
                this.f20681b.setMaximumFractionDigits(i11);
            }
            android.icu.text.NumberFormat numberFormat = this.f20681b;
            if (numberFormat instanceof DecimalFormat) {
                ((DecimalFormat) numberFormat).setSignificantDigitsUsed(false);
            }
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.c
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public j k(boolean z10) {
        this.f20681b.setGroupingUsed(z10);
        return this;
    }

    @Override // com.facebook.hermes.intl.c
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public j j(int i10) {
        if (i10 != -1) {
            this.f20681b.setMinimumIntegerDigits(i10);
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.c
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public j f(c.g gVar) {
        android.icu.text.NumberFormat numberFormat = this.f20681b;
        if (numberFormat instanceof DecimalFormat) {
            DecimalFormat decimalFormat = (DecimalFormat) numberFormat;
            DecimalFormatSymbols decimalFormatSymbols = decimalFormat.getDecimalFormatSymbols();
            int i10 = a.f20685a[gVar.ordinal()];
            if (i10 == 1) {
                decimalFormat.setPositivePrefix(BuildConfig.FLAVOR);
                decimalFormat.setPositiveSuffix(BuildConfig.FLAVOR);
                decimalFormat.setNegativePrefix(BuildConfig.FLAVOR);
                decimalFormat.setNegativeSuffix(BuildConfig.FLAVOR);
            } else if (i10 == 2 || i10 == 3) {
                if (!decimalFormat.getNegativePrefix().isEmpty()) {
                    decimalFormat.setPositivePrefix(new String(new char[]{decimalFormatSymbols.getPlusSign()}));
                }
                if (!decimalFormat.getNegativeSuffix().isEmpty()) {
                    decimalFormat.setPositiveSuffix(new String(new char[]{decimalFormatSymbols.getPlusSign()}));
                }
            }
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.c
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public j h(c.f fVar, int i10, int i11) {
        android.icu.text.NumberFormat numberFormat = this.f20681b;
        if ((numberFormat instanceof DecimalFormat) && fVar == c.f.SIGNIFICANT_DIGITS) {
            DecimalFormat decimalFormat = (DecimalFormat) numberFormat;
            if (i10 >= 0) {
                decimalFormat.setMinimumSignificantDigits(i10);
            }
            if (i11 >= 0) {
                if (i11 < decimalFormat.getMinimumSignificantDigits()) {
                    throw new Q3.e("maximumSignificantDigits should be at least equal to minimumSignificantDigits");
                }
                decimalFormat.setMaximumSignificantDigits(i11);
            }
            decimalFormat.setSignificantDigitsUsed(true);
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.c
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public j e(String str, c.i iVar) {
        if (this.f20683d == c.h.UNIT) {
            this.f20684e = p(str);
            this.f20680a = MeasureFormat.getInstance(this.f20682c.h(), iVar.getFormatWidth(), this.f20681b);
        }
        return this;
    }
}
