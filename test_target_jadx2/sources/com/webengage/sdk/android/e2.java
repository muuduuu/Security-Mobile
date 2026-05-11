package com.webengage.sdk.android;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class e2<K, V> extends HashMap<K, V> {
    public V a(K k10, V v10) {
        if (k10 == null || v10 == null) {
            return null;
        }
        return (V) super.put(k10, v10);
    }

    public V a(K k10, V v10, V v11) {
        return v10 == null ? (V) super.put(k10, v11) : (V) super.put(k10, v10);
    }

    public void a(Map<? extends K, ? extends V> map) {
        if (map != null) {
            for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
                a(entry.getKey(), entry.getValue());
            }
        }
    }
}
