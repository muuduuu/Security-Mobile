package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import com.facebook.imagepipeline.memory.a;
import e3.InterfaceC3074a;
import j4.C3492F;
import j4.G;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class e extends a implements InterfaceC3074a {

    /* renamed from: k, reason: collision with root package name */
    private final int[] f20713k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(e3.d memoryTrimmableRegistry, C3492F poolParams, G poolStatsTracker) {
        super(memoryTrimmableRegistry, poolParams, poolStatsTracker);
        Intrinsics.checkNotNullParameter(memoryTrimmableRegistry, "memoryTrimmableRegistry");
        Intrinsics.checkNotNullParameter(poolParams, "poolParams");
        Intrinsics.checkNotNullParameter(poolStatsTracker, "poolStatsTracker");
        SparseIntArray sparseIntArray = poolParams.f35791c;
        if (sparseIntArray != null) {
            this.f20713k = new int[sparseIntArray.size()];
            int size = sparseIntArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f20713k[i10] = sparseIntArray.keyAt(i10);
            }
        } else {
            this.f20713k = new int[0];
        }
        t();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.a
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public byte[] h(int i10) {
        return new byte[i10];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.a
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public void l(byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.a
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public int p(byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return value.length;
    }

    @Override // com.facebook.imagepipeline.memory.a
    protected int o(int i10) {
        if (i10 <= 0) {
            throw new a.b(Integer.valueOf(i10));
        }
        for (int i11 : this.f20713k) {
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
