package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import b3.l;
import com.facebook.imagepipeline.memory.a;
import j4.C3492F;
import j4.G;
import j4.v;

/* loaded from: classes.dex */
public abstract class f extends a {

    /* renamed from: k, reason: collision with root package name */
    private final int[] f20714k;

    f(e3.d dVar, C3492F c3492f, G g10) {
        super(dVar, c3492f, g10);
        SparseIntArray sparseIntArray = (SparseIntArray) l.g(c3492f.f35791c);
        this.f20714k = new int[sparseIntArray.size()];
        int i10 = 0;
        while (true) {
            int[] iArr = this.f20714k;
            if (i10 >= iArr.length) {
                t();
                return;
            } else {
                iArr[i10] = sparseIntArray.keyAt(i10);
                i10++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.a
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public void l(v vVar) {
        l.g(vVar);
        vVar.close();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.a
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public int p(v vVar) {
        l.g(vVar);
        return vVar.k();
    }

    int D() {
        return this.f20714k[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.a
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public boolean v(v vVar) {
        l.g(vVar);
        return !vVar.isClosed();
    }

    @Override // com.facebook.imagepipeline.memory.a
    protected int o(int i10) {
        if (i10 <= 0) {
            throw new a.b(Integer.valueOf(i10));
        }
        for (int i11 : this.f20714k) {
            if (i11 >= i10) {
                return i11;
            }
        }
        return i10;
    }

    @Override // com.facebook.imagepipeline.memory.a
    protected int q(int i10) {
        return i10;
    }
}
