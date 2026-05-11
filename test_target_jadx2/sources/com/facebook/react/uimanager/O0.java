package com.facebook.react.uimanager;

import c3.AbstractC1721a;
import com.facebook.react.config.ReactFeatureFlags;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import v4.AbstractC4929e;
import x4.C5109a;

/* loaded from: classes.dex */
public abstract class O0 {
    static Map a(j1 j1Var) {
        Map b10 = N0.b();
        b10.put("ViewManagerNames", new ArrayList(j1Var.a()));
        b10.put("LazyViewManagersEnabled", Boolean.TRUE);
        return b10;
    }

    static Map b(List list, Map map, Map map2) {
        Map b10 = N0.b();
        Map a10 = N0.a();
        Map c10 = N0.c();
        if (map != null) {
            map.putAll(a10);
        }
        if (map2 != null) {
            map2.putAll(c10);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ViewManager viewManager = (ViewManager) it.next();
            String name = viewManager.getName();
            Map c11 = c(viewManager, null, null, map, map2);
            if (!c11.isEmpty()) {
                b10.put(name, c11);
            }
        }
        b10.put("genericBubblingEventTypes", a10);
        b10.put("genericDirectEventTypes", c10);
        return b10;
    }

    static Map c(ViewManager viewManager, Map map, Map map2, Map map3, Map map4) {
        HashMap b10 = AbstractC4929e.b();
        Map<String, Object> exportedCustomBubblingEventTypeConstants = viewManager.getExportedCustomBubblingEventTypeConstants();
        if (exportedCustomBubblingEventTypeConstants != null) {
            if (ReactFeatureFlags.enableFabricRenderer && G4.a.p()) {
                exportedCustomBubblingEventTypeConstants = e(exportedCustomBubblingEventTypeConstants);
            }
            f(map3, exportedCustomBubblingEventTypeConstants);
            f(exportedCustomBubblingEventTypeConstants, map);
            b10.put("bubblingEventTypes", exportedCustomBubblingEventTypeConstants);
        } else if (map != null) {
            b10.put("bubblingEventTypes", map);
        }
        Map<String, Object> exportedCustomDirectEventTypeConstants = viewManager.getExportedCustomDirectEventTypeConstants();
        g(viewManager.getName(), exportedCustomDirectEventTypeConstants);
        if (exportedCustomDirectEventTypeConstants != null) {
            if (ReactFeatureFlags.enableFabricRenderer && G4.a.p()) {
                exportedCustomDirectEventTypeConstants = e(exportedCustomDirectEventTypeConstants);
            }
            f(map4, exportedCustomDirectEventTypeConstants);
            f(exportedCustomDirectEventTypeConstants, map2);
            b10.put("directEventTypes", exportedCustomDirectEventTypeConstants);
        } else if (map2 != null) {
            b10.put("directEventTypes", map2);
        }
        Map<String, Object> exportedViewConstants = viewManager.getExportedViewConstants();
        if (exportedViewConstants != null) {
            b10.put("Constants", exportedViewConstants);
        }
        Map<String, Integer> commandsMap = viewManager.getCommandsMap();
        if (commandsMap != null) {
            b10.put("Commands", commandsMap);
        }
        Map<String, String> nativeProps = viewManager.getNativeProps();
        if (!nativeProps.isEmpty()) {
            b10.put("NativeProps", nativeProps);
        }
        return b10;
    }

    public static Map d() {
        return AbstractC4929e.e("bubblingEventTypes", N0.a(), "directEventTypes", N0.c());
    }

    static Map e(Map map) {
        if (map == null) {
            return null;
        }
        HashSet<String> hashSet = new HashSet();
        for (Object obj : map.keySet()) {
            if (obj instanceof String) {
                String str = (String) obj;
                if (!str.startsWith("top")) {
                    hashSet.add(str);
                }
            }
        }
        if (!(map instanceof HashMap)) {
            map = new HashMap(map);
        }
        for (String str2 : hashSet) {
            map.put("top" + (str2.startsWith("on") ? str2.substring(2) : str2.substring(0, 1).toUpperCase() + str2.substring(1)), map.get(str2));
        }
        return map;
    }

    private static void f(Map map, Map map2) {
        if (map == null || map2 == null || map2.isEmpty()) {
            return;
        }
        for (Object obj : map2.keySet()) {
            Object obj2 = map2.get(obj);
            Object obj3 = map.get(obj);
            if (obj3 != null && (obj2 instanceof Map) && (obj3 instanceof Map)) {
                if (!(obj3 instanceof HashMap)) {
                    HashMap hashMap = new HashMap((Map) obj3);
                    map.replace(obj, hashMap);
                    obj3 = hashMap;
                }
                f((Map) obj3, (Map) obj2);
            } else {
                map.put(obj, obj2);
            }
        }
    }

    private static void g(String str, Map map) {
        String str2;
        if (!C5109a.f44775b || map == null) {
            return;
        }
        for (String str3 : map.keySet()) {
            Object obj = map.get(str3);
            if (obj != null && (obj instanceof Map) && (str2 = (String) ((Map) obj).get("registrationName")) != null && str3.startsWith("top") && str2.startsWith("on") && !str3.substring(3).equals(str2.substring(2))) {
                AbstractC1721a.m("UIManagerModuleConstantsHelper", String.format("Direct event name for '%s' doesn't correspond to the naming convention, expected 'topEventName'->'onEventName', got '%s'->'%s'", str, str3, str2));
            }
        }
    }
}
