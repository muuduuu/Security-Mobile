package com.google.android.gms.internal.measurement;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2266j implements InterfaceC2329q {

    /* renamed from: a, reason: collision with root package name */
    private final Double f24536a;

    public C2266j(Double d10) {
        if (d10 == null) {
            this.f24536a = Double.valueOf(Double.NaN);
        } else {
            this.f24536a = d10;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329q
    public final String a() {
        Double d10 = this.f24536a;
        if (Double.isNaN(d10.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(d10.doubleValue())) {
            return d10.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
        }
        BigDecimal a10 = AbstractC2257i.a(BigDecimal.valueOf(d10.doubleValue()));
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        decimalFormat.setMinimumFractionDigits((a10.scale() > 0 ? a10.precision() : a10.scale()) - 1);
        String format = decimalFormat.format(a10);
        int indexOf = format.indexOf("E");
        if (indexOf <= 0) {
            return format;
        }
        int parseInt = Integer.parseInt(format.substring(indexOf + 1));
        return ((parseInt >= 0 || parseInt <= -7) && (parseInt < 0 || parseInt >= 21)) ? format.replace("E-", "e-").replace("E", "e+") : a10.toPlainString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2266j) {
            return this.f24536a.equals(((C2266j) obj).f24536a);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329q
    public final Double f() {
        return this.f24536a;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329q
    public final Boolean g() {
        Double d10 = this.f24536a;
        boolean z10 = false;
        if (!Double.isNaN(d10.doubleValue()) && d10.doubleValue() != 0.0d) {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329q
    public final Iterator h() {
        return null;
    }

    public final int hashCode() {
        return this.f24536a.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329q
    public final InterfaceC2329q j() {
        return new C2266j(this.f24536a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329q
    public final InterfaceC2329q m(String str, Y1 y12, List list) {
        if ("toString".equals(str)) {
            return new C2364u(a());
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", a(), str));
    }

    public final String toString() {
        return a();
    }
}
