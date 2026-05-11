package com.webengage.sdk.android;

import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

/* loaded from: classes2.dex */
public class b3 {

    /* renamed from: a, reason: collision with root package name */
    private final Stack<a3> f30472a = new Stack<>();

    /* renamed from: b, reason: collision with root package name */
    private final Set<b0> f30473b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    private final Map<ze.D, List<b0>> f30474c = new HashMap();

    class a implements a3 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f30475a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f30476b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f30477c;

        a(Object obj, int i10, int i11) {
            this.f30475a = obj;
            this.f30476b = i10;
            this.f30477c = i11;
        }

        @Override // com.webengage.sdk.android.a3
        public void a(f1 f1Var, SpannableStringBuilder spannableStringBuilder) {
            spannableStringBuilder.setSpan(this.f30475a, this.f30476b, this.f30477c, 33);
        }
    }

    public f3 a(ze.D d10, f3 f3Var) {
        if (!this.f30474c.containsKey(d10)) {
            ArrayList arrayList = new ArrayList();
            for (b0 b0Var : this.f30473b) {
                if (b0Var.a(d10)) {
                    arrayList.add(b0Var);
                }
            }
            this.f30474c.put(d10, arrayList);
        }
        Iterator<b0> it = this.f30474c.get(d10).iterator();
        while (it.hasNext()) {
            f3Var = it.next().a(f3Var);
        }
        return f3Var;
    }

    public void a(a3 a3Var) {
        this.f30472a.push(a3Var);
    }

    public void a(b0 b0Var) {
        this.f30473b.add(b0Var);
    }

    public void a(f1 f1Var, SpannableStringBuilder spannableStringBuilder) {
        while (!this.f30472a.isEmpty()) {
            this.f30472a.pop().a(f1Var, spannableStringBuilder);
        }
    }

    public void a(Object obj, int i10, int i11) {
        if (i11 > i10) {
            this.f30472a.push(new a(obj, i10, i11));
            return;
        }
        Logger.d("WebEngage", "refusing to put span of type " + obj.getClass().getSimpleName() + " and length " + (i11 - i10));
    }
}
