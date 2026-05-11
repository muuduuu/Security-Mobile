package com.facebook.react.bridge;

import com.facebook.react.bridge.ReadableNativeMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "invoke", "()[Ljava/lang/String;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class ReadableNativeMap$keys$2 extends xc.m implements Function0<String[]> {
    final /* synthetic */ ReadableNativeMap this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReadableNativeMap$keys$2(ReadableNativeMap readableNativeMap) {
        super(0);
        this.this$0 = readableNativeMap;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String[] invoke() {
        String[] importKeys;
        ReadableNativeMap.Companion unused;
        importKeys = this.this$0.importKeys();
        unused = ReadableNativeMap.Companion;
        ReadableNativeMap.jniPassCounter++;
        return importKeys;
    }
}
