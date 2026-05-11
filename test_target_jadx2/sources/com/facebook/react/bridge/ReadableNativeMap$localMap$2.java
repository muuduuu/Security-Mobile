package com.facebook.react.bridge;

import com.facebook.react.bridge.ReadableNativeMap;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003`\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Ljava/util/HashMap;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "Lkotlin/collections/HashMap;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class ReadableNativeMap$localMap$2 extends xc.m implements Function0<HashMap<String, Object>> {
    final /* synthetic */ ReadableNativeMap this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReadableNativeMap$localMap$2(ReadableNativeMap readableNativeMap) {
        super(0);
        this.this$0 = readableNativeMap;
    }

    @Override // kotlin.jvm.functions.Function0
    public final HashMap<String, Object> invoke() {
        String[] keys;
        Object[] importValues;
        String[] keys2;
        ReadableNativeMap.Companion unused;
        keys = this.this$0.getKeys();
        int length = keys.length;
        HashMap<String, Object> hashMap = new HashMap<>(length);
        importValues = this.this$0.importValues();
        unused = ReadableNativeMap.Companion;
        ReadableNativeMap.jniPassCounter++;
        for (int i10 = 0; i10 < length; i10++) {
            keys2 = this.this$0.getKeys();
            hashMap.put(keys2[i10], importValues[i10]);
        }
        return hashMap;
    }
}
