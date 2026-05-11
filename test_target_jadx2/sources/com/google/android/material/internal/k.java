package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public class k {

    /* renamed from: c, reason: collision with root package name */
    private float f27282c;

    /* renamed from: f, reason: collision with root package name */
    private V7.d f27285f;

    /* renamed from: a, reason: collision with root package name */
    private final TextPaint f27280a = new TextPaint(1);

    /* renamed from: b, reason: collision with root package name */
    private final V7.f f27281b = new a();

    /* renamed from: d, reason: collision with root package name */
    private boolean f27283d = true;

    /* renamed from: e, reason: collision with root package name */
    private WeakReference f27284e = new WeakReference(null);

    class a extends V7.f {
        a() {
        }

        @Override // V7.f
        public void a(int i10) {
            k.this.f27283d = true;
            b bVar = (b) k.this.f27284e.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // V7.f
        public void b(Typeface typeface, boolean z10) {
            if (z10) {
                return;
            }
            k.this.f27283d = true;
            b bVar = (b) k.this.f27284e.get();
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    public interface b {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public k(b bVar) {
        g(bVar);
    }

    private float c(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f27280a.measureText(charSequence, 0, charSequence.length());
    }

    public V7.d d() {
        return this.f27285f;
    }

    public TextPaint e() {
        return this.f27280a;
    }

    public float f(String str) {
        if (!this.f27283d) {
            return this.f27282c;
        }
        float c10 = c(str);
        this.f27282c = c10;
        this.f27283d = false;
        return c10;
    }

    public void g(b bVar) {
        this.f27284e = new WeakReference(bVar);
    }

    public void h(V7.d dVar, Context context) {
        if (this.f27285f != dVar) {
            this.f27285f = dVar;
            if (dVar != null) {
                dVar.o(context, this.f27280a, this.f27281b);
                b bVar = (b) this.f27284e.get();
                if (bVar != null) {
                    this.f27280a.drawableState = bVar.getState();
                }
                dVar.n(context, this.f27280a, this.f27281b);
                this.f27283d = true;
            }
            b bVar2 = (b) this.f27284e.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    public void i(boolean z10) {
        this.f27283d = z10;
    }

    public void j(Context context) {
        this.f27285f.n(context, this.f27280a, this.f27281b);
    }
}
